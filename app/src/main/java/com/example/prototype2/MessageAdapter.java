package com.example.prototype2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseUser;

import java.util.List;


public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.Viewholder> {

    public static final int MSG_TYPE_LEFT = 0;
    public static final int MSG_TYPE_RIGHT = 1;

    FirebaseUser firebaseUser;


    private Context context;
    private List<Chat> list;
    private String imageurl;


    public MessageAdapter(Context context, List<Chat> list, String imageurl) {
        this.context = context;
        this.list = list;
        this.imageurl = imageurl;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == MSG_TYPE_RIGHT) {
            View view = LayoutInflater.from(context).inflate(R.layout.chat_right,parent,false);
            return new MessageAdapter.Viewholder(view);
        }else{
            View view  = LayoutInflater.from(context).inflate(R.layout.chat_left,parent,false);
            return new MessageAdapter.Viewholder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
