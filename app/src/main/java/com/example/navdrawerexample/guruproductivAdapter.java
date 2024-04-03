package com.example.navdrawerexample;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class guruproductivAdapter extends RecyclerView.Adapter<guruproductivAdapter.MyViewHolder> {
    Context context;
    ArrayList<Model> modelbangundatar = new ArrayList<>();
    private RecyclerViewClickListener mListener;

    public guruproductivAdapter(Context context, ArrayList<Model> model, RecyclerViewClickListener listener) {
        this.context = context;
        this.modelbangundatar = model;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public guruproductivAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_gurupdoductive, parent, false);
        return new guruproductivAdapter.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull guruproductivAdapter.MyViewHolder holder, final int position) {

        holder.tvnamebangdatar.setText(modelbangundatar.get(position).getName());
        Glide.with(context).load(modelbangundatar.get(position).getImg()).into(holder.imagesbangundatar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelbangundatar.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imagesbangundatar;
        TextView tvnamebangdatar;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            imagesbangundatar = itemView.findViewById(R.id.image);
            tvnamebangdatar = itemView.findViewById(R.id.tvnamenamasiswa);
        }
    }
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}