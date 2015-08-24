package com.eagle.twolistdialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shivam on 23/8/15.
 */
@SuppressLint("ValidFragment")
public class TwoListDialog extends DialogFragment {
    private String title;
    private String positiveText;
    private String negativeText;
    private String[] list1;
    private String[] list2;
    private FragmentManager supportFragmentManager;
    private PositiveActionCallback positiveActionCallback;
    private NegativeActionCallback negativeActionCallback;

    public TwoListDialog(TwoListDialogBuilder twoListDialogBuilder) {
        title = twoListDialogBuilder.getTitle();
        positiveText = twoListDialogBuilder.getPositiveText();
        negativeText = twoListDialogBuilder.getNegativeText();
        list1 = twoListDialogBuilder.getList1();
        list2 = twoListDialogBuilder.getList2();
        positiveActionCallback = twoListDialogBuilder.getPositiveActionCallback();
        negativeActionCallback = twoListDialogBuilder.getNegativeActionCallback();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static TwoListDialogBuilder builder(FragmentManager supportFragmentManager) {
        return new TwoListDialogBuilder(supportFragmentManager);
    }
}
