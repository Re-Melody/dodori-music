package C4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final long f1227V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final ArrayList f1228W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final ArrayList f1229X0;

    public a(int i10, long j10) {
        super(i10);
        this.f1227V0 = j10;
        this.f1228W0 = new ArrayList();
        this.f1229X0 = new ArrayList();
    }

    public final b c(int i10) {
        ArrayList arrayList = this.f1228W0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f1325a == i10) {
                return bVar;
            }
        }
        return null;
    }

    public final a d(int i10) {
        ArrayList arrayList = this.f1229X0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f1325a == i10) {
                return aVar;
            }
        }
        return null;
    }

    @Override // C4.c
    public final String toString() {
        return c.b(this.f1325a) + " leaves: " + Arrays.toString(this.f1228W0.toArray()) + " containers: " + Arrays.toString(this.f1229X0.toArray());
    }
}
