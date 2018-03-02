package com.example.aspirev.selki;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lenovo on 02/03/2018.
 */

public class MesReservationsFragment extends Fragment {
    public MesReservationsFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_mes_reservations,container,false);
        return rootView;
    }
}
