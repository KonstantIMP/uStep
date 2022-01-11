package org.kimp.ustep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

import android.os.Bundle;

/**
 * Activity for the app's managing
 */
public class OptionsActivity extends AppCompatActivity {

    public static class OptionsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        try {
            getSupportActionBar().setTitle(R.string.options_msg);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.options_fragment_holder, new OptionsFragment())
                    .commit();
        } catch (NullPointerException e) {}
    }
}