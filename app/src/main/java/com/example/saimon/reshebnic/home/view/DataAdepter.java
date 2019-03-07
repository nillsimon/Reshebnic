package com.example.saimon.reshebnic.home.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saimon.reshebnic.R;
import com.example.saimon.reshebnic.home.model.Book;

import java.util.List;

 public class DataAdepter extends RecyclerView.Adapter<DataAdepter.ViewHolder>{

    private LayoutInflater inflater;
    private List<Book> books;
    public DataAdepter(Context context, List<Book> books){
        this.books = books;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DataAdepter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = (View) inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdepter.ViewHolder holder, int position) {
        Book book = books.get(position);
        holder.nameBook.setText(book.getNameBook());
        holder.titleBook.setText(book.getTitleBook());
        holder.authorBook.setText(book.getAuthorBook());
        holder.descriptionField.setText(book.getDescription());
        holder.yearOfPrinting.setText(book.getYearOfPrinting());
        holder.levelField.setText(book.getLevel());
        holder.publishingField.setText(book.getPublishing());
        holder.m_classField.setText((book.getM_class()));
        holder.image.setImageResource(book.getImage());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final  TextView nameBook;
        final TextView titleBook;
        final  TextView authorBook;
        final TextView descriptionField;
        final  TextView yearOfPrinting;
        final TextView levelField;
        final TextView publishingField;
        final TextView m_classField;
        final ImageView image;

        public ViewHolder(@NonNull View view) {
            super(view);
            nameBook = view.findViewById(R.id.name_book);
            titleBook = view.findViewById(R.id.title_book);
            authorBook = view.findViewById(R.id.author_book);
            yearOfPrinting = view.findViewById(R.id.old_book);
            descriptionField = view.findViewById(R.id.description_field);
            levelField = view.findViewById(R.id.level_field);
            publishingField = view.findViewById(R.id.publishing_field);
            m_classField = view.findViewById(R.id.m_class_field);
            image = view.findViewById(R.id.image_book);
        }
    }
}
