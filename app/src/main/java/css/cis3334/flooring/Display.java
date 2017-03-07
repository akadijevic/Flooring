package css.cis3334.flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
double widthInput;
    double lengthInput;
    double total;
    TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvTotal = (TextView) findViewById(R.id.textViewTotal);

        Bundle extras = getIntent().getExtras();
        widthInput = extras.getDouble("width");
        lengthInput = extras.getDouble("length");
        total = extras.getDouble("total");

        tvTotal.setText("Width is " + widthInput + " and Length is " + lengthInput + ". Flooring needed is " + total + " \n \n Good luck :)");
    }
}
