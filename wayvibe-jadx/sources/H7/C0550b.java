package H7;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: H7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0550b extends E7.y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0549a f6166d = new C0549a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6167a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6169c;

    public C0550b(E7.l lVar, E7.y yVar, Class cls) {
        this.f6168b = new w(lVar, yVar, cls);
        this.f6169c = cls;
    }

    @Override // E7.y
    public final Object read(M7.b bVar) throws M7.e {
        Date dateC;
        switch (this.f6167a) {
            case 0:
                if (bVar.N() == M7.c.NULL) {
                    bVar.J();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                bVar.b();
                while (bVar.A()) {
                    arrayList.add(((E7.y) ((w) this.f6168b).f6224c).read(bVar));
                }
                bVar.l();
                int size = arrayList.size();
                Class cls = (Class) this.f6169c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i10 = 0; i10 < size; i10++) {
                    Array.set(objNewInstance, i10, arrayList.get(i10));
                }
                return objNewInstance;
            case 1:
                if (bVar.N() == M7.c.NULL) {
                    bVar.J();
                    return null;
                }
                Collection collection = (Collection) ((G7.o) this.f6169c).y();
                bVar.b();
                while (bVar.A()) {
                    collection.add(((E7.y) ((w) this.f6168b).f6224c).read(bVar));
                }
                bVar.l();
                return collection;
            case 2:
                if (bVar.N() == M7.c.NULL) {
                    bVar.J();
                    return null;
                }
                String strL = bVar.L();
                synchronized (((ArrayList) this.f6168b)) {
                    try {
                        Iterator it = ((ArrayList) this.f6168b).iterator();
                        while (it.hasNext()) {
                            try {
                                dateC = ((DateFormat) it.next()).parse(strL);
                            } catch (ParseException unused) {
                            }
                        }
                        try {
                            dateC = I7.a.c(strL, new ParsePosition(0));
                        } catch (ParseException e2) {
                            StringBuilder sbU = V0.p.u("Failed parsing '", strL, "' as Date; at path ");
                            sbU.append(bVar.z());
                            throw new E7.n(sbU.toString(), e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ((f) this.f6169c).a(dateC);
            default:
                Object obj = ((x) this.f6168b).f6228c.read(bVar);
                if (obj != null) {
                    Class cls2 = (Class) this.f6169c;
                    if (!cls2.isInstance(obj)) {
                        throw new E7.n("Expected a " + cls2.getName() + " but was " + obj.getClass().getName() + "; at path " + bVar.z());
                    }
                }
                return obj;
        }
    }

    public String toString() {
        switch (this.f6167a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f6168b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    @Override // E7.y
    public final void write(M7.d dVar, Object obj) throws IOException {
        String str;
        switch (this.f6167a) {
            case 0:
                if (obj == null) {
                    dVar.x();
                    return;
                }
                dVar.c();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ((w) this.f6168b).write(dVar, Array.get(obj, i10));
                }
                dVar.l();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    dVar.x();
                    return;
                }
                dVar.c();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((w) this.f6168b).write(dVar, it.next());
                }
                dVar.l();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    dVar.x();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f6168b).get(0);
                synchronized (((ArrayList) this.f6168b)) {
                    str = dateFormat.format(date);
                    break;
                }
                dVar.F(str);
                return;
            default:
                ((x) this.f6168b).f6228c.write(dVar, obj);
                return;
        }
    }

    public C0550b(E7.l lVar, Type type, E7.y yVar, G7.o oVar) {
        this.f6168b = new w(lVar, yVar, type);
        this.f6169c = oVar;
    }

    public C0550b(f fVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f6168b = arrayList;
        Objects.requireNonNull(fVar);
        this.f6169c = fVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (G7.h.f5656a >= 9) {
            arrayList.add(G7.d.h(i10, i11));
        }
    }

    public C0550b(x xVar, Class cls) {
        this.f6168b = xVar;
        this.f6169c = cls;
    }
}
