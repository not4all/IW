package ru.startandroid.iw0001_hw_twoactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends AppCompatActivity {

    EditText editTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        editTwo = findViewById(R.id.editTwo);
        findViewById(R.id.btnSave).setOnClickListener(view -> {
           Intent intent = new Intent();
           intent.putExtra(MainActivity.DATA, editTwo.getText().toString());
           setResult(RESULT_OK, intent);
           finish();
        });
    }
}