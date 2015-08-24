package com.eagle.twolistdialog;

import android.support.v4.app.FragmentManager;

/**
 * Created by shivam on 24/8/15.
 */
public class TwoListDialogBuilder {
    private String title;
    private String positiveText;
    private String negativeText;
    private String[] list1;
    private String[] list2;
    private FragmentManager supportFragmentManager;

    public TwoListDialogBuilder(FragmentManager supportFragmentManager) {
        this.supportFragmentManager = supportFragmentManager;
    }

    public TwoListDialogBuilder title(String title) {
        this.title = title;
        return this;
    }

    public TwoListDialogBuilder positiveText(String positiveText) {
        this.positiveText = positiveText;
        return this;
    }

    public TwoListDialogBuilder negativeText(String negativeText) {
        this.negativeText = negativeText;
        return this;
    }

    public TwoListDialog show() {
        TwoListDialog dialog = new TwoListDialog(this);
        dialog.show(supportFragmentManager, TwoListDialog.class.getSimpleName());
        return dialog;
    }

    public TwoListDialogBuilder list1(String[] list1) {
        this.list1 = list1;
        return this;
    }

    public TwoListDialogBuilder list2(String[] list2) {
        this.list2 = list2;
        return this;
    }
}
