package com.example.mpharma;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MedAdapter extends RecyclerView.Adapter<MedAdapter.ViewHolder> {

    Context context;
    ArrayList<MedModel> medModelArrayList;

    public MedAdapter(Context context, ArrayList<MedModel> medModelArrayList) {
        this.context = context;
        this.medModelArrayList = medModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.med_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).load(medModelArrayList.get(position).getImg_url()).into(holder.imageView);
        holder.name.setText(medModelArrayList.get(position).getName());
        holder.description.setText(medModelArrayList.get(position).getDescription());
        holder.price.setText(String.valueOf(medModelArrayList.get(position).getPrice()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailedActivity.class);
                intent.putExtra("detailed",medModelArrayList.get(holder.getAdapterPosition()));
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return medModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, description, price;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.med_img);
            name = itemView.findViewById(R.id.med_name);
            description = itemView.findViewById(R.id.med_desc);
            price = itemView.findViewById(R.id.med_price);


        }
    }
}
