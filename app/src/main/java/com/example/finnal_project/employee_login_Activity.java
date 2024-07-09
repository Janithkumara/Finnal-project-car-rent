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

public class employee_login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button3= findViewById(R.id.button_login_employeee);
        button3.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(employee_login_Activity.this,employeeActivity.class) ;
                startActivity(intent);





            }         } );

        Button button4= findViewById(R.id.button_login_not_registerin_employee);
        button4.setOnClickListener(new View.OnClickListener(){

            public void  onClick(View v){
                Intent intent = new Intent(employee_login_Activity.this,employee_register_Activity.class) ;
                startActivity(intent);





            }         } );
    }
}