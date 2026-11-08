package D8;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: D8.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0309r1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2771a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E8.x f2772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0315t1 f2773c;

    public C0309r1(C0315t1 c0315t1) {
        this.f2773c = c0315t1;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        E8.x xVar = this.f2772b;
        if (xVar == null || xVar.f3323b <= 0) {
            write(new byte[]{(byte) i10}, 0, 1);
            return;
        }
        xVar.f3322a.K((byte) i10);
        xVar.f3323b--;
        xVar.f3324c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        E8.x xVar = this.f2772b;
        ArrayList arrayList = this.f2771a;
        C0315t1 c0315t1 = this.f2773c;
        if (xVar == null) {
            c0315t1.f2794g.getClass();
            E8.x xVarG = com.google.firebase.firestore.Z.g(i11);
            this.f2772b = xVarG;
            arrayList.add(xVarG);
        }
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f2772b.f3323b);
            if (iMin == 0) {
                int iMax = Math.max(i11, this.f2772b.f3324c * 2);
                c0315t1.f2794g.getClass();
                E8.x xVarG2 = com.google.firebase.firestore.Z.g(iMax);
                this.f2772b = xVarG2;
                arrayList.add(xVarG2);
            } else {
                this.f2772b.a(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
