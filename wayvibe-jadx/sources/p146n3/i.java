package p146n3;

import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22936a;

    public i(String str) {
        this.f22936a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f22936a;
    }
}
