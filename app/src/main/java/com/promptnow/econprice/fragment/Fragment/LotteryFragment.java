package com.promptnow.econprice.fragment.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promptnow.econprice.R;

/**
 * Created by Whankung on 7/9/2559.
 */

public class LotteryFragment extends Fragment {
    private View rootView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.checklottery, container, false);

        return rootView;
    }



}
