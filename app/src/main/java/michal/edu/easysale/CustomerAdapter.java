package michal.edu.easysale;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.CustomerViewHolder>{

    private List<SmallCustomer> customers;
    private FragmentActivity activity;

    public CustomerAdapter(List<SmallCustomer> customers, FragmentActivity activity) {
        this.customers = customers;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CustomerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(activity).inflate(R.layout.item_view, parent, false);
        return new CustomerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerViewHolder holder, final int position) {
        final SmallCustomer customer = customers.get(position);

        holder.btnCustomerID.setText(String.valueOf(customer.getCustomerId()));
        holder.btnCustomerName.setText(customer.getLastName() + " " + customer.getFirstName());
        holder.tvCity.setText("City: " + customer.getCity());
        holder.tvCountry.setText("Country: " + customer.getCountry());
        holder.tvZipcode.setText("Zipcode: " + customer.getZipcode());
        holder.tvEmail.setText("Email: " + customer.getEmail());

        if (customer.getRegistered()){
            holder.ivCustomerRegistered.setImageResource(R.drawable.ic_green_circle);
        }else {
            holder.ivCustomerRegistered.setImageResource(R.drawable.ic_red_circle);
        }

        if (customer.isExpanded()){
            holder.expandedContent.setVisibility(View.VISIBLE);
        } else {
            holder.expandedContent.setVisibility(View.GONE);
        }

        holder.btnCustomerName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean expanded = customer.isExpanded();

                customer.setExpanded(!expanded);

                notifyItemChanged(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    class  CustomerViewHolder extends RecyclerView.ViewHolder{

        Button btnCustomerID, btnCustomerName;
        ImageView ivCustomerRegistered;
        ConstraintLayout expandedContent;
        TextView tvCity, tvCountry, tvZipcode, tvEmail;

        public CustomerViewHolder(@NonNull View itemView) {
            super(itemView);

            btnCustomerID = itemView.findViewById(R.id.btnCustomerID);
            btnCustomerName = itemView.findViewById(R.id.btnCustomerName);
            ivCustomerRegistered = itemView.findViewById(R.id.ivCustomerRegistered);
            expandedContent = itemView.findViewById(R.id.expandedContent);
            tvCity = itemView.findViewById(R.id.tvCity);
            tvCountry = itemView.findViewById(R.id.tvCountry);
            tvZipcode = itemView.findViewById(R.id.tvZipcode);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}
