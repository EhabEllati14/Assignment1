package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
private ListView listview;
private TextView title;
private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        // in listview we should put the arrayadapter
        ArrayAdapter<WorkoutExercises> listAdapter =null;
        Intent intent =getIntent();
        // get intent to take the extra informations from the previous intent or activity
        String type =(String)intent.getExtras().get("type");
        title=findViewById(R.id.workouttitle);
        title.setText(type);
        // for each type we get the array of its data
        if(type.equals("Chest")){
            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.chestWorkout);
        }
        else if(type.equals("Back")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.backs);
        }
        else if(type.equals("Legs")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.legs);
        }
        else if(type.equals("Shoulders")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.shoulders);
        }
        else if(type.equals("Biceps")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.biceps);
        }
        else if(type.equals("Triceps")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.triceps);
        }
        else if(type.equals("Abs")){

            listAdapter = new ArrayAdapter<WorkoutExercises>(MainActivity4.this,
                    android.R.layout.simple_list_item_1,
                    WorkoutExercises.abs);
        }

        ListView listView = (ListView)findViewById(R.id.exciseslstview);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(MainActivity4.this,
                        MainActivity5.class);
                intent.putExtra("exercise_id", (int)id);
                intent.putExtra("type",type);
                Toast.makeText(MainActivity4.this,"Don't Forget To Drink Water And Take a Rest",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        };
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(itemClickListener);
    }
}