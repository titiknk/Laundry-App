package com.titikhofifa.laundryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class LaundryAdapter extends RecyclerView.Adapter<LaundryAdapter.ViewHolder> {
    private LaundryRecycleViewInterface laundryRecycleViewInterface;


    ArrayList<LaundryModel> laundryModel;

    public LaundryAdapter(ArrayList<LaundryModel> laundryModel) {
        this.laundryModel = laundryModel;
        this.laundryRecycleViewInterface = laundryRecycleViewInterface;
    }

    @NonNull
    @Override
    public LaundryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull LaundryAdapter.ViewHolder holder, int position) {
        holder.namaL1.setText(laundryModel.get(position).getnamaL1());
        holder.logol1.setImageResource(laundryModel.get(position).getLogoL1());
    }

    @Override
    public int getItemCount() {
        return laundryModel.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaL1;
        ImageView logol1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaL1 = itemView.findViewById(R.id.nama_l1);
            logol1 = itemView.findViewById(R.id.logo_l1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (laundryRecycleViewInterface != null);{
                        int pos = getAdapterPosition();

                        if (pos !=RecyclerView.NO_POSITION);{
                            laundryRecycleViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
