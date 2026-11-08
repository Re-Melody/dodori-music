package X5;

import V5.e0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends I5.a {
    public static final Parcelable.Creator<l> CREATOR = new e0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f13254a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.m.f(pendingIntent, "pendingIntent");
        this.f13254a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.m.f(dest, "dest");
        int iC0 = p242x0.c.c0(20293, dest);
        p242x0.c.V(dest, 1, this.f13254a, i10, false);
        p242x0.c.d0(iC0, dest);
    }
}
