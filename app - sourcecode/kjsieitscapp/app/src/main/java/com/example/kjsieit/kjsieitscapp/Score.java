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

public class Score extends AppCompatActivity implements View.OnClickListener {

    TextView about_score;
    Button reg_score,desc_score,reg_score_intra,desc_score_intra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(this);


        about_score = (TextView)findViewById(R.id.about_score);



        desc_score_intra=(Button)findViewById(R.id.desc_score_intra);
       // reg_score_intra=(Button)findViewById(R.id.reg_score_intra);


        about_score.setText(Html.fromHtml("<h2>About Score</h2><p><b>‘SCORE’</b>, is the annual sports festival organized by the Students’ Council of K.J.<br><br>" +
                "<b>SCORE ‘16</b> will be held on <b>23rd</b> and <b>24th February,2016</b>, in our college campus at \n" +
                "\n" +
                "Ayurvihar, Sion. Last year more than 4000 students had attended and participated in our sports \n" +
                "\n" +
                "festival to make it a platform where enormous scales of skills were displayed.\n" +
                "\n" +
                "                       <br><br>Inspired by the success of <b>SCORE ’15</b> the Students’ Council is tremendously motivated \n" +
                "\n" +
                "to organize a bigger, better and different event than before. We are vastly passionate of creating a \n" +
                "\n" +
                "sports festival with a difference. It also represents vibrancy which is precisely what we want to \n" +
                "\n" +
                "showcase by means of <b>Score‘16</b>.</p>" +
                "<h3>General Rules</h3>" +
                "1. Identity Cards and Registration cards should be carried for every match.\n<br>" +
                "\n" +
                "2. Registrations will be done on  first come first serve basis.\n<br>" +
                "\n" +
                "3. The draws are made by the committee and cannot be changed or \n" +
                "\n" +
                "questioned.\n<br>" +
                "\n" +
                "4. Decision of umpire/referee will be final and cannot be questioned.\n<br>" +
                "\n" +
                "5. The right to dismiss the event(S)/change in the prize money/change in the \n" +
                "\n" +
                "rules in any case without any prior notice lie with the organizing \n" +
                "\n" +
                "committee.\n<br>" +
                "\n" +
                "6. Organizing committee of SCORE reserves the right to debar the \n" +
                "\n" +
                "team/player if they are found to misbehave or violate rules.\n<br>" +
                "\n" +
                "7. No Re-entry is allowed.\n<br>" +
                "\n" +
                "8. Only Engineering colleges students can register."));




        desc_score_intra.setOnClickListener(this);
        
        //listsponsors.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.desc_score_intra:
                Intent upd = new Intent(this, Gallery.class);
                upd.putExtra("event","Score");
                startActivity(upd);
                break;

            case R.id.fab:
                Uri uri = Uri.parse("https://www.facebook.com/scorethefest"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;

        }

    }


}
