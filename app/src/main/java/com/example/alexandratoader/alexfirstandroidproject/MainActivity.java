package com.example.alexandratoader.alexfirstandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enterAddress;
    EditText enterCategory;
    EditText enterName;
    TextView firstTextView;
    TextView secondTextView;
    TextView thirdTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_entry);
        enterAddress = (EditText) findViewById(R.id.enter_address);
        enterCategory = (EditText) findViewById(R.id.enter_category);
        enterName = (EditText) findViewById(R.id.enter_name);
        firstTextView = (TextView) findViewById(R.id.first_text_view);
        secondTextView = (TextView) findViewById(R.id.second_text_view);
        thirdTextView = (TextView) findViewById(R.id.third_text_view);


    }

    public void addItem(View view) {
        String address= enterAddress.getText().toString();
        String category= enterCategory.getText().toString();
        String name= enterName.getText().toString();
        firstTextView.setText(address);
        secondTextView.setText(category);
        thirdTextView.setText(name);



    }
}
