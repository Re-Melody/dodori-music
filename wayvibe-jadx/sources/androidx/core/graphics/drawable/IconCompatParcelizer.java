package androidx.core.graphics.drawable;

import R3.b;
import R3.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f14979a = bVar.f(iconCompat.f14979a, 1);
        byte[] bArr = iconCompat.f14981c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f10898e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f14981c = bArr;
        iconCompat.f14982d = bVar.g(iconCompat.f14982d, 3);
        iconCompat.f14983e = bVar.f(iconCompat.f14983e, 4);
        iconCompat.f14984f = bVar.f(iconCompat.f14984f, 5);
        iconCompat.f14985g = (ColorStateList) bVar.g(iconCompat.f14985g, 6);
        String string = iconCompat.f14987i;
        if (bVar.e(7)) {
            string = ((c) bVar).f10898e.readString();
        }
        iconCompat.f14987i = string;
        String string2 = iconCompat.f14988j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f10898e.readString();
        }
        iconCompat.f14988j = string2;
        iconCompat.f14986h = PorterDuff.Mode.valueOf(iconCompat.f14987i);
        switch (iconCompat.f14979a) {
            case -1:
                Parcelable parcelable = iconCompat.f14982d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f14980b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f14982d;
                if (parcelable2 != null) {
                    iconCompat.f14980b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f14981c;
                iconCompat.f14980b = bArr3;
                iconCompat.f14979a = 3;
                iconCompat.f14983e = 0;
                iconCompat.f14984f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f14981c, Charset.forName("UTF-16"));
                iconCompat.f14980b = str;
                if (iconCompat.f14979a == 2 && iconCompat.f14988j == null) {
                    iconCompat.f14988j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f14980b = iconCompat.f14981c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f14987i = iconCompat.f14986h.name();
        switch (iconCompat.f14979a) {
            case -1:
                iconCompat.f14982d = (Parcelable) iconCompat.f14980b;
                break;
            case 1:
            case 5:
                iconCompat.f14982d = (Parcelable) iconCompat.f14980b;
                break;
            case 2:
                iconCompat.f14981c = ((String) iconCompat.f14980b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f14981c = (byte[]) iconCompat.f14980b;
                break;
            case 4:
            case 6:
                iconCompat.f14981c = iconCompat.f14980b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f14979a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f14981c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f10898e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f14982d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f14983e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f14984f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f14985g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f14987i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f10898e.writeString(str);
        }
        String str2 = iconCompat.f14988j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f10898e.writeString(str2);
        }
    }
}
