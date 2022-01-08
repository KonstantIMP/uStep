package kimp.ustep.org;

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

        getSupportActionBar().hide();
    }
}