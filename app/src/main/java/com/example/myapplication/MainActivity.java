package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView txtLogin;
    EditText edtMail,edtPass;
    Button btnLogin;
    String mail="",pass="";
    CheckBox cbStudent,cbTeacher,cbathor;
    ImageView imageI1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        edtMail=findViewById(R.id.edtMail);
        edtPass=findViewById(R.id.edtPass);
        btnLogin=findViewById(R.id.btnLogin);
        cbStudent=findViewById(R.id.cbStudent);
        cbTeacher=findViewById(R.id.cbTeacher);
        cbathor=findViewById(R.id.cbathor);
        imageI1=findViewById(R.id.imageI1);

      btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mail=edtMail.getText().toString();
              pass=edtPass.getText().toString();

                if(mail.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter your email address", Toast.LENGTH_SHORT).show();
                } else if (pass.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter a password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your account created successfully", Toast.LENGTH_SHORT).show();
                }
                if(cbStudent.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Student", Toast.LENGTH_SHORT).show();
                }
              if(cbTeacher.isChecked())
              {
                  Toast.makeText(MainActivity.this, "Teacher", Toast.LENGTH_SHORT).show();
              }
              if(cbathor.isChecked())
              {
                  Toast.makeText(MainActivity.this, "author", Toast.LENGTH_SHORT).show();
              }
                  Toast.makeText(MainActivity.this, "your email &pass ==>>"+mail+""+pass, Toast.LENGTH_SHORT).show();

          }
      });

    }
}