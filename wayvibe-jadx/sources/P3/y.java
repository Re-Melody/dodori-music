package P3;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f9624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f9625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f9626c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f9624a = true;
        f9625b = true;
        f9626c = i10 >= 28;
    }
}
