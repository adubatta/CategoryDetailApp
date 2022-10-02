package com.example.cetegoryexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityAdapter extends ArrayAdapter<Food> {
    public ActivityAdapter(Context context, ArrayList<Food> foodList) {
        super(context, 0, foodList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Food myFood = getItem(position);

        if(convertView== null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.nameTextView);
        TextView price = (TextView) convertView.findViewById(R.id.priceTextView);
        TextView desc = (TextView) convertView.findViewById(R.id.descTextView);

        name.setText(myFood.getName());
        price.setText("$" + myFood.getPrice());
        desc.setText(myFood.getDesc());

        return convertView;
    }
}

