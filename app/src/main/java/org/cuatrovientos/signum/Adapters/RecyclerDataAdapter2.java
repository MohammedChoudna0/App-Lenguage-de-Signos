package org.cuatrovientos.signum.Adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerDataAdapter2 {
    public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.RecyclerDataHolder> {

        @NonNull
        @Override
        public RecyclerDataAdapter.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerDataAdapter.RecyclerDataHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class RecyclerDataHolder extends RecyclerView.ViewHolder {
            public RecyclerDataHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }}
