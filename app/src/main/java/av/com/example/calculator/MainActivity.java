package av.com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1, input2;
    private TextView result;
    private Button add, sub, mul, div, clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = (EditText) findViewById(R.id.firstNo);
        input2 = (EditText) findViewById(R.id.secNo);
        result = (TextView) findViewById(R.id.resTxtView);
        add = (Button) findViewById(R.id.addBtn);
        sub = (Button) findViewById(R.id.subBtn);
        mul = (Button) findViewById(R.id.mulBtn);
        div = (Button) findViewById(R.id.divBtn);
        clr = (Button) findViewById(R.id.clrBtn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ans;
                if (input1.getText().length() > 0 & input2.getText().length() > 0) {
                    String in1 = input1.getText().toString();
                    int in11 = Integer.parseInt(in1);

                    String in2 = input2.getText().toString();
                    int in22 = Integer.parseInt(in2);


                    ans = in11 + in22;
                    result.setText(Integer.toString(ans));
                } else {
                    Toast.makeText(MainActivity.this, "Please Fill All The Fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int ans;
                if (input1.getText().length() > 0 & input2.getText().length() > 0) {
                    String in1 = input1.getText().toString();
                    int in11 = Integer.parseInt(in1);

                    String in2 = input2.getText().toString();
                    int in22 = Integer.parseInt(in2);


                    ans = in11 - in22;
                    result.setText(Integer.toString(ans));
                } else {
                    Toast.makeText(MainActivity.this, "Please Fill All The Fields", Toast.LENGTH_LONG).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ans;
                if (input1.getText().length() > 0 & input2.getText().length() > 0) {
                    String in1 = input1.getText().toString();
                    int in11 = Integer.parseInt(in1);

                    String in2 = input2.getText().toString();
                    int in22 = Integer.parseInt(in2);


                    ans = in11 * in22;
                    result.setText(Integer.toString(ans));
                } else {
                    Toast.makeText(MainActivity.this, "Please Fill All The Fields", Toast.LENGTH_LONG).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ans;
                if (input1.getText().length() > 0 & input2.getText().length() > 0) {
                    String in1 = input1.getText().toString();
                    int in11 = Integer.parseInt(in1);

                    String in2 = input2.getText().toString();
                    int in22 = Integer.parseInt(in2);


                    ans = in11 / in22;
                    result.setText(Integer.toString(ans));
                } else {
                    Toast.makeText(MainActivity.this, "Please Fill All The Fields", Toast.LENGTH_LONG).show();
                }
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                result.setText("0.00");
            }
        });
    }
}

