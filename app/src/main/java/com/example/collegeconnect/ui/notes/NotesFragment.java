package com.example.collegeconnect.ui.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.collegeconnect.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NotesFragment extends Fragment {
    BottomNavigationView bottomNavigationView;
    TextView tv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(getActivity()!=null)
            bottomNavigationView = getActivity().findViewById(R.id.bottomNav);

        tv=getActivity().findViewById(R.id.tvTitle);
        tv.setText("Notes");
        return inflater.inflate(R.layout.fragment_notes,null);
    }
    @Override
    public void onStart() {
        super.onStart();
        bottomNavigationView.getMenu().findItem(R.id.nav_notes).setChecked(true);
    }
}