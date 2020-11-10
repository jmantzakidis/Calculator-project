package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1;
    private EditText e2;
    private TextView t1;
    private Button add;
    private Button sub;
    private Button div;
    private Button multi;
    private Button clear;
    private Button avg;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextNumber);
        e2 = findViewById(R.id.editTextNumber2);
        t1 = findViewById(R.id.textView);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multi);
        clear = findViewById(R.id.clear);
        avg = findViewById(R.id.avg);

        /**
         * SubΒutton listener using Lambda Expressions
         * Precondition: TextUtil requires both EditTexts to have values in order to continue
         * Postcondition: Returns the errors
         * @param num1,num2 stores the read values
         * @param result stores the result from subtracting num1 from num2
         */
        sub.setOnClickListener(v -> {
            if (TextUtils.isEmpty(e1.getText().toString()) || (TextUtils.isEmpty(e2.getText().toString()))) {
                e1.setError("Dont leave it blank");
                e2.setError("Dont leave it blank");
                return;
            }
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int result = num1 - num2;
            t1.setText(Double.toString(result));
        });

        /**
         * AvgΒutton listener using Lambda Expressions
         * Precondition: TextUtil requires both EditTexts to have values in order to continue
         * Postcondition: Returns the errors
         * @param num1,num2 stores the read values
         * @param sum stores the result from creating the average of num1 and num2
         */
        avg.setOnClickListener(v ->{
            if (TextUtils.isEmpty(e1.getText().toString()) || (TextUtils.isEmpty(e2.getText().toString()))) {
                e1.setError("Dont leave it blank");
                e2.setError("Dont leave it blank");
                return;
            }
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            double sum = (num1 + num2)/2;
            t1.setText(Double.toString(sum));
        });

        /**
         * Add Button set On Click Listener using Lambda Expressions
         *
         * this is the add button  that makes addition of two numbers
         *TextUtils function is checking if both EditTexts have values
         *
         * @param num1 is the first parameter we give
         * @param num2 is the second integer parameter we give
         * @param sum   is the result that is returned to the TextViiew  place

         */
        add.setOnClickListener(v -> {
            if (TextUtils.isEmpty(e1.getText().toString()) || (TextUtils.isEmpty(e2.getText().toString()))) {
                e1.setError("Dont leave it blank");
                e2.setError("Dont leave it blank");
                return;
            }
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int sum = num1 + num2;
            t1.setText(Double.toString(sum));
        });

        div.setOnClickListener(v -> {
            if (TextUtils.isEmpty(e1.getText().toString()) || (TextUtils.isEmpty(e2.getText().toString()))) {
                e1.setError("Dont leave it blank");
                e2.setError("Dont leave it blank");
                return;
            }
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int sum = num1 / num2;
            t1.setText(Double.toString(sum));
        });

        multi.setOnClickListener(v -> {
            if (TextUtils.isEmpty(e1.getText().toString()) || (TextUtils.isEmpty(e2.getText().toString()))) {
                e1.setError("Dont leave it blank");
                e2.setError("Dont leave it blank");
                return;
            }
            int num1 = Integer.parseInt(e1.getText().toString());
            int num2 = Integer.parseInt(e2.getText().toString());
            int sum = num1 * num2;
            t1.setText(Double.toString(sum));
        });
        //hi
    }
}

