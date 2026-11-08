package O6;

import T6.EnumC0865v0;
import T6.Z0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1188i;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class L implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V6.a f9261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1188i f9262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0865v0 f9263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z0 f9264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f9265f;

    public L(String str, V6.a aVar, AbstractC1188i abstractC1188i, EnumC0865v0 enumC0865v0, Z0 z1, Integer num) {
        this.f9260a = str;
        this.f9261b = aVar;
        this.f9262c = abstractC1188i;
        this.f9263d = enumC0865v0;
        this.f9264e = z1;
        this.f9265f = num;
    }

    public static L a(String str, AbstractC1188i abstractC1188i, EnumC0865v0 enumC0865v0, Z0 z1, Integer num) throws GeneralSecurityException {
        if (z1 == Z0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new L(str, T.a(str), abstractC1188i, enumC0865v0, z1, num);
    }
}
