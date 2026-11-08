package p240w9;

import N8.s;
import V0.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f28056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f28059g;

    public a(String serialName) {
        m.f(serialName, "serialName");
        this.f28053a = serialName;
        this.f28054b = s.f8650a;
        this.f28055c = new ArrayList();
        this.f28056d = new HashSet();
        this.f28057e = new ArrayList();
        this.f28058f = new ArrayList();
        this.f28059g = new ArrayList();
    }

    public final void a(String elementName, g descriptor) {
        s sVar = s.f8650a;
        m.f(elementName, "elementName");
        m.f(descriptor, "descriptor");
        if (!this.f28056d.add(elementName)) {
            StringBuilder sbU = p.u("Element with name '", elementName, "' is already registered in ");
            sbU.append(this.f28053a);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        this.f28055c.add(elementName);
        this.f28057e.add(descriptor);
        this.f28058f.add(sVar);
        this.f28059g.add(Boolean.FALSE);
    }
}
