package com.example.swati.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText myEditText;

    Button button1, button2, button3, button4, button5, button6, button7, button8,
    button9, button0, button10, buttonC, buttonEqual, buttonAdd, buttonSub, buttonMul,
    buttonDiv;

    double mValueOne, mValueTwo;

    boolean mAddition, mSubtraction, mMultiplication, mDivision;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = (EditText) findViewById(R.id.edit1);

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(myEditText.getWindowToken(), 0);




        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);




    }

    public void PressOne(View view) {
        myEditText.setText(myEditText.getText() + "1");
    }

    public void PressTwo(View view) {
        myEditText.setText(myEditText.getText() + "2");
    }

    public void PressThree(View view) {
        myEditText.setText(myEditText.getText() + "3");
    }

    public void PressFour(View view) {
        myEditText.setText(myEditText.getText() + "4");

    }


    public void PressFive(View view) {
        myEditText.setText(myEditText.getText() + "5");
    }


    public void PressSix(View view) {
        myEditText.setText(myEditText.getText() + "6");
    }

    public void PressSeven(View view) {
        myEditText.setText(myEditText.getText() + "7");
    }

    public void PressEight(View view) {
        myEditText.setText(myEditText.getText() + "8");
    }


    public void PressNine(View view) {
        myEditText.setText(myEditText.getText() + "9");
    }


    public void PressDecimal(View view) {
        myEditText.setText(myEditText.getText() + ".");
    }


    public void PressZero(View view) {
        myEditText.setText(myEditText.getText() + "0");
    }


    public void Clear(View view) {
        myEditText.setText("");
    }

    public void PressAdd(View view) {
        if (myEditText == null) {
            myEditText.setText("");
        }
        else {
            mValueOne = Float.parseFloat(myEditText.getText() + "");
            mAddition = true;

            myEditText.setText(null);
        }

        }


    public void PressSub(View view) {
        mValueOne = Float.parseFloat(myEditText.getText() + "");
        mSubtraction = true;
        myEditText.setText(null);

   }

    public void PressMul(View view) {
        mValueOne = Float.parseFloat(myEditText.getText() + "");
        mMultiplication = true;
        myEditText.setText(null);
    }


    public void PressDiv(View view) {
        mValueOne = Float.parseFloat(myEditText.getText() + "");
        mDivision = true;
        myEditText.setText(null);

    }


    public void Compute(View view) {
        mValueTwo = Float.parseFloat(myEditText.getText() + "");

        if (mAddition == true) {
            myEditText.setText(mValueOne + mValueTwo + "");
            mAddition = false;
        }

        if (mSubtraction == true) {
            myEditText.setText(mValueOne - mValueTwo + "");
            mSubtraction = false;
        }

        if (mMultiplication == true) {
            myEditText.setText(mValueOne * mValueTwo + "");
            mMultiplication = false;
        }

        if (mDivision == true) {
            myEditText.setText(mValueOne / mValueTwo + "");
            mDivision = false;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();

    }
}
