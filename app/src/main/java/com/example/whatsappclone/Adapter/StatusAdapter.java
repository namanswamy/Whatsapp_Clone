package com.example.whatsappclone.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsappclone.Model.Users;
import com.example.whatsappclone.R;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder>{

    Context context;

    ArrayList<Users> statuslist;

    public StatusAdapter(Context context, ArrayList<Users> statuslist) {
        this.context = context;
        this.statuslist = statuslist;
    }

    @NonNull
    @Override
    public StatusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_show_status,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

         ImageView image;
         TextView textView1,textView2;
         public ViewHolder(@NonNull View itemView){
             super(itemView);

             image = itemView.findViewById(R.id.profile_image);
             textView1 = itemView.findViewById(R.id.userNameStatus);
             textView2 = itemView.findViewById(R.id.statusdate);
         }
    }
}


