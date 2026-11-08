package B5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f675f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f680e;

    static {
        HashMap map = new HashMap();
        f675f = map;
        map.put("authenticatorData", new M5.a(11, true, 11, true, "authenticatorData", 2, f.class));
        map.put("progress", new M5.a(11, false, 11, false, "progress", 4, e.class));
    }

    public b(HashSet hashSet, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f676a = hashSet;
        this.f677b = i10;
        this.f678c = arrayList;
        this.f679d = i11;
        this.f680e = eVar;
    }

    @Override // M5.b
    public final void addConcreteTypeArrayInternal(M5.a aVar, String str, ArrayList arrayList) {
        int i10 = aVar.f8345g;
        if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i10), arrayList.getClass().getCanonicalName()));
        }
        this.f678c = arrayList;
        this.f676a.add(Integer.valueOf(i10));
    }

    @Override // M5.b
    public final void addConcreteTypeInternal(M5.a aVar, String str, M5.b bVar) {
        int i10 = aVar.f8345g;
        if (i10 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i10), bVar.getClass().getCanonicalName()));
        }
        this.f680e = (e) bVar;
        this.f676a.add(Integer.valueOf(i10));
    }

    @Override // M5.b
    public final /* synthetic */ Map getFieldMappings() {
        return f675f;
    }

    @Override // M5.b
    public final Object getFieldValue(M5.a aVar) {
        int i10 = aVar.f8345g;
        if (i10 == 1) {
            return Integer.valueOf(this.f677b);
        }
        if (i10 == 2) {
            return this.f678c;
        }
        if (i10 == 4) {
            return this.f680e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f8345g);
    }

    @Override // M5.b
    public final boolean isFieldSet(M5.a aVar) {
        return this.f676a.contains(Integer.valueOf(aVar.f8345g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        HashSet hashSet = this.f676a;
        if (hashSet.contains(1)) {
            p242x0.c.b0(parcel, 1, 4);
            parcel.writeInt(this.f677b);
        }
        if (hashSet.contains(2)) {
            p242x0.c.Z(parcel, 2, this.f678c, true);
        }
        if (hashSet.contains(3)) {
            p242x0.c.b0(parcel, 3, 4);
            parcel.writeInt(this.f679d);
        }
        if (hashSet.contains(4)) {
            p242x0.c.V(parcel, 4, this.f680e, i10, true);
        }
        p242x0.c.d0(iC0, parcel);
    }
}
