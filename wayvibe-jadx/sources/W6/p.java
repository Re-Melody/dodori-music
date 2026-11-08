package W6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12884b;

    public p(int i10, long j10) {
        b.a(i10, j10);
        this.f12883a = j10;
        this.f12884b = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p other = (p) obj;
        kotlin.jvm.internal.m.f(other, "other");
        Z8.c[] cVarArr = {n.f12881b, o.f12882b};
        for (int i10 = 0; i10 < 2; i10++) {
            Z8.c cVar = cVarArr[i10];
            int iV = R3.a.v((Comparable) cVar.invoke(this), (Comparable) cVar.invoke(other));
            if (iV != 0) {
                return iV;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int iV;
        if (obj != this) {
            if (obj instanceof p) {
                p other = (p) obj;
                kotlin.jvm.internal.m.f(other, "other");
                Z8.c[] cVarArr = {n.f12881b, o.f12882b};
                for (int i10 = 0; i10 < 2; i10++) {
                    Z8.c cVar = cVarArr[i10];
                    iV = R3.a.v((Comparable) cVar.invoke(this), (Comparable) cVar.invoke(other));
                    if (iV != 0) {
                        if (iV == 0) {
                        }
                    }
                }
                iV = 0;
                if (iV == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f12883a;
        return (((((int) j10) * 1369) + ((int) (j10 >> 32))) * 37) + this.f12884b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.f12883a);
        sb.append(", nanoseconds=");
        return V0.p.q(sb, this.f12884b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeLong(this.f12883a);
        dest.writeInt(this.f12884b);
    }

    public p(Date date) {
        M8.l lVar;
        kotlin.jvm.internal.m.f(date, "date");
        long time = date.getTime();
        long j10 = PipesIterator.DEFAULT_QUEUE_SIZE;
        long j11 = time / j10;
        int time2 = (int) ((date.getTime() % j10) * ((long) 1000000));
        if (time2 < 0) {
            lVar = new M8.l(Long.valueOf(j11 - 1), Integer.valueOf(time2 + 1000000000));
        } else {
            lVar = new M8.l(Long.valueOf(j11), Integer.valueOf(time2));
        }
        long jLongValue = ((Number) lVar.f8413a).longValue();
        int iIntValue = ((Number) lVar.f8414b).intValue();
        b.a(iIntValue, jLongValue);
        this.f12883a = jLongValue;
        this.f12884b = iIntValue;
    }
}
