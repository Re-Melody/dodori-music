package X8;

import B8.V;
import N8.AbstractC0645b;
import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC0645b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f13273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f13274d;

    public h(j jVar) {
        this.f13274d = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13273c = arrayDeque;
        if (((File) jVar.f13277b).isDirectory()) {
            arrayDeque.push(b((File) jVar.f13277b));
        } else {
            if (!((File) jVar.f13277b).isFile()) {
                this.f8635a = 2;
                return;
            }
            File rootFile = (File) jVar.f13277b;
            kotlin.jvm.internal.m.f(rootFile, "rootFile");
            arrayDeque.push(new e(rootFile));
        }
    }

    @Override // N8.AbstractC0645b
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f13273c;
            i iVar = (i) arrayDeque.peek();
            if (iVar != null) {
                File fileA = iVar.a();
                if (fileA != null) {
                    if (!fileA.equals(iVar.f13275a) && fileA.isDirectory()) {
                        int size = arrayDeque.size();
                        this.f13274d.getClass();
                        if (size < Integer.MAX_VALUE) {
                            arrayDeque.push(b(fileA));
                        }
                    }
                    file = fileA;
                    break;
                }
                arrayDeque.pop();
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            this.f8635a = 2;
        } else {
            this.f8636b = file;
            this.f8635a = 1;
        }
    }

    public final c b(File file) {
        int i10 = g.f13272a[((k) this.f13274d.f13278c).ordinal()];
        if (i10 == 1) {
            return new f(this, file);
        }
        if (i10 == 2) {
            return new d(this, file);
        }
        throw new V();
    }
}
