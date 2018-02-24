package com.example.gebruiker.fabtest;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/*
    Activity that contains a list of entries and allows users to create new
    entries through the floating action button.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate");

        EntryDatabase database = EntryDatabase.getInstance(this);
        Cursor cursor = database.getAllEntries();

        EntryAdapter adapter = new EntryAdapter(this, R.layout.row_entry, cursor);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public void addEntry(View view) {
        Intent intent = new Intent(MainActivity.this, EntryActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "onResume");
    }
}
