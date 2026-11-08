package C;

/* JADX INFO: renamed from: C.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0147e implements InterfaceC0148f, InterfaceC0150h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f995b;

    public C0147e(int i10) {
        this.f994a = i10;
        switch (i10) {
            case 1:
                this.f995b = 0;
                break;
            case 2:
                this.f995b = 0;
                break;
            case 3:
                this.f995b = 0;
                break;
            default:
                this.f995b = 0;
                break;
        }
    }

    @Override // C.InterfaceC0148f, C.InterfaceC0150h
    public final float a() {
        switch (this.f994a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f995b;
    }

    @Override // C.InterfaceC0148f
    public final void b(p028c1.b bVar, int i10, int[] iArr, p028c1.k kVar, int[] iArr2) {
        switch (this.f994a) {
            case 0:
                if (kVar != p028c1.k.Ltr) {
                    AbstractC0153k.a(i10, iArr, iArr2, true);
                } else {
                    AbstractC0153k.a(i10, iArr, iArr2, false);
                }
                break;
            case 1:
                if (kVar != p028c1.k.Ltr) {
                    AbstractC0153k.d(i10, iArr, iArr2, true);
                } else {
                    AbstractC0153k.d(i10, iArr, iArr2, false);
                }
                break;
            case 2:
                if (kVar != p028c1.k.Ltr) {
                    AbstractC0153k.e(i10, iArr, iArr2, true);
                } else {
                    AbstractC0153k.e(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (kVar != p028c1.k.Ltr) {
                    AbstractC0153k.f(i10, iArr, iArr2, true);
                } else {
                    AbstractC0153k.f(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // C.InterfaceC0150h
    public final void c(int i10, D0.O o10, int[] iArr, int[] iArr2) {
        switch (this.f994a) {
            case 0:
                AbstractC0153k.a(i10, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0153k.d(i10, iArr, iArr2, false);
                break;
            case 2:
                AbstractC0153k.e(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC0153k.f(i10, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f994a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
