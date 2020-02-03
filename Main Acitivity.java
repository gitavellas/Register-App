package com.example.registerlogin;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private Button mregistButton;
    private String mString_username, mString_password, mString_gender, mString_phonenumber, mString_country;
    private EditText mUsername, mPassword, mGender, mPhoneNumber, mcountry;
    public static final String Name = "name";
    public static final String Password = "password";
    public static final String Gender = "gender";
    public static final String PhoneNumber = "phonenumber";
    public static final String Coutntry = "country";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsername = findViewById(R.id.Username_EditText);
        mPassword = findViewById(R.id.Password_EditText);
        mGender = findViewById(R.id.Gender_EditText);
        mPhoneNumber = findViewById(R.id.PhoneNumber_EditText);
        mcountry = findViewById(R.id.Country_EditText);
        mregistButton = findViewById(R.id.Register_Button);
        mregistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mString_username = mUsername.getText().toString();
                mString_password = mPassword.getText().toString();
                mString_gender = mGender.getText().toString();
                mString_phonenumber = mPhoneNumber.getText().toString();
                mString_country = mcountry.getText().toString();
                Toast.makeText(MainActivity.this, "Register Succes", Toast.LENGTH_SHORT).show();
                Intent intent_toHome = new Intent(MainActivity.this, HomeActivity.class);
                intent_toHome.putExtra("name", mString_username);
                intent_toHome.putExtra("password", mString_password);
                intent_toHome.putExtra("gender", mString_gender);
                intent_toHome.putExtra("phonenumber", mString_phonenumber);
                intent_toHome.putExtra("country", mString_country);
                startActivity(intent_toHome);
            }
        });

    }
}
