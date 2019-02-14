package com.example.saimon.reshebnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    List<Book> books = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setTitle("Поиск решебника");


        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.search_book);
        DataAdepter adepter = new DataAdepter(this, books);
        recyclerView.setAdapter(adepter);

    }

    private void setInitialData() {
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
        books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));

    }
}
