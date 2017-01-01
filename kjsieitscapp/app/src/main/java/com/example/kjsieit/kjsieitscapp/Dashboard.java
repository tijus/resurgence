package com.example.kjsieit.kjsieitscapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener{

    ImageView member, updates, fests;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       member=(ImageView)findViewById(R.id.member);
        updates=(ImageView)findViewById(R.id.updates);
        fests=(ImageView)findViewById(R.id.fests);


        member.setOnClickListener(this);
        updates.setOnClickListener(this);
        fests.setOnClickListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        SharedPreferences.Editor login= (SharedPreferences.Editor) getSharedPreferences("KJSIEIT", Context.MODE_PRIVATE).edit();
        login.putString("rm","no");
        login.commit();

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
        switch(item.getItemId()){
            case R.id.nav_Home:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.nav_Noticeboard:
                startActivity(new Intent(this, NotificationMain.class));
                break;
            case R.id.nav_Results:
                startActivity(new Intent(this, ResultsMain.class));
                break;
            case R.id.nav_Admission:
                startActivity(new Intent(this, AdmissionMain.class));
                break;
            case R.id.nav_SC:
                startActivity(new Intent(this, Dashboard.class));
                break;
            case R.id.nav_Contact:
                startActivity(new Intent(this, Contact.class));
                break;
            case R.id.nav_Updates:
                Intent upd = new Intent(this, Updates.class);
                upd.putExtra("role","admin");
                startActivity(upd);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.member:
                startActivity(new Intent(this, Members.class));
                break;
            case R.id.updates:
                Intent upd = new Intent(this, Updates.class);
                upd.putExtra("role","user");
                startActivity(upd);
                break;
            case R.id.fests:
                startActivity(new Intent(this, Fests.class));
                break;
            case R.id.fab:
                startActivity(new Intent(this, Contact.class));
                break;

        }
    }
}
