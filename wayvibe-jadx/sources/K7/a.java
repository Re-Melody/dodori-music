package K7;

import E7.n;
import E7.y;
import H7.C0549a;
import M7.d;
import M7.e;
import V0.p;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0549a f7379c = new C0549a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0549a f7380d = new C0549a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0549a f7381e = new C0549a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7383b;

    public a(int i10) {
        this.f7382a = i10;
        switch (i10) {
            case 1:
                this.f7383b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f7383b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // E7.y
    public final Object read(M7.b bVar) throws e {
        Date date;
        Time time;
        switch (this.f7382a) {
            case 0:
                if (bVar.N() == M7.c.NULL) {
                    bVar.J();
                    return null;
                }
                String strL = bVar.L();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f7383b).parse(strL);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e2) {
                    StringBuilder sbU = p.u("Failed parsing '", strL, "' as SQL Date; at path ");
                    sbU.append(bVar.z());
                    throw new n(sbU.toString(), e2);
                }
            case 1:
                if (bVar.N() == M7.c.NULL) {
                    bVar.J();
                    return null;
                }
                String strL2 = bVar.L();
                try {
                    synchronized (this) {
                        try {
                            time = new Time(((SimpleDateFormat) this.f7383b).parse(strL2).getTime());
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return time;
                } catch (ParseException e4) {
                    StringBuilder sbU2 = p.u("Failed parsing '", strL2, "' as SQL Time; at path ");
                    sbU2.append(bVar.z());
                    throw new n(sbU2.toString(), e4);
                }
            default:
                Date date2 = (Date) ((y) this.f7383b).read(bVar);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // E7.y
    public final void write(d dVar, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f7382a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    dVar.x();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f7383b).format((Date) date);
                    break;
                }
                dVar.F(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    dVar.x();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f7383b).format((Date) time);
                    break;
                }
                dVar.F(str2);
                return;
            default:
                ((y) this.f7383b).write(dVar, (Timestamp) obj);
                return;
        }
    }

    public a(y yVar) {
        this.f7382a = 2;
        this.f7383b = yVar;
    }
}
