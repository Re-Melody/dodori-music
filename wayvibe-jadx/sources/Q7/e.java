package Q7;

import V0.p;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p199t.C2231f;

/* JADX INFO: loaded from: classes.dex */
public final class e implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10585b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F6.a f10587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F6.b f10588e;

    public e(String str, SharedPreferences sharedPreferences, F6.a aVar, F6.b bVar) {
        this.f10586c = str;
        this.f10584a = sharedPreferences;
        this.f10587d = aVar;
        this.f10588e = bVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(U6.f.b(this.f10588e.a(str.getBytes(StandardCharsets.UTF_8), this.f10586c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        } catch (GeneralSecurityException e4) {
            throw new SecurityException("Could not encrypt key. " + e4.getMessage(), e4);
        }
    }

    public final Object b(String str) {
        b bVar;
        if (c(str)) {
            throw new SecurityException(p.n(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f10584a.getString(strA, null);
            if (string != null) {
                byte[] bArrA = U6.f.a(string);
                F6.a aVar = this.f10587d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
                byteBufferWrap.position(0);
                int i10 = byteBufferWrap.getInt();
                if (i10 == 0) {
                    bVar = b.STRING;
                } else if (i10 == 1) {
                    bVar = b.STRING_SET;
                } else if (i10 == 2) {
                    bVar = b.INT;
                } else if (i10 == 3) {
                    bVar = b.LONG;
                } else if (i10 != 4) {
                    bVar = i10 != 5 ? null : b.BOOLEAN;
                } else {
                    bVar = b.FLOAT;
                }
                if (bVar == null) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
                }
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 0) {
                    int i11 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i11);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iOrdinal == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iOrdinal == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iOrdinal == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: " + bVar);
                    }
                    C2231f c2231f = new C2231f(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i12 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i12);
                        byteBufferWrap.position(byteBufferWrap.position() + i12);
                        c2231f.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c2231f.f26288c != 1 || !"__NULL__".equals(c2231f.f26287b[0])) {
                        return c2231f;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(p.n(str, " is a reserved key for the encryption keyset."));
        }
        return this.f10584a.contains(a(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f10584a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f10584a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f10588e.b(U6.f.a(entry.getKey()), this.f10586c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        Object objB = b(str);
        return objB instanceof Float ? ((Float) objB).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set c2231f = objB instanceof Set ? (Set) objB : new C2231f(0);
        return !c2231f.isEmpty() ? c2231f : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10585b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10585b.remove(onSharedPreferenceChangeListener);
    }
}
