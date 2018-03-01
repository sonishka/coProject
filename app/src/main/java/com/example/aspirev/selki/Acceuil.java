package com.example.aspirev.selki;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by lenovo on 26/02/2018.
 */

public class Acceuil extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        Button btn1 = (Button) findViewById(R.id.id_chercher);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.id_proposer);
        btn2.setOnClickListener(this);
    }

    private void gotoActivity() {
        Intent intent = new Intent(this,ChercherCovoiturage.class);
        startActivity(intent);
    }

    private void gotoActivity1() {
        Intent intent = new Intent(this,ProposerCovoiturage.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_chercher:
                gotoActivity();
                break;
            case R.id.id_proposer:
                gotoActivity1();
                break;
            default:
                break;

        }
    }
}
