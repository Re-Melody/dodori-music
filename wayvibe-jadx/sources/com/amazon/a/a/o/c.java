package com.amazon.a.a.o;

import V0.p;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16456a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f16457b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16458c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16459d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16460e;

    public c(String str) {
        this.f16460e = str;
    }

    private String d(String str) {
        return p.r(new StringBuilder(), this.f16460e, ": ", str);
    }

    public void a(String str) {
        if (f16456a) {
            Log.d(f16459d, d(str));
        }
    }

    public void b(String str) {
        if (f16457b) {
            Log.e(f16459d, d(str));
        }
    }

    public void c(String str) {
        if (f16458c) {
            Log.e(f16459d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th) {
        if (f16456a) {
            Log.d(f16459d, d(str), th);
        }
    }

    public void b(String str, Throwable th) {
        if (f16457b) {
            Log.e(f16459d, d(str), th);
        }
    }

    public static void a() {
        f16458c = true;
    }

    public static boolean b() {
        return f16458c;
    }
}
