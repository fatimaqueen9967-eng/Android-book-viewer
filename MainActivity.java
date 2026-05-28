package com.example.bookapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<BookModel> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        bookList = new ArrayList<>();

        bookList.add(new BookModel(R.drawable.book1, "Book One"));
        bookList.add(new BookModel(R.drawable.book2, "Book Two"));
        bookList.add(new BookModel(R.drawable.book3, "Book Three"));
        bookList.add(new BookModel(R.drawable.book4, "Book Four"));
        bookList.add(new BookModel(R.drawable.book5, "Book Five"));
        bookList.add(new BookModel(R.drawable.book6, "Book Six"));

        BookAdapter adapter = new BookAdapter(bookList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}