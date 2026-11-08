package Ia;

import V0.p;
import android.media.AudioAttributes;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6435f;

    public a(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f6430a = z10;
        this.f6431b = z11;
        this.f6432c = i10;
        this.f6433d = i11;
        this.f6434e = i12;
        this.f6435f = i13;
    }

    public static a b(a aVar) {
        boolean z10 = aVar.f6430a;
        boolean z11 = aVar.f6431b;
        int i10 = aVar.f6432c;
        int i11 = aVar.f6433d;
        int i12 = aVar.f6434e;
        int i13 = aVar.f6435f;
        aVar.getClass();
        return new a(z10, z11, i10, i11, i12, i13);
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(this.f6433d).setContentType(this.f6432c).build();
        m.e(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6430a == aVar.f6430a && this.f6431b == aVar.f6431b && this.f6432c == aVar.f6432c && this.f6433d == aVar.f6433d && this.f6434e == aVar.f6434e && this.f6435f == aVar.f6435f;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f6430a), Boolean.valueOf(this.f6431b), Integer.valueOf(this.f6432c), Integer.valueOf(this.f6433d), Integer.valueOf(this.f6434e), Integer.valueOf(this.f6435f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioContextAndroid(isSpeakerphoneOn=");
        sb.append(this.f6430a);
        sb.append(", stayAwake=");
        sb.append(this.f6431b);
        sb.append(", contentType=");
        sb.append(this.f6432c);
        sb.append(", usageType=");
        sb.append(this.f6433d);
        sb.append(", audioFocus=");
        sb.append(this.f6434e);
        sb.append(", audioMode=");
        return p.q(sb, this.f6435f, ')');
    }
}
