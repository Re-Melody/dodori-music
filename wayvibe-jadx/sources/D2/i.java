package D2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class i extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1857b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1858a;

    public i(int i10) {
        this.f1858a = i10;
    }

    public i(int i10, Exception exc) {
        super(exc);
        this.f1858a = i10;
    }

    public i(String str, int i10) {
        super(str);
        this.f1858a = i10;
    }

    public i(String str, Exception exc, int i10) {
        super(str, exc);
        this.f1858a = i10;
    }
}
