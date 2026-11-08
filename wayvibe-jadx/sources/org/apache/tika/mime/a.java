package org.apache.tika.mime;

import java.net.URL;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24606a;

    public /* synthetic */ a(int i10) {
        this.f24606a = i10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f24606a) {
            case 0:
                MimeTypesFactory.lambda$create$0((URL) obj);
                break;
            case 1:
                ((Process) obj).destroyForcibly();
                break;
            default:
                ((Process) obj).destroyForcibly();
                break;
        }
    }
}
