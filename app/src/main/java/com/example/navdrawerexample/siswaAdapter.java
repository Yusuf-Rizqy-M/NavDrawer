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

public class siswaAdapter extends RecyclerView.Adapter<siswaAdapter.MyViewHolder> {
    Context context;
    ArrayList<Model> modelbangundatar = new ArrayList<>();
    private RecyclerViewClickListener mListener;

    public siswaAdapter(Context context, ArrayList<Model> modelbangundatar, RecyclerViewClickListener listener) {
        this.context = context;
        this.modelbangundatar = modelbangundatar;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public siswaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_namasiswa, parent, false);
        return new siswaAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull siswaAdapter.MyViewHolder holder, final int position) {

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