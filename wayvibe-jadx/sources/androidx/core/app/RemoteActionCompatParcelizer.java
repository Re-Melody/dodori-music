package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(R3.b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        R3.d dVarH = remoteActionCompat.f14910a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f14910a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f14911b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((R3.c) bVar).f10898e);
        }
        remoteActionCompat.f14911b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f14912c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((R3.c) bVar).f10898e);
        }
        remoteActionCompat.f14912c = charSequence2;
        remoteActionCompat.f14913d = (PendingIntent) bVar.g(remoteActionCompat.f14913d, 4);
        boolean z11 = remoteActionCompat.f14914e;
        if (bVar.e(5)) {
            z11 = ((R3.c) bVar).f10898e.readInt() != 0;
        }
        remoteActionCompat.f14914e = z11;
        boolean z12 = remoteActionCompat.f14915f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((R3.c) bVar).f10898e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f14915f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, R3.b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f14910a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f14911b;
        bVar.i(2);
        Parcel parcel = ((R3.c) bVar).f10898e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f14912c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f14913d, 4);
        boolean z10 = remoteActionCompat.f14914e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f14915f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
