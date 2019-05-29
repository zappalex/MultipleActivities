package com.example.zappalex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ParentActivity extends AppCompatActivity {

    private static final String TAG = "ParentActivity";
    private Button navigateToChildBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        registerButton();
        setButtonOnClick();

    }

    private void registerButton() {
        navigateToChildBtn = findViewById(R.id.navigate_to_child_btn);

    }

    private void setButtonOnClick(){
        if(navigateToChildBtn != null ) {
            navigateToChildBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // TODO : navigate to child activity when button clicked
                }
            });
        } else {
            Log.d(TAG, "Unable to set button onClickListener, button is null");
        }
    }


}
