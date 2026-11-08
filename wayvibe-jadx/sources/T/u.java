package T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BodyLarge;
    public static final u BodyMedium;
    public static final u BodySmall;
    public static final u DisplayLarge;
    public static final u DisplayMedium;
    public static final u DisplaySmall;
    public static final u HeadlineLarge;
    public static final u HeadlineMedium;
    public static final u HeadlineSmall;
    public static final u LabelLarge;
    public static final u LabelMedium;
    public static final u LabelSmall;
    public static final u TitleLarge;
    public static final u TitleMedium;
    public static final u TitleSmall;

    static {
        u uVar = new u("BodyLarge", 0);
        BodyLarge = uVar;
        u uVar2 = new u("BodyMedium", 1);
        BodyMedium = uVar2;
        u uVar3 = new u("BodySmall", 2);
        BodySmall = uVar3;
        u uVar4 = new u("DisplayLarge", 3);
        DisplayLarge = uVar4;
        u uVar5 = new u("DisplayMedium", 4);
        DisplayMedium = uVar5;
        u uVar6 = new u("DisplaySmall", 5);
        DisplaySmall = uVar6;
        u uVar7 = new u("HeadlineLarge", 6);
        HeadlineLarge = uVar7;
        u uVar8 = new u("HeadlineMedium", 7);
        HeadlineMedium = uVar8;
        u uVar9 = new u("HeadlineSmall", 8);
        HeadlineSmall = uVar9;
        u uVar10 = new u("LabelLarge", 9);
        LabelLarge = uVar10;
        u uVar11 = new u("LabelMedium", 10);
        LabelMedium = uVar11;
        u uVar12 = new u("LabelSmall", 11);
        LabelSmall = uVar12;
        u uVar13 = new u("TitleLarge", 12);
        TitleLarge = uVar13;
        u uVar14 = new u("TitleMedium", 13);
        TitleMedium = uVar14;
        u uVar15 = new u("TitleSmall", 14);
        TitleSmall = uVar15;
        $VALUES = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
