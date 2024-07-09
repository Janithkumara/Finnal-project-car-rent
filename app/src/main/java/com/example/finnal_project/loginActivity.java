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

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button3= findViewById(R.id.buttonlogin);
        button3.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(loginActivity.this,customerActivity.class) ;
                startActivity(intent);





            }         } );

        Button button4= findViewById(R.id.button_login_not_register);
        button4.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(loginActivity.this,registerActivity.class) ;
                startActivity(intent);





            }         } );
    }
}