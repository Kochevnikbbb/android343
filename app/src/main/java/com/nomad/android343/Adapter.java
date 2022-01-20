package com.nomad.android343;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ContViewHolder>{

    private Context context;

    ArrayList<LanguageProgramm> names = new ArrayList<>();

    public Adapter(ArrayList<LanguageProgramm> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public ContViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        return new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContViewHolder holder, int position) {
        holder.bind(names.get(position),context);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    static class ContViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView image;

        public ContViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.names);
            image=itemView.findViewById(R.id.image);
        }

        public void bind(LanguageProgramm languageProgramm, Context context) {
            name.setText(languageProgramm.getName());
            Glide.with(context).load(languageProgramm.getImage()).into(image);



        }
    }
}
