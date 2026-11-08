package H2;

import A6.AbstractC0093s;
import A6.W;
import A6.b0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;
import p255y2.C2329e;
import p255y2.C2339o;

/* JADX INFO: renamed from: H2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0536f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0536f f5898c = new C0536f(A6.E.x(C0535e.f5894d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f5899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f5900e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f5901a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5902b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC0093s.b(3, objArr);
        f5899d = A6.E.p(3, objArr);
        A6.G g3 = new A6.G(4, 0);
        g3.r(5, 6);
        g3.r(17, 6);
        g3.r(7, 6);
        g3.r(30, 10);
        g3.r(18, 6);
        g3.r(6, 8);
        g3.r(8, 8);
        g3.r(14, 8);
        f5900e = g3.h();
    }

    public C0536f(W w10) {
        for (int i10 = 0; i10 < w10.f331d; i10++) {
            C0535e c0535e = (C0535e) w10.get(i10);
            this.f5901a.put(c0535e.f5895a, c0535e);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f5901a.size(); i11++) {
            iMax = Math.max(iMax, ((C0535e) this.f5901a.valueAt(i11)).f5896b);
        }
        this.f5902b = iMax;
    }

    public static W a(int[] iArr, int i10) {
        A6.B bQ = A6.E.q();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            bQ.a(new C0535e(i11, i10));
        }
        return bQ.f();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    public static C0536f b(Context context, Intent intent, C2329e c2329e, C0541k c0541k) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (c0541k == null) {
            c0541k = B2.C.f560a >= 33 ? AbstractC0534d.b(audioManager, c2329e) : null;
        }
        int i10 = B2.C.f560a;
        if (i10 >= 33 && (B2.C.H(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return AbstractC0534d.a(audioManager, c2329e);
        }
        if (i10 >= 23 && AbstractC0531a.b(audioManager, c0541k)) {
            return f5898c;
        }
        A6.H h10 = new A6.H(4);
        h10.a(2);
        if (i10 >= 29 && (B2.C.H(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            A6.E eA = AbstractC0532b.a(c2329e);
            eA.getClass();
            h10.c(eA);
            return new C0536f(a(R3.a.f0(h10.f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = B2.C.f562c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    W w10 = f5899d;
                    w10.getClass();
                    h10.c(w10);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            W w11 = f5899d;
            w11.getClass();
            h10.c(w11);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C0536f(a(R3.a.f0(h10.f()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listD = R3.a.d(intArrayExtra);
            listD.getClass();
            h10.c(listD);
        }
        return new C0536f(a(R3.a.f0(h10.f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static C0536f c(Context context, C2329e c2329e, C0541k c0541k) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2329e, c0541k);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    public final Pair d(C2329e c2329e, C2339o c2339o) {
        String str = c2339o.f28954m;
        str.getClass();
        int iB = p255y2.C.b(str, c2339o.f28952j);
        Integer numValueOf = Integer.valueOf(iB);
        b0 b0Var = f5900e;
        if (!b0Var.containsKey(numValueOf)) {
            return null;
        }
        int i10 = 6;
        if (iB == 18 && !e(18)) {
            iB = 6;
        } else if ((iB == 8 && !e(8)) || (iB == 30 && !e(30))) {
            iB = 7;
        }
        if (!e(iB)) {
            return null;
        }
        C0535e c0535e = (C0535e) this.f5901a.get(iB);
        c0535e.getClass();
        boolean zContains = false;
        int iIntValue = c0535e.f5896b;
        A6.I i11 = c0535e.f5897c;
        int i12 = c2339o.f28932A;
        if (i12 == -1 || iB == 18) {
            int i13 = c2339o.f28933B;
            if (i13 == -1) {
                i13 = 48000;
            }
            if (i11 == null) {
                int i14 = B2.C.f560a;
                int i15 = c0535e.f5895a;
                if (i14 >= 29) {
                    iIntValue = AbstractC0532b.b(i15, i13, c2329e);
                } else {
                    Object obj = b0Var.get(Integer.valueOf(i15));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i12 = iIntValue;
        } else if (!c2339o.f28954m.equals("audio/vnd.dts.uhd;profile=p2") || B2.C.f560a >= 33) {
            if (i11 != null) {
                int iR = B2.C.r(i12);
                if (iR != 0) {
                    zContains = i11.contains(Integer.valueOf(iR));
                }
            } else if (i12 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i12 > 10) {
            return null;
        }
        int i16 = B2.C.f560a;
        if (i16 > 28) {
            i10 = i12;
        } else if (i12 == 7) {
            i10 = 8;
        } else if (i12 != 3 && i12 != 4 && i12 != 5) {
            i10 = i12;
        }
        if (i16 <= 26 && "fugu".equals(B2.C.f561b) && i10 == 1) {
            i10 = 2;
        }
        int iR2 = B2.C.r(i10);
        if (iR2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iR2));
    }

    public final boolean e(int i10) {
        SparseArray sparseArray = this.f5901a;
        int i11 = B2.C.f560a;
        return sparseArray.indexOfKey(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C0536f) {
                C0536f c0536f = (C0536f) obj;
                SparseArray sparseArray = this.f5901a;
                SparseArray sparseArray2 = c0536f.f5901a;
                int i10 = B2.C.f560a;
                if (sparseArray == null) {
                    if (sparseArray2 == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray2 == null) {
                    zContentEquals = false;
                } else if (B2.C.f560a >= 31) {
                    zContentEquals = sparseArray.contentEquals(sparseArray2);
                } else {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                if (Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                                    i11++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f5902b != c0536f.f5902b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f5901a;
        if (B2.C.f560a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f5902b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f5902b + ", audioProfiles=" + this.f5901a + "]";
    }
}
