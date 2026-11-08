package com.google.android.gms.internal.p002firebaseauthapi;

import J2.u;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.r;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeu {
    private final int zza;

    private zzaeu(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzv.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(listZza.get(1)) * PipesIterator.DEFAULT_QUEUE_SIZE) + (Integer.parseInt(listZza.get(0)) * 1000000) + Integer.parseInt(listZza.get(2));
        } catch (IllegalArgumentException e2) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e2));
            return -1;
        }
    }

    public final String zzb() {
        return b.k("X", Integer.toString(this.zza));
    }

    public static zzaeu zza() throws Throwable {
        InputStream resourceAsStream;
        String str;
        r rVar = r.f18070c;
        rVar.getClass();
        u uVar = r.f18069b;
        E.f("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = rVar.f18071a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            inputStream = null;
            try {
                try {
                    resourceAsStream = r.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty(DiagnosticsEntry.VERSION_KEY, null);
                            StringBuilder sb = new StringBuilder(25 + String.valueOf(property).length());
                            sb.append("firebase-auth version is ");
                            sb.append(property);
                            String string = sb.toString();
                            if (Log.isLoggable(uVar.f6548b, 2)) {
                                String str2 = uVar.f6549c;
                                if (str2 != null) {
                                    string = str2.concat(string);
                                }
                                Log.v("LibraryVersion", string);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(56);
                            sb2.append("Failed to get app version for libraryName: firebase-auth");
                            String string2 = sb2.toString();
                            if (Log.isLoggable(uVar.f6548b, 5)) {
                                String str3 = uVar.f6549c;
                                if (str3 != null) {
                                    string2 = str3.concat(string2);
                                }
                                Log.w("LibraryVersion", string2);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        inputStream = resourceAsStream;
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("Failed to get app version for libraryName: firebase-auth");
                        String string3 = sb3.toString();
                        if (Log.isLoggable(uVar.f6548b, 6)) {
                            String str4 = uVar.f6549c;
                            if (str4 != null) {
                                string3 = str4.concat(string3);
                            }
                            Log.e("LibraryVersion", string3, e);
                        }
                        resourceAsStream = inputStream;
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = resourceAsStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            }
            if (property == null) {
                if (Log.isLoggable(uVar.f6548b, 3)) {
                    String str5 = uVar.f6549c;
                    Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str = "UNKNOWN";
            } else {
                str = property;
            }
            concurrentHashMap.put("firebase-auth", str);
        }
        if (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) {
            str = "-1";
        }
        return new zzaeu(str);
    }
}
