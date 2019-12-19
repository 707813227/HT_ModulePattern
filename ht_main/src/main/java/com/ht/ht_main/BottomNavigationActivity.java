package com.ht.ht_main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;

import com.ht.ht_lib.base.BaseActivity;
import com.ht.ht_lib.base.BaseFragment;
import com.ht.ht_lib.base.FragmentManager;
import com.ht.ht_lib.base.IViewDelegate;
import com.ht.ht_lib.utlis.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/12/19.
 * 请写类注释
 *
 * @author peter
 */
public class BottomNavigationActivity extends BaseActivity {

    private ViewPager mPager;
    private List<BaseFragment> mFragments;
    private FragmentAdapter mAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int i = item.getItemId();
            if (i == R.id.navigation_a) {
                mPager.setCurrentItem(0);
                return true;
            } else if (i == R.id.navigation_b) {
                mPager.setCurrentItem(1);
                return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        initViewPager();

    }

    private void initViewPager() {
        mFragments = FragmentManager.getInstance().getAllFragment();
        Log.e("mFragments ", "" + mFragments.size());
        mPager = (ViewPager) findViewById(R.id.container_pager);
        mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        mPager.setAdapter(mAdapter);
    }
}
