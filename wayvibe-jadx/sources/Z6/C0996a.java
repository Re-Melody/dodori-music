package Z6;

import E9.C0354o;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Z6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996a extends I5.a {
    public static final Parcelable.Creator<C0996a> CREATOR = new Z5.u(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13969j;
    public final String k;

    public C0996a(C0354o c0354o) {
        this.f13960a = (String) c0354o.f3401d;
        this.f13961b = (String) c0354o.f3402e;
        this.f13962c = null;
        this.f13963d = (String) c0354o.f3403f;
        this.f13964e = c0354o.f3399b;
        this.f13965f = (String) c0354o.f3404g;
        this.f13966g = c0354o.f3400c;
        this.f13969j = (String) c0354o.f3405h;
        this.k = (String) c0354o.f3406i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.W(parcel, 1, this.f13960a, false);
        p242x0.c.W(parcel, 2, this.f13961b, false);
        p242x0.c.W(parcel, 3, this.f13962c, false);
        p242x0.c.W(parcel, 4, this.f13963d, false);
        p242x0.c.b0(parcel, 5, 4);
        parcel.writeInt(this.f13964e ? 1 : 0);
        p242x0.c.W(parcel, 6, this.f13965f, false);
        p242x0.c.b0(parcel, 7, 4);
        parcel.writeInt(this.f13966g ? 1 : 0);
        p242x0.c.W(parcel, 8, this.f13967h, false);
        int i11 = this.f13968i;
        p242x0.c.b0(parcel, 9, 4);
        parcel.writeInt(i11);
        p242x0.c.W(parcel, 10, this.f13969j, false);
        p242x0.c.W(parcel, 11, this.k, false);
        p242x0.c.d0(iC0, parcel);
    }

    public C0996a(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7, String str8) {
        this.f13960a = str;
        this.f13961b = str2;
        this.f13962c = str3;
        this.f13963d = str4;
        this.f13964e = z10;
        this.f13965f = str5;
        this.f13966g = z11;
        this.f13967h = str6;
        this.f13968i = i10;
        this.f13969j = str7;
        this.k = str8;
    }
}
