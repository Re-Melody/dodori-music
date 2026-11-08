package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1066y f15067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f15069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15070d;

    public b0(AbstractC1066y abstractC1066y, String str, Object[] objArr) {
        this.f15067a = abstractC1066y;
        this.f15068b = str;
        this.f15069c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15070d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f15070d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final Y a() {
        int i10 = this.f15070d;
        if ((i10 & 1) != 0) {
            return Y.PROTO2;
        }
        return (i10 & 4) == 4 ? Y.EDITIONS : Y.PROTO3;
    }
}
