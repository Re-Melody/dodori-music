package R2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: R2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f10874b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10875a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0793v(D2.k kVar) {
        this(0L);
        Uri uri = kVar.f1865a;
        Map map = Collections.EMPTY_MAP;
    }

    public C0793v(long j10) {
        this.f10875a = j10;
    }
}
