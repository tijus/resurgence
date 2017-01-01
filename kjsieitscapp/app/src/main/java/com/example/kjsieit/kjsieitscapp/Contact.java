package com.example.kjsieit.kjsieitscapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Contact extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,AsyncResponse,  View.OnClickListener{

    EditText retFullname, retEmail,retMessage;
    Button bSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        retFullname = (EditText)findViewById(R.id.retFullname);
        retEmail = (EditText)findViewById(R.id.retEmail);
        retMessage = (EditText)findViewById(R.id.retMessage);
        bSend = (Button)findViewById(R.id.bSend);
        bSend.setOnClickListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
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

    @Override

    @SuppressWarnings("StatementWithEmptyBody")

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
    public void onClick(View view) {
        if(retFullname.getText().toString().equals(""))
        {
            Toast.makeText(Contact.this, "Please Fill your Name", Toast.LENGTH_SHORT).show();
        }
        else if(retEmail.getText().toString().equals(""))
        {
            Toast.makeText(Contact.this, "Please Fill your Email Id", Toast.LENGTH_LONG).show();
        }
        else if(!(retEmail.getText().toString().contains("@")))
        {
            Toast.makeText(Contact.this, "Please Fill a valid Email Address", Toast.LENGTH_LONG).show();
        }
        else if(retMessage.getText().toString().equals(""))
        {
            Toast.makeText(Contact.this, "Please mention any query", Toast.LENGTH_SHORT).show();
        }
        else
        {
            HashMap postData = new HashMap();
            postData.put("rtxtFullname", retFullname.getText().toString());
            postData.put("rtxtEmail", retEmail.getText().toString());

            postData.put("rtxtMessage", retMessage.getText().toString());

            PostResponseAsyncTask task = new PostResponseAsyncTask(Contact.this, postData);
            task.execute("http://kjsieit.in/SC/app/feedback.php");
        }

    }

    @Override
    public void processFinish(String result) {
        if(result.equals("")) {
            Toast.makeText(Contact.this, "Please Connect to Internet", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Contact.this, NoInternet.class));
        }
        else
        {
            Toast.makeText(Contact.this, "Your message sent successfully", Toast.LENGTH_SHORT).show();

        }
    }
}
