package p150n8;

import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public enum f {
    STANDARD(null),
    LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
    MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
    HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
    SELECTION_CLICK("HapticFeedbackType.selectionClick"),
    SUCCESS_NOTIFICATION("HapticFeedbackType.successNotification"),
    WARNING_NOTIFICATION("HapticFeedbackType.warningNotification"),
    ERROR_NOTIFICATION("HapticFeedbackType.errorNotification");

    private final String encodedName;

    f(String str) {
        this.encodedName = str;
    }

    public static f a(String str) throws NoSuchFieldException {
        for (f fVar : values()) {
            String str2 = fVar.encodedName;
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return fVar;
            }
        }
        throw new NoSuchFieldException(b.k("No such HapticFeedbackType: ", str));
    }
}
