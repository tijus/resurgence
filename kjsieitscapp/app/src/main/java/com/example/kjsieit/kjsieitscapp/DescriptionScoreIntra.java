package com.example.kjsieit.kjsieitscapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class DescriptionScoreIntra extends AppCompatActivity  {

    TextView description_score_intra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_score_intra);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        description_score_intra = (TextView)findViewById(R.id.description_score_intra);
        description_score_intra.setText(Html.fromHtml("<h4>Event : Open Football</h4>\n" +
                "\n" +
                "<b>Event Head :</b>\n<br>" +
                "\n" +
                "Nimish Bandivedakar-9987810455\n<br>" +
                "\n" +
                "Prasad- 8767486565\n<br>" +
                "\n" +
                "Yash Panchal-8879347035\n<br>" +
                "\n<br>" +
                "<b>Rules:</b>\n<br>" +
                "\n" +
                "1. Number of players : 11+4\n<br>" +
                "\n" +
                "2. Rolling Substitites are allowed.\n<br>" +
                "\n" +
                "3. Halftime is 20 minutes with 5 minutes between halves.\n<br>" +
                "\n" +
                "4. All standard FIFA rules are applicable.\n<br>" +
                "\n" +
                "5. Registration will be done on first come first serve basis.\n<br>" +
                "\n" +
                "6. All teams are requested to give complete list of 15 men squad when they \n" +
                "\n" +
                "report for their matches with thei college identity cards.\n<br>" +
                "\n" +
                "7. The squad cannot be changed for the rest of the tournament or else the \n" +
                "\n" +
                "team will be disqualified.\n<br>" +
                "\n" +
                "8. Referees cannot questioned and the decision will be final.\n<br><br>" +
                "<h4>Event : Open cricket</h4>\n" +
                "\n" +
                "<b>Event Heads :</b>\n<br>" +
                "\n" +
                "Ronak Gothi:9699228353\n<br>" +
                "\n" +
                "Rahul baddi:8691951417\n<br>" +
                "\n" +
                "Vinay Kamte:8452099114\n<br>" +
                "\n<br>" +
                "<b>Rules:</b>\n<br>" +
                "\n" +
                "1. Umpires decision will be the final decision.\n<br>" +
                "\n" +
                "2. There will be a free-hit on an overstepping  no-ball.\n<br>" +
                "\n" +
                "3. Net run rate basd on runs and overs.\n<br>" +
                "\n" +
                "4. 6 overs matches will be played.\n<br>" +
                "\n" +
                "5. It will be knockout tournament.\n<br>" +
                "\n" +
                "6. Superover will be played incase of draw match. \n<br>" +
                "\n" +
                "7. The match should be completed within 50 minutes otherwise penalty of 10 \n" +
                "\n" +
                "runs.<br><br><h4>Event : Rink Football</h4>\n" +
                "\n" +
                "<b>Event Heads :</b>\n<br>" +
                "\n" +
                "Sumit Jethva - 9821694674\n<br>" +
                "\n" +
                "Karan shah - 9821422177\n<br><br>" +
                "\n" +
                "<b>Rules:\n</b>" +
                "\n" +
                "1. Number of players : 5+2\n<br>" +
                "\n" +
                "2. Rolling substitutes are allowed.\n<br>" +
                "\n" +
                "3. Half length is 10 minutes with a break of 5 minutes between the halves. \n<br>" +
                "\n" +
                "4. The draws are made by the committee and cannot be changed or \n" +
                "\n" +
                "questioned.\n<br>" +
                "\n" +
                "5. Referees cannot be questioned and the decision will be final.\n<br>" +
                "\n" +
                "6. Other rules will be told before the match.<br><br>" +
                "<h4>Event:Box Cricket & Mix-Box Cricket</h4>\n" +
                "\n" +
                "<b>Event heads:\n</b><br>" +
                "\n" +
                "Manish pandey-8691808830\n<br>" +
                "\n" +
                "Sushant parte-7045129629\n<br>" +
                "\n" +
                "Jenish prajapati-9619373018\n<br><br>" +
                "\n" +
                "<b>Rules:\n</b><br>" +
                "\n" +
                "1. Umpires decision will be the final decision.\n<br>" +
                "\n" +
                "2. It will be knockout tournament.<br><br><h4>Event: Badminton</h4>\n" +
                "\n" +
                "<b>Event head:</b>\n<br>" +
                "\n" +
                "Mousami Sabnis: 9967002967\n<br>" +
                "\n" +
                "Rohan Rajyadhax:8692906709\n<br>" +
                "\n" +
                "Karthik karkera:8097021236\n<br><br>" +
                "\n" +
                "<b>Rules:</b>\n<br>" +
                "\n" +
                "1. Tournament progresses as knockout rounds.\n<br>" +
                "\n" +
                "2. All matches will be best of 3 games.Each match of 21 points.\n<br>" +
                "\n" +
                "3. Standard badminton rules apply during the course of match.<br><br><h4>Event : Table Tennis</h4>\n" +
                "\n" +
                "<b>Event heads:</b>\n<br>" +
                "\n" +
                "Anuj panchal:\n<br>" +
                "\n" +
                "Nimish Bandivedakar-9987810455\n<br><br>" +
                "\n" +
                "<b>Rules:</b>\n<br>" +
                "\n" +
                "1.Each game will be of 11 points,serves and ends only when one player reaches \n" +
                "\n" +
                "11 points.\n<br>" +
                "\n" +
                "2.All matches will be played on a knockout basis.\n<br>" +
                "\n" +
                "3.Any number  of Re(net) serves are allowed.For serving,the ball has to be tossed \n" +
                "\n" +
                "with open palm,minimum 6 inches .From the start of service until it is struck,the \n" +
                "\n" +
                "ball hasto be above the level of the playing surfaceand behind the servers end \n" +
                "\n" +
                "line,and it cannot be hidden from the receiver by the server.Ball once tossed has \n" +
                "\n" +
                "to be served  else point is lost.\n<br>" +
                "\n" +
                "4.Bat touch is allowed but body touch is considered as violation.\n<br>" +
                "\n" +
                "5.Participants are requested to play with the provided college bats and to bring if \n" +
                "\n" +
                "possible.<br><br><h4>Event : Chess</h4>\n" +
                "\n" +
                "<b>Event Heads:</b>\n<br>" +
                "\n" +
                "Yash Sawant –9820551456\n<br>" +
                "\n" +
                "Prasad-9969786262\n<br>" +
                "\n" +
                "<b>Rules:</b>\n<br>" +
                "\n<br>" +
                "1. Draws will be declared by the committee and cannot be questioned.\n<br>" +
                "\n" +
                "2. Each player will be provided with 45 minutes of play.\n<br>" +
                "\n" +
                "3. In case of draw a Blitz match of 5 minutes will decide the winner.\n<br>" +
                "\n" +
                "4. Participants are requested to bring their own chess board.<br><br><h4>Event : Carrom</h4>\n" +
                "\n" +
                "<b>Event Heads:</b> \n<br>" +
                "\n" +
                "Mahesh-82864999378\n<br>" +
                "\n" +
                "Rahul Baddi-8691951417\n<br>" +
                "\n" +
                "Smit kotadiya-9773472854\n<br><br>" +
                "\n" +
                "<b>Rules:</b> \n<br>" +
                "\n" +
                "1. It is an individual event\n<br>" +
                "\n" +
                "2. Adjusting chairs after the match starts will not be allowed.\n<br>" +
                "\n" +
                "3. Touching of coins while picking striker is considered as foul\n<br>" +
                "\n" +
                "4. All university rules are applicable.<br><br><h4>Event : Volleyball</h4>\n" +
                "\n" +
                "<b>Event head :</b> \n<br>" +
                "\n" +
                "Gyanendra singh-9702022327\n<br>" +
                "\n" +
                "Ronak gothi- 9699228353\n<br><br>" +
                "\n" +
                "<b>Rules:</b>\n<br>" +
                "\n" +
                "1. Number of players : 6+4\n<br>" +
                "\n" +
                "2. There will be best of three set match.\n<br>" +
                "\n" +
                "3. First and second set will be of 25 points and third will be of 15 points.\n<br>" +
                "\n" +
                "4. Touching the net will be considered as foul and a point will be given to \n" +
                "\n" +
                "opponent team.\n<br>" +
                "\n" +
                "5. Crossing the line under the net and the line for service will also be \n" +
                "\n" +
                "considered as a foul.<br><br><h4>Event : Throwball</h4>\n" +
                "\n" +
                "Throw ball is played between two teams of seven players or nine players.\n<br>" +
                "\n" +
                "The first team to score 25 points wins a set. \n<br>" +
                "\n" +
                "A match is of 3 sets.\n<br>" +
                "\n" +
                "Service is within 5 seconds after te referee whistles and is done rom the serve \n" +
                "\n" +
                "one,without crossing the end line.<br><br><h4>Event : Dodge ball</h4>\n" +
                "\n" +
                "The main objective of each team is to eliminate all members of the opposing team \n" +
                "\n" +
                "by hitting them with thrown balls,catching a ball thrown by a member of opposing \n" +
                "\n" +
                "team.<br><br>" ));
    }


}
