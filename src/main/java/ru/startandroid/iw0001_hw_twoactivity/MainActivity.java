package ru.startandroid.iw0001_hw_twoactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtOne;
    Button btnNext;

    public static final int REQUEST_CODE = 100;
    public static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityTwo.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CODE:
                txtOne = findViewById(R.id.txtOne);
                String currentData = data.getStringExtra(DATA);
                txtOne.setText(currentData);
                break;
        }
    }
}