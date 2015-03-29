package com.example.sara.smple_calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    String memory ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button c = (Button) findViewById(R.id.button);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result=(TextView)findViewById(R.id.textView);
                result.setText("");
            }
        });

        final Button zero = (Button) findViewById(R.id.button21);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result=(TextView)findViewById(R.id.textView);
                result.append(zero.getText());
            }
        });

        final Button one = (Button) findViewById(R.id.button16);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result=(TextView)findViewById(R.id.textView);
                result.append(one.getText());
            }
        });

        final Button two = (Button) findViewById(R.id.button17);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result=(TextView)findViewById(R.id.textView);
                result.append(two.getText());
            }
        });

        final Button three = (Button) findViewById(R.id.button18);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(three.getText());
            }
        });

        final Button four = (Button) findViewById(R.id.button12);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(four.getText());
            }
        });

        final Button five = (Button) findViewById(R.id.button13);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(five.getText());
            }
        });

        final Button six = (Button) findViewById(R.id.button14);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(six.getText());
            }
        });

        final Button seven = (Button) findViewById(R.id.button8);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(seven.getText());
            }
        });

        final Button eight = (Button) findViewById(R.id.button9);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(eight.getText());
            }
        });

        final Button nine = (Button) findViewById(R.id.button10);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.textView);
                result.append(nine.getText());
            }
        });

        final Button plus = (Button) findViewById(R.id.button19);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result=(TextView)findViewById(R.id.textView);
                result.append(" "+plus.getText()+" ");
            }
        });

        final Button sub = (Button) findViewById(R.id.button15);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                result.append(" " + "-" + " ");

            }
        });

        final Button multiplication = (Button) findViewById(R.id.button11);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                result.append(" "+"*"+" ");

            }
        });

        final Button back = (Button) findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                if(result.getText().charAt(result.getText().length()-1) == ' ') {
                    result.setText(result.getText().subSequence(0, result.getText().length() - 2));
                } else result.setText(result.getText().subSequence(0, result.getText().length() - 1));
            }
        });

        final Button div = (Button) findViewById(R.id.button7);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                result.append(" "+div.getText()+" ");

            }
        });

        final Button negative = (Button) findViewById(R.id.button6);
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                result.append("-");

            }
        });

        final Button MPlus = (Button) findViewById(R.id.button4);
        MPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                TextView resultMemory=(TextView)findViewById(R.id.textView2);
                memory = String.valueOf(result.getText());
                resultMemory.setText("M");
                result.setText("");
            }
        });

        final Button MC = (Button) findViewById(R.id.button2);
        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                TextView resultMemory=(TextView)findViewById(R.id.textView2);
                memory="";
                resultMemory.setText("");

            }
        });

        final Button MR = (Button) findViewById(R.id.button3);
        MR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result=(TextView)findViewById(R.id.textView);
                if(!(memory=="")) {
                    result.append("" + memory);
                }else{result.append("0");}
            }
        });

        final Button equal = (Button) findViewById(R.id.button20);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            split();

            }
        });

    }
    public void split(){
        TextView result=(TextView)findViewById(R.id.textView);

        String text=null;
        text = String.valueOf(result.getText());
        String[] split = null;
        split = text.split(" ");

        // to determine the operation that is used --------------------
        if(split[1].equals("+")){            // if the operation is +
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[2]);
            double answer = a+b;
            result.setText(""+answer);

        }

        else if(split[1].equals("-")){            // if the operation is -
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[2]);
            double answer = a-b;
            result.setText(""+answer);

        }
        else if(split[1].equals("*")){            // if the operation is *
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[2]);
            double answer = a*b;
            result.setText(""+answer);

        }

        else if(split[1].equals("/")){            // if the operation is /
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[2]);
            double answer = a/b;
            result.setText(""+answer);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
