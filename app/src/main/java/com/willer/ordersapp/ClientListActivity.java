package com.willer.ordersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ClientListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_list);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProgressBar.getVisibility() == View.VISIBLE){
                    showProgressBar(false);
                }
                else {
                    showProgressBar(true);
                }
            }
        });
    }

    public void showProgressBar(boolean visibility){
        mProgressBar.setVisibility(visibility ? View.VISIBLE : View.INVISIBLE);
    }
}
