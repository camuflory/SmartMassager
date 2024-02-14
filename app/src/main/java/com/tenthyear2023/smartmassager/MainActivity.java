package com.tenthyear2023.smartmassager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView body;
    private final Bitmap[] sides = new Bitmap[4];
    private final ConstraintLayout[] points = new ConstraintLayout[4];

    private int rotateIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        body = findViewById(R.id.imageViewBody);

        int[] imagesId = new int[]{R.drawable.frontside, R.drawable.leftside,
                R.drawable.backside, R.drawable.rightside};
//        int[] layoutsId = new int[]{R.id.constraintLayoutFront, R.id.buttonRotateLeft,
//                R.id.constraintLayoutBack, R.id.constraintLayoutRight};

        for (int i = 0; i < sides.length; i++) {
            sides[i] = BitmapFactory.decodeResource(getResources(), imagesId[i]);
//          ConstraintLayout layout = findViewById(layoutsId[i]);
//          points[i] = layout;
        }

        ConstraintLayout layout1 = findViewById(R.id.constraintLayoutFront);
        points[0] = layout1;
        ConstraintLayout layout2 = findViewById(R.id.constraintLayoutLeft);
        points[1] = layout2;
        ConstraintLayout layout3 = findViewById(R.id.constraintLayoutBack);
        points[2] = layout3;
        ConstraintLayout layout4 = findViewById(R.id.constraintLayoutRight);
        points[3] = layout4;
    }

    public void rotateBodyToLeft(View view) {
        /** метод изменения картинки ,когда нажата кнопка "налево" **/
        points[rotateIndex].setVisibility(View.GONE);
        rotateIndex++;
        if (rotateIndex == sides.length) rotateIndex = 0;
        body.setImageBitmap(sides[rotateIndex]);
        points[rotateIndex].setVisibility(View.VISIBLE);
    }

    public void rotateBodyToRight(View view) {
        /** метод изменения картинки ,когда нажата кнопка "направо" **/
        points[rotateIndex].setVisibility(View.GONE);
        rotateIndex--;
        if (rotateIndex < 0) rotateIndex = sides.length - 1;
        body.setImageBitmap(sides[rotateIndex]);
        points[rotateIndex].setVisibility(View.VISIBLE);
    }

    public void onClickPoint(View view) {
        /** метод открытия карточек болевых точек **/
        Intent intent = new Intent(this, PointCardActivity.class);
        intent.putExtra("pointId", String.valueOf(view.getId()));
        startActivity(intent);
    }
}