package A9;

import B2.AbstractC0111a;
import D7.W;
import U.W0;
import Z6.AbstractC1009n;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.appcompat.widget.ActionMenuView;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.internal.C1158z;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzkh;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import p152o.C2131f;
import p152o.C2139j;
import p255y2.C2337m;
import p261z.C0;
import p261z.C2413l0;

/* JADX INFO: renamed from: A9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0108h implements p142n.w, androidx.lifecycle.D, p253y0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0108h f461d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f464c;

    public /* synthetic */ C0108h(int i10) {
        this.f462a = i10;
    }

    public static Z6.I r(Intent intent) {
        Parcelable.Creator<zzait> creator = zzait.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        return Z6.I.y(((zzait) (byteArrayExtra == null ? null : W.A(byteArrayExtra, creator))).zzc(true));
    }

    public static void t(Context context) {
        C0108h c0108h = f461d;
        c0108h.f463b = false;
        if (((BroadcastReceiver) c0108h.f464c) != null) {
            p212u2.b bVarA = p212u2.b.a(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) f461d.f464c;
            synchronized (bVarA.f27172b) {
                try {
                    ArrayList arrayList = (ArrayList) bVarA.f27172b.remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            p212u2.a aVar = (p212u2.a) arrayList.get(size);
                            aVar.f27168d = true;
                            for (int i10 = 0; i10 < aVar.f27165a.countActions(); i10++) {
                                String action = aVar.f27165a.getAction(i10);
                                ArrayList arrayList2 = (ArrayList) bVarA.f27173c.get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        p212u2.a aVar2 = (p212u2.a) arrayList2.get(size2);
                                        if (aVar2.f27166b == broadcastReceiver) {
                                            aVar2.f27168d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        bVarA.f27173c.remove(action);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f461d.f464c = null;
    }

    @Override // p253y0.a
    public long W(int i10, long j10, long j11) {
        if (!this.f463b) {
            return 0L;
        }
        C0 c3 = (C0) this.f464c;
        if (c3.f29364a.a()) {
            return 0L;
        }
        return c3.g(c3.c(c3.f29364a.e(c3.c(c3.f(j11)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p253y0.a
    public Object Z(long j10, long j11, Q8.d dVar) {
        C2413l0 c2413l0;
        long jD;
        if (dVar instanceof C2413l0) {
            c2413l0 = (C2413l0) dVar;
            int i10 = c2413l0.f29622d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2413l0.f29622d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2413l0 = new C2413l0(this, (S8.c) dVar);
            }
        } else {
            c2413l0 = new C2413l0(this, (S8.c) dVar);
        }
        Object objB = c2413l0.f29620b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = c2413l0.f29622d;
        if (i11 == 0) {
            Q5.b.T(objB);
            if (this.f463b) {
                c2413l0.f29619a = j11;
                c2413l0.f29622d = 1;
                objB = ((C0) this.f464c).b(j11, c2413l0);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                jD = 0;
            }
            return new p028c1.o(jD);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j11 = c2413l0.f29619a;
        Q5.b.T(objB);
        jD = p028c1.o.d(j11, ((p028c1.o) objB).f15864a);
        return new p028c1.o(jD);
    }

    @Override // p142n.w
    public void a(p142n.l lVar, boolean z10) {
        C2139j c2139j;
        if (this.f463b) {
            return;
        }
        this.f463b = true;
        p098j.J j10 = (p098j.J) this.f464c;
        ActionMenuView actionMenuView = j10.f21269a.f23312a.f14586a;
        if (actionMenuView != null && (c2139j = actionMenuView.f14504t) != null) {
            c2139j.f();
            C2131f c2131f = c2139j.f23385t;
            if (c2131f != null && c2131f.b()) {
                c2131f.f22702i.dismiss();
            }
        }
        j10.f21270b.onPanelClosed(108, lVar);
        this.f463b = false;
    }

    @Override // p142n.w
    public boolean b(p142n.l lVar) {
        ((p098j.J) this.f464c).f21270b.onMenuOpened(108, lVar);
        return true;
    }

    @Override // androidx.lifecycle.D
    public void c(Object obj) {
        this.f463b = true;
        F5.i iVar = (F5.i) this.f464c;
        iVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.f4547b;
        signInHubActivity.setResult(signInHubActivity.f17820i, signInHubActivity.f17821j);
        signInHubActivity.finish();
    }

    public void d(int i10) {
        AbstractC0111a.h(!this.f463b);
        ((SparseBooleanArray) this.f464c).append(i10, true);
    }

    public C2337m e() {
        AbstractC0111a.h(!this.f463b);
        this.f463b = true;
        return new C2337m((SparseBooleanArray) this.f464c);
    }

    public boolean f() {
        return this.f463b;
    }

    public void g() {
        this.f463b = false;
    }

    public void h(boolean z10) {
        if (this.f463b) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f463b = true;
        C1158z c1158z = (C1158z) this.f464c;
        int i10 = c1158z.f17960a - 1;
        c1158z.f17960a = i10;
        boolean z11 = z10 | c1158z.f17961b;
        c1158z.f17961b = z11;
        if (i10 != 0 || z11) {
            return;
        }
        ((W0) c1158z.f17963d).u((KeyEvent) c1158z.f17962c);
    }

    public void i(byte b10) {
        ((A1.d) this.f464c).q(String.valueOf(b10));
    }

    public void j(char c3) {
        A1.d dVar = (A1.d) this.f464c;
        dVar.h(dVar.f116b, 1);
        char[] cArr = (char[]) dVar.f117c;
        int i10 = dVar.f116b;
        dVar.f116b = i10 + 1;
        cArr[i10] = c3;
    }

    public void k(int i10) {
        ((A1.d) this.f464c).q(String.valueOf(i10));
    }

    public void l(long j10) {
        ((A1.d) this.f464c).q(String.valueOf(j10));
    }

    public void m(String v3) {
        kotlin.jvm.internal.m.f(v3, "v");
        ((A1.d) this.f464c).q(v3);
    }

    public void n(short s8) {
        ((A1.d) this.f464c).q(String.valueOf(s8));
    }

    public void o(String value) {
        byte b10;
        kotlin.jvm.internal.m.f(value, "value");
        A1.d dVar = (A1.d) this.f464c;
        dVar.h(dVar.f116b, value.length() + 2);
        char[] cArr = (char[]) dVar.f117c;
        int i10 = dVar.f116b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c3 = cArr[i13];
            byte[] bArr = H.f442b;
            if (c3 < bArr.length && bArr[c3] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    dVar.h(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = H.f442b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) dVar.f117c)[i13] = cCharAt;
                        i13 = i15;
                    } else if (b10 == 1) {
                        String str = H.f441a[cCharAt];
                        kotlin.jvm.internal.m.c(str);
                        dVar.h(i13, str.length());
                        str.getChars(0, str.length(), (char[]) dVar.f117c, i13);
                        int length3 = str.length() + i13;
                        dVar.f116b = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = (char[]) dVar.f117c;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b10;
                        i13 += 2;
                        dVar.f116b = i13;
                    }
                }
                dVar.h(i13, 1);
                ((char[]) dVar.f117c)[i13] = '\"';
                dVar.f116b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        dVar.f116b = i12 + 1;
    }

    public void s(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f464c = broadcastReceiver;
        p212u2.b bVarA = p212u2.b.a(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (bVarA.f27172b) {
            try {
                p212u2.a aVar = new p212u2.a(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) bVarA.f27172b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    bVarA.f27172b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) bVarA.f27173c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        bVarA.f27173c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f462a) {
            case 7:
                return ((F5.i) this.f464c).toString();
            case 8:
                String str = (String) this.f464c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f463b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(zzkh zzkhVar) {
        if (this.f463b) {
            zzc.zzo("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((W0) this.f464c).z(new p104j5.a(zzkhVar, p104j5.c.DEFAULT));
        } catch (Throwable unused) {
            zzc.zzo("BillingLogger", "logging failed.");
        }
    }

    public boolean v(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC1009n abstractC1009n) {
        if (this.f463b) {
            return false;
        }
        s(activity, new p011a7.r(this, activity, taskCompletionSource, firebaseAuth, abstractC1009n));
        this.f463b = true;
        return true;
    }

    public /* synthetic */ C0108h(int i10, Object obj, boolean z10) {
        this.f462a = i10;
        this.f464c = obj;
        this.f463b = z10;
    }

    public C0108h(A1.d dVar) {
        this.f462a = 0;
        this.f464c = dVar;
        this.f463b = true;
    }

    public C0108h() {
        this.f462a = 9;
        this.f464c = new SparseBooleanArray();
    }

    public C0108h(C1158z c1158z) {
        this.f462a = 5;
        this.f464c = c1158z;
        this.f463b = false;
    }

    public C0108h(F5.d dVar, F5.i iVar) {
        this.f462a = 7;
        this.f463b = false;
        this.f464c = iVar;
    }

    public C0108h(p098j.J j10) {
        this.f462a = 6;
        this.f464c = j10;
    }

    public void p() {
    }

    public void q() {
    }
}
