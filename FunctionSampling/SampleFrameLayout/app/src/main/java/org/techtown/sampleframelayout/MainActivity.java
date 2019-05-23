package org.techtown.sampleframelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView = (ImageView) findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v){
        changImage();
    }

    public void changImage(){
        if(imageIndex==0)
        {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex =1;
        }
        else if(imageIndex==1)
        {
            imageView.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.VISIBLE);

            imageIndex =0;
        }
    }
}