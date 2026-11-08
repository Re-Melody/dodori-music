package O6;

import T6.EnumC0865v0;
import T6.Z0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1188i;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: O6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f9306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0865v0 f9307c;

    public C0699j(String str, Class cls, EnumC0865v0 enumC0865v0) {
        this.f9305a = str;
        this.f9306b = cls;
        this.f9307c = enumC0865v0;
    }

    public final Object a(AbstractC1188i abstractC1188i) throws GeneralSecurityException {
        return v.f9326b.a(w.f9328b.a(L.a(this.f9305a, abstractC1188i, this.f9307c, Z0.RAW, null)), this.f9306b);
    }
}
