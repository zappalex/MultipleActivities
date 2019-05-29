package com.example.zappalex;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private static final String TAG = "ChildActivity";
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        registerTextView();
    }

    private void registerTextView() {
        messageTextView = findViewById(R.id.message_textview);
    }

}
