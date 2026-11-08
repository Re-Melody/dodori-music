package p217u7;

import D2.j;
import D7.p1;
import E4.g;
import E9.C0351l;
import F9.i;
import G7.o;
import J3.e;
import J4.l;
import O4.c;
import O4.f;
import S2.k;
import V2.p;
import android.graphics.Path;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.protobuf.S;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.m;
import p097i9.a;
import p097i9.r;
import p165p2.b;
import p235w4.n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements S, g, o, p, e, l, N4.g, k, C, U6.k, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27261a;

    public /* synthetic */ d(int i10) {
        this.f27261a = i10;
    }

    public static C0351l k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (F9.b.a(str.charAt(i11 + 1)) + (F9.b.a(str.charAt(i11)) << 4));
        }
        return new C0351l(bArr);
    }

    public static C0351l l(String str) {
        m.f(str, "<this>");
        byte[] bytes = str.getBytes(a.f20563a);
        m.e(bytes, "getBytes(...)");
        C0351l c0351l = new C0351l(bytes);
        c0351l.f3391c = str;
        return c0351l;
    }

    public static Path m(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static C0351l n(byte... data) {
        m.f(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        m.e(bArrCopyOf, "copyOf(...)");
        return new C0351l(bArrCopyOf);
    }

    @Override // J4.l
    public int a(long j10) {
        return 0;
    }

    @Override // J4.l
    public int b(p235w4.o oVar, p256y4.d dVar, boolean z10) {
        dVar.f3017b = 4;
        return -4;
    }

    @Override // J4.l
    public boolean c() {
        return true;
    }

    @Override // S2.k
    public long e() {
        throw new NoSuchElementException();
    }

    @Override // S2.k
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // V2.p
    public Object g(Uri uri, j jVar) {
        return Long.valueOf(B2.C.L(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    public N4.e h(n nVar) {
        String str = nVar.f28001f;
        str.getClass();
        int i10 = nVar.f28019z;
        List list = nVar.f28003h;
        switch (str) {
            case "application/dvbsubs":
                return new P4.a(list);
            case "application/x-mp4-vtt":
                return new U4.b();
            case "text/vtt":
                return new U4.k();
            case "application/x-quicktime-tx3g":
                return new T4.a(list);
            case "text/x-ssa":
                return new Q4.a(list);
            case "application/x-mp4-cea-608":
            case "application/cea-608":
                return new c(nVar.f28001f, i10);
            case "application/cea-708":
                return new f(i10);
            case "application/x-subrip":
                return new R4.a();
            case "application/ttml+xml":
                return new S4.a();
            default:
                throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }

    @Override // J3.e
    public void i(Serializable serializable, int i10) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // J3.e
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // S2.k
    public boolean next() {
        return false;
    }

    @Override // G7.o
    public Object y() {
        switch (this.f27261a) {
            case 7:
                return new ArrayDeque();
            default:
                return new TreeMap();
        }
    }

    public d(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f27261a = 13;
    }

    public static final boolean d(E9.C c3) {
        E9.C c9 = i.f4638f;
        c3.getClass();
        C0351l c0351l = F9.c.f4620a;
        C0351l c0351lX = c3.f3334a;
        int iR = C0351l.r(c0351lX, c0351l);
        if (iR == -1) {
            iR = C0351l.r(c0351lX, F9.c.f4621b);
        }
        if (iR != -1) {
            c0351lX = C0351l.x(c0351lX, iR + 1, 0, 2);
        } else if (c3.g() != null && c0351lX.k() == 2) {
            c0351lX = C0351l.f3388d;
        }
        return !r.b0(c0351lX.A(), ".class", true);
    }

    @Override // E4.g
    public int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // E4.g
    public boolean b() {
        return false;
    }

    @Override // U6.k
    public Object c(String str, Provider provider) {
        switch (this.f27261a) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    @Override // E4.g
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // E4.g
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // J4.l
    public void d() {
    }
}
