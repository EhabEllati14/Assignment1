package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    //this page for the registration
    // attributes from the xml file by using the r file third parity
    private Button cancel, save;
    private EditText username, email, age, pswd, weight, height;
    private RadioGroup gender;
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private Spinner spin;
    private int correct;
    private double ages;
    private double weightres;
    private double heightres;

    private String selectedGender = "";

    //hashmap for the users
    public static HashMap<String, user> allUsers = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // define object from the xml file taht will be convert to object in the runtime
        save = findViewById(R.id.savebtn);
        cancel = findViewById(R.id.cancelbtn);
        username = findViewById(R.id.useredttxt);
        email = findViewById(R.id.emailedttxt);
        age = findViewById(R.id.birthdateedttxt);
        pswd = findViewById(R.id.pswdedttxt);
        gender = findViewById(R.id.groupradio);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        spin = findViewById(R.id.spinner);
        weight = findViewById(R.id.weightedttxt);
        height = findViewById(R.id.heightedttxt);

        //cancel to unsave the data of the data of the user
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Are You Sure You Don't Want to Register !", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // before we save we should make some validation please
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correct = 0;
                String name = username.getText().toString().trim();
                if (name.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please Enter The username !", Toast.LENGTH_LONG).show();
                } else {
                    correct += 1;
                }
                String emails = email.getText().toString().toLowerCase();
                if (emails.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please Enter The Email !", Toast.LENGTH_LONG).show();
                } else if (!(emails.contains("@"))) {
                    Toast.makeText(MainActivity2.this, "Please The Email Should Contain @", Toast.LENGTH_LONG).show();
                } else if (!(emails.endsWith("@gmail.com")) && !(emails.endsWith("@hotmail.com"))) {
                    Toast.makeText(MainActivity2.this, "Please The Email Should end with gmail/hotmail.com ", Toast.LENGTH_LONG).show();
                } else {
                    correct += 1;
                }
                String age1 = age.getText().toString();
                if (age1 == "" || age1.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please Enter Your Age !", Toast.LENGTH_LONG).show();
                } else if (!age1.matches("\\d+")) {
                    Toast.makeText(MainActivity2.this, "Please enter a valid number for age", Toast.LENGTH_LONG).show();
                } else {
                    double agess = Double.parseDouble(age.getText().toString()); // Convert the string to an integer
                    if (agess < 12 || agess > 120) {
                        Toast.makeText(MainActivity2.this, "Age must be between 12 and 120", Toast.LENGTH_LONG).show();
                    } else {
                        ages = Double.parseDouble(age.getText().toString());
                        correct += 1;
                    }
                }


                if (selectedGender.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please Select Your Gender !", Toast.LENGTH_LONG).show();
                } else {
                    correct += 1;
                }

                List<String> exp = new ArrayList<>();
                if (checkBox.isChecked()) {
                    exp.add(checkBox.getText().toString().trim());
                }

                if (checkBox2.isChecked()) {
                    exp.add(checkBox.getText().toString().trim());
                }

                if (checkBox3.isChecked()) {
                    exp.add(checkBox.getText().toString().trim());
                }
                if (checkBox4.isChecked()) {
                    exp.add(checkBox.getText().toString().trim());
                }

                if (exp.size() < 1) {
                    Toast.makeText(MainActivity2.this, "Please Select One Workout Taregt at least !", Toast.LENGTH_LONG).show();
                } else {
                    correct += 1;
                }
                String userPassword = pswd.getText().toString();
                if (userPassword.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please Enter The Password !", Toast.LENGTH_LONG).show();
                } else if (userPassword.length() < 7) {
                    Toast.makeText(MainActivity2.this, "Please The Password Length Should be at least 7 !", Toast.LENGTH_LONG).show();
                } else if (!userPassword.matches(".*\\d.*")) {
                    Toast.makeText(MainActivity2.this, "Password must contain at least one digit", Toast.LENGTH_LONG).show();
                } else {
                    correct += 1;
                }

                String experience = spin.getSelectedItem().toString();

                String heightStr = height.getText().toString();
                if (heightStr.equals("") || heightStr.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please Enter Your Height!", Toast.LENGTH_LONG).show();
                } else if (!heightStr.matches("\\d+(\\.\\d+)?")) {
                    Toast.makeText(MainActivity2.this, "Please Enter a Valid Number for Height", Toast.LENGTH_LONG).show();
                } else {
                    double heightValue = Double.parseDouble(heightStr);
                    if (heightValue < 120 || heightValue > 220) {
                        Toast.makeText(MainActivity2.this, "Height Must Be Between 120 cm and 220 cm", Toast.LENGTH_LONG).show();
                    } else {
                        heightres = heightValue;
                        correct += 1;
                    }
                }


                String weightStr = weight.getText().toString();
                if (weightStr.equals("") || weightStr.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please Enter Your Weight!", Toast.LENGTH_LONG).show();
                } else if (!weightStr.matches("\\d+(\\.\\d+)?")) {
                    Toast.makeText(MainActivity2.this, "Please Enter a Valid Number for Weight", Toast.LENGTH_LONG).show();
                } else {
                    double weightValue = Double.parseDouble(weightStr);
                    if (weightValue < 40 || weightValue > 150) {
                        Toast.makeText(MainActivity2.this, "Weight Must Be Between 40 kg and 150 kg", Toast.LENGTH_LONG).show();
                    } else {
                        weightres = weightValue;
                        correct += 1;
                    }
                }


                if (correct == 8) {
                    user u = new user(name, userPassword, emails, ages, exp, selectedGender, experience, weightres, heightres);
                    allUsers.put(name, u);
                    Toast.makeText(MainActivity2.this, "Registration successful! Welcome aboard!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);
                    correct = 0;
                }
            }

        });
        //for the radio button

        gender.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radio = findViewById(checkedId);
            selectedGender = radio.getText().toString();
        });


    }
}