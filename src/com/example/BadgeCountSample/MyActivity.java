package com.example.BadgeCountSample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyActivity extends Activity {
    TextView tv, tv1;
    String counts, sampleCount;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        applyCounts();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        onCreateOptionsMenu(menu, inflater);
        return super.onCreateOptionsMenu(menu);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
        RelativeLayout badgeLayout = (RelativeLayout) menu.findItem(R.id.badge).getActionView();
        RelativeLayout badgeLayout1 = (RelativeLayout) menu.findItem(R.id.badge1).getActionView();
        tv = (TextView) badgeLayout.findViewById(R.id.textOne);
        tv1 = (TextView) badgeLayout1.findViewById(R.id.textTwo);
        tv.setText(counts);
        tv1.setText(sampleCount);
    }

    public void applyCounts() {
        counts = "25";
        sampleCount = "50";
    }
}
