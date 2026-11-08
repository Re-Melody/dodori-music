package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum g {
    CLICK("SystemSoundType.click"),
    TICK("SystemSoundType.tick"),
    ALERT("SystemSoundType.alert");

    private final String encodedName;

    g(String str) {
        this.encodedName = str;
    }

    public static g a(String str) throws NoSuchFieldException {
        for (g gVar : values()) {
            if (gVar.encodedName.equals(str)) {
                return gVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such SoundType: ", str));
    }
}
