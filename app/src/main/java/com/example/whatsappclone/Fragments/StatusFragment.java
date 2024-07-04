package com.example.whatsappclone.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsappclone.R;
import com.example.whatsappclone.databinding.FragmentStatusBinding;
import com.google.firebase.database.FirebaseDatabase;


public class StatusFragment extends Fragment {



    public StatusFragment() {

    }

    FragmentStatusBinding binding;

    FirebaseDatabase database;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_status, container, false);
    }
}