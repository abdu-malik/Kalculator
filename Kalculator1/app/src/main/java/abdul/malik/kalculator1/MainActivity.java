package abdul.malik.kalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1 , text2;
    Button minus ,plus ,delenie , umnogit,ravno;
    TextView otvet;
    double otv = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.Etext1);
        text2 = findViewById(R.id.Etext2);

        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        delenie = findViewById(R.id.delenie);
        umnogit = findViewById(R.id.umnogit);

        ravno = findViewById(R.id.ravno1);

        otvet = findViewById(R.id.otvet1);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {

                }
                else {
                    double a = Double.parseDouble(text1.getText().toString());
                    double b = Double.parseDouble(text2.getText().toString());
                    otv = a + b;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {

                }
                else {
                    double a = Double.parseDouble(text1.getText().toString());
                    double b = Double.parseDouble(text2.getText().toString());
                    otv = a - b;
                }
            }
        });

        umnogit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {

                }
                else {
                    double a = Double.parseDouble(text1.getText().toString());
                    double b = Double.parseDouble(text2.getText().toString());
                    otv = a * b;
                }
            }
        });

        delenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = text1.getText().toString();
                String num2 = text2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {

                } else {
                    double a = Double.parseDouble(text1.getText().toString());
                    double b = Double.parseDouble(text2.getText().toString());
                    if (b != 0)
                        otv = a / b;
                    else
                        Toast.makeText(getApplicationContext(), "Нельзя делить на нол", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ravno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otv1 = String.valueOf(otv);
                otvet.setText(otv1);
                otv= 0;
            }
        });
    }
}