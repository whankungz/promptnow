package com.promptnow.econprice.activity;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.promptnow.econprice.R;
import com.promptnow.econprice.fragment.lottery.NullLotteryFragment;
import com.promptnow.econprice.fragment.oil.NullOilFragment;
import com.promptnow.econprice.fragment.weather.NullWeatherFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabSelectListener;

import static android.R.id.accessibilityActionContextClick;
import static android.R.id.message;
import static android.R.id.tabs;
import static com.promptnow.econprice.R.color.bb_inActiveBottomBarItemColor;
import static com.promptnow.econprice.R.color.colorGreen;
import static com.promptnow.econprice.R.id.bb_bottom_bar_icon;
import static com.promptnow.econprice.R.id.bottomBar;
import static com.promptnow.econprice.R.id.cancel_action;
import static com.promptnow.econprice.R.id.collapseActionView;
import static com.promptnow.econprice.R.id.icon;
import static com.promptnow.econprice.R.id.showCustom;
import static com.promptnow.econprice.R.id.showTitle;
import static com.promptnow.econprice.R.id.tab_oil;

public class Menu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setView();
        setBottomBar();

    }


    private void setView() {

    }


    private void setBottomBar() {
        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
             TextView tv = (TextView) findViewById(R.id.toolbar_title);
            @Override
            public void onTabSelected(@IdRes int tabId) {

                if (tabId == R.id.tab_oil) {

                    // Toast.makeText(MainActivity.this,"tttt",Toast.LENGTH_LONG).show();
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.frgMain, new NullOilFragment());
                    transaction.commit();
                    tv.setText("ตรวจสอบราคาน้ำมัน");
                    tv.setTextColor(Color.parseColor("#228B22"));
                 //   tv.setBackgroundColor(Color.parseColor("#FFFFF0"));




                }else if (tabId == R.id.tab_lottery){
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.frgMain, new NullLotteryFragment());
                    transaction.commit();
                    tv.setText("ตรวจผลสลากกินแบ่งรัฐบาล");
                    tv.setTextColor(Color.parseColor("#B22222"));
                }else if(tabId == R.id.tab_weather){
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.frgMain, new NullWeatherFragment());
                    transaction.commit();
                    tv.setText("พยากรณ์อากาศ");
                    tv.setTextColor(Color.parseColor("#20B2AA"));
                }
            }


        });

    }










}




