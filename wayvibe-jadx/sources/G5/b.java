package G5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I5.a {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5467b;

    public b(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            E.j("deleteAll was set to true but other constraint(s) was also provided: keys", z11);
        }
        this.f5467b = z10;
        this.f5466a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                E.f(str, "Element in keys cannot be null or empty");
                this.f5466a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.X(parcel, 1, Collections.unmodifiableList(this.f5466a));
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(this.f5467b ? 1 : 0);
        p242x0.c.d0(iC0, parcel);
    }
}
