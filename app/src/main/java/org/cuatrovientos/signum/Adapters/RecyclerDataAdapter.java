package org.cuatrovientos.signum.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.cuatrovientos.signum.R;

import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.RecyclerDataHolder> {
    private List<String>  list;
    private OnItemClickListener listener;

    public RecyclerDataAdapter(List<String> list, OnItemClickListener listener){

        this.list = list;
        this.listener = listener;
    }
    @NonNull
    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoria_item,parent,false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(list.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerDataHolder extends RecyclerView.ViewHolder {
        TextView tw;
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);

            tw = itemView.findViewById(R.id.textView);
        }

        public void assignData(String name, OnItemClickListener listener) {

            tw.setText(name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(name, getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(String string,int position);
    }
}