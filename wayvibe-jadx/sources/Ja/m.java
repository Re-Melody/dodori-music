package Ja;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SoundPool f6776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6778c;

    public m(SoundPool soundPool) {
        this.f6776a = soundPool;
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.m.e(mapSynchronizedMap, "synchronizedMap(...)");
        this.f6777b = mapSynchronizedMap;
        Map mapSynchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.m.e(mapSynchronizedMap2, "synchronizedMap(...)");
        this.f6778c = mapSynchronizedMap2;
    }
}
