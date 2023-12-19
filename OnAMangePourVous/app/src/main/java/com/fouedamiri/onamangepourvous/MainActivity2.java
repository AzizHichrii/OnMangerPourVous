package com.fouedamiri.onamangepourvous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String[] quality_service = {"Exellent", "Bien", "Moyen", "mediocre"};
    Spinner spinner1,spinner2;
    //EditText service,plats;
    //Rating bar
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        // Display the form data on the screen
        TextView nameTextView = findViewById(R.id.text_view_nom);
        nameTextView.setText("Nom et Prénom: " + nom + " " + prenom);
        //service=(EditText) findViewById(R.id.txt_service);
        //plats=(EditText) findViewById(R.id.txt_plats);
        Spinner spinner=findViewById(R.id.spinner1);
        //ArrayAdapter<String> adapter1=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_dropdown_item, quality_service);
        ArrayAdapter<String>adapter1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,quality_service);
        spinner.setAdapter(adapter1);
        Spinner spinner2=findViewById(R.id.spinner2);
        //ArrayAdapter<String> adapter1=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_dropdown_item, quality_service);
        ArrayAdapter<String>adapter2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,quality_service);
        spinner2.setAdapter(adapter2);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);

    }
    public void sumbitStars(View view){
        System.out.println("star amount:"+ratingBar.getRating());
    }
}