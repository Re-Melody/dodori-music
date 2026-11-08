package p152o;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2146m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f23398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f23399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f23400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f23401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f23402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f23403f;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z10;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z10 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z10 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f23399b = method;
                        f23400c = field;
                        f23401d = field2;
                        f23402e = field3;
                        f23403f = field4;
                        f23398a = true;
                        return;
                    }
                    f23399b = null;
                    f23400c = null;
                    f23401d = null;
                    f23402e = null;
                    f23403f = null;
                    f23398a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f23399b = method;
                        f23400c = field;
                        f23401d = field2;
                        f23402e = field3;
                        f23403f = field4;
                        f23398a = true;
                        return;
                    }
                    f23399b = null;
                    f23400c = null;
                    f23401d = null;
                    f23402e = null;
                    f23403f = null;
                    f23398a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f23399b = method;
                        f23400c = field;
                        f23401d = field2;
                        f23402e = field3;
                        f23403f = field4;
                        f23398a = true;
                        return;
                    }
                    f23399b = null;
                    f23400c = null;
                    f23401d = null;
                    f23402e = null;
                    f23403f = null;
                    f23398a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f23399b = method;
                    f23400c = field;
                    f23401d = field2;
                    f23402e = field3;
                    f23403f = field4;
                    f23398a = true;
                    return;
                }
                f23399b = null;
                f23400c = null;
                f23401d = null;
                f23402e = null;
                f23403f = null;
                f23398a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f23399b = method;
                    f23400c = field;
                    f23401d = field2;
                    f23402e = field3;
                    f23403f = field4;
                    f23398a = true;
                    return;
                }
                f23399b = null;
                f23400c = null;
                f23401d = null;
                f23402e = null;
                f23403f = null;
                f23398a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f23399b = method;
                    f23400c = field;
                    f23401d = field2;
                    f23402e = field3;
                    f23403f = field4;
                    f23398a = true;
                    return;
                }
                f23399b = null;
                f23400c = null;
                f23401d = null;
                f23402e = null;
                f23403f = null;
                f23398a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z10) {
            f23399b = method;
            f23400c = field;
            f23401d = field2;
            f23402e = field3;
            f23403f = field4;
            f23398a = true;
            return;
        }
        f23399b = null;
        f23400c = null;
        f23401d = null;
        f23402e = null;
        f23403f = null;
        f23398a = false;
    }
}
