package michal.edu.easysale;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class GridFragment extends Fragment {

    private RecyclerView rvCustomers;


    public static GridFragment newInstance(ArrayList<SmallCustomer> customers) {

        Bundle args = new Bundle();
        args.putSerializable("customers", customers);
        GridFragment fragment = new GridFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_grid, container, false);

        rvCustomers = v.findViewById(R.id.rvCustomers);

        final ArrayList<SmallCustomer> customers = (ArrayList<SmallCustomer>) getArguments().getSerializable("customers");

        final CustomerAdapter adapter = new CustomerAdapter(customers, getActivity());
        rvCustomers.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCustomers.setAdapter(adapter);


        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP |
                ItemTouchHelper.DOWN | ItemTouchHelper.START | ItemTouchHelper.END, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder,
                                  @NonNull RecyclerView.ViewHolder target) {

                int fromPosition = viewHolder.getAdapterPosition();
                int toPosition = target.getAdapterPosition();

                Collections.swap(customers, fromPosition, toPosition);

                recyclerView.getAdapter().notifyItemMoved(fromPosition, toPosition);

                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                final int position = viewHolder.getAdapterPosition();
                final SmallCustomer deletedCustomer = customers.get(position);

                customers.remove(position);
                adapter.notifyItemRemoved(position);
                Snackbar.make(rvCustomers, deletedCustomer.getLastName() + " " + deletedCustomer.getFirstName(), Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                customers.add(position, deletedCustomer);
                                adapter.notifyItemInserted(position);
                            }
                        }).show();
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(rvCustomers);

        return v;
    }

}
