package X8;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f13263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.m.f(rootDir, "rootDir");
        this.f13266f = hVar;
    }

    @Override // X8.i
    public final File a() {
        boolean z10 = this.f13265e;
        File file = this.f13275a;
        h hVar = this.f13266f;
        if (!z10 && this.f13263c == null) {
            hVar.f13274d.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f13263c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f13274d.getClass();
                this.f13265e = true;
            }
        }
        File[] fileArr = this.f13263c;
        if (fileArr != null && this.f13264d < fileArr.length) {
            kotlin.jvm.internal.m.c(fileArr);
            int i10 = this.f13264d;
            this.f13264d = i10 + 1;
            return fileArr[i10];
        }
        if (this.f13262b) {
            hVar.f13274d.getClass();
            return null;
        }
        this.f13262b = true;
        return file;
    }
}
