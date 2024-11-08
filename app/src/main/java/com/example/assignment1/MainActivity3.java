package com.example.assignment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    //attributes
    private ListView listview;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                //for hte list view each position have a type in the workoutExercise object
                // when we opent the activity we will put extra message which its the ype
                if (position == 0) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Chest");
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Back");
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Legs");
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Shoulders");
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Biceps");
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Triceps");
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("type", "Abs");
                    startActivity(intent);
                }

            }
        };
        // when we click on the item we take its postion
        ListView listView = (ListView) findViewById(R.id.workoutCategorylstview);
        listView.setOnItemClickListener(itemClickListener);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

