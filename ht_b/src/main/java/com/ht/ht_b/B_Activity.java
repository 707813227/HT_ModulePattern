package com.ht.ht_b;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.ht.ht_lib.base.BaseActivity;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
@Route(path = "/b/b")
public class B_Activity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
}
