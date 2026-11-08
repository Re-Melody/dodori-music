package J2;

import B2.C;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p255y2.K;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Q2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f6481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f6482j;
    public final Uri k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f6483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f6484m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, u uVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f6473a = j10;
        this.f6474b = j11;
        this.f6475c = j12;
        this.f6476d = z10;
        this.f6477e = j13;
        this.f6478f = j14;
        this.f6479g = j15;
        this.f6480h = j16;
        this.f6483l = iVar;
        this.f6481i = uVar;
        this.k = uri;
        this.f6482j = tVar;
        this.f6484m = arrayList;
    }

    @Override // Q2.a
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new K());
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f6484m.size()) {
                break;
            }
            if (((K) linkedList.peek()).f28775a != i10) {
                long jC = c(i10);
                if (jC != -9223372036854775807L) {
                    j11 += jC;
                }
            } else {
                h hVarB = b(i10);
                List list2 = hVarB.f6507c;
                K k = (K) linkedList.poll();
                int i11 = k.f28775a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = k.f28776b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f6465c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(k.f28777c));
                        k = (K) linkedList.poll();
                        if (k.f28775a != i11) {
                            break;
                        }
                    } while (k.f28776b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f6463a, aVar.f6464b, arrayList3, aVar.f6466d, aVar.f6467e, aVar.f6468f));
                    if (k.f28775a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(k);
                arrayList.add(new h(hVarB.f6505a, hVarB.f6506b - j10, arrayList2, hVarB.f6508d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f6474b;
        return new c(this.f6473a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f6475c, this.f6476d, this.f6477e, this.f6478f, this.f6479g, this.f6480h, this.f6483l, this.f6481i, this.f6482j, this.k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f6484m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.f6484m;
        if (i10 == list.size() - 1) {
            j10 = this.f6474b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f6506b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f6506b;
            j11 = ((h) list.get(i10)).f6506b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return C.I(c(i10));
    }
}
