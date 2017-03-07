package css.cis3334.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText etxtwidth;
    EditText etxtlength;
    Button btnresults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtlength = (EditText) findViewById(R.id.editTextLength);
        etxtwidth = (EditText) findViewById(R.id.editTextWidth);
        btnresults = (Button) findViewById(R.id.buttonResults);

    }
    public void onClickResults(View view) {

        Double widthInput = Double.parseDouble(etxtlength.getText().toString());
        Double lengthInput= Double.parseDouble(etxtwidth.getText().toString());
        Double total = widthInput * lengthInput;

        Intent displayInput = new Intent(MainActivity.this, Display.class);
        displayInput.putExtra("width", widthInput);
        displayInput.putExtra("length", lengthInput);
        displayInput.putExtra("total", total);
        startActivity(displayInput);
    }

}
