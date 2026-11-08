package com.google.firebase.firestore;

import Ca.C0168a;
import E9.C0348i;
import Z6.C1004i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.os.Trace;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import app.nagakiba.wayvibe.R;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public class Z implements A4.g, com.google.protobuf.S, G7.o, I3.a, O2.j, com.google.crypto.tink.shaded.protobuf.C, U6.k, Z2.q, Continuation, p165p2.b, p046da.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Z f18587b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18588a;

    public /* synthetic */ Z(int i10) {
        this.f18588a = i10;
    }

    public static E8.x g(int i10) {
        return new E8.x(new C0348i(), Math.min(1048576, Math.max(4096, i10)));
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static MediaCodec i(O2.i iVar) throws IOException {
        O2.n nVar = iVar.f9064a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = nVar.f9070a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static W4.m j(Context context, String[] strArr, String str, C0168a c0168a) {
        String[] strArrM = m(context);
        int length = strArrM.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = strArrM[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String string = sb.toString();
                            c0168a.F("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                W4.m mVar = new W4.m(14);
                                mVar.f12825b = zipFile;
                                mVar.f12826c = entry;
                                return mVar;
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    public static String[] l(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // Z2.q
    public void A() {
        throw new UnsupportedOperationException();
    }

    @Override // Z2.q
    public Z2.F L(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // Z2.q
    public void b(Z2.z zVar) {
        throw new UnsupportedOperationException();
    }

    @Override // U6.k
    public Object c(String str, Provider provider) {
        switch (this.f18588a) {
            case 19:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // A4.g
    public void d(int i10, X4.f fVar) {
        fVar.g(i10);
    }

    @Override // O2.j
    public O2.k e(O2.i iVar) {
        MediaCodec mediaCodecI = null;
        try {
            mediaCodecI = i(iVar);
            Trace.beginSection("configureCodec");
            mediaCodecI.configure(iVar.f9065b, iVar.f9067d, iVar.f9068e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecI.start();
            Trace.endSection();
            return new android.support.v4.media.session.t(mediaCodecI);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodecI != null) {
                mediaCodecI.release();
            }
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        switch (this.f18588a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return obj != null && Z.class == obj.getClass();
            default:
                return super.equals(obj);
        }
    }

    @Override // I3.a
    public CharSequence f(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f15608a.getString(R.string.not_set);
        }
        return null;
    }

    public android.content.pm.Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof C1004i) && ((C1004i) task.getException()).f13983a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }

    public String toString() {
        switch (this.f18588a) {
            case 0:
                return "MemoryEagerGcSettings{}";
            default:
                return super.toString();
        }
    }

    @Override // G7.o
    public Object y() {
        switch (this.f18588a) {
            case 7:
                return new TreeSet();
            case 8:
                return new ConcurrentSkipListMap();
            default:
                return new G7.m(true);
        }
    }

    public Z(RecyclerView recyclerView) {
        this.f18588a = 13;
    }

    @Override // A4.g
    public void a(long j10, int i10, int i11, int i12, A4.f fVar) {
    }
}
