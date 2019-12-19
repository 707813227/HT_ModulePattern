package com.ht.modulepattern;


import com.alibaba.android.arouter.launcher.ARouter;
import com.ht.ht_lib.base.BaseApplication;
import com.ht.ht_lib.utlis.HTUtils;

/**
 * Created on 2019/12/18.
 * 请写类注释
 *
 * @author peter
 */
public class HTApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        if (HTUtils.isAppDebug()){
            ARouter.openDebug();
            ARouter.openLog();
        }

        ARouter.init(this);

    }
}
