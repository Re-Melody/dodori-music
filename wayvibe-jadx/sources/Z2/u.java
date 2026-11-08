package Z2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13579c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13580a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13581b = -1;

    public final boolean a(String str) {
        Matcher matcher = f13579c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = B2.C.f560a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f13580a = i11;
            this.f13581b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(p255y2.B b10) {
        int i10 = 0;
        while (true) {
            p255y2.A[] aArr = b10.f28752a;
            if (i10 >= aArr.length) {
                return;
            }
            p255y2.A a10 = aArr[i10];
            if (a10 instanceof p146n3.f) {
                p146n3.f fVar = (p146n3.f) a10;
                if ("iTunSMPB".equals(fVar.f22928c) && a(fVar.f22929d)) {
                    return;
                }
            } else if (a10 instanceof p146n3.k) {
                p146n3.k kVar = (p146n3.k) a10;
                if ("com.apple.iTunes".equals(kVar.f22938b) && "iTunSMPB".equals(kVar.f22939c) && a(kVar.f22940d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
