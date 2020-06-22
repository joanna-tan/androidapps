package com.example.helloworld;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.white));
                //Log.i("Joanna", "button clicked");
            }
        });

        //change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });

        //change text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the input text
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //put the text into our textview once the button is clicked
                if (TextUtils.isEmpty(newText)) {
                    //set to a default text
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Joanna!");
                }
                else {
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }

            }
        });

        //reset to default with background click
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set text color to "#ffaa66cc"
                ((TextView) findViewById(R.id.textView3)).setTextColor(getResources().getColor(R.color.purple));
                //background to colorPrimaryDark
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                //text to "Hello from Joanna"
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Joanna!");

            }
        });

    }


}