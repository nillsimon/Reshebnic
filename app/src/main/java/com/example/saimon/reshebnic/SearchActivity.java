package com.example.saimon.reshebnic;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    ArrayList<Book> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setTitle("Activity Поиск");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.search_book);
        DataAdepter adepter = new DataAdepter(this, books);
        recyclerView.setAdapter(adepter);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(intent,0);
        return true;
    }

    private void setInitialData() {
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));
         books.add(new Book("Algebra", "Peter A.V.", "2016 год", R.drawable.algebra));

    }
}
