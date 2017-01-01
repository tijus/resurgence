package com.example.kjsieit.kjsieitscapp;

import android.app.Activity;
import android.app.ProgressDialog;
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
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.ProgressBar;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Gallery extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    public String gal;
    private static WebView webView;
    private static ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        progress = (ProgressBar)findViewById(R.id.progressBar1);
        progress.setMax(100);
        progress.setVisibility(View.VISIBLE);

        Intent intent = getIntent();

        gal = intent.getStringExtra("event");
        webView=(WebView)findViewById(R.id.gallery);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.loadUrl("http://kjsieit.in/SC/app/gallery/index.php?event="+gal);
        webView.setWebViewClient(new com.example.kjsieit.kjsieitscapp.MyAppWebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                progress.setVisibility(View.GONE);

                findViewById(R.id.gallery).setVisibility(View.VISIBLE);
            }
            public void onReceivedError(final WebView view, int errorCode, String description,
                                        final String failingUrl) {
                //control you layout, show something like a retry button, and
                //call view.loadUrl(failingUrl) to reload.
                //Toast.makeText(Admission.this, "Connect to internet",Toast.LENGTH_LONG).show();
                webView.loadUrl("about:blank");
                startActivity(new Intent(Gallery.this, NoInternet.class));
                //super.onReceivedError(view, errorCode, description, failingUrl);
            }


        });
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
        } else if(webView.canGoBack()){
            webView.goBack();
        }
        else{
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
}
