package com.example.deepak.coordinatorlayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepak.coordinatorlayout.Model.ItemObjects;
import com.example.deepak.coordinatorlayout.adapters.HomeRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private StaggeredGridLayoutManager staggeredGridLayoutManager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView rv = (RecyclerView) inflater.inflate(R.layout.fragment_home, container, false);
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
//        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));

        recyclerView.setHasFixedSize(true);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        recyclerView.setAdapter(new HomeRecyclerViewAdapter(getActivity(),getListItemData()));
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Elegent", R.drawable.img_1));
        listViewItems.add(new ItemObjects("STETSON", R.drawable.img_2));
        listViewItems.add(new ItemObjects("Woven", R.drawable.img_3));
        listViewItems.add(new ItemObjects("Ralph Lauren", R.drawable.img_4));
        listViewItems.add(new ItemObjects("Fedora", R.drawable.img_5));
        listViewItems.add(new ItemObjects("Straw", R.drawable.img_6));
        listViewItems.add(new ItemObjects("Martell", R.drawable.img_7));
        listViewItems.add(new ItemObjects("Campbell", R.drawable.img_8));
        listViewItems.add(new ItemObjects("Seabreez", R.drawable.img_9));
        listViewItems.add(new ItemObjects("Martinez", R.drawable.img_10));
        listViewItems.add(new ItemObjects("Beenies", R.drawable.img_11));
        listViewItems.add(new ItemObjects("Emile Goorin", R.drawable.img_12));
        listViewItems.add(new ItemObjects("Galeano", R.drawable.img_13));
        listViewItems.add(new ItemObjects("Elegent", R.drawable.img_1));
        listViewItems.add(new ItemObjects("STETSON", R.drawable.img_2));
        listViewItems.add(new ItemObjects("Woven", R.drawable.img_3));
        listViewItems.add(new ItemObjects("Ralph Lauren", R.drawable.img_4));
        listViewItems.add(new ItemObjects("Fedora", R.drawable.img_5));
        listViewItems.add(new ItemObjects("Straw", R.drawable.img_6));
        listViewItems.add(new ItemObjects("Martell", R.drawable.img_7));
        listViewItems.add(new ItemObjects("Campbell", R.drawable.img_8));
        listViewItems.add(new ItemObjects("Seabreez", R.drawable.img_9));
        listViewItems.add(new ItemObjects("Martinez", R.drawable.img_10));
        listViewItems.add(new ItemObjects("Beenies", R.drawable.img_11));
        listViewItems.add(new ItemObjects("Emile Goorin", R.drawable.img_12));
        listViewItems.add(new ItemObjects("Galeano", R.drawable.img_13));
        listViewItems.add(new ItemObjects("Elegent", R.drawable.img_1));
        listViewItems.add(new ItemObjects("STETSON", R.drawable.img_2));
        listViewItems.add(new ItemObjects("Woven", R.drawable.img_3));
        listViewItems.add(new ItemObjects("Ralph Lauren", R.drawable.img_4));
        listViewItems.add(new ItemObjects("Fedora", R.drawable.img_5));
        listViewItems.add(new ItemObjects("Straw", R.drawable.img_6));
        listViewItems.add(new ItemObjects("Martell", R.drawable.img_7));
        listViewItems.add(new ItemObjects("Campbell", R.drawable.img_8));
        listViewItems.add(new ItemObjects("Seabreez", R.drawable.img_9));
        listViewItems.add(new ItemObjects("Martinez", R.drawable.img_10));
        listViewItems.add(new ItemObjects("Beenies", R.drawable.img_11));
        listViewItems.add(new ItemObjects("Emile Goorin", R.drawable.img_12));
        listViewItems.add(new ItemObjects("Galeano", R.drawable.img_13));

        return listViewItems;
    }
}
