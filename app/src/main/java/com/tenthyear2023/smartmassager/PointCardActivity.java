package com.tenthyear2023.smartmassager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PointCardActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_card);
        txt = findViewById(R.id.textViewPointCard);
        int id = Integer.parseInt(getIntent().getStringExtra("pointId"));

        if (id == R.id.imageViewBackLeftNeck || id == R.id.imageViewBackRightNeck) {
            txt.setText(R.string.back_neck);
        }
    }

    public void onClickBack(View view) {
        /** метод возвращения на предыдущий экран **/
        finish();
    }
}