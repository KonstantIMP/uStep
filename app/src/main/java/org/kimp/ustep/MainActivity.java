package org.kimp.ustep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentResultListener;

import android.content.Intent;
import android.os.Bundle;

/**
 * Start page for the application
 */
public class MainActivity extends AppCompatActivity implements FragmentResultListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) getSupportActionBar().hide();

        getSupportFragmentManager().setFragmentResultListener("requestKey", this, this);
    }

    /**
     * Open next activity if ActionFragment send command
     */
    @Override
    public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
        if (result.getString("action").equals("options")) {
            startActivity(new Intent(this, OptionsActivity.class));
        }
        else if (result.getString("action").equals("universities")) {
            // TODO
        }
    }
}