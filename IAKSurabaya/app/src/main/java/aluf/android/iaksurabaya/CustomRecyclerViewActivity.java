package aluf.android.iaksurabaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import aluf.android.iaksurabaya.adapter.RecyclerAdapter;
import aluf.android.iaksurabaya.model.RView;

public class CustomRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RView> datalist = new ArrayList<>();
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_recycler_view);

        recyclerView = (RecyclerView) findViewById(R.id.view);
        mAdapter = new RecyclerAdapter(datalist);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {
        RView data = new RView("Browser","Browser internet",R.drawable.browser);
        datalist.add(data);
        data = new RView("Android Studio", "Ngoding Android", R.drawable.androidstudio);
        datalist.add(data);
    }
}
