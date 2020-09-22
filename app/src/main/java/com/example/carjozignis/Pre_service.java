package com.example.carjozignis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pre_service extends AppCompatActivity {
    Button Addnew;
    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_service);
        Addnew = (Button) findViewById(R.id.addnew);
        view =findViewById(R.id.recycleviewlist);
        Addnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pre_service.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}