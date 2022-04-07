package com.example.recyclereview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MVH>{
    String[] T,ST ;
    Integer[] Img ;
    Context c;

    public ListAdapter(String[] t, String[] ST, Integer[] img, Context c) {
        T = t;
        this.ST = ST;
        Img = img;
        this.c = c;
    }

    @NonNull
    @Override
    public MVH onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerlayout,parent,false) ;
        ListAdapter.MVH mvh =new ListAdapter.MVH(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull  ListAdapter.MVH holder, int i) {

        holder.titre.setText(T[i]) ;
        holder.Stitre.setText(T[i]) ;
        holder.img.setImageResource(Img[i]); ;
    }

    @Override
    public int getItemCount() {
        return T.length;
    }

    public class MVH extends RecyclerView.ViewHolder {
        TextView titre, Stitre;
        ImageView img ;
        public MVH(@NonNull View itemView) {
            super(itemView);
            titre=itemView.findViewById(R.id.textView);
            Stitre=itemView.findViewById(R.id.textView);
            img=itemView.findViewById(R.id.imageView) ;
        }
    }
}
