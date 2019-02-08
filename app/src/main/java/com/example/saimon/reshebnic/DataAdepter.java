package com.example.saimon.reshebnic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdepter extends RecyclerView.Adapter<DataAdepter.ViewHolder>{

    private LayoutInflater inflater;
    private List<Book> books;
    DataAdepter(Context context, List<Book> books){
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DataAdepter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = (View) inflater.inflate(R.layout.book_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdepter.ViewHolder holder, int position) {
        Book book = books.get(position);
        holder.nameBook.setText(book.getNameBook());
        holder.authorBook.setText(book.getAuthorBook());
        holder.yearOfPrinting.setText(book.getYearOfPrinting());
        holder.image.setImageResource(book.getImage());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameBook;
        final  TextView authorBook;
        final  TextView yearOfPrinting;
        final ImageView image;

        public ViewHolder(@NonNull View view) {
            super(view);
            nameBook = view.findViewWithTag(R.id.title_book);
            authorBook = view.findViewById(R.id.old_book);
            yearOfPrinting = view.findViewById(R.id.author_book);
            image = view.findViewById(R.id.image_book);
        }
    }
}
