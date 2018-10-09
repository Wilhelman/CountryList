package com.example.guillermogs2.countrylist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CountryViewHolder extends RecyclerView.ViewHolder{

    private TextView country_view;

    public CountryViewHolder(View itemView) {
        super(itemView);
        country_view = itemView.findViewById(R.id.country_view);
    }

    public void bind(String country){
        country_view.setText(country);
    }

}
