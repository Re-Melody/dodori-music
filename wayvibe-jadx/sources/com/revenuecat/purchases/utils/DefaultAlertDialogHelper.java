package com.revenuecat.purchases.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAlertDialogHelper implements AlertDialogHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$0(Z8.a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$1(Z8.a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$2(Z8.a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.invoke();
    }

    @Override // com.revenuecat.purchases.utils.AlertDialogHelper
    public void showDialog(Activity activity, String title, String message, String positiveButtonText, String negativeButtonText, String neutralButtonText, final Z8.a onPositiveButtonClicked, final Z8.a onNegativeButtonClicked, final Z8.a onNeutralButtonClicked) {
        m.f(activity, "activity");
        m.f(title, "title");
        m.f(message, "message");
        m.f(positiveButtonText, "positiveButtonText");
        m.f(negativeButtonText, "negativeButtonText");
        m.f(neutralButtonText, "neutralButtonText");
        m.f(onPositiveButtonClicked, "onPositiveButtonClicked");
        m.f(onNegativeButtonClicked, "onNegativeButtonClicked");
        m.f(onNeutralButtonClicked, "onNeutralButtonClicked");
        AlertDialog.Builder message2 = new AlertDialog.Builder(activity).setTitle(title).setMessage(message);
        final int i10 = 0;
        AlertDialog.Builder positiveButton = message2.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                switch (i10) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(onPositiveButtonClicked, dialogInterface, i11);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(onPositiveButtonClicked, dialogInterface, i11);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(onPositiveButtonClicked, dialogInterface, i11);
                        break;
                }
            }
        });
        final int i11 = 1;
        AlertDialog.Builder negativeButton = positiveButton.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i11) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(onNegativeButtonClicked, dialogInterface, i12);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(onNegativeButtonClicked, dialogInterface, i12);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(onNegativeButtonClicked, dialogInterface, i12);
                        break;
                }
            }
        });
        final int i12 = 2;
        negativeButton.setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.utils.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                switch (i12) {
                    case 0:
                        DefaultAlertDialogHelper.showDialog$lambda$0(onNeutralButtonClicked, dialogInterface, i13);
                        break;
                    case 1:
                        DefaultAlertDialogHelper.showDialog$lambda$1(onNeutralButtonClicked, dialogInterface, i13);
                        break;
                    default:
                        DefaultAlertDialogHelper.showDialog$lambda$2(onNeutralButtonClicked, dialogInterface, i13);
                        break;
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.revenuecat.purchases.utils.b
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onNeutralButtonClicked.invoke();
            }
        }).show();
    }
}
