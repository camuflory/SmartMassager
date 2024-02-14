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

        if (id == R.id.imageViewBackLeftNeck) txt.setText(R.string.text_left_back_neck);
        else if (id == R.id.imageViewBackRightNeck) txt.setText(R.string.text_right_back_neck);

        else if (id == R.id.imageViewLeftClavicle) txt.setText(R.string.text_left_clavicle);
        else if (id == R.id.imageViewRightClavicle) txt.setText(R.string.text_right_clavicle);

        else if (id == R.id.imaggeViewBackCalf) txt.setText(R.string.text_left_knee);
        else if (id == R.id.imageViewRightBackCalf) txt.setText(R.string.text_right_knee);

        else if (id == R.id.imageViewNeckLeftTop) txt.setText(R.string.text_left_neck);
        else if (id == R.id.imageViewNeckRightTop) txt.setText(R.string.text_right_neck);

    }

    public void onClickBack(View view) {
        /** метод возвращения на предыдущий экран **/
        finish();
    }
}