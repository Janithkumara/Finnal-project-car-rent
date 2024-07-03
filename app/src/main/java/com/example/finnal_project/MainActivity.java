package com.example.finnal_project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Log.d("hi all of you","On create Called");

        Button button = findViewById(R.id.btn_home);

        button.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent=new Intent(MainActivity.this,MainActivity.class) ;
                intent.putExtra("MainActivity", "jannithmkumara");
                startActivity(intent);
            }
        } );

        Button button2= findViewById(R.id.btn_customer);
        button2.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this,customerActivity.class) ;
                startActivity(intent);





            }         } );


        Button button3= findViewById(R.id.btn_employee);
        button3.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this,employeeActivity.class) ;
                startActivity(intent);





            }         } );
        Button button4= findViewById(R.id.btn_Admin);
        button4.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this, adminActivity.class) ;
                startActivity(intent);





            }         } );

        Button button5= findViewById(R.id.buttonregister);
        button5.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this, registerActivity.class) ;
                startActivity(intent);





            }         } );


        Button button6= findViewById(R.id.button_login);
        button6.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this, loginActivity.class) ;
                startActivity(intent);





            }         } );





    }
}

