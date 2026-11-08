package p199t;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p209u.a;
import p209u.b;
import p209u.c;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final b lock;
    private final c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public n(int i10) {
        this.maxSize = i10;
        if (i10 <= 0) {
            a.c("maxSize <= 0");
            throw null;
        }
        this.map = new c();
        this.lock = new b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        m.f(message, "message");
        throw new IllegalStateException(message);
    }

    public Object create(Object key) {
        m.f(key, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z10, Object key, Object oldValue, Object obj) {
        m.f(key, "key");
        m.f(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    public final Object get(Object key) {
        Object objPut;
        m.f(key, "key");
        synchronized (this.lock) {
            c cVar = this.map;
            cVar.getClass();
            Object obj = cVar.f27016a.get(key);
            if (obj != null) {
                this.hitCount++;
                return obj;
            }
            this.missCount++;
            Object objCreate = create(key);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objPut = this.map.f27016a.put(key, objCreate);
                    if (objPut != null) {
                        this.map.f27016a.put(key, objPut);
                    } else {
                        this.size += a(key, objCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                entryRemoved(false, key, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final Object put(Object key, Object value) {
        Object objPut;
        m.f(key, "key");
        m.f(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            objPut = this.map.f27016a.put(key, value);
            if (objPut != null) {
                this.size -= a(key, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, key, objPut, value);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final Object remove(Object key) {
        Object objRemove;
        m.f(key, "key");
        synchronized (this.lock) {
            c cVar = this.map;
            cVar.getClass();
            objRemove = cVar.f27016a.remove(key);
            if (objRemove != null) {
                this.size -= a(key, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, key, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i10) {
        if (!(i10 > 0)) {
            a.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i10;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(Object key, Object value) {
        m.f(key, "key");
        m.f(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set setEntrySet = this.map.f27016a.entrySet();
            m.e(setEntrySet, "map.entries");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = this.map.f27016a.entrySet();
            m.e(setEntrySet2, "map.entries");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void trimToSize(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.f27016a.isEmpty() || this.size == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size > i10 && !this.map.f27016a.isEmpty()) {
                        Set setEntrySet = this.map.f27016a.entrySet();
                        m.e(setEntrySet, "map.entries");
                        Map.Entry entry = (Map.Entry) N8.n.C0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        c cVar = this.map;
                        cVar.getClass();
                        m.f(key, "key");
                        cVar.f27016a.remove(key);
                        this.size -= a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
