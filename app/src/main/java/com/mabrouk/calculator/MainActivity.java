package com.mabrouk.calculator;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.op_selector) Spinner opSelector;
    @BindView(R.id.input1) EditText input1;
    @BindView(R.id.input2) EditText input2;
    @BindView(R.id.result) TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final List<String> channels = Arrays.asList("+", "-", "*", "/");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, channels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opSelector.setAdapter(adapter);
    }

    @OnClick(R.id.calculate)
    void calculate() {
        if(input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
            SpannableString spannableString = new SpannableString("Please enter valid operands");
            spannableString.setSpan(new ForegroundColorSpan(Color.RED), 0, spannableString.length(), 0);
            return;
        }

        double op1 = Double.parseDouble(input1.getText().toString());
        double op2 = Double.parseDouble(input2.getText().toString());

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(op1);
        resultBuilder.append(" ");
        resultBuilder.append(opSelector.getSelectedItem());
        resultBuilder.append(" ");
        resultBuilder.append(op2);
        resultBuilder.append(" = ");
        switch (opSelector.getSelectedItemPosition()) {
            case 0:
                resultBuilder.append(Calculator.add(op1, op2));
                break;
            case 1:
                resultBuilder.append(Calculator.subtract(op1, op2));
                break;
            case 2:
                resultBuilder.append(Calculator.multiply(op1, op2));
                break;
            case 3:
                resultBuilder.append(Calculator.divide(op1, op2));
                break;
        }

        result.setText(resultBuilder.toString());

    }
}
