package com.ulfy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ulfy.controls.ChartView;
import com.ulfy.controls.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {
    private Button refreshBT;
    private ChartView charCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshBT = findViewById(R.id.refreshBT);
        charCV = findViewById(R.id.charCV);

        refreshBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<ChartView.Data> dataList = new ArrayList<>();
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                dataList.add(new ChartView.Data("03.11", new Random().nextInt(100)));
                charCV.setDataList(dataList);
            }
        });
    }
}
