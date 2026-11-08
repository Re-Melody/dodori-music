package H2;

import p255y2.C2339o;

/* JADX INFO: renamed from: H2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548s extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2339o f5938c;

    public C0548s(int i10, C2339o c2339o, boolean z10) {
        super(p134m1.b.j(i10, "AudioTrack write failed: "));
        this.f5937b = z10;
        this.f5936a = i10;
        this.f5938c = c2339o;
    }
}
