package com.example.kjsieit.kjsieitscapp;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Admission extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    public String mca;
    private static WebView webView;
    private static ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progress = (ProgressBar)findViewById(R.id.progressBar1);
        progress.setMax(100);
        progress.setVisibility(View.VISIBLE);
        Intent intent = getIntent();

        mca = intent.getStringExtra("mca");

        webView=(WebView)findViewById(R.id.admission);
        final WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl("http://kjsieit.in/SC/app/admissions.php?matter="+mca);
        webView.setWebViewClient(new com.example.kjsieit.kjsieitscapp.MyAppWebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                progress.setVisibility(View.GONE);

                findViewById(R.id.admission).setVisibility(View.VISIBLE);
            }
            public void onReceivedError(final WebView view, int errorCode, String description,
                                        final String failingUrl) {
                Toast.makeText(Admission.this, "Please connect to internet",Toast.LENGTH_LONG).show();
                webView.loadUrl("about:blank");
                startActivity(new Intent(Admission.this, NoInternet.class));
                //super.onReceivedError(view, errorCode, description, failingUrl);
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                if (url.endsWith(".pdf")) {
  //                  webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                    webView.loadUrl("https://docs.google.com/gview?embedded=true&url="+url);
                    return true;
                }
                return false;
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
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.fab:
                startActivity(new Intent(this, Contact.class));
                break;
        }
    }
}
