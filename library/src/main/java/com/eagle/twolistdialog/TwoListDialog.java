package com.eagle.twolistdialog;

import android.annotation.SuppressLint;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by shivam on 23/8/15.
 */
@SuppressLint("ValidFragment")
public class TwoListDialog extends DialogFragment {

    public TwoListDialog(TwoListDialogBuilder twoListDialogBuilder) {
    }

    public static TwoListDialogBuilder builder(FragmentManager supportFragmentManager) {
        return new TwoListDialogBuilder(supportFragmentManager);
    }
}
