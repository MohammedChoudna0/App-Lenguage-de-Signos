package org.cuatrovientos.signum.Adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerDataAdapter2 extends RecyclerView.Adapter<RecyclerDataAdapter2.RecyclerDataHolder> {

    @NonNull
    @Override
    public RecyclerDataAdapter2.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataAdapter2.RecyclerDataHolder holder, int position) {

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
}
