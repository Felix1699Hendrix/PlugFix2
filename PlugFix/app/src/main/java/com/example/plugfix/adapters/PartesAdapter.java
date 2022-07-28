package com.example.plugfix.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.plugfix.R;

import java.util.List;

public class PartesAdapter extends RecyclerView.Adapter<PartesAdapter.ViewHolder> {

    private List<String> lstItems;
    private Context _ctx;
    public PartesAdapter(List<String> lstItems, Context ctx){
        this.lstItems = lstItems;
        this._ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.partes_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgItem;
        private TextView txtItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgItem = (ImageView) itemView.findViewById(R.id.imgItem);
            this.txtItem = (TextView) itemView.findViewById(R.id.txtItem);
        }
    }

}
