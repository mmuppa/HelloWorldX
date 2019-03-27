package edu.uw.tacoma.css.mmuppa.helloworldx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Testing commits with git");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Overrode onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "Overrode onResume");
    }
}
