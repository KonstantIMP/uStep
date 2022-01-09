package org.kimp.ustep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Start page for the application
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) getSupportActionBar().hide();
    }
}