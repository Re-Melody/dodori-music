package p134m1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {
    public static i j(String str) {
        i iVar = new i(str.toCharArray());
        iVar.f22199b = 0L;
        iVar.i(str.length() - 1);
        return iVar;
    }

    @Override // p134m1.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && c().equals(((i) obj).c())) {
            return true;
        }
        return super.equals(obj);
    }
}
