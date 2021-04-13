package com.example.yodut.ui.tugas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yodut.DetailTugasActivity;
import com.example.yodut.R;
import com.example.yodut.Tugas;
import com.example.yodut.TugasAdaptor;

import java.util.ArrayList;

public class FragmentTugas extends Fragment {

    private RecyclerView recyclerView;
    private TugasAdaptor tugasAdaptor;
    private ArrayList<Tugas> tugasArrayList;


    public FragmentTugas() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tugas, container, false);
        return view;
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        getData();
        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.recyclerView);
        TugasAdaptor tugasAdaptor = new  TugasAdaptor(getContext(), tugasArrayList);

        //   RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FragmentTugas.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(tugasAdaptor);

    }


    public void getData()
    {
        tugasArrayList = new ArrayList<>();
        tugasArrayList.add(new Tugas("Buat Mind Map", "4 April 2021","PPL 1 Praktik"));
        tugasArrayList.add(new Tugas("Resume Jurnal", "30 Maret 2021","PKN"));
        tugasArrayList.add(new Tugas("Eksplorasi Sensor", "28 Maret 2021","PPL 4"));
        tugasArrayList.add(new Tugas("Buat Aplikasi Keuangan", "4 April 2021","PPB"));
        tugasArrayList.add(new Tugas("Latihan Statistika Deskriptif", "2 Maret 2021","Statistika"));
        tugasArrayList.add(new Tugas("Buat MindMap", "4 Maret","PPL 1 Praktik"));
        tugasArrayList.add(new Tugas("Buat Mind Map", "4 Maret","PPL 1 Praktik"));
        tugasArrayList.add(new Tugas("Buat Mind Map", "4 Maret","PPL 1 Praktik"));
        tugasArrayList.add(new Tugas("Buat Mind Map", "4 Maret","PPL 1 Praktik"));
    }

//    @Override
//    public void gotoDetailTugas(Tugas tugas) {
//        Intent intent = new Intent(recyclerView.getContext(), DetailTugasActivity.class);
//        recyclerView.getContext().startActivity(intent);
//
//    }
}