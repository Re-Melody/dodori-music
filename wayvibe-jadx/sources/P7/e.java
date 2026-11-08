package P7;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9754j;

    public e(Map map) {
        this.f9745a = b("sharedPreferencesName", "FlutterSecureStorage", map);
        this.f9746b = b("preferencesKeyPrefix", "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg", map);
        this.f9747c = a(map, "resetOnError", false);
        this.f9748d = a(map, "migrateOnAlgorithmChange", true);
        this.f9749e = a(map, "encryptedSharedPreferences", false);
        this.f9750f = a(map, "enforceBiometrics", false);
        this.f9751g = b("prefOptionBiometricPromptTitle", "Authenticate to access", map);
        this.f9752h = b("prefOptionBiometricPromptSubtitle", "Use biometrics or device credentials", map);
        this.f9754j = b("storageCipherAlgorithm", "AES_GCM_NoPadding", map);
        this.f9753i = b("keyCipherAlgorithm", "RSA_ECB_PKCS1Padding", map);
    }

    public static boolean a(Map map, String str, boolean z10) {
        Object obj = map.get(str);
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }

    public static String b(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!str3.isEmpty()) {
                    return str3;
                }
            }
        }
        return str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlutterSecureStorageConfig{sharedPreferencesName='");
        sb.append(this.f9745a);
        sb.append("', sharedPreferencesKeyPrefix='");
        sb.append(this.f9746b);
        sb.append("', deleteOnFailure=");
        sb.append(this.f9747c);
        sb.append(", migrateOnAlgorithmChange=");
        sb.append(this.f9748d);
        sb.append(", enforceBiometrics=");
        return p134m1.b.o(sb, this.f9750f, '}');
    }
}
