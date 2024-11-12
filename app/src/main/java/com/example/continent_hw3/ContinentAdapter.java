package com.example.continent_hw3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<String> continentList;

    public ContinentAdapter(ArrayList<String> continentList) {
        this.continentList = continentList;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false);
        return new ContinentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public static class ContinentViewHolder extends RecyclerView.ViewHolder {

        private TextView tvContinentName;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContinentName = itemView.findViewById(R.id.tv_continentName);
        }

        public void bind(String continent) {
            tvContinentName.setText(continent);
        }
    }
}