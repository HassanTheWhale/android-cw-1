package site.thewhale.firstprojectever;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GradeCalculator");

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
                EditText editText2 = (EditText) findViewById(R.id.editTextNumber2);
                EditText editText3 = (EditText) findViewById(R.id.editTextNumber3);
                EditText editText4 = (EditText) findViewById(R.id.editTextNumber4);

                String e1 = editText1.getText().toString();
                String e2 = editText2.getText().toString();
                String e3 = editText3.getText().toString();
                String e4 = editText4.getText().toString();

                TextView myAwesomeTextView = (TextView)findViewById(R.id.textView2);

                try {

                    int a = Integer.parseInt(e1);
                    int b = Integer.parseInt(e2);
                    int c = Integer.parseInt(e3);
                    int d = Integer.parseInt(e4);
                    int result = a + b + c + d;
                    myAwesomeTextView.setText(String.valueOf(result));
                } catch (Exception ex) {
                    myAwesomeTextView.setText("Something is wrong!");
                }
            }
        });
    }


}