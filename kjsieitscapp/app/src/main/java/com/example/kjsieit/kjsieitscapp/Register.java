package com.example.kjsieit.kjsieitscapp;

import android.content.Intent;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class Register extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener, AsyncResponse {

    Button bRegister;
    EditText retFullname, retUsername, retPassword, retBranch_Year,retCollege,retContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        retFullname=(EditText)findViewById(R.id.retFullname);
        retUsername=(EditText)findViewById(R.id.retUsername);
        retPassword=(EditText)findViewById(R.id.retPassword);
        retBranch_Year=(EditText)findViewById(R.id.retBranch_Year);
        retCollege=(EditText)findViewById(R.id.retCollege);
        retContact=(EditText)findViewById(R.id.retContact);

        bRegister=(Button)findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);

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
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        HashMap postData = new HashMap();
        postData.put("rtxtFullname", retFullname.getText().toString());
        postData.put("rtxtUsername", retUsername.getText().toString());
        postData.put("rtxtPassword", retPassword.getText().toString());
        postData.put("rtxtBranchYear", retBranch_Year.getText().toString());
        postData.put("rtxtCollege", retCollege.getText().toString());
        postData.put("rtxtContact", retContact.getText().toString());
        PostResponseAsyncTask task = new PostResponseAsyncTask(Register.this, postData);
        task.execute("http://ta-sujit.esy.es/register.php");
    }

    @Override
    public void processFinish(String result) {

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}
