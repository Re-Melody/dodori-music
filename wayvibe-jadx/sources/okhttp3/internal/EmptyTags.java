package okhttp3.internal;

import kotlin.jvm.internal.e;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptyTags extends Tags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EmptyTags f24152a = new EmptyTags();

    private EmptyTags() {
        super(0);
    }

    @Override // okhttp3.internal.Tags
    public final Tags a(e eVar, Object obj) {
        return obj != null ? new LinkedTags(eVar, obj, this) : this;
    }

    public final String toString() {
        return "{}";
    }
}
