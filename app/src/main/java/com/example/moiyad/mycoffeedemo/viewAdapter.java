package com.example.moiyad.mycoffeedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by moiyad on 10/10/2017.
 */


public class viewAdapter extends ArrayAdapter<CoffeeShop> {


    public viewAdapter(Context mContext, ArrayList<CoffeeShop> object) {
        super(mContext, 0, object);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        CoffeeShop current = getItem(position);


        v = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        TextView vname = (TextView) v.findViewById(R.id.textView);
        ImageView vimage = (ImageView) v.findViewById(R.id.imageView);

        vname.setText(current.getShopName());
        vimage.setImageResource(current.getShopImage());
        vimage.setVisibility(View.VISIBLE);


        return v;

    }
}