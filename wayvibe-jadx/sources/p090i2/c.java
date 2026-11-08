package p090i2;

import A.n;
import E3.j;
import P5.a;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;
import org.maplibre.android.offline.OfflineManager;
import p078h2.s;
import p098j.u;
import p140m7.C2061m;
import p158o5.b;
import p160o7.y;
import p161o8.o;
import p161o8.q;
import p161o8.r;
import p196s5.d;
import p230w.C2287u;
import p234w3.k;
import p255y2.C2339o;
import y3.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b, q, y, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f20480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f20481c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20482a;

    public /* synthetic */ c(int i10) {
        this.f20482a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    public static final void a(File file, File file2) throws Throwable {
        Throwable th;
        FileChannel channel;
        IOException iOException;
        c cVar = OfflineManager.f25078d;
        if (!file2.exists() && !file2.createNewFile()) {
            throw new IOException("Unable to copy database file for merge.");
        }
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                try {
                    channel.transferFrom(channel2, 0L, channel2.size());
                    channel2.close();
                    channel.close();
                } catch (IOException e2) {
                    iOException = e2;
                    fileChannel = channel2;
                    try {
                        throw new IOException(String.format("Unable to copy database file for merge. %s", Arrays.copyOf(new Object[]{iOException.getMessage()}, 1)));
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (channel != null) {
                            throw th;
                        }
                        channel.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel != null) {
                        throw th;
                    }
                    channel.close();
                    throw th;
                }
            } catch (IOException e4) {
                iOException = e4;
                channel = null;
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (IOException e7) {
            iOException = e7;
            channel = null;
        } catch (Throwable th5) {
            th = th5;
            channel = null;
        }
    }

    public static final float[] b() {
        float[] fArr = C2287u.f27777s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C2287u.f27777s = fArr2;
        return fArr2;
    }

    public static boolean e(p101j2.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                s[] sVarArr = (s[]) editable.getSpans(selectionStart, iMin, s.class);
                if (sVarArr != null && sVarArr.length > 0) {
                    for (s sVar : sVarArr) {
                        int spanStart = editable.getSpanStart(sVar);
                        int spanEnd = editable.getSpanEnd(sVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p234w3.k
    public boolean c(C2339o c2339o) {
        String str = c2339o.f28954m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public synchronized OfflineManager d(Context context) {
        OfflineManager offlineManager;
        try {
            m.f(context, "context");
            if (OfflineManager.f25079e == null) {
                OfflineManager.f25079e = new OfflineManager(context);
            }
            offlineManager = OfflineManager.f25079e;
            m.c(offlineManager);
        } catch (Throwable th) {
            throw th;
        }
        return offlineManager;
    }

    @Override // L8.a
    public Object get() {
        switch (this.f20482a) {
            case 2:
                return new a(Executors.newSingleThreadExecutor(), 2);
            default:
                u uVar = new u();
                HashMap map = new HashMap();
                p104j5.c cVar = p104j5.c.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar, new p196s5.b(30000L, 86400000L, set));
                p104j5.c cVar2 = p104j5.c.HIGHEST;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar2, new p196s5.b(1000L, 86400000L, set));
                p104j5.c cVar3 = p104j5.c.VERY_LOW;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(d.DEVICE_IDLE)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(cVar3, new p196s5.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < p104j5.c.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new p196s5.a(uVar, map);
        }
    }

    @Override // p234w3.k
    public p234w3.m j(C2339o c2339o) {
        String str = c2339o.f28954m;
        if (str != null) {
            List list = c2339o.f28957p;
            switch (str) {
                case "application/dvbsubs":
                    return new f(list);
                case "application/pgs":
                    return new C2061m(12);
                case "application/x-mp4-vtt":
                    return new n(3);
                case "text/vtt":
                    return new j();
                case "application/x-quicktime-tx3g":
                    return new D3.a(list);
                case "text/x-ssa":
                    return new A3.b(list);
                case "application/x-subrip":
                    return new B3.a();
                case "application/ttml+xml":
                    return new C3.f();
            }
        }
        throw new IllegalArgumentException(p134m1.b.k("Unsupported MIME type: ", str));
    }

    @Override // p234w3.k
    public int n(C2339o c2339o) {
        String str = c2339o.f28954m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(p134m1.b.k("Unsupported MIME type: ", str));
    }

    @Override // p161o8.q
    public void onMethodCall(o oVar, r rVar) {
        ((p150n8.o) rVar).b(null);
    }

    @Override // p160o7.y
    public void run() {
    }
}
