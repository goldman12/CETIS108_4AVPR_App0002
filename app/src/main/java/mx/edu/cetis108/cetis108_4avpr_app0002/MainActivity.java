package mx.edu.cetis108.cetis108_4avpr_app0002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2;
    EditText op1,op2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.op1 = (EditText) findViewById(R.id.editText);
        this.op2 = (EditText) findViewById(R.id.editText2);
        this.resultado = (TextView) findViewById(R.id.textView);
    }
    public void onSuma(View view){
        if (this.op1.getText().toString().length() > 0 && this.op2.getText().toString().length() >0);
        this.num1 = Double.parseDouble (this.op1.getText().toString());
        this.num2 = Double.parseDouble (this.op2.getText().toString());
        this.resultado.setText(Double.toString(this.num1 + num2));
    }
    public  void onResta (View view){
        if (this.op1.getText().toString().length() > 0 && this.op2.getText().toString().length() >0);
        this.num1 = Double.parseDouble (this.op1.getText().toString());
        this.num2 = Double.parseDouble (this.op2.getText().toString());
        this.resultado.setText(Double.toString(this.num1 - num2));
    }
    public  void onMult (View view){
        if (this.op1.getText().toString().length() > 0 && this.op2.getText().toString().length() >0);
        this.num1 = Double.parseDouble (this.op1.getText().toString());
        this.num2 = Double.parseDouble (this.op2.getText().toString());
        this.resultado.setText(Double.toString(this.num1 * num2));
    }
    public void onDiv (View view){
        if (this.op1.getText().toString().length() > 0 && this.op2.getText().toString().length() >0);
        this.num1 = Double.parseDouble (this.op1.getText().toString());
        this.num2 = Double.parseDouble (this.op2.getText().toString());
        this.resultado.setText(Double.toString(this.num1 / num2));

    }
}
