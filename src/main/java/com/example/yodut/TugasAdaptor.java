package com.example.yodut;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TugasAdaptor extends RecyclerView.Adapter<TugasAdaptor.TugasViewHolder> {

    private ArrayList<Tugas> listTugas;

    public TugasAdaptor(ArrayList<Tugas> listTugas) {
        this.listTugas = listTugas;
    }

    @NonNull
    @Override
    public TugasAdaptor.TugasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tugas, parent, false);
        return new TugasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TugasAdaptor.TugasViewHolder holder, int position) {
        holder.tvNamaTugas.setText(listTugas.get(position).getNamaTugas());
        holder.tvDeadline.setText(listTugas.get(position).getDeadline());
        holder.tvMataKuliah.setText(listTugas.get(position).getMataKuliah());

    }

    @Override
    public int getItemCount() {
        return (listTugas != null) ? listTugas.size() :0;
    }

    public class TugasViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNamaTugas, tvDeadline, tvMataKuliah;

        public TugasViewHolder(View view){
            super(view);

            tvNamaTugas = view.findViewById(R.id.tvNamaTugas);
            tvDeadline = view.findViewById(R.id.tvDeadline);
            tvMataKuliah = view.findViewById(R.id.tvMataKuliah);


        }
    }
}
