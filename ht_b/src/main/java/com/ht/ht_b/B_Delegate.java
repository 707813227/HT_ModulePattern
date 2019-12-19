package com.ht.ht_b;

import android.support.annotation.Keep;
import android.view.ViewManager;

import com.ht.ht_lib.base.FragmentManager;
import com.ht.ht_lib.base.IApplicationDelegate;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
@Keep
public class B_Delegate implements IApplicationDelegate {

    @Override
    public void onCreate() {
        FragmentManager.getInstance().addFragment(0, B_Fragment.newInstance());
    }

    @Override
    public void onTerminate() {

    }

    @Override
    public void onLowMemory() {

    }

    @Override
    public void onTrimMemory(int level) {

    }
}
