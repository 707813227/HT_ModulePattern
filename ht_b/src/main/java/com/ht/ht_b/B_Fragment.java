package com.ht.ht_b;

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
public class B_Fragment extends BaseFragment {

    public static B_Fragment newInstance() {
        return new B_Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}
