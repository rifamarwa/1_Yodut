package com.example.yodut.ui.home;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.yodut.R;
import com.example.yodut.ui.kalendar.FragmentKalendar;
import com.example.yodut.ui.tugas.FragmentTugas;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Button btnTugas;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

//        btnTugas = (Button) root.findViewById(R.id.btnTugas);
//        btnTugas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTugas fragmentTugas = new FragmentTugas();
//                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.placeholder, fragmentTugas);
//                fragmentTransaction.commit();
//
//            }
//        });
        
        return root;
    }

//        btnTugas = (Button) view.findViewById(R.id.btnTugas);
//        btnTugas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTugas fragmentTugas = new FragmentTugas();
//                fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.placeholder, fragmentTugas);
//                fragmentTransaction.commit();
//
//            }
//        });
//        btnKalendar = (Button) view.findViewById(R.id.btnKalendar);
//        btnKalendar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentKalendar fragmentKalendar = new FragmentKalendar();
//                fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.placeholder, fragmentKalendar);
//                fragmentTransaction.commit();
//            }
//        });



}