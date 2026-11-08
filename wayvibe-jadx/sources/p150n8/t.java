package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum t {
    CHARACTERS("TextCapitalization.characters"),
    WORDS("TextCapitalization.words"),
    SENTENCES("TextCapitalization.sentences"),
    NONE("TextCapitalization.none");

    private final String encodedName;

    t(String str) {
        this.encodedName = str;
    }

    public static t a(String str) throws NoSuchFieldException {
        for (t tVar : values()) {
            if (tVar.encodedName.equals(str)) {
                return tVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such TextCapitalization: ", str));
    }
}
