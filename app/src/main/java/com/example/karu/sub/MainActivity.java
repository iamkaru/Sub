package com.example.karu.sub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imBurgerClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userUI();

    }

    public void userUI(){
        imBurgerClick = (ImageView)findViewById(R.id.main_imBurger);
    }

    public void clickBurg(View view){
        finish();
        startActivity(new Intent(getApplicationContext(),PreOrder.class));
    }
}
