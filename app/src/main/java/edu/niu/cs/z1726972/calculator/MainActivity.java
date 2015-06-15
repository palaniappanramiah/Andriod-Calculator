package edu.niu.cs.z1726972.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText num1, num2;
    TextView result;
    Button addBtn,subBtn,mulBtn,divBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        result = (TextView) findViewById(R.id.tvResult);
        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);
        mulBtn.setOnClickListener(this);
        divBtn.setOnClickListener(this);
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

    public void onClick(View v)
    {
        double n1,n2;
        try{
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            switch(v.getId())
            {
                case R.id.btnAdd:
                    result.setText(String.valueOf(n1+n2));
                    break;
                case R.id.btnSub:
                    result.setText(String.valueOf(n1-n2));
                    break;
                case R.id.btnMul:
                    result.setText(String.valueOf(n1*n2));
                    break;
                case R.id.btnDiv:
                    result.setText(String.valueOf(n1/n2));
                    break;
            }
        }
        catch (Exception e){
            Toast.makeText(this,"Pls enter numbers in both fields", Toast.LENGTH_LONG).show();
            result.setText(e.getMessage());
        }
    }
}