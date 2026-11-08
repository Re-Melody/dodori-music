package p014aa;

import Z9.w;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f14311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f14312b;

    public c(CharSequence charSequence, w wVar) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.f14311a = charSequence;
        this.f14312b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final c a(int i10, int i11) {
        w wVar;
        CharSequence charSequenceSubSequence = this.f14311a.subSequence(i10, i11);
        w wVar2 = this.f14312b;
        if (wVar2 != null) {
            int i12 = wVar2.f14057b + i10;
            int i13 = i11 - i10;
            if (i13 != 0) {
                wVar = new w(wVar2.f14056a, i12, i13);
            } else {
                wVar = null;
            }
        } else {
            wVar = null;
        }
        return new c(charSequenceSubSequence, wVar);
    }
}
