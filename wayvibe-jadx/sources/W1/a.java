package W1;

import M8.l;
import N8.y;
import V5.EnumC0954u;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f12775a;

    static {
        l[] lVarArr = {new l(EnumC0954u.UNKNOWN_ERR, new Q1.a(26)), new l(EnumC0954u.ABORT_ERR, new Q1.a(0)), new l(EnumC0954u.ATTESTATION_NOT_PRIVATE_ERR, new Q1.a(16)), new l(EnumC0954u.CONSTRAINT_ERR, new Q1.a(1)), new l(EnumC0954u.DATA_ERR, new Q1.a(3)), new l(EnumC0954u.INVALID_STATE_ERR, new Q1.a(10)), new l(EnumC0954u.ENCODING_ERR, new Q1.a(4)), new l(EnumC0954u.NETWORK_ERR, new Q1.a(12)), new l(EnumC0954u.NOT_ALLOWED_ERR, new Q1.a(14)), new l(EnumC0954u.NOT_SUPPORTED_ERR, new Q1.a(17)), new l(EnumC0954u.SECURITY_ERR, new Q1.a(22)), new l(EnumC0954u.TIMEOUT_ERR, new Q1.a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.e0(12));
        y.m0(linkedHashMap, lVarArr);
        f12775a = linkedHashMap;
    }
}
