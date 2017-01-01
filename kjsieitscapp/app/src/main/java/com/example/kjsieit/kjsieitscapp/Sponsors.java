package com.example.kjsieit.kjsieitscapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Sponsors extends AppCompatActivity implements AsyncResponse, AdapterView.OnItemClickListener {

    //TextView sponsors;
    String myJSON;

    private static final String TAG_RESULTS = "result";
    private static final String TAG_SPONSOR = "Sponsor";
    private static final String TAG_DESC = "Description";

    JSONArray sponsors = null;

    ArrayList<HashMap<String, String>> sponsorList;

    ListView listsponsors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);
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

        //sponsors = (TextView)findViewById(R.id.sponsors);
        listsponsors = (ListView) findViewById(R.id.listsponsors);

        sponsorList = new ArrayList<HashMap<String, String>>();
        getData();
        listsponsors.setOnItemClickListener(this);

    }

    public void getData() {
        PostResponseAsyncTask task = new PostResponseAsyncTask(Sponsors.this);
        task.execute("http://ta-sujit.esy.es/sponsors.php");
    }


    @Override
    public void processFinish(String result) {
        myJSON = result;
        showList();
    }


    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            sponsors = jsonObj.getJSONArray(TAG_RESULTS);


            for (int i = 0; i < sponsors.length(); i++) {
                JSONObject c = sponsors.getJSONObject(i);
                String sp = c.getString(TAG_SPONSOR);
                String des = c.getString(TAG_DESC);


                HashMap<String, String> sponsors = new HashMap<String, String>();

                sponsors.put(TAG_SPONSOR, sp);
                sponsors.put(TAG_DESC, des);


                sponsorList.add(sponsors);
            }


            ListAdapter adapter = new SimpleAdapter(
                    Sponsors.this, sponsorList, R.layout.list_item,
                    new String[]{TAG_SPONSOR, TAG_DESC},
                    new int[]{R.id.Sponsor, R.id.Description}
            );


            listsponsors.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //Toast.makeText(Sponsors.this, "myPos"+parent +"myPos"+parent+"myPos"+parent+"myPos"+parent, Toast.LENGTH_SHORT).show();
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            sponsors = jsonObj.getJSONArray(TAG_RESULTS);



                JSONObject c = sponsors.getJSONObject(position);

                String des = c.getString(TAG_DESC);
                //Toast.makeText(Sponsors.this, des, Toast.LENGTH_SHORT).show();
            String url = des;
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
