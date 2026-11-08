package A4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f263c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f264a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f265b = -1;

    public final void a(F4.c cVar) {
        int i10 = 0;
        while (true) {
            F4.b[] bVarArr = cVar.f4506a;
            if (i10 >= bVarArr.length) {
                return;
            }
            F4.b bVar = bVarArr[i10];
            if (bVar instanceof H4.e) {
                H4.e eVar = (H4.e) bVar;
                if ("iTunSMPB".equals(eVar.f6008c)) {
                    Matcher matcher = f263c.matcher(eVar.f6009d);
                    if (matcher.find()) {
                        try {
                            int i11 = Integer.parseInt(matcher.group(1), 16);
                            int i12 = Integer.parseInt(matcher.group(2), 16);
                            if (i11 > 0 || i12 > 0) {
                                this.f264a = i11;
                                this.f265b = i12;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
    }

    public final boolean b() {
        return (this.f264a == -1 || this.f265b == -1) ? false : true;
    }
}
