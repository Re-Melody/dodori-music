package p098j;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.location.I;
import org.maplibre.android.maps.C2206d;
import org.maplibre.android.maps.InterfaceC2219q;
import org.maplibre.android.maps.r;
import org.maplibre.android.maps.s;

/* JADX INFO: renamed from: j.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1993f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f21328b;

    public void a(int i10) {
        C2206d c2206d = (C2206d) this.f21328b.get();
        if (c2206d != null) {
            if (i10 == 0) {
                boolean z10 = !c2206d.f24933b && (hasMessages(3) || hasMessages(2));
                removeMessages(3);
                removeMessages(2);
                if (z10) {
                    return;
                }
            }
            Message message = new Message();
            message.what = i10;
            sendMessage(message);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f21327a) {
            case 0:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f21328b.get(), message.what);
                    break;
                } else if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                I i11 = (I) this.f21328b.get();
                if (i11 != null) {
                    i11.a(true);
                }
                break;
            default:
                C2206d c2206d = (C2206d) this.f21328b.get();
                if (c2206d != null) {
                    int i12 = message.what;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3 && !c2206d.f24933b) {
                                    c2206d.f24933b = true;
                                    CopyOnWriteArrayList copyOnWriteArrayList = c2206d.f24938g;
                                    if (!copyOnWriteArrayList.isEmpty()) {
                                        Iterator it = copyOnWriteArrayList.iterator();
                                        while (it.hasNext()) {
                                            ((InterfaceC2219q) it.next()).F();
                                        }
                                    }
                                }
                                break;
                            } else {
                                CopyOnWriteArrayList copyOnWriteArrayList2 = c2206d.f24936e;
                                if (!copyOnWriteArrayList2.isEmpty() && !c2206d.f24933b) {
                                    Iterator it2 = copyOnWriteArrayList2.iterator();
                                    while (it2.hasNext()) {
                                        ((C2206d) it2.next()).f24932a.a(2);
                                    }
                                    break;
                                }
                            }
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList3 = c2206d.f24937f;
                            if (!copyOnWriteArrayList3.isEmpty() && !c2206d.f24933b) {
                                Iterator it3 = copyOnWriteArrayList3.iterator();
                                while (it3.hasNext()) {
                                    ((r) it3.next()).h();
                                }
                                break;
                            }
                        }
                    } else if (c2206d.f24933b) {
                        c2206d.f24933b = false;
                        CopyOnWriteArrayList copyOnWriteArrayList4 = c2206d.f24935d;
                        if (!copyOnWriteArrayList4.isEmpty()) {
                            Iterator it4 = copyOnWriteArrayList4.iterator();
                            while (it4.hasNext()) {
                                ((s) it4.next()).r(c2206d.f24934c);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public HandlerC1993f(I i10) {
        this.f21327a = 1;
        this.f21328b = new WeakReference(i10);
    }
}
