package com.ht.ht_a;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.ht.ht_lib.base.BaseActivity;

/**
 * Created on 2019/12/18.
 * 请写类注释
 *
 * @author peter
 */
@Route(path = "/a/activity")
public class A_Activity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
}
