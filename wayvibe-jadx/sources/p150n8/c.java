package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    LIGHT("Brightness.light"),
    DARK("Brightness.dark");

    private String encodedName;

    c(String str) {
        this.encodedName = str;
    }

    public static c a(String str) throws NoSuchFieldException {
        for (c cVar : values()) {
            if (cVar.encodedName.equals(str)) {
                return cVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such Brightness: ", str));
    }
}
