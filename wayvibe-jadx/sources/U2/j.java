package U2;

import B2.C;
import R2.d0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p255y2.U;

/* JADX INFO: loaded from: classes.dex */
public final class j extends U {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f12118A = 0;
    public final boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12119s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12120t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f12121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseArray f12125y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f12126z;

    static {
        new j(new i());
        C.D(PipesIterator.DEFAULT_QUEUE_SIZE);
        C.D(1001);
        C.D(1002);
        C.D(1003);
        p134m1.b.y(1004, 1005, 1006, 1007, 1008);
        p134m1.b.y(1009, 1010, 1011, 1012, 1013);
        p134m1.b.y(1014, 1015, 1016, 1017, 1018);
    }

    public j(i iVar) {
        super(iVar);
        this.r = iVar.r;
        this.f12119s = iVar.f12110s;
        this.f12120t = iVar.f12111t;
        this.f12121u = iVar.f12112u;
        this.f12122v = iVar.f12113v;
        this.f12123w = iVar.f12114w;
        this.f12124x = iVar.f12115x;
        this.f12125y = iVar.f12116y;
        this.f12126z = iVar.f12117z;
    }

    @Override // p255y2.U
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.r == jVar.r && this.f12119s == jVar.f12119s && this.f12120t == jVar.f12120t && this.f12121u == jVar.f12121u && this.f12122v == jVar.f12122v && this.f12123w == jVar.f12123w && this.f12124x == jVar.f12124x) {
                SparseBooleanArray sparseBooleanArray = this.f12126z;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = jVar.f12126z;
                if (sparseBooleanArray2.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.f12125y;
                    int size2 = sparseArray.size();
                    SparseArray sparseArray2 = jVar.f12125y;
                    if (sparseArray2.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i11);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        d0 d0Var = (d0) entry.getKey();
                                        if (!map2.containsKey(d0Var) || !C.a(entry.getValue(), map2.get(d0Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p255y2.U
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.r ? 1 : 0)) * 961) + (this.f12119s ? 1 : 0)) * 961) + (this.f12120t ? 1 : 0)) * 28629151) + (this.f12121u ? 1 : 0)) * 31) + (this.f12122v ? 1 : 0)) * 31) + (this.f12123w ? 1 : 0)) * 961) + (this.f12124x ? 1 : 0)) * 31;
    }
}
