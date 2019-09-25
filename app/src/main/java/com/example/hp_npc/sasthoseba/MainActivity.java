package com.example.hp_npc.sasthoseba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1= (Button) findViewById(R.id.mainb1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMedicineCompany();

            }

            private void openMedicineCompany() {

                Intent intent = new Intent( MainActivity.this,MedicineCompany.class);
                startActivity(intent);
            }
        });


        b2= (Button) findViewById(R.id.mainb2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDoctorsIdea();

            }

            private void openDoctorsIdea() {

                Intent intent = new Intent( MainActivity.this,DoctorsIdea.class);
                startActivity(intent);
            }
        });


        b3= (Button) findViewById(R.id.mainb3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openHerbalMedicine();

            }

            private void openHerbalMedicine() {

                Intent intent = new Intent( MainActivity.this,HerbalMedicine.class);
                startActivity(intent);
            }
        });
    }
}
