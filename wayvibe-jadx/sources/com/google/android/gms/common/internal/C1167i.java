package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f18038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f18039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p022b6.a f18042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f18043g;

    public C1167i(String str, String str2, Set set) {
        p022b6.a aVar = p022b6.a.f15769a;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f18037a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f18039c = map;
        this.f18040d = str;
        this.f18041e = str2;
        this.f18042f = aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw V0.p.g(it);
        }
        this.f18038b = Collections.unmodifiableSet(hashSet);
    }
}
