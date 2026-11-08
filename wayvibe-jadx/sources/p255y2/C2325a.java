package p255y2;

import B2.AbstractC0111a;
import B2.C;
import android.net.Uri;
import java.util.Arrays;
import p134m1.b;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2325a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f28861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2346w[] f28862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f28863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f28864f;

    static {
        b.y(0, 1, 2, 3, 4);
        C.D(5);
        C.D(6);
        C.D(7);
        C.D(8);
    }

    public C2325a(int i10, int i11, int[] iArr, C2346w[] c2346wArr, long[] jArr) {
        Uri uri;
        int i12 = 0;
        AbstractC0111a.d(iArr.length == c2346wArr.length);
        this.f28859a = i10;
        this.f28860b = i11;
        this.f28863e = iArr;
        this.f28862d = c2346wArr;
        this.f28864f = jArr;
        this.f28861c = new Uri[c2346wArr.length];
        while (true) {
            Uri[] uriArr = this.f28861c;
            if (i12 >= uriArr.length) {
                return;
            }
            C2346w c2346w = c2346wArr[i12];
            if (c2346w == null) {
                uri = null;
            } else {
                C2343t c2343t = c2346w.f28984b;
                c2343t.getClass();
                uri = c2343t.f28975a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f28863e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2325a.class != obj.getClass()) {
            return false;
        }
        C2325a c2325a = (C2325a) obj;
        return this.f28859a == c2325a.f28859a && this.f28860b == c2325a.f28860b && Arrays.equals(this.f28862d, c2325a.f28862d) && Arrays.equals(this.f28863e, c2325a.f28863e) && Arrays.equals(this.f28864f, c2325a.f28864f);
    }

    public final int hashCode() {
        int i10 = ((this.f28859a * 31) + this.f28860b) * 31;
        int i11 = (int) 0;
        return (((Arrays.hashCode(this.f28864f) + ((Arrays.hashCode(this.f28863e) + ((Arrays.hashCode(this.f28862d) + ((i10 + i11) * 31)) * 31)) * 31)) * 31) + i11) * 31;
    }
}
