package p146n3;

import A6.E;
import D7.p1;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import org.apache.tika.utils.XMLReaderUtils;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.location.z;
import org.maplibre.android.maps.x;
import org.maplibre.android.offline.OfflineGeometryRegionDefinition;
import org.maplibre.android.offline.OfflineTilePyramidRegionDefinition;
import p152o.O;
import p156o3.a;
import p156o3.c;
import p156o3.d;
import p166p3.e;
import p166p3.f;
import p166p3.i;
import p166p3.j;
import p235w4.n;
import p255y2.B;
import p255y2.C2335k;
import p255y2.C2336l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22914a;

    public /* synthetic */ b(int i10) {
        this.f22914a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in) {
        switch (this.f22914a) {
            case 0:
                return new c(in);
            case 1:
                return new d(in);
            case 2:
                return new e(in);
            case 3:
                return new f(in);
            case 4:
                return new g(in);
            case 5:
                return new k(in);
            case 6:
                return new l(in);
            case 7:
                return new m(in);
            case 8:
                String string = in.readString();
                string.getClass();
                String string2 = in.readString();
                String[] strArrCreateStringArray = in.createStringArray();
                strArrCreateStringArray.getClass();
                return new n(string, string2, E.s(strArrCreateStringArray));
            case 9:
                return new o(in);
            case 10:
                O o10 = new O(in);
                o10.f23249a = in.readByte() != 0;
                return o10;
            case 11:
                return new a(in);
            case 12:
                ArrayList arrayList = new ArrayList();
                in.readList(arrayList, p156o3.b.class.getClassLoader());
                return new c(arrayList);
            case 13:
                return new p156o3.b(in.readInt(), in.readLong(), in.readLong());
            case 14:
                return new d(in);
            case 15:
                z zVar = new z();
                zVar.f24815a = in.readFloat();
                zVar.f24816b = in.readInt();
                zVar.f24817c = in.readInt();
                zVar.f24818d = in.readString();
                zVar.f24819e = in.readInt();
                zVar.f24820f = in.readString();
                zVar.f24821g = in.readInt();
                zVar.f24822h = in.readString();
                zVar.f24823i = in.readInt();
                zVar.f24824j = in.readString();
                zVar.k = in.readInt();
                zVar.f24825l = in.readString();
                zVar.f24826m = in.readInt();
                zVar.f24827n = in.readString();
                zVar.f24828o = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.f24829p = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.f24830q = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.r = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.f24831s = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.f24832t = in.readFloat();
                zVar.f24833u = in.readByte() != 0;
                zVar.f24834v = in.readLong();
                zVar.f24835w = in.createIntArray();
                zVar.f24836x = in.readFloat();
                zVar.f24837y = in.readFloat();
                zVar.f24838z = in.readByte() != 0;
                zVar.f24801A = in.readFloat();
                zVar.f24802B = in.readFloat();
                zVar.f24803C = (RectF) in.readParcelable(RectF.class.getClassLoader());
                zVar.f24804D = in.readString();
                zVar.f24805E = in.readString();
                zVar.f24806F = in.readFloat();
                zVar.f24807G = in.readByte() != 0;
                zVar.f24808H = in.readByte() != 0;
                zVar.f24809I = (Boolean) in.readValue(Boolean.class.getClassLoader());
                zVar.f24810J = (Boolean) in.readValue(Boolean.class.getClassLoader());
                zVar.f24811K = (Integer) in.readValue(Integer.class.getClassLoader());
                zVar.f24812L = in.readFloat();
                zVar.f24813M = in.readFloat();
                zVar.f24814N = in.readFloat();
                return zVar;
            case 16:
                x xVar = new x();
                xVar.f25047c = true;
                xVar.f25048d = true;
                xVar.f25049e = 8388661;
                xVar.f25052h = true;
                xVar.f25053i = 8388691;
                xVar.k = -1;
                xVar.f25055l = true;
                xVar.f25056m = 8388691;
                xVar.f25058o = 0.0d;
                xVar.f25059p = 25.5d;
                xVar.f25060q = 0.0d;
                xVar.r = 60.0d;
                xVar.f25061s = true;
                xVar.f25062t = true;
                xVar.f25063u = true;
                xVar.f25064v = true;
                xVar.f25065w = true;
                xVar.f25066x = true;
                xVar.f25067y = true;
                xVar.f25068z = true;
                xVar.f25029A = 4;
                xVar.f25030B = false;
                xVar.f25031C = true;
                xVar.f25039K = true;
                xVar.f25040L = false;
                xVar.f25041M = "";
                xVar.f25042N = 1048576L;
                xVar.f25043O = 5L;
                xVar.f25044P = 60;
                xVar.f25045a = (CameraPosition) in.readParcelable(CameraPosition.class.getClassLoader());
                xVar.f25046b = in.readByte() != 0;
                xVar.f25047c = in.readByte() != 0;
                xVar.f25049e = in.readInt();
                xVar.f25050f = in.createIntArray();
                xVar.f25048d = in.readByte() != 0;
                Bitmap bitmap = (Bitmap) in.readParcelable(x.class.getClassLoader());
                if (bitmap != null) {
                    xVar.f25051g = new BitmapDrawable(bitmap);
                }
                xVar.f25052h = in.readByte() != 0;
                xVar.f25053i = in.readInt();
                xVar.f25054j = in.createIntArray();
                xVar.f25055l = in.readByte() != 0;
                xVar.f25056m = in.readInt();
                xVar.f25057n = in.createIntArray();
                xVar.k = in.readInt();
                xVar.f25058o = in.readDouble();
                xVar.f25059p = in.readDouble();
                xVar.f25060q = in.readDouble();
                xVar.r = in.readDouble();
                xVar.f25061s = in.readByte() != 0;
                xVar.f25062t = in.readByte() != 0;
                xVar.f25063u = in.readByte() != 0;
                xVar.f25064v = in.readByte() != 0;
                xVar.f25065w = in.readByte() != 0;
                xVar.f25066x = in.readByte() != 0;
                xVar.f25067y = in.readByte() != 0;
                xVar.f25034F = in.readString();
                xVar.f25035G = in.readByte() != 0;
                xVar.f25036H = in.readByte() != 0;
                xVar.f25068z = in.readByte() != 0;
                xVar.f25029A = in.readInt();
                xVar.f25030B = in.readByte() != 0;
                xVar.f25031C = in.readByte() != 0;
                xVar.f25032D = in.readString();
                xVar.f25033E = in.createStringArray();
                xVar.f25038J = in.readFloat();
                xVar.f25037I = in.readInt();
                xVar.f25039K = in.readByte() != 0;
                xVar.f25040L = in.readByte() != 0;
                xVar.f25041M = in.readString();
                xVar.f25042N = in.readLong();
                xVar.f25043O = in.readLong();
                xVar.f25044P = in.readInt();
                return xVar;
            case 17:
                return new p166p3.a(in);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new e(in);
            case 19:
                return new f();
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new i(in);
            case 21:
                return new j(in.readLong(), in.readLong());
            case 22:
                String string3 = in.readString();
                m.c(string3);
                int i10 = in.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string4 = in.readString();
                    m.c(string4);
                    String string5 = in.readString();
                    m.c(string5);
                    linkedHashMap.put(string4, string5);
                }
                return new p167p4.a(string3, linkedHashMap);
            case 23:
                return new p176q3.a(in);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                m.f(in, "in");
                return new OfflineGeometryRegionDefinition(in);
            case 25:
                m.f(in, "in");
                return new OfflineTilePyramidRegionDefinition(in);
            case 26:
                return new n(in);
            case 27:
                return new C2336l(in);
            case 28:
                return new C2335k(in);
            default:
                return new B(in);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f22914a) {
            case 0:
                return new c[i10];
            case 1:
                return new d[i10];
            case 2:
                return new e[i10];
            case 3:
                return new f[i10];
            case 4:
                return new g[i10];
            case 5:
                return new k[i10];
            case 6:
                return new l[i10];
            case 7:
                return new m[i10];
            case 8:
                return new n[i10];
            case 9:
                return new o[i10];
            case 10:
                return new O[i10];
            case 11:
                return new a[i10];
            case 12:
                return new c[i10];
            case 13:
                return new p156o3.b[i10];
            case 14:
                return new d[i10];
            case 15:
                return new z[i10];
            case 16:
                return new x[i10];
            case 17:
                return new p166p3.a[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new e[i10];
            case 19:
                return new f[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new i[i10];
            case 21:
                return new j[i10];
            case 22:
                return new p167p4.a[i10];
            case 23:
                return new p176q3.a[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new OfflineGeometryRegionDefinition[i10];
            case 25:
                return new OfflineTilePyramidRegionDefinition[i10];
            case 26:
                return new n[i10];
            case 27:
                return new C2336l[i10];
            case 28:
                return new C2335k[i10];
            default:
                return new B[i10];
        }
    }
}
