package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*For calender button*/
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class HomePage extends AppCompatActivity {
    public Button cal_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        cal_btn = (Button) findViewById(R.id.calender_btn); //link btn in home xml

        cal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, CalenderPage.class);
                startActivity(intent);
            }
        });
    }
}