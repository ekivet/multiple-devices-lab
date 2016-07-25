package com.example.erickivet.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView mainTextview;
    ImageView vectorImage;
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextview = (TextView)findViewById(R.id.main_textview);
        vectorImage = (ImageView)findViewById(R.id.main_image);
        mainButton = (Button)findViewById(R.id.main_button);

        mainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mainTextview.setText(R.string.textview_2);
                vectorImage.setImageResource(R.drawable.ic_insert_emoticon_black_24dp);

            }

        });




    }
}
