package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21149b;

    public s(View view, int i10) {
        this.f21148a = view;
        this.f21149b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f21149b == sVar.f21149b && this.f21148a.equals(sVar.f21148a);
    }

    public final int hashCode() {
        return ((this.f21148a.hashCode() + 31) * 31) + this.f21149b;
    }
}
