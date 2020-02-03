package com.example.registerlogin;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class HomeActivity extends AppCompatActivity {
    private TextView home_username, home_password, home_gender, home_phonenumber, home_country;
    private Button home_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home_username = findViewById(R.id.home_username);
        home_password = findViewById(R.id.home_password);
        home_gender = findViewById(R.id.home_gender);
        home_phonenumber = findViewById(R.id.home_phonenumber);
        home_country = findViewById(R.id.home_country);

        home_username.setText("Username : "+getIntent().getStringExtra("name"));
        home_password.setText("Password : "+getIntent().getStringExtra("password"));
        home_gender.setText("Gender : "+getIntent().getStringExtra("gender"));
        home_phonenumber.setText("Phone Number : "+getIntent().getStringExtra("phonenumber"));
        home_country.setText("Country : "+getIntent().getStringExtra("country"));

        home_button = findViewById(R.id.Back_Button);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_button = findViewById(R.id.Back_Button);
                Toast.makeText(HomeActivity.this, "You're Exit", Toast.LENGTH_SHORT).show();
                Intent intent_toRegister = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent_toRegister);
            }
        });

    }
}
