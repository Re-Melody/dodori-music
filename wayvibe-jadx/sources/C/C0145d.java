package C;

/* JADX INFO: renamed from: C.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145d implements InterfaceC0150h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f992a;

    @Override // C.InterfaceC0150h
    public final void c(int i10, D0.O o10, int[] iArr, int[] iArr2) {
        switch (this.f992a) {
            case 0:
                AbstractC0153k.c(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC0153k.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f992a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
