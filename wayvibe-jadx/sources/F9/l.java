package F9;

import E9.G;
import M8.D;
import java.io.IOException;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Z8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f4660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f4661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f4662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f4663e;

    public /* synthetic */ l(G g3, y yVar, y yVar2, y yVar3) {
        this.f4661c = g3;
        this.f4660b = yVar;
        this.f4662d = yVar2;
        this.f4663e = yVar3;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i10 = this.f4659a;
        int iIntValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i10) {
            case 0:
                long jLongValue = l10.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    G g3 = this.f4661c;
                    byte b10 = g3.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    long j10 = z10 ? 5L : 1L;
                    if (z11) {
                        j10 += 4;
                    }
                    if (z12) {
                        j10 += 4;
                    }
                    if (jLongValue < j10) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        this.f4660b.f21873a = Integer.valueOf(g3.e());
                    }
                    if (z11) {
                        this.f4662d.f21873a = Integer.valueOf(g3.e());
                    }
                    if (z12) {
                        this.f4663e.f21873a = Integer.valueOf(g3.e());
                    }
                }
                return D.f8402a;
            default:
                long jLongValue2 = l10.longValue();
                if (iIntValue == 1) {
                    y yVar = this.f4660b;
                    if (yVar.f21873a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    G g10 = this.f4661c;
                    yVar.f21873a = Long.valueOf(g10.g());
                    this.f4662d.f21873a = Long.valueOf(g10.g());
                    this.f4663e.f21873a = Long.valueOf(g10.g());
                }
                return D.f8402a;
        }
    }

    public /* synthetic */ l(y yVar, G g3, y yVar2, y yVar3) {
        this.f4660b = yVar;
        this.f4661c = g3;
        this.f4662d = yVar2;
        this.f4663e = yVar3;
    }
}
