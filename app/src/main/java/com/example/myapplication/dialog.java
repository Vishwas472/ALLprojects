package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dialog extends AppCompatActivity {
    Button btn34;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        initview();
    }

    private void initview() {
        btn34=findViewById(R.id.btn34);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView btn1,btn2;

                Dialog dialog =new Dialog(dialog.this);
                dialog.setContentView(R.layout.dailog_item_file);
                btn1=dialog.findViewById(R.id.btn1);
                btn2=dialog.findViewById(R.id.btn2);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });
    }
}
//custom dialogebox