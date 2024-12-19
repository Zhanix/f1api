package com.example.f1api;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.f1api.Model.DataItem;

import java.util.ArrayList;

public class ListF1Adapter extends RecyclerView.Adapter<ListF1Adapter.ListViewHolder> {
    private ArrayList<DataItem> listData;
    private OnItemClickCallBack onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallBack onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallBack {
        void onItemClicked(DataItem data);
    }

    public ListF1Adapter(ArrayList<DataItem> list) {
        this.listData = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_f1, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        DataItem team = listData.get(position);

        // Load team badge using Glide
        Glide.with(holder.itemView.getContext())
                .load(team.getLogo())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        // Set team name, league, description, stadium, and formed year
        holder.tvName.setText(team.getPosisi());
        holder.tvFrom.setText(team.getPoint());  // League name
        holder.tvDescription.setText(team.getTim());  // Team description
        holder.tvStadium.setText(team.getDesctim());  // Stadium name

        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listData.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), "You selected " + team.getPosisi(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom, tvDescription, tvStadium; // Added fields

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo); // ImageView for team badge
            tvName = itemView.findViewById(R.id.tv_item_name);  // TextView for team name
            tvFrom = itemView.findViewById(R.id.tv_item_from);  // TextView for league name
            tvDescription = itemView.findViewById(R.id.tv_item_description);  // New description view
            tvStadium = itemView.findViewById(R.id.tv_item_stadium);  // New stadium view
        }
    }
}