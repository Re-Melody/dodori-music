package L3;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7671e;

    public final int a() {
        if (this.f7669c) {
            return 0 - this.f7667a;
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=-1, mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=0, mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f7667a);
        sb.append(", mStructureChanged=");
        sb.append(this.f7668b);
        sb.append(", mInPreLayout=");
        sb.append(this.f7669c);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f7670d);
        sb.append(", mRunPredictiveAnimations=");
        return p134m1.b.o(sb, this.f7671e, '}');
    }
}
