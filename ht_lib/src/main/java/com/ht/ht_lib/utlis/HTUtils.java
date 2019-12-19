package com.ht.ht_lib.utlis;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created on 2019/12/18.
 * 请写类注释
 *
 * @author peter
 */
public class HTUtils {

    private static Context context;
    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        HTUtils.context = context.getApplicationContext();
    }


    /**
     * 判断App是否是Debug版本
     *
     * @return {@code true}: 是<br>{@code false}: 否
     */
    public static boolean isAppDebug() {
        if (TextUtils.isEmpty(context.getPackageName())){
            return false;
        }
        try {
            PackageManager pm = context.getPackageManager();
            ApplicationInfo ai = pm.getApplicationInfo(context.getPackageName(), 0);
            return ai != null && (ai.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
