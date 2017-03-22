package com.huylv.draft;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jaychang.srv.SimpleRecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.simple_rv)    SimpleRecyclerView simple_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<Book> books = Utils.getBookList(this);
        Log.e("cxz","book "+books.size());
        for(Book b:books){
            simple_rv.addCell(new BookCell(b));
            Log.e("cxz","ad cell "+b.name);
        }
    }
}
