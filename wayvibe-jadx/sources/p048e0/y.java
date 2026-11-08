package p048e0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;
import p013a9.d;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Map.Entry, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f19555c;

    public y(z zVar) {
        this.f19555c = zVar;
        Map.Entry entry = zVar.f19559d;
        m.c(entry);
        this.f19553a = entry.getKey();
        Map.Entry entry2 = zVar.f19559d;
        m.c(entry2);
        this.f19554b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19553a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19554b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        z zVar = this.f19555c;
        if (zVar.f19556a.a().f19528d != zVar.f19558c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f19554b;
        zVar.f19556a.put(this.f19553a, obj);
        this.f19554b = obj;
        return obj2;
    }
}
