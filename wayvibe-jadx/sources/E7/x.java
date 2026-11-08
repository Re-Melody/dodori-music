package E7;

import B8.V;
import java.math.BigDecimal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    private static final /* synthetic */ x[] $VALUES;
    public static final x BIG_DECIMAL;
    public static final x DOUBLE;
    public static final x LAZILY_PARSED_NUMBER;
    public static final x LONG_OR_DOUBLE;

    static {
        x xVar = new x() { // from class: E7.t
            @Override // E7.x
            public final Number a(M7.b bVar) {
                return Double.valueOf(bVar.E());
            }
        };
        DOUBLE = xVar;
        x xVar2 = new x() { // from class: E7.u
            @Override // E7.x
            public final Number a(M7.b bVar) {
                return new G7.i(bVar.L());
            }
        };
        LAZILY_PARSED_NUMBER = xVar2;
        x xVar3 = new x() { // from class: E7.v
            @Override // E7.x
            public final Number a(M7.b bVar) throws M7.e {
                String strL = bVar.L();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strL));
                    } catch (NumberFormatException e2) {
                        StringBuilder sbU = V0.p.u("Cannot parse ", strL, "; at path ");
                        sbU.append(bVar.z());
                        throw new V(sbU.toString(), e2);
                    }
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strL);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!bVar.f8377b) {
                            throw new M7.e("JSON forbids NaN and infinities: " + dValueOf + "; at path " + bVar.z());
                        }
                    }
                    return dValueOf;
                }
            }
        };
        LONG_OR_DOUBLE = xVar3;
        x xVar4 = new x() { // from class: E7.w
            @Override // E7.x
            public final Number a(M7.b bVar) throws M7.e {
                String strL = bVar.L();
                try {
                    return new BigDecimal(strL);
                } catch (NumberFormatException e2) {
                    StringBuilder sbU = V0.p.u("Cannot parse ", strL, "; at path ");
                    sbU.append(bVar.z());
                    throw new V(sbU.toString(), e2);
                }
            }
        };
        BIG_DECIMAL = xVar4;
        $VALUES = new x[]{xVar, xVar2, xVar3, xVar4};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public abstract Number a(M7.b bVar);
}
