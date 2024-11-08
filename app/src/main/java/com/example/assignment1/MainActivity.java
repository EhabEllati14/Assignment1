package com.example.assignment1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Welcome To My project
//My Project is about exercises (workouts)
public class MainActivity extends AppCompatActivity {
    // First we declare attributes to define a objects from the xml file by using r file third parity between them
    // All these attributes they will covert to objects in the runtime
    private EditText edittxt1;
    private EditText edittxt2;
    private Button btn, register;
    //we crate objec from the Mainactivity2 to save the use in the arrraylist when they register.
    MainActivity2 ac2 = new MainActivity2();
// when we run this activity the oncreate method will called
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Ensure EdgeToEdge class is defined properly
        setContentView(R.layout.activity_main);
        //create object form the xml file by using the third parity R file
        edittxt1 = findViewById(R.id.edttxt1);
        edittxt2 = findViewById(R.id.pswd);
        btn = findViewById(R.id.button);
        register = findViewById(R.id.button2);


        // when the user click on the register button they will open the new activity
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
///////important note /////
        // when they click on login button , there is a validation to make sure that this user is register
        //Please Important note
        //first you should go to the register screen before login
        // because when you login because we dont have a database so first you will create account to save your data on the arraylist
        //after that you can login
        // please any error in nputs in the register ther is a toast will shown
        // after that when you register please enter you name and password

        // please you can enter this data

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edittxt1.getText().toString();
                String password = edittxt2.getText().toString();
                //validations for the username
                //if the user name is null or empty
                if (username.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter Your Name ", Toast.LENGTH_LONG).show();
                }
                //if the password is empty
                if (password.equals("")) {
                    Toast.makeText(MainActivity.this, "Please Enter Your Name ", Toast.LENGTH_LONG).show();
                }
                // get the user from the hashmap
                user u = MainActivity2.allUsers.get(username);
                //if the user is not exists
                if (u == null) {
                    Toast.makeText(MainActivity.this, "If You Are New User, Please Register", Toast.LENGTH_LONG).show();
                } else if (username.equals(u.getUsername())) {
                    //if we found the user
                    if (password.equals(u.getPassword())) {
                        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent);
                        edittxt1.setText("");
                        edittxt2.setText("");
                        Toast.makeText(MainActivity.this, "Welcome to our app! Have a great day!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Incorrect password, please try again!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect username or does not exist!", Toast.LENGTH_LONG).show();
                }



            }
        });


    }

}