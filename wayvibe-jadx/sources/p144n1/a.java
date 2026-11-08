package p144n1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22806a;

    static {
        int[] iArr = new int[j.values().length];
        f22806a = iArr;
        try {
            iArr[j.LEFT_TO_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22806a[j.LEFT_TO_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22806a[j.RIGHT_TO_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22806a[j.RIGHT_TO_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22806a[j.START_TO_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22806a[j.START_TO_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22806a[j.END_TO_START.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f22806a[j.END_TO_END.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f22806a[j.TOP_TO_TOP.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f22806a[j.TOP_TO_BOTTOM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f22806a[j.TOP_TO_BASELINE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f22806a[j.BOTTOM_TO_TOP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f22806a[j.BOTTOM_TO_BOTTOM.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f22806a[j.BOTTOM_TO_BASELINE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f22806a[j.BASELINE_TO_BOTTOM.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f22806a[j.BASELINE_TO_TOP.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f22806a[j.BASELINE_TO_BASELINE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f22806a[j.CIRCULAR_CONSTRAINT.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f22806a[j.CENTER_HORIZONTALLY.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f22806a[j.CENTER_VERTICALLY.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
