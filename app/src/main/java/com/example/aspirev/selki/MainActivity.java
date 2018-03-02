package com.example.aspirev.selki;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    NavigationView navigationView =null ;
    Toolbar toolbar =null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment fragment = new MainFragment();
        android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
        FragmentTransaction.replace(R.id.fragment_container,fragment);
        FragmentTransaction.commit();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.vehicule) {
            VehiculeFragment fragment = new VehiculeFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();


        } else if (id == R.id.modifierinfoperso) {
           ModifierInfoPersonnelleFragment fragment = new ModifierInfoPersonnelleFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();


        } else if (id == R.id.cherchercovoiturage) {
            ChercherCovoiturageFragment fragment = new ChercherCovoiturageFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();

        } else if (id == R.id.proposercovoiturage) {
            ProposerCovoiturageFragment fragment = new ProposerCovoiturageFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();

        } else if (id == R.id.contactez) {
            Contactez_nousFragment fragment = new Contactez_nousFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();


        } else if (id == R.id.prefrences) {
            PrefrencesFragment fragment = new PrefrencesFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();

        }else if (id==R.id.avenir){
            MesTrajetsAvenirFragment fragment = new MesTrajetsAvenirFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();
        }else if (id==R.id.res){
            MesReservationsFragment fragment = new MesReservationsFragment();
            android.support.v4.app.FragmentTransaction FragmentTransaction = getSupportFragmentManager().beginTransaction() ;
            FragmentTransaction.replace(R.id.fragment_container,fragment);
            FragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
