package com.example.yodut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TugasAdaptor extends RecyclerView.Adapter<TugasAdaptor.TugasViewHolder> {

    private ArrayList<Tugas> listTugas;
    TugasRecycler mListener;

    public TugasAdaptor(ArrayList<Tugas> listTugas, TugasRecycler mListener) {

        this.listTugas = listTugas;
        this.mListener = mListener;
    }

    public TugasAdaptor(Context context, ArrayList<Tugas> listTugas) {
        this.listTugas = listTugas;
    }

    @NonNull
    @Override
    public TugasAdaptor.TugasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tugas, parent, false);
        return new TugasViewHolder(view, mListener);
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
        private RelativeLayout relativeLayout;
        TugasRecycler mListener;

        public TugasViewHolder(View view, TugasRecycler mListener){
            super(view);
            this.mListener = mListener;

            tvNamaTugas = view.findViewById(R.id.tvNamaTugas);
            tvDeadline = view.findViewById(R.id.tvDeadline);
            tvMataKuliah = view.findViewById(R.id.tvMataKuliah);
            relativeLayout = view.findViewById(R.id.recyclerView);

            view.setOnClickListener((v ->  {
                Bundle bundle = new Bundle();
                bundle.putString("nama_tugas", listTugas.get(getAdapterPosition()).getNamaTugas());
                bundle.putString("deadline", listTugas.get(getAdapterPosition()).getDeadline());
                bundle.putString("mata_kuliah", listTugas.get(getAdapterPosition()).getMataKuliah());
                Intent intent = new Intent(view.getContext(), DetailTugasActivity.class);
                intent.putExtras(bundle);

//                intent.putExtra("nama_tugas", listTugas.get(getAdapterPosition()).getNamaTugas());
//                intent.putExtra("deadline", listTugas.get(getAdapterPosition()).getDeadline());
//                intent.putExtra("mata_kuliah",listTugas.get(getAdapterPosition()).getMataKuliah());
                view.getContext().startActivity(intent);
            }));

        }
    }

    public interface TugasRecycler {
        void gotoDetailTugas(Tugas tugas);
    }
}
