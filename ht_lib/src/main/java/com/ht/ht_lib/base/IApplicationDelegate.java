package com.ht.ht_lib.base;

import android.support.annotation.Keep;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
@Keep
public interface IApplicationDelegate {

    void onCreate();

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);
}
