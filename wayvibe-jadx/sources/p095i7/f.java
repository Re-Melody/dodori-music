package p095i7;

import A1.d;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p062f7.b;
import p062f7.c;
import p062f7.e;
import p083h7.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f20535f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f20537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f20538i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f20539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f20543e = new h(this);

    static {
        d dVarD = d.d();
        dVarD.f116b = 1;
        a aVarC = dVarD.c();
        HashMap map = new HashMap();
        map.put(d.class, aVarC);
        f20536g = new c("key", Collections.unmodifiableMap(new HashMap(map)));
        d dVarD2 = d.d();
        dVarD2.f116b = 2;
        a aVarC2 = dVarD2.c();
        HashMap map2 = new HashMap();
        map2.put(d.class, aVarC2);
        f20537h = new c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f20538i = new a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, a aVar) {
        this.f20539a = byteArrayOutputStream;
        this.f20540b = map;
        this.f20541c = map2;
        this.f20542d = aVar;
    }

    public static int g(c cVar) {
        d dVar = (d) ((Annotation) cVar.f19847b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f20531c;
        }
        throw new b("Field has no @Protobuf config");
    }

    @Override // p062f7.e
    public final e a(c cVar, long j10) throws IOException {
        d(cVar, j10, true);
        return this;
    }

    @Override // p062f7.e
    public final e b(c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void c(c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f19847b.get(d.class));
        if (dVar == null) {
            throw new b("Field has no @Protobuf config");
        }
        a aVar = (a) dVar;
        int i11 = e.f20534a[aVar.f20532d.ordinal()];
        int i12 = aVar.f20531c;
        if (i11 == 1) {
            h(i12 << 3);
            h(i10);
        } else if (i11 == 2) {
            h(i12 << 3);
            h((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i11 != 3) {
                return;
            }
            h((i12 << 3) | 5);
            this.f20539a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void d(c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f19847b.get(d.class));
        if (dVar == null) {
            throw new b("Field has no @Protobuf config");
        }
        a aVar = (a) dVar;
        int i10 = e.f20534a[aVar.f20532d.ordinal()];
        int i11 = aVar.f20531c;
        if (i10 == 1) {
            h(i11 << 3);
            i(j10);
        } else if (i10 == 2) {
            h(i11 << 3);
            i((j10 >> 63) ^ (j10 << 1));
        } else {
            if (i10 != 3) {
                return;
            }
            h((i11 << 3) | 1);
            this.f20539a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
        }
    }

    public final void e(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20535f);
            h(bytes.length);
            this.f20539a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f20538i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z10 && dDoubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f20539a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f20539a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(cVar, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f20539a.write(bArr);
            return;
        }
        p062f7.d dVar = (p062f7.d) this.f20540b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z10);
            return;
        }
        p062f7.f fVar = (p062f7.f) this.f20541c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f20543e;
            hVar.f20545a = false;
            hVar.f20547c = cVar;
            hVar.f20546b = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof p168p5.c) {
            c(cVar, ((p168p5.c) obj).f(), true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f20542d, cVar, obj, z10);
        }
    }

    public final void f(p062f7.d dVar, c cVar, Object obj, boolean z10) throws IOException {
        b bVar = new b();
        bVar.f20533a = 0L;
        try {
            OutputStream outputStream = this.f20539a;
            this.f20539a = bVar;
            try {
                dVar.a(obj, this);
                this.f20539a = outputStream;
                long j10 = bVar.f20533a;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f20539a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f20539a.write((i10 & 127) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            i10 >>>= 7;
        }
        this.f20539a.write(i10 & 127);
    }

    public final void i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f20539a.write((((int) j10) & 127) | ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            j10 >>>= 7;
        }
        this.f20539a.write(((int) j10) & 127);
    }
}
