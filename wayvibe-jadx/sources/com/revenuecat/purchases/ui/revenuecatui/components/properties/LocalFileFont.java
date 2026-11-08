package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import T0.AbstractC0800c;
import T0.C;
import T0.E;
import T0.I;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.slf4j.helpers.i;

/* JADX INFO: loaded from: classes2.dex */
final class LocalFileFont extends AbstractC0800c {
    private final File file;
    private final FileTypefaceLoader fileTypefaceLoader;
    private final int style;
    private final I weight;

    public /* synthetic */ LocalFileFont(File file, I i10, int i11, FileTypefaceLoader fileTypefaceLoader, f fVar) {
        this(file, i10, i11, fileTypefaceLoader);
    }

    public final File getFile() {
        return this.file;
    }

    public final FileTypefaceLoader getFileTypefaceLoader() {
        return this.fileTypefaceLoader;
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo9getStyle_LCdwA() {
        return this.style;
    }

    @Override // T0.InterfaceC0816t
    public I getWeight() {
        return this.weight;
    }

    public String toString() {
        return "LocalFileFont(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) C.a(mo9getStyle_LCdwA())) + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private LocalFileFont(File file, I weight, int i10, FileTypefaceLoader fileTypefaceLoader) {
        super(0, LocalFileFontTypefaceLoader.INSTANCE, i.f(weight, i10, new E[0]));
        m.f(file, "file");
        m.f(weight, "weight");
        m.f(fileTypefaceLoader, "fileTypefaceLoader");
        this.file = file;
        this.weight = weight;
        this.style = i10;
        this.fileTypefaceLoader = fileTypefaceLoader;
    }
}
