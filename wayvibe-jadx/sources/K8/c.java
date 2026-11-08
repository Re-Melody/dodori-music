package K8;

import D8.AbstractC0291l0;
import D8.t2;
import E9.C0348i;
import E9.C0351l;
import F4.d;
import G7.o;
import K1.InterfaceC0621x;
import O2.A;
import S5.e;
import S5.f;
import S5.g;
import U6.k;
import Z2.InterfaceC0965f;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import app.nagakiba.wayvibe.R;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zzc;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.protobuf.S;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.m;
import p199t.C2230e;
import p199t.l;

/* JADX INFO: loaded from: classes2.dex */
public class c implements S, t2, d, o, I3.a, InterfaceC0621x, A, C, k, V2.k, InterfaceC0965f, p165p2.b, p253y0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f7394b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7395a;

    public /* synthetic */ c(int i10) {
        this.f7395a = i10;
    }

    public static final float o(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i11 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i11];
            float f19 = fArr[i10];
            f11 = fArr2[i11];
            f12 = f18;
            f13 = fArr2[i10];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static E9.C p(String str) {
        m.f(str, "<this>");
        C0351l c0351l = F9.c.f4620a;
        C0348i c0348i = new C0348i();
        c0348i.R(str);
        return F9.c.d(c0348i, false);
    }

    public static E9.C q(File file) {
        String str = E9.C.f3333b;
        String string = file.toString();
        m.e(string, "toString(...)");
        return p(string);
    }

    @Override // O2.A
    public MediaCodecInfo b(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // U6.k
    public Object c(String str, Provider provider) {
        switch (this.f7395a) {
            case 19:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // D8.t2
    public Object d() {
        return Executors.newCachedThreadPool(AbstractC0291l0.e("grpc-okhttp-%d"));
    }

    @Override // I3.a
    public CharSequence f(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f15608a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // O2.A
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // V2.k
    public void h() {
        synchronized (W2.a.f12776a) {
            Object obj = W2.a.f12777b;
            synchronized (obj) {
                if (W2.a.f12778c) {
                    return;
                }
                long jA = W2.a.a();
                synchronized (obj) {
                    W2.a.f12779d = jA;
                    W2.a.f12778c = true;
                }
            }
        }
    }

    @Override // O2.A
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // O2.A
    public int j() {
        return MediaCodecList.getCodecCount();
    }

    @Override // O2.A
    public boolean m() {
        return false;
    }

    @Override // D8.t2
    public void n(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public boolean r(CharSequence charSequence) {
        return charSequence instanceof I1.b;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:10:0x0031, B:12:0x003d, B:52:0x00c2, B:17:0x0046, B:19:0x004d, B:21:0x0053, B:26:0x0059, B:28:0x005d, B:31:0x0066, B:33:0x006e, B:36:0x0075, B:43:0x00a1, B:44:0x00a9, B:39:0x007c, B:41:0x0082, B:42:0x0093, B:47:0x00ac, B:50:0x00af, B:51:0x00b9, B:18:0x0049), top: B:139:0x0031, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    public int s(Context context, boolean z10) {
        int i10;
        Cursor cursor;
        try {
            synchronized (S5.c.class) {
                Boolean bool = S5.c.f11122c;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        S5.c.e(classLoader);
                                    } catch (S5.b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!S5.c.c(context)) {
                                        return 0;
                                    }
                                    if (S5.c.f11124e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iD = S5.c.d(context, z10, true);
                                                String str = S5.c.f11123d;
                                                if (str != null && !str.isEmpty()) {
                                                    ClassLoader classLoaderU = S5.d.U();
                                                    if (classLoaderU == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            S5.a.b();
                                                            String str2 = S5.c.f11123d;
                                                            E.h(str2);
                                                            classLoaderU = S5.a.a(str2, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str3 = S5.c.f11123d;
                                                            E.h(str3);
                                                            classLoaderU = new e(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    S5.c.e(classLoaderU);
                                                    declaredField.set(null, classLoaderU);
                                                    S5.c.f11122c = bool2;
                                                    return iD;
                                                }
                                                return iD;
                                            } catch (S5.b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                S5.c.f11122c = bool;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return S5.c.d(context, z10, false);
                    } catch (S5.b e4) {
                        String message = e4.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                g gVarF = S5.c.f(context);
                try {
                    if (gVarF == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelZzB = gVarF.zzB(6, gVarF.zza());
                        int i11 = parcelZzB.readInt();
                        parcelZzB.recycle();
                        if (i11 < 3) {
                            if (i11 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                R5.b bVar = new R5.b(context);
                                Parcel parcelZza = gVarF.zza();
                                zzc.zze(parcelZza, bVar);
                                parcelZza.writeString("com.google.android.gms.providerinstaller.dynamite");
                                parcelZza.writeInt(z10 ? 1 : 0);
                                Parcel parcelZzB2 = gVarF.zzB(5, parcelZza);
                                i10 = parcelZzB2.readInt();
                                parcelZzB2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                R5.b bVar2 = new R5.b(context);
                                Parcel parcelZza2 = gVarF.zza();
                                zzc.zze(parcelZza2, bVar2);
                                parcelZza2.writeString("com.google.android.gms.providerinstaller.dynamite");
                                parcelZza2.writeInt(z10 ? 1 : 0);
                                Parcel parcelZzB3 = gVarF.zzB(3, parcelZza2);
                                i10 = parcelZzB3.readInt();
                                parcelZzB3.recycle();
                            }
                            return i10;
                        }
                        ThreadLocal threadLocal = S5.c.f11127h;
                        f fVar = (f) threadLocal.get();
                        if (fVar != null && (cursor = fVar.f11134a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) R5.b.d0(gVarF.k0(new R5.b(context), z10, ((Long) S5.c.f11128i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i12 = cursor3.getInt(0);
                                    if (i12 > 0) {
                                        f fVar2 = (f) threadLocal.get();
                                        if (fVar2 == null || fVar2.f11134a != null) {
                                            z11 = false;
                                        } else {
                                            fVar2.f11134a = cursor3;
                                        }
                                        cursor2 = z11 ? null : cursor3;
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i12;
                                }
                            } catch (RemoteException e7) {
                                e = e7;
                                cursor2 = cursor3;
                                String message2 = e.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                sb3.append("Failed to retrieve remote module version: ");
                                sb3.append(message2);
                                Log.w("DynamiteModule", sb3.toString());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e10) {
                        e = e10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            try {
                E.h(context);
                throw th4;
            } catch (Exception e11) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e11);
                throw th4;
            }
        }
    }

    @Override // F4.d
    public F4.c v(F4.f fVar) {
        ByteBuffer byteBuffer = fVar.f29074e;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        X4.f fVar2 = new X4.f(bArrArray, iLimit);
        String strS = fVar2.s();
        String strS2 = fVar2.s();
        long jM = fVar2.m();
        fVar2.g(4);
        return new F4.c(new G4.a(strS, strS2, (fVar2.m() * 1000) / jM, fVar2.m(), Arrays.copyOfRange(bArrArray, fVar2.f13221b, iLimit)));
    }

    @Override // G7.o
    public Object y() {
        switch (this.f7395a) {
            case 8:
                return new ArrayList();
            default:
                return new LinkedHashMap();
        }
    }

    public c(t tVar) {
        this.f7395a = 13;
    }

    public c() {
        this.f7395a = 14;
        new C2230e(0);
        new l((Object) null);
    }

    @Override // V2.k
    public void k() {
    }

    @Override // Z2.InterfaceC0965f
    public long e(long j10) {
        return j10;
    }

    @Override // K1.InterfaceC0621x
    public void a(int i10, int i11, int i12, boolean z10) {
    }

    @Override // K1.InterfaceC0621x
    public void l(int i10, int i11, int i12, int i13) {
    }
}
