package K7;

import H7.C0549a;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0549a f7388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0549a f7389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0549a f7390f;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f7385a = z10;
        if (z10) {
            f7386b = new b(Date.class, 0);
            f7387c = new b(Timestamp.class, 1);
            f7388d = a.f7379c;
            f7389e = a.f7380d;
            f7390f = a.f7381e;
            return;
        }
        f7386b = null;
        f7387c = null;
        f7388d = null;
        f7389e = null;
        f7390f = null;
    }
}
