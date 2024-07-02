package com.example.finnal_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class customerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_customer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button button2= findViewById(R.id.btn_customerback);
        button2.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(customerActivity.this, MainActivity.class) ;
                startActivity(intent);





            }         } );


        /*         feedback and contact button navigation there activities                   */

        Button button3= findViewById(R.id.btn_feedback);
        button3.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(customerActivity.this,feedbackActivity.class) ;
                startActivity(intent);





            }         } );
        Button button4= findViewById(R.id.btn_contact);
        button4.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(customerActivity.this,contactActivity.class) ;
                startActivity(intent);





            }         } );




    }
}