package com.example.saimon.reshebnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

  //  List<Book> books = new ArrayList();
  private   List<Book> books = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //setTitle("Поиск решебника");


        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler_book);
        Log.i("Recycler1","recycler1");
        DataAdepter adepter = new DataAdepter(this, books);
        recyclerView.setAdapter(adepter);

    }

    private void setInitialData() {
        books.add(new Book("Algebra", "Peter", "2016 год", R.drawable.algebra));
        books.add(new Book("Algebra", "Peter", "2016 год", R.drawable.algebra));
        books.add(new Book("Algebra", "Peter", "2016 год", R.drawable.algebra));
        books.add(new Book("Algebra", "Peter", "2016 год", R.drawable.algebra));

    }
}
