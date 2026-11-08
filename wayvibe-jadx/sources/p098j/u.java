package p098j;

import A6.E;
import Ea.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.apple.android.music.playback.reporting.d;
import io.flutter.plugins.firebase.firestore.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import org.maplibre.android.style.layers.SymbolLayer;
import za.b;
import za.c;
import za.g;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC1989b, a, p225v5.a {
    public static byte[] d(E e2, long j10) {
        s sVar = new s(24);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e2.size());
        Iterator<E> it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) sVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(d.f17633a, j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static SymbolLayer e(String str) {
        SymbolLayer symbolLayer = new SymbolLayer(str, "mapbox-location-source");
        Boolean bool = Boolean.TRUE;
        symbolLayer.f(new Aa.a("icon-allow-overlap", bool), new Aa.a("icon-ignore-placement", bool), new Aa.a("icon-rotation-alignment", "map"), new Aa.a("icon-rotate", g.e(new b(str), new b(Float.valueOf(0.0f)), g.f("mapbox-location-foreground-layer", g.b("mapbox-property-gps-bearing")), g.f("mapbox-location-background-layer", g.b("mapbox-property-gps-bearing")), g.f("mapbox-location-shadow-layer", g.b("mapbox-property-gps-bearing")), g.f("mapbox-location-bearing-layer", g.b("mapbox-property-compass-bearing")))), new Aa.a("icon-image", g.e(new b(str), new b(""), g.f("mapbox-location-foreground-layer", new g("case", g.b("mapbox-property-location-stale"), g.b("mapbox-property-foreground-stale-icon"), g.b("mapbox-property-foreground-icon"))), g.f("mapbox-location-background-layer", new g("case", g.b("mapbox-property-location-stale"), g.b("mapbox-property-background-stale-icon"), g.b("mapbox-property-background-icon"))), g.f("mapbox-location-shadow-layer", new b("mapbox-location-shadow-icon")), g.f("mapbox-location-bearing-layer", g.b("mapbox-property-shadow-icon")))), new Aa.a("icon-offset", g.e(new b(str), new g("literal", new c(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f)})), g.f(new b("mapbox-location-foreground-layer"), g.b("mapbox-property-foreground-icon-offset")), g.f(new b("mapbox-location-shadow-layer"), g.b("mapbox-property-shadow-icon-offset")))));
        return symbolLayer;
    }

    @Override // Ea.a
    public Ea.b a(String str) {
        return org.slf4j.helpers.b.f25121a;
    }

    public String b(List list) throws IOException {
        m.f(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        m.e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // p225v5.a
    public long c() {
        return System.currentTimeMillis();
    }
}
