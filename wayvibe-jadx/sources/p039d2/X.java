package p039d2;

import D8.C0312s1;
import M8.D;
import Q5.b;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p069g2.g;

/* JADX INFO: loaded from: classes.dex */
public final class X extends P {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        W w10;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof W) {
            w10 = (W) cVar;
            int i10 = w10.f19158e;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                w10.f19158e = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                w10 = new W(this, cVar);
            }
        } else {
            w10 = new W(this, cVar);
        }
        Object obj2 = w10.f19156c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = w10.f19158e;
        D d10 = D.f8402a;
        if (i11 == 0) {
            b.T(obj2);
            if (this.f19130b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f19129a);
            try {
                g gVar = g.f20059a;
                C0312s1 c0312s1 = new C0312s1(fileOutputStream3);
                w10.f19154a = fileOutputStream3;
                w10.f19155b = fileOutputStream3;
                w10.f19158e = 1;
                gVar.b(obj, c0312s1);
                if (d10 == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = w10.f19155b;
            fileOutputStream = w10.f19154a;
            try {
                b.T(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    b.n(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        b.n(fileOutputStream, null);
        return d10;
    }
}
