package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e4.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i10, f fVar) {
        this.zza = new zzfm();
    }
}
