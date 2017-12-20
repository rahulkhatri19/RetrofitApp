package com.example.rahul.contact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rahul on 19-12-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Contact> contacts;

    public RecyclerAdapter(List<Contact> contacts)
    {
        this.contacts=contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(contacts.get(position).getName());
        holder.Email.setText(contacts.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
 TextView Name,Email;
        public MyViewHolder(View itemView) {
            super(itemView);

            Name=(TextView)itemView.findViewById(R.id.name);
            Email=(TextView)itemView.findViewById(R.id.email);

        }
    }
}
