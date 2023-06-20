package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listItems=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems.add("Visit the department");
        listItems.add("Visit my college");
        listItems.add("Visit the dentist");
        listItems.add("Visit the Togo");
        listItems.add("Visit the project");
        listItems.add("eat rice");
        listItems.add("Rest for sometime");

        ArrayAdapter<String>adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice,listItems);

        ListView listview=findViewById(R.id.to_do_list);

        listview.setAdapter(adapter);

        FloatingActionButton add_itemButton =findViewById(R.id.add_item);

        add_itemButton.setOnClickListener(V ->{

            Intent intent =new Intent(this,AddTask.class);
            startActivity(intent);




    });
}}