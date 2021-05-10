package com.example.recycleviewtutoial;

import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter (List<ModelClass>userList){this.userList = userList; }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resouce = userList.get(position).getProfileimageView();
        String name = userList.get(position).getNameTextView();
        String time = userList.get(position).getTimeTextView();
        String message = userList.get(position).getMessageTextView();

        holder.setData(resouce,name,time,message);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView Name,Time,Message;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.profileimageView);
            Name = itemView.findViewById(R.id.nameTextView);
            Time = itemView.findViewById(R.id.timeTextView);
            Message = itemView.findViewById(R.id.messageTextView);


        }

        public void setData(int resouce, String name, String time, String message) {

            imageView.setImageResource(resouce);
            Name.setText(name);
            Time.setText(time);
            Message.setText(message);

        }
    }
}
