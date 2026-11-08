package B5;

import B2.AbstractC0112b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new c(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f696h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f703g;

    static {
        HashMap map = new HashMap();
        f696h = map;
        map.put("accountType", new M5.a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new M5.a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new M5.a(8, false, 8, false, "transferBytes", 4, null));
    }

    public g(HashSet hashSet, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f697a = hashSet;
        this.f698b = i10;
        this.f699c = str;
        this.f700d = i11;
        this.f701e = bArr;
        this.f702f = pendingIntent;
        this.f703g = aVar;
    }

    @Override // M5.b
    public final /* synthetic */ Map getFieldMappings() {
        return f696h;
    }

    @Override // M5.b
    public final Object getFieldValue(M5.a aVar) {
        int i10 = aVar.f8345g;
        if (i10 == 1) {
            return Integer.valueOf(this.f698b);
        }
        if (i10 == 2) {
            return this.f699c;
        }
        if (i10 == 3) {
            return Integer.valueOf(this.f700d);
        }
        if (i10 == 4) {
            return this.f701e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f8345g);
    }

    @Override // M5.b
    public final boolean isFieldSet(M5.a aVar) {
        return this.f697a.contains(Integer.valueOf(aVar.f8345g));
    }

    @Override // M5.b
    public final void setDecodedBytesInternal(M5.a aVar, String str, byte[] bArr) {
        int i10 = aVar.f8345g;
        if (i10 != 4) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Field with id=", " is not known to be a byte array."));
        }
        this.f701e = bArr;
        this.f697a.add(Integer.valueOf(i10));
    }

    @Override // M5.b
    public final void setIntegerInternal(M5.a aVar, String str, int i10) {
        int i11 = aVar.f8345g;
        if (i11 != 3) {
            throw new IllegalArgumentException(AbstractC0112b.d(i11, "Field with id=", " is not known to be an int."));
        }
        this.f700d = i10;
        this.f697a.add(Integer.valueOf(i11));
    }

    @Override // M5.b
    public final void setStringInternal(M5.a aVar, String str, String str2) {
        int i10 = aVar.f8345g;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i10)));
        }
        this.f699c = str2;
        this.f697a.add(Integer.valueOf(i10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        HashSet hashSet = this.f697a;
        if (hashSet.contains(1)) {
            p242x0.c.b0(parcel, 1, 4);
            parcel.writeInt(this.f698b);
        }
        if (hashSet.contains(2)) {
            p242x0.c.W(parcel, 2, this.f699c, true);
        }
        if (hashSet.contains(3)) {
            int i11 = this.f700d;
            p242x0.c.b0(parcel, 3, 4);
            parcel.writeInt(i11);
        }
        if (hashSet.contains(4)) {
            p242x0.c.P(parcel, 4, this.f701e, true);
        }
        if (hashSet.contains(5)) {
            p242x0.c.V(parcel, 5, this.f702f, i10, true);
        }
        if (hashSet.contains(6)) {
            p242x0.c.V(parcel, 6, this.f703g, i10, true);
        }
        p242x0.c.d0(iC0, parcel);
    }
}
