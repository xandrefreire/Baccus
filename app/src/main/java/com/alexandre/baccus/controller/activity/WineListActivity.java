package com.alexandre.baccus.controller.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.alexandre.baccus.R;
import com.alexandre.baccus.controller.fragment.WineListFragment;
import com.alexandre.baccus.controller.fragment.WineryFragment;

/**
 * Created by alexandre on 5/2/17.
 */

public class WineListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_list);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        FragmentManager fm = getSupportFragmentManager();

        if (findViewById(R.id.list) != null) {
            Fragment listFragment = fm.findFragmentById(R.id.list);
            if (listFragment == null) {
                listFragment = new WineListFragment();
                fm.beginTransaction().add(R.id.list, listFragment).commit();
            }
        }

        if (findViewById(R.id.winery) != null) {
            Fragment wineryFragment = fm.findFragmentById(R.id.winery);
            if (wineryFragment == null) {
                wineryFragment =  WineryFragment.newInstance(0);
                fm.beginTransaction().add(R.id.winery, wineryFragment).commit();
            }
        }
    }
}
