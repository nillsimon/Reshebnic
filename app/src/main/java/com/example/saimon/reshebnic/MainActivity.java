package com.example.saimon.reshebnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    List<Book> books = new ArrayList<>();
    FrameLayout container;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, BookFragment.newInstance())
                    .commitNow();
        }
            // FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
            // fr.replace(R.id.fMain,new BookFragment());
            // fr.commit();

            navigationView.setCheckedItem(R.id.action_settings);

            setInitialData();


            RecyclerView recyclerView = findViewById(R.id.list_book);
            DataAdepter adepter = new DataAdepter(this, books);
            recyclerView.setAdapter(adepter);

            recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
            recyclerView.setAdapter(adepter);
        initViews();
      //  initDetailFragment();
        }

    private void initViews() {
        container = findViewById(R.id.fragmentContainer);

    }

    private void initDetailFragment(int position) {
        BookFragment detailFragment = new BookFragment();
        detailFragment.setWorkout(position);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, detailFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
        @Override
        public void onBackPressed () {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);

        }

        private void setInitialData () {


            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.lgebra11));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.house_work_5));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.russian_kinguage_8));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.fisika_9));
            books.add(new Book("Algebra", "the beginning of the analysis", "Decision", "Peterson", "2016", "Advanced", "SousPrinting", "5 класс", R.drawable.algebra));

        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected (MenuItem item){
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            if (id == R.id.nav_search) {
                Intent i = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i);
            } else if (id == R.id.nav_settings) {
                FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
                fr.replace(R.id.fMain, new BookFragment());
                fr.commit();
            } else if (id == R.id.nav_send_A10) {
                Intent i = new Intent(MainActivity.this, BookActivity.class);
                startActivity(i);
            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
    }
