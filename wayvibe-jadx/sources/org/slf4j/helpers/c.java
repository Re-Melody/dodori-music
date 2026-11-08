package org.slf4j.helpers;

import D8.W;
import java.util.concurrent.ConcurrentHashMap;
import p098j.u;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ea.a f25123b;

    public c(int i10) {
        this.f25122a = i10;
        switch (i10) {
            case 1:
                this.f25123b = new W();
                new ConcurrentHashMap();
                new ThreadLocal();
                new a();
                break;
            default:
                this.f25123b = new u();
                new ConcurrentHashMap();
                break;
        }
    }
}
