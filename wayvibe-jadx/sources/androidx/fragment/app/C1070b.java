package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1070b implements Parcelable {
    public static final Parcelable.Creator<C1070b> CREATOR = new Z6.J(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f15265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f15267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f15268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f15273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15274j;
    public final CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f15275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15277n;

    public C1070b(C1068a c1068a) {
        int size = c1068a.f15247a.size();
        this.f15265a = new int[size * 6];
        if (!c1068a.f15253g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f15266b = new ArrayList(size);
        this.f15267c = new int[size];
        this.f15268d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s0 s0Var = (s0) c1068a.f15247a.get(i11);
            int i12 = i10 + 1;
            this.f15265a[i10] = s0Var.f15418a;
            ArrayList arrayList = this.f15266b;
            F f10 = s0Var.f15419b;
            arrayList.add(f10 != null ? f10.mWho : null);
            int[] iArr = this.f15265a;
            iArr[i12] = s0Var.f15420c ? 1 : 0;
            iArr[i10 + 2] = s0Var.f15421d;
            iArr[i10 + 3] = s0Var.f15422e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = s0Var.f15423f;
            i10 += 6;
            iArr[i13] = s0Var.f15424g;
            this.f15267c[i11] = s0Var.f15425h.ordinal();
            this.f15268d[i11] = s0Var.f15426i.ordinal();
        }
        this.f15269e = c1068a.f15252f;
        this.f15270f = c1068a.f15254h;
        this.f15271g = c1068a.f15263s;
        this.f15272h = c1068a.f15255i;
        this.f15273i = c1068a.f15256j;
        this.f15274j = c1068a.k;
        this.k = c1068a.f15257l;
        this.f15275l = c1068a.f15258m;
        this.f15276m = c1068a.f15259n;
        this.f15277n = c1068a.f15260o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f15265a);
        parcel.writeStringList(this.f15266b);
        parcel.writeIntArray(this.f15267c);
        parcel.writeIntArray(this.f15268d);
        parcel.writeInt(this.f15269e);
        parcel.writeString(this.f15270f);
        parcel.writeInt(this.f15271g);
        parcel.writeInt(this.f15272h);
        TextUtils.writeToParcel(this.f15273i, parcel, 0);
        parcel.writeInt(this.f15274j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.f15275l);
        parcel.writeStringList(this.f15276m);
        parcel.writeInt(this.f15277n ? 1 : 0);
    }

    public C1070b(Parcel parcel) {
        this.f15265a = parcel.createIntArray();
        this.f15266b = parcel.createStringArrayList();
        this.f15267c = parcel.createIntArray();
        this.f15268d = parcel.createIntArray();
        this.f15269e = parcel.readInt();
        this.f15270f = parcel.readString();
        this.f15271g = parcel.readInt();
        this.f15272h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f15273i = (CharSequence) creator.createFromParcel(parcel);
        this.f15274j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.f15275l = parcel.createStringArrayList();
        this.f15276m = parcel.createStringArrayList();
        this.f15277n = parcel.readInt() != 0;
    }
}
