package X8;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f13269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.m.f(rootDir, "rootDir");
        this.f13271e = hVar;
    }

    @Override // X8.i
    public final File a() {
        boolean z10 = this.f13268b;
        File file = this.f13275a;
        h hVar = this.f13271e;
        if (!z10) {
            hVar.f13274d.getClass();
            this.f13268b = true;
            return file;
        }
        File[] fileArr = this.f13269c;
        if (fileArr != null && this.f13270d >= fileArr.length) {
            hVar.f13274d.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f13269c = fileArrListFiles;
            if (fileArrListFiles == null) {
                hVar.f13274d.getClass();
            }
            File[] fileArr2 = this.f13269c;
            if (fileArr2 == null || fileArr2.length == 0) {
                hVar.f13274d.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f13269c;
        kotlin.jvm.internal.m.c(fileArr3);
        int i10 = this.f13270d;
        this.f13270d = i10 + 1;
        return fileArr3[i10];
    }
}
