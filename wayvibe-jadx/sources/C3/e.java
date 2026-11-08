package C3;

import K.Y;
import V0.p;
import V0.s;

/* JADX INFO: loaded from: classes.dex */
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1190c;

    @Override // V0.s
    public int a(int i10) {
        if (i10 >= 0 && i10 <= this.f1190c) {
            Y.y(i10, this.f1189b, i10);
        }
        return i10;
    }

    @Override // V0.s
    public int b(int i10) {
        if (i10 >= 0 && i10 <= this.f1189b) {
            Y.x(i10, this.f1190c, i10);
        }
        return i10;
    }

    public int c() {
        int i10 = this.f1190c;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.f1188a) {
            case 4:
                StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
                sb.append(0);
                sb.append(", mCurrentPosition=");
                sb.append(0);
                sb.append(", mItemDirection=");
                sb.append(0);
                sb.append(", mLayoutDirection=");
                sb.append(0);
                sb.append(", mStartLine=");
                sb.append(this.f1189b);
                sb.append(", mEndLine=");
                return p.q(sb, this.f1190c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i10, int i11, int i12) {
        this.f1188a = i12;
        this.f1189b = i10;
        this.f1190c = i11;
    }
}
