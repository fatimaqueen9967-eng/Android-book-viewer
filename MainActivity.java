package com.example.bookapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button btnNext, btnPrevious;

    int currentIndex = 0;

    int[] images = {
            R.drawable.book1,
            R.drawable.book2,
            R.drawable.book3,
            R.drawable.book4,
            R.drawable.book5,
            R.drawable.book6

    };

    String[] names = {
            "Book One",
            "Book Two",
            "Book Three",
            "Book Four",
            "Book Five",
            "Book Six"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);

        btnNext.setOnClickListener(v -> {
            currentIndex++;
            if (currentIndex >= images.length) {
                currentIndex = 0;
            }
            updateUI();
        });

        btnPrevious.setOnClickListener(v -> {
            currentIndex--;
            if (currentIndex < 0) {
                currentIndex = images.length - 1;
            }
            updateUI();
        });
    }

    private void updateUI() {
        imageView.setImageResource(images[currentIndex]);
        textView.setText(names[currentIndex]);
    }
}