package com.example.kjsieit.kjsieitscapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Surge extends AppCompatActivity implements View.OnClickListener {

    TextView about_surge;
    Button desc_surge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surge);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(this);

        about_surge = (TextView)findViewById(R.id.about_surge);
        desc_surge=(Button)findViewById(R.id.desc_surge);
        desc_surge.setOnClickListener(this);


        about_surge.setText(Html.fromHtml("<h2 align='center'>About Surge</h2><p><b>‘Surge’</b>, is the annual cultural festival organized by the Students’ Council of K.J. \n" +
                "\n" +
                "Somaiya Institute Of Engineering And Information Technology.<br><br><b> Surge ‘16</b> will be held on <b>25th</b> and <b>26th \n" +
                "\n" +
                "February,2016</b>, in our college campus at Ayurvihar, Sion. Last year more that 4000 students had \n" +
                "\n" +
                "attended  and participated in our  cultural festival to make it a platform where enormous scales of \n" +
                "\n" +
                "talent were displayed.\n" +
                "\n" +
                "                       <br><br>Inspired by the success of <b>SURGE ’15</b> the Students’ Council is tremendously motivated \n" +
                "\n" +
                "to organize a bigger, better and different event than before. We are vastly passionate  of creating a \n" +
                "\n" +
                "cultural festival with a difference. Therefore ‘Surge’, as it serves our main purpose of being totally \n" +
                "\n" +
                "‘out of the box’ . We believe that Surge signifies a blend of various ideas, flavors & cultures. It also \n" +
                "\n" +
                "represents vibrancy which is precisely what we want to showcase by means of <b>Surge‘16</b>.</p><br><br><h2>About Theme</h2><p><b>“1–UP”</b> is based on classic games. The main objective of this theme is to give a reality  touch to the \n" +
                "\n" +
                "gaming world. With this theme, everyone will be experience their favorite games in real life. We aim \n" +
                "\n" +
                "to create gatherings/ events for all ages to enjoy several interactive events and competition. In \n" +
                "\n" +
                "addition, we want to gather all video game enthusiasts to create day of joy and go down the \n" +
                "\n" +
                "memory lane of childhood.</p>"));



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){


            case R.id.desc_surge:
                Intent upd = new Intent(this, Gallery.class);
                upd.putExtra("event","Surge");
                startActivity(upd);
                break;

            case R.id.fab:
                Uri uri = Uri.parse("https://www.facebook.com/surgethefest"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
        }

    }
}
