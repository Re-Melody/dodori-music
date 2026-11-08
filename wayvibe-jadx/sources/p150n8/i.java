package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum i {
    TOP_OVERLAYS("SystemUiOverlay.top"),
    BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

    private String encodedName;

    i(String str) {
        this.encodedName = str;
    }

    public static i a(String str) throws NoSuchFieldException {
        for (i iVar : values()) {
            if (iVar.encodedName.equals(str)) {
                return iVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such SystemUiOverlay: ", str));
    }
}
