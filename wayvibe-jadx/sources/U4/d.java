package U4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12196j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12199n;

    public static int a(String str, int i10, int i11, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
