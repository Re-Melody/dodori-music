package p020b4;

import M8.D;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p008a4.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f15761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f15762b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15763c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f15764d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f15761a = windowLayoutComponent;
    }

    @Override // p008a4.a
    public final void a(J1.a aVar) {
        ReentrantLock reentrantLock = this.f15762b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f15764d;
        try {
            Context context = (Context) linkedHashMap.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f15763c;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = multicastConsumer.f15698b;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = multicastConsumer.f15700d;
            try {
                linkedHashSet.remove(aVar);
                reentrantLock2.unlock();
                linkedHashMap.remove(aVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    this.f15761a.removeWindowLayoutInfoListener(multicastConsumer);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p008a4.a
    public final void b(Context context, Executor executor, J1.a aVar) {
        D d10;
        ReentrantLock reentrantLock = this.f15762b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f15763c;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f15764d;
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                linkedHashMap2.put(aVar, context);
                d10 = D.f8402a;
            } else {
                d10 = null;
            }
            if (d10 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(aVar, context);
                multicastConsumer2.a(aVar);
                this.f15761a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
