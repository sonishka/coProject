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
    private Button connect;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
        connect=(Button) findViewById(R.id.email_sign_in_button);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }
        });
    }
    private void goToNextActivity(){
        Intent intent = new Intent(Connection.this ,Acceuil.class );
        startActivity(intent);
    }
}