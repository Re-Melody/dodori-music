package p203t3;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends E2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26699e;

    public a(int i10, long j10) {
        super(i10);
        this.f26697c = j10;
        this.f26698d = new ArrayList();
        this.f26699e = new ArrayList();
    }

    public final a i(int i10) {
        ArrayList arrayList = this.f26699e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f3017b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b j(int i10) {
        ArrayList arrayList = this.f26698d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f3017b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // E2.a
    public final String toString() {
        return E2.a.d(this.f3017b) + " leaves: " + Arrays.toString(this.f26698d.toArray()) + " containers: " + Arrays.toString(this.f26699e.toArray());
    }
}
