package com.example.dbstudentstask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText surname;
    private EditText marks;

    ArrayList<StudentModel> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameEditText);
        surname = findViewById(R.id.surnameEditText);
        marks = findViewById(R.id.marksEditText);
        students = new ArrayList<>();
    }

    public void addStudent(View view) {
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        String nameValue = name.getText().toString();
        String surnameValue = surname.getText().toString();
        String marksValue = marks.getText().toString();

        if(!nameValue.matches("") && !surnameValue.matches("") && !marksValue.matches("")){
            if(dbHelper.insert(nameValue, surnameValue, marksValue)){
                students.add(new StudentModel(nameValue, surnameValue, marksValue));
                Toast.makeText(this, "Data is added", Toast.LENGTH_LONG).show();
            }
        }
    }
}
