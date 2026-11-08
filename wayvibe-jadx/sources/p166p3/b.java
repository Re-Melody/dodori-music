package p166p3;

import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements A {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
