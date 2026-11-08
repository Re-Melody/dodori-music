package com.google.android.recaptcha.internal;

import M8.D;
import Q5.b;
import android.content.Context;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.jvm.internal.m;
import p119k9.C;
import p119k9.F;
import p119k9.I;
import p119k9.InterfaceC2035t;
import t9.a;
import t9.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzan {
    public InterfaceC2035t zza;
    private final C zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final a zzg = new d();

    public zzan(Context context, C c3, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = c3;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(Q8.d dVar) {
        zzag zzagVar;
        if (dVar instanceof zzag) {
            zzagVar = (zzag) dVar;
            int i10 = zzagVar.zzc;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzagVar.zzc = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzagVar = new zzag(this, dVar);
            }
        } else {
            zzagVar = new zzag(this, dVar);
        }
        Object obj = zzagVar.zza;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = zzagVar.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.T(obj);
            return obj;
        }
        b.T(obj);
        I iZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = iZza.await(zzagVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, Q8.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Q5.b.T(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            Q5.b.T(r7)
            goto L4b
        L38:
            Q5.b.T(r7)
            k9.t r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            k9.u r7 = (p119k9.C2036u) r7
            java.lang.Object r7 = r7.m(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            k9.I r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, Q8.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[PHI: r2 r7
  0x0067: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r8 != r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r7, Q8.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            R8.a r1 = R8.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.b.T(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            Q5.b.T(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            Q5.b.T(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            Q5.b.T(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            goto L77
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            return r8
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            goto L77
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, Q8.d):java.lang.Object");
    }

    public final Object zzd(long j10, Q8.d dVar) {
        this.zzf = j10;
        return D.f8402a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(Q8.d dVar) {
        zzak zzakVar;
        zzan zzanVar;
        a aVar;
        if (dVar instanceof zzak) {
            zzakVar = (zzak) dVar;
            int i10 = zzakVar.zzd;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                zzakVar.zzd = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                zzakVar = new zzak(this, dVar);
            }
        } else {
            zzakVar = new zzak(this, dVar);
        }
        Object obj = zzakVar.zzb;
        R8.a aVar2 = R8.a.COROUTINE_SUSPENDED;
        int i11 = zzakVar.zzd;
        D d10 = D.f8402a;
        try {
            if (i11 == 0) {
                b.T(obj);
                a aVar3 = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = aVar3;
                zzakVar.zzd = 1;
                d dVar2 = (d) aVar3;
                if (dVar2.c(zzakVar) != aVar2) {
                    zzanVar = this;
                    aVar = dVar2;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.T(obj);
                return d10;
            }
            a aVar4 = (a) zzakVar.zza;
            zzanVar = zzakVar.zze;
            b.T(obj);
            aVar = aVar4;
            if (!m.b(zzanVar.zze, zzao.zza)) {
                ((d) aVar).e(null);
                return d10;
            }
            zzanVar.zze = zzao.zzb;
            ((d) aVar).e(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = F.a();
            F.w(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
            return d10 == aVar2 ? aVar2 : d10;
        } catch (Throwable th) {
            ((d) aVar).e(null);
            throw th;
        }
    }

    public final InterfaceC2035t zzf() {
        InterfaceC2035t interfaceC2035t = this.zza;
        if (interfaceC2035t != null) {
            return interfaceC2035t;
        }
        return null;
    }
}
