package U7;

import B8.f0;
import U.W0;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.util.Log;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.ryanheise.audioservice.AudioService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p045d8.AbstractActivityC1932d;
import p152o.h1;
import p161o8.s;
import p199t.C2230e;

/* JADX INFO: loaded from: classes2.dex */
public class n implements p118k8.b, p130l8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static l f12313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static B9.d f12314i;
    public static p150n8.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f12316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static android.support.v4.media.e f12317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static W0 f12318n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p118k8.a f12321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p130l8.b f12322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f12323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f12324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f12325f = new h(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashSet f12312g = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f12315j = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f12319o = new g();

    public static HashMap a(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompatA = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat mediaDescriptionCompatG = mediaMetadataCompat.g();
        HashMap map = new HashMap();
        map.put(DiagnosticsEntry.ID_KEY, mediaDescriptionCompatG.f14315a);
        map.put(com.amazon.a.a.o.b.f16393S, m(mediaMetadataCompat, "android.media.metadata.TITLE"));
        map.put("album", m(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = mediaDescriptionCompatG.f14320f;
        if (uri != null) {
            map.put("artUri", uri.toString());
        }
        map.put("artist", m(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        map.put("genre", m(mediaMetadataCompat, "android.media.metadata.GENRE"));
        Bundle bundle = mediaMetadataCompat.f14328a;
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            map.put("duration", Long.valueOf(bundle.getLong("android.media.metadata.DURATION", 0L)));
        }
        map.put("playable", Boolean.valueOf(bundle.getLong("playable_long", 0L) != 0));
        map.put("displayTitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        map.put("displaySubtitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        map.put("displayDescription", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (bundle.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompatA = RatingCompat.a(bundle.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e2) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            }
            map.put("rating", n(ratingCompatA));
        }
        HashMap mapE = e(new Bundle(bundle));
        if (mapE.size() > 0) {
            map.put("extras", mapE);
        }
        return map;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new MediaSessionCompat$QueueItem(null, d(g(map).g(), (Map) map.get("extras")), i10));
            i10++;
        }
        return arrayList;
    }

    public static MediaBrowserCompat$MediaItem c(Map map) {
        return new MediaBrowserCompat$MediaItem(d(g(map).g(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static MediaDescriptionCompat d(MediaDescriptionCompat mediaDescriptionCompat, Map map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = mediaDescriptionCompat.f14321g;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(l(map));
        return new MediaDescriptionCompat(mediaDescriptionCompat.f14315a, mediaDescriptionCompat.f14316b, mediaDescriptionCompat.f14317c, mediaDescriptionCompat.f14318d, mediaDescriptionCompat.f14319e, mediaDescriptionCompat.f14320f, bundle, mediaDescriptionCompat.f14322h);
    }

    public static HashMap e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                map.put(str, serializable);
            }
        }
        return map;
    }

    public static MediaMetadataCompat g(Map map) {
        RatingCompat ratingCompat;
        float f10;
        Parcelable parcelable;
        AudioService audioService = AudioService.f18926x;
        String str = (String) map.get(DiagnosticsEntry.ID_KEY);
        String str2 = (String) map.get(com.amazon.a.a.o.b.f16393S);
        String str3 = (String) map.get("album");
        String str4 = (String) map.get("artist");
        String str5 = (String) map.get("genre");
        Long lJ = j(map.get("duration"));
        String str6 = (String) map.get("artUri");
        Boolean bool = (Boolean) map.get("playable");
        String str7 = (String) map.get("displayTitle");
        String str8 = (String) map.get("displaySubtitle");
        String str9 = (String) map.get("displayDescription");
        Map map2 = (Map) map.get("rating");
        if (map2 == null) {
            ratingCompat = null;
            f10 = -1.0f;
        } else {
            Integer num = (Integer) map2.get("type");
            Object obj = map2.get("value");
            if (obj == null) {
                int iIntValue = num.intValue();
                switch (iIntValue) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        f10 = -1.0f;
                        ratingCompat = new RatingCompat(iIntValue, -1.0f);
                        break;
                }
            } else {
                switch (num.intValue()) {
                    case 1:
                        ratingCompat = new RatingCompat(1, ((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, ((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = RatingCompat.c(((Integer) obj).intValue(), num.intValue());
                        break;
                    case 6:
                        ratingCompat = RatingCompat.b(((Double) obj).floatValue());
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        switch (iIntValue2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(iIntValue2, -1.0f);
                                break;
                        }
                        break;
                }
                f10 = -1.0f;
            }
            ratingCompat = null;
            f10 = -1.0f;
        }
        Map map3 = (Map) map.get("extras");
        audioService.getClass();
        Y5.h hVar = new Y5.h(6);
        hVar.q("android.media.metadata.MEDIA_ID", str);
        hVar.q("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            hVar.q("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            hVar.q("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            hVar.q("android.media.metadata.GENRE", str5);
        }
        if (lJ != null) {
            hVar.p(lJ.longValue(), "android.media.metadata.DURATION");
        }
        if (str6 != null) {
            hVar.q("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            hVar.p(bool.booleanValue() ? 1L : 0L, "playable_long");
        }
        if (str7 != null) {
            hVar.q("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            hVar.q("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            hVar.q("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        Bundle bundle = (Bundle) hVar.f13385b;
        if (ratingCompat != null) {
            C2230e c2230e = MediaMetadataCompat.f14324d;
            if (c2230e.containsKey("android.media.metadata.RATING") && ((Integer) c2230e.get("android.media.metadata.RATING")).intValue() != 3) {
                throw new IllegalArgumentException("The android.media.metadata.RATING key cannot be used to put a Rating");
            }
            if (ratingCompat.f14333c == null) {
                float f11 = ratingCompat.f14332b;
                boolean z10 = f11 >= 0.0f;
                int i10 = ratingCompat.f14331a;
                if (z10) {
                    switch (i10) {
                        case 1:
                            ratingCompat.f14333c = android.support.v4.media.h.g(i10 == 1 && f11 == 1.0f);
                            break;
                        case 2:
                            ratingCompat.f14333c = android.support.v4.media.h.j(i10 == 2 && f11 == 1.0f);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            if ((i10 == 3 || i10 == 4 || i10 == 5) && f11 >= 0.0f) {
                                f10 = f11;
                            }
                            ratingCompat.f14333c = android.support.v4.media.h.i(i10, f10);
                            break;
                        case 6:
                            if (i10 == 6 && f11 >= 0.0f) {
                                f10 = f11;
                            }
                            ratingCompat.f14333c = android.support.v4.media.h.h(f10);
                            break;
                        default:
                            parcelable = null;
                            break;
                    }
                } else {
                    ratingCompat.f14333c = android.support.v4.media.h.k(i10);
                }
                parcelable = ratingCompat.f14333c;
            } else {
                parcelable = ratingCompat.f14333c;
            }
            bundle.putParcelable("android.media.metadata.RATING", parcelable);
        }
        if (map3 != null) {
            for (String str10 : map3.keySet()) {
                Object obj2 = map3.get(str10);
                if (obj2 instanceof Long) {
                    hVar.p(((Long) obj2).longValue(), str10);
                } else if (obj2 instanceof Integer) {
                    hVar.p(((Integer) obj2).intValue(), str10);
                } else if (obj2 instanceof String) {
                    hVar.q(str10, (String) obj2);
                } else if (obj2 instanceof Boolean) {
                    hVar.p(((Boolean) obj2).booleanValue() ? 1L : 0L, str10);
                } else if (obj2 instanceof Double) {
                    hVar.q(str10, obj2.toString());
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        AudioService.f18925B.put(str, mediaMetadataCompat);
        return mediaMetadataCompat;
    }

    public static void h() {
        l lVar = f12313h;
        AbstractActivityC1932d abstractActivityC1932d = lVar != null ? lVar.f12305b : null;
        if (abstractActivityC1932d != null) {
            abstractActivityC1932d.setIntent(new Intent("android.intent.action.MAIN"));
        }
        W0 w10 = f12318n;
        if (w10 != null) {
            g gVar = f12319o;
            if (gVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (((Set) w10.f11834d).remove(gVar)) {
                try {
                    ((android.support.v4.media.session.h) w10.f11833c).b(gVar);
                    gVar.b(null);
                } catch (Throwable th) {
                    gVar.b(null);
                    throw th;
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            f12318n = null;
        }
        android.support.v4.media.e eVar = f12317m;
        if (eVar != null) {
            eVar.a();
            f12317m = null;
        }
    }

    public static synchronized p052e8.b i(ContextWrapper contextWrapper) {
        p052e8.b bVar;
        String strD;
        Uri data;
        try {
            bVar = (p052e8.b) ((HashMap) Y7.e.m().f13395b).get("audio_service_engine");
            if (bVar == null) {
                bVar = new p052e8.b(contextWrapper.getApplicationContext(), null, new io.flutter.plugin.platform.q());
                if (contextWrapper instanceof AbstractActivityC1932d) {
                    AbstractActivityC1932d abstractActivityC1932d = (AbstractActivityC1932d) contextWrapper;
                    strD = abstractActivityC1932d.d();
                    if (strD == null && abstractActivityC1932d.h() && (data = abstractActivityC1932d.getIntent().getData()) != null) {
                        strD = data.getPath();
                        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                            strD = strD + "?" + data.getQuery();
                        }
                    }
                } else {
                    strD = null;
                }
                if (strD == null) {
                    strD = "/";
                }
                ((s) bVar.f19636i.f13385b).a("setInitialRoute", strD, null);
                p063f8.b bVar2 = bVar.f19630c;
                p096i8.d dVar = (p096i8.d) W0.p().f11833c;
                if (!dVar.f20557b) {
                    throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
                }
                bVar2.e(new p063f8.a((String) ((f0) dVar.f20559d).f801b, "main"), null);
                Y7.e.m().x("audio_service_engine", bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bVar;
    }

    public static Long j(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static HashMap k(Object... objArr) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            map.put((String) objArr[i10], objArr[i10 + 1]);
        }
        return map;
    }

    public static Bundle l(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    public static String m(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence charSequence = mediaMetadataCompat.f14328a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public static HashMap n(RatingCompat ratingCompat) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(ratingCompat.f14331a));
        float f10 = ratingCompat.f14332b;
        boolean z10 = false;
        if (!(f10 >= 0.0f)) {
            map.put("value", null);
            return map;
        }
        int i10 = ratingCompat.f14331a;
        switch (i10) {
            case 0:
                map.put("value", null);
                break;
            case 1:
                if (i10 == 1 && f10 == 1.0f) {
                    z10 = true;
                }
                map.put("value", Boolean.valueOf(z10));
                break;
            case 2:
                if (i10 == 2 && f10 == 1.0f) {
                    z10 = true;
                }
                map.put("value", Boolean.valueOf(z10));
                break;
            case 3:
            case 4:
            case 5:
                if ((i10 != 3 && i10 != 4 && i10 != 5) || f10 < 0.0f) {
                    f10 = -1.0f;
                }
                map.put("value", Float.valueOf(f10));
                break;
            case 6:
                if (i10 != 6 || f10 < 0.0f) {
                    f10 = -1.0f;
                }
                map.put("value", Float.valueOf(f10));
                break;
        }
        return map;
    }

    public final void f() {
        if (f12317m == null) {
            android.support.v4.media.e eVar = new android.support.v4.media.e(this.f12320a, new ComponentName(this.f12320a, (Class<?>) AudioService.class), this.f12325f);
            f12317m = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f14346a.f14338b.connect();
        }
    }

    public final void o() {
        AbstractActivityC1932d abstractActivityC1932d = this.f12324e.f12305b;
        if (f12314i == null || abstractActivityC1932d.getIntent().getAction() == null) {
            return;
        }
        f12314i.p("onNotificationClicked", k("clicked", Boolean.valueOf(abstractActivityC1932d.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
    }

    @Override // p130l8.a
    public final void onAttachedToActivity(p130l8.b bVar) {
        this.f12322c = bVar;
        l lVar = this.f12324e;
        AbstractActivityC1932d abstractActivityC1932d = (AbstractActivityC1932d) ((h1) bVar).f23356a;
        lVar.f12305b = abstractActivityC1932d;
        lVar.f12304a = abstractActivityC1932d;
        p052e8.b bVarI = i(abstractActivityC1932d);
        l lVar2 = this.f12324e;
        lVar2.f12307d = this.f12321b.f21665c != bVarI.f19630c;
        f12313h = lVar2;
        p130l8.b bVar2 = this.f12322c;
        f fVar = new f(this);
        this.f12323d = fVar;
        ((HashSet) ((h1) bVar2).f23360e).add(fVar);
        W0 w10 = f12318n;
        if (w10 != null) {
            W0.C(f12313h.f12305b, w10);
        }
        if (f12317m == null) {
            f();
        }
        AbstractActivityC1932d abstractActivityC1932d2 = f12313h.f12305b;
        if ((this.f12324e.f12305b.getIntent().getFlags() & 1048576) == 1048576) {
            abstractActivityC1932d2.setIntent(new Intent("android.intent.action.MAIN"));
        }
        o();
    }

    @Override // p118k8.b
    public final void onAttachedToEngine(p118k8.a aVar) {
        this.f12321b = aVar;
        l lVar = new l(aVar.f21665c);
        this.f12324e = lVar;
        lVar.f12304a = this.f12321b.f21663a;
        f12312g.add(lVar);
        if (this.f12320a == null) {
            this.f12320a = this.f12321b.f21663a;
        }
        if (f12314i == null) {
            B9.d dVar = new B9.d(this.f12321b.f21665c);
            f12314i = dVar;
            AudioService.f18928z = dVar;
        }
        if (f12317m == null) {
            f();
        }
    }

    @Override // p130l8.a
    public final void onDetachedFromActivity() {
        p130l8.b bVar = this.f12322c;
        ((HashSet) ((h1) bVar).f23360e).remove(this.f12323d);
        this.f12322c = null;
        this.f12323d = null;
        l lVar = this.f12324e;
        lVar.f12305b = null;
        lVar.f12304a = this.f12321b.f21663a;
        if (f12312g.size() == 1) {
            h();
        }
        if (this.f12324e == f12313h) {
            f12313h = null;
        }
    }

    @Override // p130l8.a
    public final void onDetachedFromActivityForConfigChanges() {
        p130l8.b bVar = this.f12322c;
        ((HashSet) ((h1) bVar).f23360e).remove(this.f12323d);
        this.f12322c = null;
        l lVar = this.f12324e;
        lVar.f12305b = null;
        lVar.f12304a = this.f12321b.f21663a;
    }

    @Override // p118k8.b
    public final void onDetachedFromEngine(p118k8.a aVar) {
        HashSet hashSet = f12312g;
        if (hashSet.size() == 1) {
            h();
        }
        hashSet.remove(this.f12324e);
        this.f12324e.f12304a = null;
        this.f12324e = null;
        this.f12320a = null;
        B9.d dVar = f12314i;
        if (dVar != null && ((p161o8.f) dVar.f902b) == this.f12321b.f21665c) {
            System.out.println("### destroying audio handler interface");
            AudioTrack audioTrack = (AudioTrack) f12314i.f904d;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f12314i = null;
        }
        this.f12321b = null;
    }

    @Override // p130l8.a
    public final void onReattachedToActivityForConfigChanges(p130l8.b bVar) {
        this.f12322c = bVar;
        l lVar = this.f12324e;
        AbstractActivityC1932d abstractActivityC1932d = (AbstractActivityC1932d) ((h1) bVar).f23356a;
        lVar.f12305b = abstractActivityC1932d;
        lVar.f12304a = abstractActivityC1932d;
        f fVar = new f(this);
        this.f12323d = fVar;
        ((HashSet) ((h1) bVar).f23360e).add(fVar);
    }
}
