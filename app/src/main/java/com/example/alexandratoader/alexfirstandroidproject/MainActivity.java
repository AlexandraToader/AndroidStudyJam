package com.example.alexandratoader.alexfirstandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enterDestinationField;
    TextView firstTextView;
    TextView secondTextView;
    TextView thirdTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_entry);
        enterDestinationField = (EditText) findViewById(R.id.enter_destination_field);
        firstTextView = (TextView) findViewById(R.id.first_text_view);
        secondTextView = (TextView) findViewById(R.id.second_text_view);
        thirdTextView = (TextView) findViewById(R.id.third_text_view);


    }

    public void addItem(View view) {
        String destinationField= enterDestinationField.getText().toString();
        if(firstTextView.getText().toString().isEmpty()){
        firstTextView.setText(destinationField);
        } else if (secondTextView.getText().toString().isEmpty()){
            secondTextView.setText(destinationField);
        } else if (thirdTextView.getText().toString().isEmpty()){
            thirdTextView.setText(destinationField);
        }



    }
}
