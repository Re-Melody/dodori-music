package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum v {
    TEXT("TextInputType.text"),
    DATETIME("TextInputType.datetime"),
    NAME("TextInputType.name"),
    POSTAL_ADDRESS("TextInputType.address"),
    NUMBER("TextInputType.number"),
    PHONE("TextInputType.phone"),
    MULTILINE("TextInputType.multiline"),
    EMAIL_ADDRESS("TextInputType.emailAddress"),
    URL("TextInputType.url"),
    VISIBLE_PASSWORD("TextInputType.visiblePassword"),
    NONE("TextInputType.none"),
    WEB_SEARCH("TextInputType.webSearch"),
    TWITTER("TextInputType.twitter");

    private final String encodedName;

    v(String str) {
        this.encodedName = str;
    }

    public static v a(String str) throws NoSuchFieldException {
        for (v vVar : values()) {
            if (vVar.encodedName.equals(str)) {
                return vVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such TextInputType: ", str));
    }
}
