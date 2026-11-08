package p224v4;

import kotlin.jvm.internal.m;
import p028c1.a;
import p251x9.d;
import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(long j10, EnumC2391a0 enumC2391a0) {
        if (enumC2391a0 == EnumC2391a0.Vertical) {
            if (a.g(j10) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (a.h(j10) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p003a.a.j(r9, r1, kotlin.jvm.internal.m.b(r7, r2) ? r0.getWidth() : p224v4.g.d(r7.f26120a, r8), kotlin.jvm.internal.m.b(r7, r2) ? r0.getHeight() : p224v4.g.d(r7.f26121b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap b(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, p195s4.g r7, p195s4.f r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p224v4.i.b(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, s4.g, s4.f, boolean):android.graphics.Bitmap");
    }

    public static void c(d dVar, p219u9.a serializer, Object obj) {
        m.f(serializer, "serializer");
        if (serializer.getDescriptor().c()) {
            dVar.y(serializer, obj);
        } else if (obj == null) {
            dVar.e();
        } else {
            dVar.y(serializer, obj);
        }
    }

    public static boolean d(String str, String str2) {
        char c3;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
                if (cCharAt == cCharAt2 || ((c3 = (char) ((cCharAt | ' ') - 97)) < 26 && c3 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String f(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
