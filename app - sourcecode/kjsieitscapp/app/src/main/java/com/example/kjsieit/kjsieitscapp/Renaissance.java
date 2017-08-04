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

public class Renaissance extends AppCompatActivity implements View.OnClickListener {

    TextView about_renaissance;
    Button desc_renaissance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renaissance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(this);

        about_renaissance = (TextView)findViewById(R.id.about_renaissance);
        desc_renaissance = (Button)findViewById(R.id.desc_renaissance);

        about_renaissance.setText(Html.fromHtml("<h2>About Renaissance</h2><p><b>‘RENAISSANCE’</b>, is the annual technical festival that is organized in K.J. Somaiya " +
                "Institue of Engineering and Information Technology, Sion<br><br>" +
                "It is organized by the students of the institute and is organized in the month of august or september.<br><br>" +
                "This year, Renaissance was organized on 22nd and 23rd of September and the theme was 'Make in India' which was " +
                "inaugurated by Mr. Sunil Khanna, President, Emerson Power India Ltd."));



        desc_renaissance.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){


           case R.id.desc_renaissance:
                Intent upd = new Intent(this, Gallery.class);
                upd.putExtra("event","Renaissance");
                startActivity(upd);
                break;


            case R.id.fab:
                Uri uri = Uri.parse("https://www.facebook.com/renaissancethefest/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;


        }
    }
}
