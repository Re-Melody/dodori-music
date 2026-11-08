package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import P0.f;
import T0.AbstractC0800c;
import T0.I;
import Z2.l;
import android.graphics.Typeface;
import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LocalFileFontKt {
    private static final FileTypefaceLoader DefaultFileTypefaceLoader = new l(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface DefaultFileTypefaceLoader$lambda$0(File file) {
        m.f(file, "file");
        return Build.VERSION.SDK_INT >= 26 ? f.f(file).build() : Typeface.createFromFile(file);
    }

    /* JADX INFO: renamed from: localFileFont-Ej4NQ78, reason: not valid java name */
    public static final /* synthetic */ AbstractC0800c m435localFileFontEj4NQ78(File file, I weight, int i10, FileTypefaceLoader fileTypefaceLoader) {
        m.f(file, "file");
        m.f(weight, "weight");
        m.f(fileTypefaceLoader, "fileTypefaceLoader");
        return new LocalFileFont(file, weight, i10, fileTypefaceLoader, null);
    }

    /* JADX INFO: renamed from: localFileFont-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ AbstractC0800c m436localFileFontEj4NQ78$default(File file, I i10, int i11, FileTypefaceLoader fileTypefaceLoader, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            fileTypefaceLoader = DefaultFileTypefaceLoader;
        }
        return m435localFileFontEj4NQ78(file, i10, i11, fileTypefaceLoader);
    }
}
