package p078h2;

import Ca.C0168a;
import java.nio.ByteBuffer;
import org.apache.tika.utils.StringUtils;
import p090i2.a;
import p090i2.b;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f20214d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0168a f20216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f20217c = 0;

    public r(C0168a c0168a, int i10) {
        this.f20216b = c0168a;
        this.f20215a = i10;
    }

    public final int a(int i10) {
        a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f7243d;
        int i11 = iA + aVarB.f7240a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final a b() {
        ThreadLocal threadLocal = f20214d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f20216b.f1501b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f7240a;
            int i11 = (this.f20215a * 4) + ((ByteBuffer) bVar.f7243d).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f7243d).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f7243d;
            aVar.f7243d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f7240a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f7241b = i13;
                aVar.f7242c = ((ByteBuffer) aVar.f7243d).getShort(i13);
                return aVar;
            }
            aVar.f7240a = 0;
            aVar.f7241b = 0;
            aVar.f7242c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f7243d).getInt(iA + aVarB.f7240a) : 0));
        sb.append(", codepoints:");
        a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f7240a;
            i10 = ((ByteBuffer) aVarB2.f7243d).getInt(((ByteBuffer) aVarB2.f7243d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(StringUtils.SPACE);
        }
        return sb.toString();
    }
}
