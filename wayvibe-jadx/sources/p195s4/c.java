package p195s4;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.m;
import p070g4.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26118a;

    public c(Context context) {
        this.f26118a = context;
    }

    @Override // p195s4.h
    public final Object b(j jVar) {
        DisplayMetrics displayMetrics = this.f26118a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m.b(this.f26118a, ((c) obj).f26118a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26118a.hashCode();
    }
}
