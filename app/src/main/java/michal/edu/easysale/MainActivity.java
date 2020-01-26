package michal.edu.easysale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showProgress(true);

        getList(this);
    }

    ProgressDialog dialog;
    private void showProgress(boolean show){
        if (dialog == null) {
            dialog = new ProgressDialog(this);

            dialog.setCancelable(true);
            dialog.setTitle("Please wait");
            dialog.setMessage("Loading...");
        }
        if (show){
            dialog.show();
        }else {
            dialog.dismiss();
        }
    }


    private void getList(final FragmentActivity activity){
        String URL = "https://api.rivhit.co.il/online/RivhitOnlineAPI.svc/Customer.List";

        final ArrayList<SmallCustomer> myCustomers = new ArrayList<>();

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("api_token", "A2DACF08-55F1-4D03-90B7-8839E66AE57A");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        MyRequest myRequest = new MyRequest(Request.Method.POST, URL, headers, jsonObject, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONObject object = response.getJSONObject("data");

                    JSONArray jArray = object.getJSONArray("customer_list");


                    /**
                     * FOLLOWING CODE CAN BE USED IF ALL PROPERTIES ARE NEEDED:
                     * */

//                    Gson gson = new Gson();
//                    Customer[] customers = gson.fromJson(String.valueOf(jArray), Customer[].class);
//
//                    for (Customer customer : customers) {
//                        System.out.println(customer);
//                    }



                    int jsonArrLength = jArray.length();

                    for (int i = 0; i < jsonArrLength; i++) {
                        JSONObject jsonObject = jArray.getJSONObject(i);

                        int customerId = jsonObject.getInt("customer_id");
                        String lastName = jsonObject.getString("last_name");
                        String firstName = jsonObject.getString("first_name");
                        String city = jsonObject.getString("city");
                        String zipcode = jsonObject.getString("zipcode");
                        String country = jsonObject.getString("country");
                        String email = jsonObject.getString("email");
                        boolean isRegistered = jsonObject.getBoolean("is_registered");

                        SmallCustomer newCustomer = new SmallCustomer(customerId, lastName, firstName, city, zipcode, country,
                                email, isRegistered);

                        myCustomers.add(newCustomer);

                    }

                    showProgress(false);

                    FragmentManager fm = activity.getSupportFragmentManager();
                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
                    transaction.replace(R.id.container, GridFragment.newInstance(myCustomers))
                            .commit();


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("error " + error);
            }
        });


        RequestQueue queue = Volley.newRequestQueue(activity);
        queue.add(myRequest);
    }


}
