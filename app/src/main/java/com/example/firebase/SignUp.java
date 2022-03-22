package com.example.firebase;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.xml.namespace.QName;

public class SignUp extends AppCompatActivity {
    EditText name, email, pass;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name= findViewById(R.id.sin_name);
        email = findViewById(R.id.sin_email);
        pass = findViewById(R.id.sin_pass);
        signup = findViewById(R.id.btn_sinup);
        DbStudent Db = new DbStudent();
        signup.setOnClickListener(view -> {
            student stu = new student(name.getText().toString(), email.getText().toString(), pass.getText().toString());
            Db.add(stu).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Student Added", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, "+er.get", Toast.LENGTH_SHORT).show();
            });

        });
    }
}