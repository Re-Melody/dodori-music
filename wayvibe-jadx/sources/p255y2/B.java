package p255y2;

import B2.C;
import S5.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new b(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A[] f28752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28753b;

    public B(A... aArr) {
        this(-9223372036854775807L, aArr);
    }

    public final B a(A... aArr) {
        if (aArr.length == 0) {
            return this;
        }
        int i10 = C.f560a;
        A[] aArr2 = this.f28752a;
        Object[] objArrCopyOf = Arrays.copyOf(aArr2, aArr2.length + aArr.length);
        System.arraycopy(aArr, 0, objArrCopyOf, aArr2.length, aArr.length);
        return new B(this.f28753b, (A[]) objArrCopyOf);
    }

    public final B b(B b10) {
        return b10 == null ? this : a(b10.f28752a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b10 = (B) obj;
            if (Arrays.equals(this.f28752a, b10.f28752a) && this.f28753b == b10.f28753b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return d.F(this.f28753b) + (Arrays.hashCode(this.f28752a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f28752a));
        long j10 = this.f28753b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        A[] aArr = this.f28752a;
        parcel.writeInt(aArr.length);
        for (A a10 : aArr) {
            parcel.writeParcelable(a10, 0);
        }
        parcel.writeLong(this.f28753b);
    }

    public B(long j10, A... aArr) {
        this.f28753b = j10;
        this.f28752a = aArr;
    }

    public B(List list) {
        this((A[]) list.toArray(new A[0]));
    }

    public B(Parcel parcel) {
        this.f28752a = new A[parcel.readInt()];
        int i10 = 0;
        while (true) {
            A[] aArr = this.f28752a;
            if (i10 < aArr.length) {
                aArr[i10] = (A) parcel.readParcelable(A.class.getClassLoader());
                i10++;
            } else {
                this.f28753b = parcel.readLong();
                return;
            }
        }
    }
}
