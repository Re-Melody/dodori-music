package org.maplibre.android.offline;

import androidx.annotation.Keep;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineRegionError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25092b;

    @Keep
    private OfflineRegionError(String str, String str2) {
        this.f25091a = str;
        this.f25092b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !OfflineRegionError.class.equals(obj.getClass())) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        if (m.b(this.f25091a, offlineRegionError.f25091a)) {
            return m.b(this.f25092b, offlineRegionError.f25092b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25092b.hashCode() + (this.f25091a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineRegionError{reason='");
        sb.append(this.f25091a);
        sb.append("', message='");
        return p134m1.b.m(sb, this.f25092b, "'}");
    }
}
