package aluf.android.iaksurabaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void coffee(View view){
        startActivity(new Intent(MainActivity.this,CoffeeActivity.class));
    }

    public void basketCounter(View view){
        startActivity(new Intent(MainActivity.this, BasketCounterActivity.class));
    }

    public void costumRecyclerView(View view){
        startActivity(new Intent(MainActivity.this, CustomRecyclerViewActivity.class));
    }
}
