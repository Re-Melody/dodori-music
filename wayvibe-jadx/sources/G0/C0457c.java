package G0;

import java.text.BreakIterator;

/* JADX INFO: renamed from: G0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457c extends AbstractC0454b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C0457c f5192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C0457c f5193f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f5195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0457c(int i10) {
        super(0);
        this.f5194c = i10;
    }

    @Override // G0.AbstractC0454b
    public final int[] e(int i10) {
        switch (this.f5194c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f5195d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f5195d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.l("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f5195d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            default:
                if (i().length() <= 0 || i10 >= i().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!r(i10) && (!r(i10) || (i10 != 0 && r(i10 - 1)))) {
                    BreakIterator breakIterator4 = this.f5195d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f5195d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.l("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !q(iFollowing2)) {
                    return null;
                }
                return h(i10, iFollowing2);
        }
    }

    @Override // G0.AbstractC0454b
    public final int[] n(int i10) {
        switch (this.f5194c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f5195d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f5195d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.l("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f5195d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !r(i10 - 1) && !q(i10)) {
                    BreakIterator breakIterator4 = this.f5195d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f5195d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.l("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !r(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !r(iPreceding2 - 1)) {
                    return h(iPreceding2, i10);
                }
                return null;
        }
    }

    public final void p(String str) {
        switch (this.f5194c) {
            case 0:
                this.f5185a = str;
                BreakIterator breakIterator = this.f5195d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.l("impl");
                    throw null;
                }
            default:
                this.f5185a = str;
                BreakIterator breakIterator2 = this.f5195d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.l("impl");
                    throw null;
                }
        }
    }

    public boolean q(int i10) {
        if (i10 <= 0 || !r(i10 - 1)) {
            return false;
        }
        return i10 == i().length() || !r(i10);
    }

    public boolean r(int i10) {
        if (i10 < 0 || i10 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i10));
    }
}
