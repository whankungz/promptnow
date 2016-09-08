package com.promptnow.econprice.fragment.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.promptnow.econprice.R;

public class NullWeatherFragment extends Fragment {
    private View rootView;

    public void onCreate (Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState );
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_stucture_weather, container, false);
//setToolbar();
        return rootView;
    }

//    private void setToolbar() {
//        TextView tb=(TextView) rootView.findViewById(R.id.toolbar_title);
//        tb.setText("พยากรณ์อากาศ");
//    }


}
