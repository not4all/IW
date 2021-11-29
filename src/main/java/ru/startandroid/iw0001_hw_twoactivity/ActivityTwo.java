package ru.startandroid.iw0001_hw_twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

    EditText editTwo;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnSave = (Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
                Intent intent = new Intent (this, MainActivity.class);
                editTwo = (EditText) findViewById(R.id.editTwo);
                intent.putExtra("editActTwo", editTwo.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}