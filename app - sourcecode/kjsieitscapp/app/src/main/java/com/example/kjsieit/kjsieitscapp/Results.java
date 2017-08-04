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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Results extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    public String mc,fc;
    private WebView webView;
    private static ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        mc = intent.getStringExtra("mcr");
        fc = intent.getStringExtra("fcr");
        //Toast.makeText(this, mc+", "+fc, Toast.LENGTH_LONG).show();
        progress = (ProgressBar)findViewById(R.id.progressBar1);
        progress.setMax(100);
        progress.setVisibility(View.VISIBLE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        webView=(WebView)findViewById(R.id.results);
        final WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //webSettings.getJavaScriptEnabled();
      //  webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl("http://kjsieit.in/SC/app/results.php?branch="+fc+"&year="+mc);
        webView.setWebViewClient(new com.example.kjsieit.kjsieitscapp.MyAppWebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                progress.setVisibility(View.GONE);

                findViewById(R.id.results).setVisibility(View.VISIBLE);
            }
            public void onReceivedError(final WebView view, int errorCode, String description,
                                        final String failingUrl) {
                //control you layout, show something like a retry button, and
                //call view.loadUrl(failingUrl) to reload.
                Toast.makeText(Results.this, "Please connect to internet",Toast.LENGTH_LONG).show();
                webView.loadUrl("about:blank");
                startActivity(new Intent(Results.this, NoInternet.class));
                //super.onReceivedError(view, errorCode, description, failingUrl);
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {

                if (url.endsWith(".pdf")) {
                    //Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/gview?embedded=true&url="+url));
                    //view.getContext().startActivity(intent);
                    //Toast.makeText(view.getContext(), url, Toast.LENGTH_LONG).show();
        //            webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                    webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
                    return true;
                }
                return false;


            }


        });

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
