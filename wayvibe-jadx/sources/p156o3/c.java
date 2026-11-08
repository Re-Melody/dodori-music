package p156o3;

import B2.AbstractC0111a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p146n3.b;
import p255y2.A;

/* JADX INFO: loaded from: classes.dex */
public final class c implements A {
    public static final Parcelable.Creator<c> CREATOR = new b(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23655a;

    public c(ArrayList arrayList) {
        this.f23655a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((b) arrayList.get(0)).f23653b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((b) arrayList.get(i10)).f23652a < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((b) arrayList.get(i10)).f23653b;
            }
        }
        AbstractC0111a.d(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f23655a.equals(((c) obj).f23655a);
    }

    public final int hashCode() {
        return this.f23655a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f23655a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f23655a);
    }
}
