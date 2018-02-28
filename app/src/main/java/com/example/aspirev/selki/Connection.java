package com.example.aspirev.selki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 26/02/2018.
 */

public class Connection extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
        Button btn1 = (Button) findViewById(R.id.email_sign_in_button);
       if(btn1.callOnClick()) {
           Intent intent = new Intent(this, Inscription.class);
           startActivity(intent);
       }

    }

}