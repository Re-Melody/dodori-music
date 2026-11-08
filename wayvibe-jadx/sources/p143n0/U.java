package p143n0;

import android.graphics.RectF;
import kotlin.jvm.internal.m;
import p133m0.a;
import p133m0.d;
import p133m0.e;

/* JADX INFO: loaded from: classes.dex */
public interface U {
    static void a(U u10, e eVar) {
        T t10 = T.CounterClockwise;
        C2083j c2083j = (C2083j) u10;
        if (c2083j.f22777b == null) {
            c2083j.f22777b = new RectF();
        }
        RectF rectF = c2083j.f22777b;
        m.c(rectF);
        float f10 = eVar.f22191d;
        rectF.set(eVar.f22188a, eVar.f22189b, eVar.f22190c, f10);
        if (c2083j.f22778c == null) {
            c2083j.f22778c = new float[8];
        }
        float[] fArr = c2083j.f22778c;
        m.c(fArr);
        long j10 = eVar.f22192e;
        fArr[0] = a.b(j10);
        fArr[1] = a.c(j10);
        long j11 = eVar.f22193f;
        fArr[2] = a.b(j11);
        fArr[3] = a.c(j11);
        long j12 = eVar.f22194g;
        fArr[4] = a.b(j12);
        fArr[5] = a.c(j12);
        long j13 = eVar.f22195h;
        fArr[6] = a.b(j13);
        fArr[7] = a.c(j13);
        RectF rectF2 = c2083j.f22777b;
        m.c(rectF2);
        float[] fArr2 = c2083j.f22778c;
        m.c(fArr2);
        c2083j.f22776a.addRoundRect(rectF2, fArr2, W.m(t10));
    }

    static void b(U u10, d dVar) {
        T t10 = T.CounterClockwise;
        C2083j c2083j = (C2083j) u10;
        c2083j.getClass();
        float f10 = dVar.f22184a;
        if (!Float.isNaN(f10)) {
            float f11 = dVar.f22185b;
            if (!Float.isNaN(f11)) {
                float f12 = dVar.f22186c;
                if (!Float.isNaN(f12)) {
                    float f13 = dVar.f22187d;
                    if (!Float.isNaN(f13)) {
                        if (c2083j.f22777b == null) {
                            c2083j.f22777b = new RectF();
                        }
                        RectF rectF = c2083j.f22777b;
                        m.c(rectF);
                        rectF.set(f10, f11, f12, f13);
                        RectF rectF2 = c2083j.f22777b;
                        m.c(rectF2);
                        c2083j.f22776a.addRect(rectF2, W.m(t10));
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
