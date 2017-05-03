package com.example.kyu.caparuf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView vor = (TextView) findViewById(R.id.vor);

        vor.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent vorIntent = new Intent(MainActivity.this, VORActivity.class);

                startActivity(vorIntent);
            }
        });

        TextView kkr = (TextView) findViewById(R.id.kkr);

        kkr.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent kkrIntent = new Intent(MainActivity.this, KKRActivity.class);

                startActivity(kkrIntent);
            }
        });

        TextView ndb = (TextView) findViewById(R.id.ndb);

        ndb.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent ndbIntent = new Intent(MainActivity.this, NDBActivity.class);

                startActivity(ndbIntent);
            }
        });

        TextView tacan = (TextView) findViewById(R.id.tacan);

        tacan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tacanIntent = new Intent(MainActivity.this, TacanActivity.class);

                startActivity(tacanIntent);
            }
        });
    }
}
