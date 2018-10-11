package com.rohit.com.glidelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private Button mButtonDownloadImage;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);

        mButtonDownloadImage = findViewById(R.id.button);
        mButtonDownloadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlideApp.with(MainActivity.this)
                        .load("https://www.mayflower.in/uploads/product/gallery/thumbs/400_400_20170620174927255028.jpg")
                        .placeholder(R.drawable.image_placeholder)
                        .into(mImageView);

            }
        });
    }
}
