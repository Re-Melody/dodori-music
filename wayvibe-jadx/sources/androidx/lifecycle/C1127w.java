package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1127w extends AbstractC1121p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15567a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p172q.a f15568b = new p172q.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC1120o f15569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f15570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p151n9.U f15575i;

    public C1127w(InterfaceC1125u interfaceC1125u) {
        EnumC1120o enumC1120o = EnumC1120o.INITIALIZED;
        this.f15569c = enumC1120o;
        this.f15574h = new ArrayList();
        this.f15570d = new WeakReference(interfaceC1125u);
        this.f15575i = p151n9.J.b(enumC1120o);
    }

    public final EnumC1120o a(InterfaceC1124t interfaceC1124t) {
        C1126v c1126v;
        HashMap map = this.f15568b.f25363e;
        p172q.c cVar = map.containsKey(interfaceC1124t) ? ((p172q.c) map.get(interfaceC1124t)).f25370d : null;
        EnumC1120o enumC1120o = (cVar == null || (c1126v = (C1126v) cVar.f25368b) == null) ? null : c1126v.f15565a;
        ArrayList arrayList = this.f15574h;
        EnumC1120o enumC1120o2 = arrayList.isEmpty() ? null : (EnumC1120o) p134m1.b.i(1, arrayList);
        EnumC1120o state1 = this.f15569c;
        kotlin.jvm.internal.m.f(state1, "state1");
        if (enumC1120o == null || enumC1120o.compareTo(state1) >= 0) {
            enumC1120o = state1;
        }
        return (enumC1120o2 == null || enumC1120o2.compareTo(enumC1120o) >= 0) ? enumC1120o : enumC1120o2;
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final void addObserver(InterfaceC1124t observer) {
        InterfaceC1123s c1111f;
        InterfaceC1125u interfaceC1125u;
        ArrayList arrayList = this.f15574h;
        Object obj = null;
        int i10 = 1;
        kotlin.jvm.internal.m.f(observer, "observer");
        b("addObserver");
        EnumC1120o enumC1120o = this.f15569c;
        EnumC1120o initialState = EnumC1120o.DESTROYED;
        if (enumC1120o != initialState) {
            initialState = EnumC1120o.INITIALIZED;
        }
        kotlin.jvm.internal.m.f(initialState, "initialState");
        C1126v c1126v = new C1126v();
        HashMap map = AbstractC1128x.f15576a;
        boolean z10 = observer instanceof InterfaceC1123s;
        boolean z11 = observer instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            c1111f = new C1111f((DefaultLifecycleObserver) observer, (InterfaceC1123s) observer);
        } else if (z11) {
            c1111f = new C1111f((DefaultLifecycleObserver) observer, (InterfaceC1123s) null);
        } else if (z10) {
            c1111f = (InterfaceC1123s) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC1128x.b(cls) == 2) {
                Object obj2 = AbstractC1128x.f15577b.get(cls);
                kotlin.jvm.internal.m.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC1128x.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1113h[] interfaceC1113hArr = new InterfaceC1113h[size];
                if (size > 0) {
                    AbstractC1128x.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1111f = new M3.b(interfaceC1113hArr, i10);
            } else {
                c1111f = new C1111f(observer);
            }
        }
        c1126v.f15566b = c1111f;
        c1126v.f15565a = initialState;
        p172q.a aVar = this.f15568b;
        p172q.c cVarA = aVar.a(observer);
        if (cVarA != null) {
            obj = cVarA.f25368b;
        } else {
            HashMap map2 = aVar.f25363e;
            p172q.c cVar = new p172q.c(observer, c1126v);
            aVar.f25377d++;
            p172q.c cVar2 = aVar.f25375b;
            if (cVar2 == null) {
                aVar.f25374a = cVar;
                aVar.f25375b = cVar;
            } else {
                cVar2.f25369c = cVar;
                cVar.f25370d = cVar2;
                aVar.f25375b = cVar;
            }
            map2.put(observer, cVar);
        }
        if (((C1126v) obj) == null && (interfaceC1125u = (InterfaceC1125u) this.f15570d.get()) != null) {
            boolean z12 = this.f15571e != 0 || this.f15572f;
            EnumC1120o enumC1120oA = a(observer);
            this.f15571e++;
            while (c1126v.f15565a.compareTo(enumC1120oA) < 0 && this.f15568b.f25363e.containsKey(observer)) {
                arrayList.add(c1126v.f15565a);
                C1117l c1117l = EnumC1119n.Companion;
                EnumC1120o enumC1120o2 = c1126v.f15565a;
                c1117l.getClass();
                EnumC1119n enumC1119nB = C1117l.b(enumC1120o2);
                if (enumC1119nB == null) {
                    throw new IllegalStateException("no event up from " + c1126v.f15565a);
                }
                c1126v.a(interfaceC1125u, enumC1119nB);
                arrayList.remove(arrayList.size() - 1);
                enumC1120oA = a(observer);
            }
            if (!z12) {
                f();
            }
            this.f15571e--;
        }
    }

    public final void b(String str) {
        if (this.f15567a) {
            p162p.a.e0().f25138b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(V0.p.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void c(EnumC1119n event) {
        kotlin.jvm.internal.m.f(event, "event");
        b("handleLifecycleEvent");
        d(event.f());
    }

    public final void d(EnumC1120o enumC1120o) {
        EnumC1120o enumC1120o2 = this.f15569c;
        if (enumC1120o2 == enumC1120o) {
            return;
        }
        if (enumC1120o2 == EnumC1120o.INITIALIZED && enumC1120o == EnumC1120o.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC1120o + ", but was " + this.f15569c + " in component " + this.f15570d.get()).toString());
        }
        this.f15569c = enumC1120o;
        if (this.f15572f || this.f15571e != 0) {
            this.f15573g = true;
            return;
        }
        this.f15572f = true;
        f();
        this.f15572f = false;
        if (this.f15569c == EnumC1120o.DESTROYED) {
            this.f15568b = new p172q.a();
        }
    }

    public final void e(EnumC1120o state) {
        kotlin.jvm.internal.m.f(state, "state");
        b("setCurrentState");
        d(state);
    }

    public final void f() {
        InterfaceC1125u interfaceC1125u = (InterfaceC1125u) this.f15570d.get();
        if (interfaceC1125u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p172q.a aVar = this.f15568b;
            if (aVar.f25377d != 0) {
                p172q.c cVar = aVar.f25374a;
                kotlin.jvm.internal.m.c(cVar);
                EnumC1120o enumC1120o = ((C1126v) cVar.f25368b).f15565a;
                p172q.c cVar2 = this.f15568b.f25375b;
                kotlin.jvm.internal.m.c(cVar2);
                EnumC1120o enumC1120o2 = ((C1126v) cVar2.f25368b).f15565a;
                if (enumC1120o == enumC1120o2 && this.f15569c == enumC1120o2) {
                    break;
                }
                this.f15573g = false;
                EnumC1120o enumC1120o3 = this.f15569c;
                p172q.c cVar3 = this.f15568b.f25374a;
                kotlin.jvm.internal.m.c(cVar3);
                if (enumC1120o3.compareTo(((C1126v) cVar3.f25368b).f15565a) < 0) {
                    p172q.a aVar2 = this.f15568b;
                    p172q.b bVar = new p172q.b(aVar2.f25375b, aVar2.f25374a, 1);
                    aVar2.f25376c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f15573g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.m.e(entry, "next()");
                        InterfaceC1124t interfaceC1124t = (InterfaceC1124t) entry.getKey();
                        C1126v c1126v = (C1126v) entry.getValue();
                        while (c1126v.f15565a.compareTo(this.f15569c) > 0 && !this.f15573g && this.f15568b.f25363e.containsKey(interfaceC1124t)) {
                            C1117l c1117l = EnumC1119n.Companion;
                            EnumC1120o enumC1120o4 = c1126v.f15565a;
                            c1117l.getClass();
                            EnumC1119n enumC1119nA = C1117l.a(enumC1120o4);
                            if (enumC1119nA == null) {
                                throw new IllegalStateException("no event down from " + c1126v.f15565a);
                            }
                            this.f15574h.add(enumC1119nA.f());
                            c1126v.a(interfaceC1125u, enumC1119nA);
                            ArrayList arrayList = this.f15574h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p172q.c cVar4 = this.f15568b.f25375b;
                if (!this.f15573g && cVar4 != null && this.f15569c.compareTo(((C1126v) cVar4.f25368b).f15565a) > 0) {
                    p172q.a aVar3 = this.f15568b;
                    aVar3.getClass();
                    p172q.d dVar = new p172q.d(aVar3);
                    aVar3.f25376c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f15573g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC1124t interfaceC1124t2 = (InterfaceC1124t) entry2.getKey();
                        C1126v c1126v2 = (C1126v) entry2.getValue();
                        while (c1126v2.f15565a.compareTo(this.f15569c) < 0 && !this.f15573g && this.f15568b.f25363e.containsKey(interfaceC1124t2)) {
                            this.f15574h.add(c1126v2.f15565a);
                            C1117l c1117l2 = EnumC1119n.Companion;
                            EnumC1120o enumC1120o5 = c1126v2.f15565a;
                            c1117l2.getClass();
                            EnumC1119n enumC1119nB = C1117l.b(enumC1120o5);
                            if (enumC1119nB == null) {
                                throw new IllegalStateException("no event up from " + c1126v2.f15565a);
                            }
                            c1126v2.a(interfaceC1125u, enumC1119nB);
                            ArrayList arrayList2 = this.f15574h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f15573g = false;
        this.f15575i.h(this.f15569c);
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final EnumC1120o getCurrentState() {
        return this.f15569c;
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final p151n9.S getCurrentStateFlow() {
        return new p151n9.E(this.f15575i);
    }

    @Override // androidx.lifecycle.AbstractC1121p
    public final void removeObserver(InterfaceC1124t observer) {
        kotlin.jvm.internal.m.f(observer, "observer");
        b("removeObserver");
        this.f15568b.c(observer);
    }
}
