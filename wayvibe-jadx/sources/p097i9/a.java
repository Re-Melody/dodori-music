package p097i9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f20563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f20564b;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        m.e(charsetForName, "forName(...)");
        f20563a = charsetForName;
        m.e(Charset.forName("UTF-16"), "forName(...)");
        m.e(Charset.forName("UTF-16BE"), "forName(...)");
        m.e(Charset.forName("UTF-16LE"), "forName(...)");
        m.e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        m.e(charsetForName2, "forName(...)");
        f20564b = charsetForName2;
    }
}
