package p255y2;

import java.util.HashSet;

/* JADX INFO: renamed from: y2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2347x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f28989a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f28990b = "media3.common";

    public static synchronized void a(String str) {
        if (f28989a.add(str)) {
            f28990b += ", " + str;
        }
    }
}
