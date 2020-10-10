package edu.cs.birzeit.finalbookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import model.Book;
import model.BookFactory;
import model.IBookDa;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= findViewById(R.id.spinner);
        populateSpinner();
    }

    private void populateSpinner() {
        BookFactory factory= new BookFactory();
        IBookDa book = factory.getModel();
        String[] cats=book.getCat();
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);

    }

    public void btnGetOnClick(View view) {
        BookFactory factory= new BookFactory();
        IBookDa book = factory.getModel();
        List<Book> books= book.getBooks("programming");
        String str= "";
        for(Book b:books)
        {
            str+=b.getTitle() +"\n";
        }
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}