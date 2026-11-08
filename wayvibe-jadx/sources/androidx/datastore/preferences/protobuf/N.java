package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class N {
    public static M a(Object obj, Object obj2) {
        M mK = (M) obj;
        M m8 = (M) obj2;
        if (!m8.isEmpty()) {
            if (!mK.f15037a) {
                mK = mK.k();
            }
            mK.g();
            if (!m8.isEmpty()) {
                mK.putAll(m8);
            }
        }
        return mK;
    }
}
