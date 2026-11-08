package Z5;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f13888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f13889b;

    static {
        Locale locale = Locale.ROOT;
        f13888a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f13889b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
