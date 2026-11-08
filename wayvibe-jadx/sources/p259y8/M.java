package p259y8;

import D7.W;
import T8.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y8.M[], still in use, count: 1, list:
  (r0v1 y8.M[]) from 0x0024: INVOKE (r0v1 y8.M[]) STATIC call: D7.W.B(java.lang.Enum[]):T8.b A[MD:(java.lang.Enum[]):T8.b (m), WRAPPED] (LINE:37)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class M {
    PLATFORM_ENCODED(0),
    JSON_ENCODED(1),
    UNEXPECTED_STRING(2);

    private static final /* synthetic */ a $ENTRIES;
    public static final L Companion = new L();
    private final int raw;

    static {
        $ENTRIES = W.B(new M[]{r0, r1, r2});
    }

    public M(int i10) {
        super(str, i);
        this.raw = i10;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }

    public final int f() {
        return this.raw;
    }
}
