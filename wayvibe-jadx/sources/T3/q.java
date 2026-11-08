package T3;

import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class q implements S3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewStartUpResultBoundaryInterface f11621a;

    public q(ArrayList arrayList, ArrayList arrayList2, WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.f11621a = webViewStartUpResultBoundaryInterface;
    }

    @Override // S3.h
    public final Long getTotalTimeInUiThreadMillis() {
        return this.f11621a.getTotalTimeInUiThreadMillis();
    }
}
