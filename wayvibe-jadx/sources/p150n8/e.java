package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    PORTRAIT_UP("DeviceOrientation.portraitUp"),
    PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
    LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
    LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

    private String encodedName;

    e(String str) {
        this.encodedName = str;
    }

    public static e a(String str) throws NoSuchFieldException {
        for (e eVar : values()) {
            if (eVar.encodedName.equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such DeviceOrientation: ", str));
    }
}
