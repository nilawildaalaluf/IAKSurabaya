package aluf.android.iaksurabaya;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class CoffeeActivity extends AppCompatActivity {
    
    int quantity =0;
    boolean isWhippedCream = false;
    boolean isChocolate = false;
    
    EditText textNama;
    CheckBox cbWhippedCream;
    CheckBox cbChocolate;
    TextView tvValue;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        
        textNama = (EditText)findViewById(R.id.nama);
        cbWhippedCream =(CheckBox)findViewById(R.id.cb_cream);
        cbChocolate = (CheckBox)findViewById(R.id.cb_chocolate);
        tvValue = (TextView) findViewById(R.id.value);
        tvTotal = (TextView) findViewById(R.id.total);
    }
    
    public void min (View view){
        if (quantity == 0){
            return;
        }
        quantity = quantity-1;
        display(quantity);
    }

    private void display(int number) {
        tvValue.setText(""+number);
    }
    public void plus(View view){
        quantity = quantity+1;
        display(quantity);
    }
    public void order(View view){
        displayOrder(10 * quantity);
    }

    private void displayOrder(int number) {
        isWhippedCream = cbWhippedCream.isChecked();
        isChocolate = cbChocolate.isChecked();

        if (isWhippedCream){
            number = number+1;
        }
        if (isChocolate){
            number = number+2;
        }

        tvTotal.setText("Total : "+ NumberFormat.getCurrencyInstance().format(number));
    }
}
