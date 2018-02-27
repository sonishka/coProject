package com.example.aspirev.selki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by lenovo on 26/02/2018.
 */

public class Acceuil extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        Intent intent=getIntent();
    }
}
