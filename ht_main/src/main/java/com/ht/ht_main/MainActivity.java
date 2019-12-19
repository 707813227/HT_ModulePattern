package com.ht.ht_main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;


import com.alibaba.android.arouter.launcher.ARouter;
import com.ht.ht_lib.base.BaseActivity;

/**
 * Created on 2019/12/18.
 * 请写类注释
 *
 * @author peter
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        findViewById(R.id.a_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/a/activity").navigation();
            }
        });

        findViewById(R.id.b_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/b/b").navigation();
            }
        });

        findViewById(R.id.fragment_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BottomNavigationActivity.class));
            }
        });
    }
}
