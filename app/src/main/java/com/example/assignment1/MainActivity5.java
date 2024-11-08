package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;


public class MainActivity5 extends AppCompatActivity {
    //here we add the stop watch that we disscused in the room class
    private ImageView img;
    private TextView title, rounds, repetions, level, calories, description;
    private Button back;
   private int seconds = 0;
    private boolean running = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        checkInstance(savedInstanceState);

        runTimer();
        Intent intent = getIntent();
        int id = (int) intent.getExtras().get("exercise_id");
        String type = (String) intent.getExtras().get("type");
        WorkoutExercises work = null;
        if (type.equals("Chest")) {
            work = WorkoutExercises.chestWorkout[id];
        }
        else if(type.equals("Back")){
            work=WorkoutExercises.backs[id];
        }
        else if(type.equals("Legs")){
            work=WorkoutExercises.legs[id];
        }
        else if(type.equals("Shoulders")){
            work=WorkoutExercises.shoulders[id];
        }
        else if(type.equals("Biceps")){
            work=WorkoutExercises.biceps[id];
        }
        else if(type.equals("Triceps")){
            work=WorkoutExercises.triceps[id];
        }
        else if(type.equals("Abs")){
            work=WorkoutExercises.abs[id];
        }
        img = findViewById(R.id.workouts_images);
        // we used glide to make the images gif to automate the images and we add the libraries into the gradle build

        Glide.with(this)
                .asGif() // Specify that we're loading a GIF
                .load(work.getImageId()) // Replace with your method to get the GIF resource ID
                .into(img);
        title = findViewById(R.id.title_workout);
        title.setText(work.getExersiceName());

        rounds = findViewById(R.id.roundvar);
        rounds.setText(String.valueOf(work.getRounds()));

        repetions = findViewById(R.id.repetionvar);
        repetions.setText(String.valueOf(work.getRepetitions()));

        level = findViewById(R.id.levelvar);
        level.setText(work.getLevel());

        calories = findViewById(R.id.caloriesvar);
        calories.setText(String.valueOf(work.getCalories()));

        description = findViewById(R.id.descriptionvar);
        description.setText(work.getDescription());

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(MainActivity5.this,MainActivity4.class) ;
             startActivity(intent);
            }
        });

    }
    private void checkInstance(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("SECONDS");
            running = savedInstanceState.getBoolean("RUNNING");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("SECONDS", seconds);
        outState.putBoolean("RUNNING", running);


    }



    private void runTimer(){
        final TextView txtTime = findViewById(R.id.txtTime);
        //this handler api we take it to take the system time
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600) / 60;
                int secs = seconds%60;
                String time = hours +" : " + minutes + " : " + secs;
                txtTime.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);

            }
        });
    }


    public void btnStartOnClick(View view) {
        running = true;
    }

    public void btnStopOnClick(View view) {
        running = false;
    }

    public void btnResetOnClick(View view) {
        running = false;
        seconds = 0;
    }


}