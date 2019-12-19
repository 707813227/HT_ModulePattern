package com.ht.ht_a;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.ht.ht_lib.base.BaseFragment;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
public class A_Fragment extends BaseFragment {
    public static A_Fragment newInstance() {
        return new A_Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_a, container, false);

    }
}
