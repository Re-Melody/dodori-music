package E7;

import java.lang.reflect.Field;
import java.util.Locale;

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
public abstract class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h IDENTITY;
    public static final h LOWER_CASE_WITH_DASHES;
    public static final h LOWER_CASE_WITH_DOTS;
    public static final h LOWER_CASE_WITH_UNDERSCORES;
    public static final h UPPER_CAMEL_CASE;
    public static final h UPPER_CAMEL_CASE_WITH_SPACES;
    public static final h UPPER_CASE_WITH_UNDERSCORES;

    static {
        h hVar = new h() { // from class: E7.a
            @Override // E7.h
            public final String b(Field field) {
                return field.getName();
            }
        };
        IDENTITY = hVar;
        h hVar2 = new h() { // from class: E7.b
            @Override // E7.h
            public final String b(Field field) {
                return h.d(field.getName());
            }
        };
        UPPER_CAMEL_CASE = hVar2;
        h hVar3 = new h() { // from class: E7.c
            @Override // E7.h
            public final String b(Field field) {
                return h.d(h.a(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = hVar3;
        h hVar4 = new h() { // from class: E7.d
            @Override // E7.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = hVar4;
        h hVar5 = new h() { // from class: E7.e
            @Override // E7.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = hVar5;
        h hVar6 = new h() { // from class: E7.f
            @Override // E7.h
            public final String b(Field field) {
                return h.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = hVar6;
        h hVar7 = new h() { // from class: E7.g
            @Override // E7.h
            public final String b(Field field) {
                return h.a(field.getName(), com.amazon.a.a.o.c.a.b.f16463a).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = hVar7;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
    }

    public static String a(String str, char c3) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c3);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String d(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public abstract String b(Field field);
}
