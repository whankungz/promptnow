package com.promptnow.econprice.view;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.promptnow.econprice.R;

import java.util.Arrays;

;

/**
 * Created by Admin on 2/9/2559.
 *
 *
 *
 * This code is used to call a View_popup.
 *
 * View_date alertDialog = new View_date(
 * getResources().getString(R.string.str_msgdate));
 * alertDialog.mListener = (class).this;
 * alertDialog.show(getActivity().getFragmentManager(), "");
 * });
 */


public class View_date extends DialogFragment {

    private Button button;
    TextView txt_msg;
    private String message;

    String[] value = new String[]{
            "1 มิถุนายน 59",
            "16 มิถุนายน 59",
            "1 กรกฏาคม 59",
            "16 กรกฏาคม 59"
    };

    View.OnClickListener listenerOK;
    public View_date.onSubmitAlertDialogListener mListener;

    public void show(FragmentActivity activity, String s) {
        this.show(activity, s);
    }


    public interface onSubmitAlertDialogListener {
        void setOnSubmitAlertDialogListener();
    }

    public View_date(String message) {
        this.message = message;

    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(getActivity());
        alertdialogbuilder.setItems(value, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selectedText = Arrays.asList(value).get(which);
                txt_msg = (TextView) getActivity().findViewById(R.id.tv_date);
                txt_msg.setText(selectedText);


            }
        });

        AlertDialog dialog = alertdialogbuilder.create();

        dialog.show();
        return dialog;
    }

}





