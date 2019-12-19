package com.ht.ht_lib.base;

import android.view.ViewManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
public class FragmentManager {

    private static List<BaseFragment> fragmentList;

    public static FragmentManager getInstance() {
        return ManagerHolder.sInstance;
    }

    private static class ManagerHolder {
        private static final FragmentManager sInstance = new FragmentManager();
    }

    public List<BaseFragment> getAllFragment() {
        if (fragmentList != null) {
            return fragmentList;
        }
        return null;
    }
    public void addFragment(int index, BaseFragment fragment) {
        if (fragmentList == null) {
            fragmentList = new ArrayList<>();
        }
        fragmentList.add(fragment);
//        fragmentList.add(index, fragment);
    }

}
