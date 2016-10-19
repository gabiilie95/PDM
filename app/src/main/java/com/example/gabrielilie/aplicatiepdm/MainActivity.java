package com.example.gabrielilie.aplicatiepdm;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button _showPopup = new Button(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        AddLayouts();
        super.onCreate(savedInstanceState);
    }

    private void AddLayouts()
    {
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        mainLayout.addView(_showPopup);
        _showPopup.setOnClickListener((sender)->
            {
                Toast.makeText(this, "Uraa", Toast.LENGTH_LONG);
        });
    }


}
