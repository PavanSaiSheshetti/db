package com.example.carjozignis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText edittext_number,edittext_car,edittext_date,edittext_additional_problem,edittext_odometer,edittext_fuel_reading,edittext_fuel_type,edittext_belongings,edittext_dents,edittext_estimate,tyrecondition,paintcondition,engineoilcondition,coolantcondition,chklist,inspectedby,pickupexecutive,signature;
    Button save;
    MyDatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edittext_car = findViewById(R.id.edittext_car);
        edittext_number = findViewById(R.id.edittext_number);
        edittext_date = findViewById(R.id.edittext_date);
        edittext_odometer = findViewById(R.id.edittext_odometer);
        edittext_additional_problem = findViewById(R.id.edittext_additional_problem);
        edittext_fuel_reading = findViewById(R.id.edittext_fuel_reading);
        edittext_fuel_type = findViewById(R.id.edittext_fuel_type);
        edittext_belongings = findViewById(R.id.edittext_belongings);
        edittext_dents = findViewById(R.id.edittext_dents);
        edittext_estimate = findViewById(R.id.edittext_estimate);
        tyrecondition = findViewById(R.id.tyrecondition);
        paintcondition = findViewById(R.id.paintcondition);
        engineoilcondition = findViewById(R.id.engineoilcondition);
        coolantcondition = findViewById(R.id.coolantcondition);
        chklist = findViewById(R.id.chklist);
        inspectedby = findViewById(R.id.inspectedby);
        pickupexecutive = findViewById(R.id.pickupexecutive);
        signature = findViewById(R.id.signature);

        save = findViewById(R.id.btnsave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDB = new MyDatabaseHelper(MainActivity2.this);
                myDB.addService(edittext_car.getText().toString().trim(),
                        Integer.parseInt(edittext_number.getText().toString().trim()),
                        Integer.parseInt(edittext_date.getText().toString().trim()),
                        Integer.parseInt(edittext_odometer.getText().toString().trim()),
                        edittext_additional_problem.getText().toString().trim(),
                        Integer.parseInt(edittext_fuel_reading.getText().toString().trim()),
                        edittext_fuel_type.getText().toString().trim(),
                        edittext_belongings.getText().toString().trim(),
                        edittext_dents.getText().toString().trim(),
                        edittext_estimate.getText().toString().trim(),
                        tyrecondition.getText().toString().trim(),
                        paintcondition.getText().toString().trim(),
                        engineoilcondition.getText().toString().trim(),
                        coolantcondition.getText().toString().trim(),
                        chklist.getText().toString().trim(),
                        inspectedby.getText().toString().trim(),
                        pickupexecutive.getText().toString().trim(),
                        signature.getText().toString().trim());

            }
        });
    }
}