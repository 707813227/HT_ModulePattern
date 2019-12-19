package com.ht.ht_lib.base;

import android.app.Application;
import android.util.Log;

import com.ht.ht_lib.utlis.ClassUtils;
import com.ht.ht_lib.utlis.HTUtils;

import java.util.List;

/**
 * Created on 2019/12/18.
 * 请写类注释
 *
 * @author peter
 */
public class BaseApplication extends Application {
    public static final String ROOT_PACKAGE = "com.ht";
    private List<IApplicationDelegate> mAppDelegateList;
    @Override
    public void onCreate() {
        super.onCreate();
        HTUtils.init(this);
        mAppDelegateList = ClassUtils.getObjectsWithInterface(this, IApplicationDelegate.class, ROOT_PACKAGE);
        Log.e("BaseApplication ","+"+mAppDelegateList.size());
        for (IApplicationDelegate delegate : mAppDelegateList) {
            delegate.onCreate();
        }
    }
}
