package com.example.tam.a1322drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = (Button)findViewById(R.id.btn_adđrawing);
        Button btnRemove = (Button)findViewById(R.id.btn_remove);
        btnAdd.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
        mImageView = (ImageView)findViewById(R.id.img_view);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_adđrawing:
                drawView();
                break;
            case R.id.btn_remove:
              clearView();
                break;
            default:
                break;

        }
    }


    public void drawView() {
        Bitmap bmp = Bitmap.createBitmap(600, 600,  Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        Canvas canvas = new Canvas(bmp);
        canvas.drawRect(30, 30, 300, 150, paint);
        mImageView.setImageBitmap(bmp);
    }

    public void clearView() {
        mImageView.setImageDrawable(null);
    }

}
