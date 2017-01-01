package com.example.kjsieit.kjsieitscapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.ArrayList;
import java.util.HashMap;

public class RegistrationScoreIntra extends AppCompatActivity implements View.OnClickListener, AsyncResponse {

    String eventsresult="";

    CheckBox opencricket,boxcricket,openfootball,volleyball,rinkfootball,chess,carroms,carromd,badmintonbs,badmintonbd,tabletenniss,tabletennisd,throwballgirls,dodgeballgirls;
    Button bRegisterScore;
    EditText retFullname, retUsername, retBranch_Year,retContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_score_intra);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        bRegisterScore = (Button)findViewById(R.id.bRegisterScore);
        retFullname = (EditText)findViewById(R.id.retFullname);
        retUsername = (EditText)findViewById(R.id.retUsername);
        //retPassword = (EditText)findViewById(R.id.retPassword);
        retBranch_Year = (EditText)findViewById(R.id.retBranch_Year);

        retContact = (EditText)findViewById(R.id.retContact);
        openfootball = (CheckBox)findViewById(R.id.openfootball);
        opencricket = (CheckBox)findViewById(R.id.opencricket);
        boxcricket = (CheckBox)findViewById(R.id.boxcricket);
        tabletenniss = (CheckBox)findViewById(R.id.tabletenniss);
        tabletennisd = (CheckBox)findViewById(R.id.tabletennisd);
        volleyball = (CheckBox)findViewById(R.id.volleyball);
        dodgeballgirls = (CheckBox)findViewById(R.id.dodgeballgirls);
        throwballgirls = (CheckBox)findViewById(R.id.throwballgirls);
        rinkfootball = (CheckBox)findViewById(R.id.rinkfootball);
        chess = (CheckBox)findViewById(R.id.chess);
        carroms = (CheckBox)findViewById(R.id.carroms);
        carromd = (CheckBox)findViewById(R.id.carromd);
        badmintonbs = (CheckBox)findViewById(R.id.badmintonbs);
        badmintonbd = (CheckBox)findViewById(R.id.badmintonbd);
        bRegisterScore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(retFullname.getText().toString().equals(""))
        {
            Toast.makeText(RegistrationScoreIntra.this, "Please Fill your First Name", Toast.LENGTH_SHORT).show();
        }
        else if(retUsername.getText().toString().equals(""))
        {
            Toast.makeText(RegistrationScoreIntra.this, "Please Fill your correct email address", Toast.LENGTH_SHORT).show();
        }
        else if(retBranch_Year.getText().toString().equals(""))
        {
            Toast.makeText(RegistrationScoreIntra.this, "Please Fill your Branch and year", Toast.LENGTH_SHORT).show();
        }
        else if(retContact.getText().toString().equals("") || retContact.getText().toString().length()!=10)
        {
            Toast.makeText(RegistrationScoreIntra.this, "Contact information not filled properly", Toast.LENGTH_SHORT).show();
        }
        else if((openfootball.isChecked() == false) && (volleyball.isChecked() == false) && (rinkfootball.isChecked() == false) && (chess.isChecked() == false) && (carromd.isChecked() == false) && (carroms.isChecked() == false) && (badmintonbd.isChecked() == false) && (badmintonbs.isChecked() == false) && (opencricket.isChecked() == false) && (boxcricket.isChecked() == false) && (tabletenniss.isChecked())&& (tabletennisd.isChecked())&& (dodgeballgirls.isChecked())&& (throwballgirls.isChecked()))
        {
            Toast.makeText(RegistrationScoreIntra.this, "Please Fill at least one event before registering", Toast.LENGTH_SHORT).show();
        }
        else {
            ArrayList<String> eventregistered = new ArrayList<String>();
            if(openfootball.isChecked()) {
                eventregistered.add(openfootball.getText().toString());
            }
            if(volleyball.isChecked()) {
                eventregistered.add(volleyball.getText().toString());
            }
            if(rinkfootball.isChecked()) {
                eventregistered.add(rinkfootball.getText().toString());
            }
            if(boxcricket.isChecked()) {
                eventregistered.add(boxcricket.getText().toString());
            }
            if(opencricket.isChecked()) {
                eventregistered.add(opencricket.getText().toString());
            }
            if(tabletennisd.isChecked()) {
                eventregistered.add(tabletennisd.getText().toString());
            }
            if(tabletenniss.isChecked()) {
                eventregistered.add(tabletenniss.getText().toString());
            }
            if(throwballgirls.isChecked()) {
                eventregistered.add(throwballgirls.getText().toString());
            }
            if(dodgeballgirls.isChecked()) {
                eventregistered.add(dodgeballgirls.getText().toString());
            }
            if(chess.isChecked()) {
                eventregistered.add(chess.getText().toString());
            }
            if(carromd.isChecked()) {
                eventregistered.add(carromd.getText().toString());
            }
            if(carroms.isChecked()) {
                eventregistered.add(carroms.getText().toString());
            }
            if(badmintonbs.isChecked()) {
                eventregistered.add(badmintonbs.getText().toString());
            }
            if(badmintonbd.isChecked()) {
                eventregistered.add(badmintonbd.getText().toString());
            }

            StringBuilder sb = new StringBuilder();
            for (String n : eventregistered) {
                if (sb.length() > 0) sb.append(',');
                sb.append("").append(n).append("");
            }
            eventsresult= sb.toString();
            HashMap postData = new HashMap();
            postData.put("rtxtFullname", retFullname.getText().toString());
            postData.put("rtxtUsername", retUsername.getText().toString());
            //postData.put("rtxtPassword", retPassword.getText().toString());
            postData.put("rtxtBranchYear", retBranch_Year.getText().toString());
            postData.put("rtxtCollege", "KJSIEIT");
            postData.put("rtxtContact", retContact.getText().toString());
            postData.put("cricket",eventsresult);
            PostResponseAsyncTask task = new PostResponseAsyncTask(RegistrationScoreIntra.this, postData);
            task.execute("http://ta-sujit.esy.es/newregister.php");
        }
    }
    @Override
    public void processFinish(String result) {
        if(result.equals("")) {
            Toast.makeText(RegistrationScoreIntra.this, "Network Error. Please Connect Internet", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(RegistrationScoreIntra.this, result, Toast.LENGTH_SHORT).show();

        }
    }
}
