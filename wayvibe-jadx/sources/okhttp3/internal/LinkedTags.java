package okhttp3.internal;

import N8.n;
import Z8.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import p085h9.j;

/* JADX INFO: loaded from: classes2.dex */
final class LinkedTags<K> extends Tags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tags f24155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(e key, Object value, Tags next) {
        super(0);
        m.f(key, "key");
        m.f(value, "value");
        m.f(next, "next");
        this.f24153a = key;
        this.f24154b = value;
        this.f24155c = next;
    }

    @Override // okhttp3.internal.Tags
    public final Tags a(e eVar, Object obj) {
        e eVar2 = this.f24153a;
        boolean zEquals = eVar.equals(eVar2);
        Tags linkedTags = this.f24155c;
        if (!zEquals) {
            Tags tagsA = linkedTags.a(eVar, null);
            linkedTags = tagsA == linkedTags ? this : new LinkedTags(eVar2, this.f24154b, tagsA);
        }
        return obj != null ? new LinkedTags(eVar, obj, linkedTags) : linkedTags;
    }

    public final String toString() {
        final int i10 = 0;
        final int i11 = 1;
        return n.H0(n.O0(j.v0(j.r0(new c() { // from class: okhttp3.internal.a
            @Override // Z8.c
            public final Object invoke(Object obj) {
                LinkedTags it = (LinkedTags) obj;
                switch (i10) {
                    case 0:
                        m.f(it, "it");
                        Tags tags = it.f24155c;
                        if (tags instanceof LinkedTags) {
                            return (LinkedTags) tags;
                        }
                        return null;
                    default:
                        m.f(it, "it");
                        StringBuilder sb = new StringBuilder();
                        sb.append(it.f24153a);
                        sb.append('=');
                        sb.append(it.f24154b);
                        return sb.toString();
                }
            }
        }, this))), null, "{", "}", new c() { // from class: okhttp3.internal.a
            @Override // Z8.c
            public final Object invoke(Object obj) {
                LinkedTags it = (LinkedTags) obj;
                switch (i11) {
                    case 0:
                        m.f(it, "it");
                        Tags tags = it.f24155c;
                        if (tags instanceof LinkedTags) {
                            return (LinkedTags) tags;
                        }
                        return null;
                    default:
                        m.f(it, "it");
                        StringBuilder sb = new StringBuilder();
                        sb.append(it.f24153a);
                        sb.append('=');
                        sb.append(it.f24154b);
                        return sb.toString();
                }
            }
        }, 25);
    }
}
