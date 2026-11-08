package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0680i {
    private static final /* synthetic */ EnumC0680i[] $VALUES;
    public static final EnumC0680i Clickable;
    public static final EnumC0680i Link;
    public static final EnumC0680i Paragraph;
    public static final EnumC0680i Span;
    public static final EnumC0680i String;
    public static final EnumC0680i Url;
    public static final EnumC0680i VerbatimTts;

    static {
        EnumC0680i enumC0680i = new EnumC0680i("Paragraph", 0);
        Paragraph = enumC0680i;
        EnumC0680i enumC0680i2 = new EnumC0680i("Span", 1);
        Span = enumC0680i2;
        EnumC0680i enumC0680i3 = new EnumC0680i("VerbatimTts", 2);
        VerbatimTts = enumC0680i3;
        EnumC0680i enumC0680i4 = new EnumC0680i("Url", 3);
        Url = enumC0680i4;
        EnumC0680i enumC0680i5 = new EnumC0680i("Link", 4);
        Link = enumC0680i5;
        EnumC0680i enumC0680i6 = new EnumC0680i("Clickable", 5);
        Clickable = enumC0680i6;
        EnumC0680i enumC0680i7 = new EnumC0680i("String", 6);
        String = enumC0680i7;
        $VALUES = new EnumC0680i[]{enumC0680i, enumC0680i2, enumC0680i3, enumC0680i4, enumC0680i5, enumC0680i6, enumC0680i7};
    }

    public static EnumC0680i valueOf(String str) {
        return (EnumC0680i) Enum.valueOf(EnumC0680i.class, str);
    }

    public static EnumC0680i[] values() {
        return (EnumC0680i[]) $VALUES.clone();
    }
}
