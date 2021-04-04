package com.example.yodut;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getData();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tugas, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        tugasAdaptor = new TugasAdaptor(tugasArrayList);

        //   RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FragmentTugas.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        recyclerView.setAdapter(tugasAdaptor);

        return view;
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
}