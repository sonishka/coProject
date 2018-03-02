package Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aspirev.selki.MainActivity;
import com.example.aspirev.selki.R;

import Activities.InscriptionActivity;
import Activities.InscriptionActivity;


/**
 * Created by lenovo on 26/02/2018.
 */

public class Connection extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);

        Button btn1 = (Button) findViewById(R.id.email_sign_in_button);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.email_subscribe_button);
        btn2.setOnClickListener(this);

    }


    private void gotoActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void gotoActivity1() {
        Intent intent = new Intent(this, InscriptionActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.email_sign_in_button:
                gotoActivity();
                break;
            case R.id.email_subscribe_button:
                gotoActivity1();
                break;
            default:
                break;

        }
    }
}