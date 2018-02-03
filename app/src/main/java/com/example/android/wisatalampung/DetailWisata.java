package com.example.android.wisatalampung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fiqri hafzain islami as Developer
 */

public class DetailWisata extends AppCompatActivity {
    TextView judul, dsk;
    ImageView gbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        judul = (TextView) findViewById(R.id.jdl);
        gbr = (ImageView) findViewById(R.id.img);
        dsk = (TextView) findViewById(R.id.desk);
        Intent intent = getIntent();
        judul.setText(intent.getStringExtra("judul"));
        dsk.setText(intent.getStringExtra("desk"));
        gbr.setImageResource(intent.getIntExtra("gambar", 1));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}