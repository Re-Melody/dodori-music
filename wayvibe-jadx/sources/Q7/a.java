package Q7;

import V0.p;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p199t.C2231f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f10581b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10583d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f10582c = new CopyOnWriteArrayList();

    public a(e eVar, SharedPreferences.Editor editor) {
        this.f10580a = eVar;
        this.f10581b = editor;
    }

    public final void a() {
        if (this.f10583d.getAndSet(false)) {
            e eVar = this.f10580a;
            for (String str : ((HashMap) eVar.getAll()).keySet()) {
                if (!this.f10582c.contains(str) && !e.c(str)) {
                    this.f10581b.remove(eVar.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f10581b.apply();
        b();
        this.f10582c.clear();
    }

    public final void b() {
        e eVar = this.f10580a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : eVar.f10585b) {
            Iterator it = this.f10582c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(eVar, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        e eVar = this.f10580a;
        eVar.getClass();
        if (e.c(str)) {
            throw new SecurityException(p.n(str, " is a reserved key for the encryption keyset."));
        }
        this.f10582c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = eVar.a(str);
            try {
                Pair pair = new Pair(strA, new String(U6.f.b(eVar.f10587d.a(bArr, strA.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f10581b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        } catch (GeneralSecurityException e4) {
            throw new SecurityException("Could not encrypt data: " + e4.getMessage(), e4);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f10583d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10582c;
        a();
        try {
            return this.f10581b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(b.BOOLEAN.f());
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(b.FLOAT.f());
        byteBufferAllocate.putFloat(f10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(b.INT.f());
        byteBufferAllocate.putInt(i10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(b.LONG.f());
        byteBufferAllocate.putLong(j10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8 + length);
        byteBufferAllocate.putInt(b.STRING.f());
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C2231f(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(b.STRING_SET.f());
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        e eVar = this.f10580a;
        eVar.getClass();
        if (e.c(str)) {
            throw new SecurityException(p.n(str, " is a reserved key for the encryption keyset."));
        }
        this.f10581b.remove(eVar.a(str));
        this.f10582c.add(str);
        return this;
    }
}
