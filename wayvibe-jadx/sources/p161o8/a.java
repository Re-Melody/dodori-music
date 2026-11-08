package p161o8;

import android.util.Log;
import java.nio.ByteBuffer;
import p140m7.C2061m;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23817c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f23815a = i10;
        this.f23817c = obj;
        this.f23816b = obj2;
    }

    @Override // p161o8.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f23815a) {
            case 0:
                C2061m c2061m = (C2061m) this.f23817c;
                try {
                    ((c) this.f23816b).d(((n) c2061m.f22466c).b(byteBuffer));
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c2061m.f22465b), "Failed to handle message reply", e2);
                    return;
                }
                break;
            default:
                s sVar = (s) this.f23817c;
                r rVar = (r) this.f23816b;
                try {
                    if (byteBuffer == null) {
                        rVar.c();
                    } else {
                        try {
                            rVar.b(sVar.f23833c.f(byteBuffer));
                        } catch (k e4) {
                            rVar.d(e4.f23824b, e4.f23823a, e4.getMessage());
                        }
                    }
                } catch (RuntimeException e7) {
                    Log.e("MethodChannel#" + sVar.f23832b, "Failed to handle method call result", e7);
                    return;
                }
                break;
        }
    }
}
