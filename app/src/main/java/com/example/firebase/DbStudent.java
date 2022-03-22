package com.example.firebase;


import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DbStudent {
    private DatabaseReference databaseReference;
    public DbStudent()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(student.class.getSimpleName());

    }
    public Task<Void> add(student stu)
    {

          return   databaseReference.push().setValue(stu);
    }
}
