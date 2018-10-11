package com.example.guillermogs2.countrylist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CountryListAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    public interface OnClickListener {
        void onClick(int position);
    }

    private Context context;
    private List<String> countries;
    private OnClickListener listener;

    public CountryListAdapter(Context context, List<String> countries) {
        this.context = context;
        this.countries = countries;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new CountryViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
