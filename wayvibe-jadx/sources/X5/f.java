package X5;

import V5.e0;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends I5.a {
    public static final Parcelable.Creator<f> CREATOR = new e0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f13241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13242b;

    public f(PendingIntent pendingIntent, g gVar) {
        this.f13241a = pendingIntent;
        this.f13242b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.m.f(dest, "dest");
        int iC0 = p242x0.c.c0(20293, dest);
        p242x0.c.V(dest, 1, this.f13241a, i10, false);
        p242x0.c.V(dest, 2, this.f13242b, i10, false);
        p242x0.c.d0(iC0, dest);
    }
}
