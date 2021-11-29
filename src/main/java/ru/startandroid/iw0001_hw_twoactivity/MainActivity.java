package ru.startandroid.iw0001_hw_twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String newText;
    TextView txtOne;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        txtOne = (TextView) findViewById(R.id.txtOne);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(this);

        newText = getIntent().getStringExtra("editActTwo");
        if(newText == null) {
            txtOne.setText("Hello World");
        } else {
            txtOne.setText(newText);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}