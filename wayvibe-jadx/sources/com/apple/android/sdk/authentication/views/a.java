package com.apple.android.sdk.authentication.views;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17682a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f17683b = new ConcurrentHashMap();

    public static Typeface a(Context context, String str) {
        return b.f17684a.b(context, str);
    }

    private Typeface b(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f17683b;
        if (concurrentHashMap == null) {
            return null;
        }
        Typeface typeface = (Typeface) concurrentHashMap.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
        if (typefaceCreateFromAsset != null) {
            this.f17683b.put(str, typefaceCreateFromAsset);
        }
        return typefaceCreateFromAsset;
    }
}
