package A9;

import android.media.AudioManager;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import p122l0.C2046c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.j implements Z8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f469a = i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        M8.D d10;
        Ja.h hVar;
        Ja.h hVar2;
        Ja.h hVar3;
        Ja.h hVar4;
        Ja.h hVar5;
        Ja.h hVar6;
        Ja.h hVar7;
        M8.D d11 = M8.D.f8402a;
        switch (this.f469a) {
            case 0:
                p240w9.g p10 = (p240w9.g) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.f(p10, "p0");
                n nVar = (n) this.receiver;
                nVar.getClass();
                boolean z10 = !p10.j(iIntValue) && p10.i(iIntValue).c();
                nVar.f471b = z10;
                return Boolean.valueOf(z10);
            case 1:
                return Boolean.valueOf(G0.A.e((G0.A) this.receiver, (C2046c) obj, (p133m0.d) obj2));
            case 2:
                p161o8.o p11 = (p161o8.o) obj;
                p161o8.r p12 = (p161o8.r) obj2;
                kotlin.jvm.internal.m.f(p11, "p0");
                kotlin.jvm.internal.m.f(p12, "p1");
                Ia.c cVar = (Ia.c) this.receiver;
                cVar.getClass();
                String str = (String) p11.a("playerId");
                if (str != null) {
                    String str2 = p11.f23827a;
                    boolean zB = kotlin.jvm.internal.m.b(str2, "create");
                    ConcurrentHashMap concurrentHashMap = cVar.f6442e;
                    if (!zB) {
                        Ja.p pVar = (Ja.p) concurrentHashMap.get(str);
                        if (pVar == null) {
                            throw new IllegalStateException("Player has not yet been created or has already been disposed.");
                        }
                        try {
                            if (str2 != null) {
                                try {
                                    int iHashCode = str2.hashCode();
                                    d10 = d11;
                                    Ca.r rVar = pVar.f6783b;
                                    switch (iHashCode) {
                                        case -1757019252:
                                            if (str2.equals("getCurrentPosition")) {
                                                p12.b((!pVar.f6793m || (hVar = pVar.f6786e) == null) ? null : hVar.getCurrentPosition());
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -1722943962:
                                            if (str2.equals("setPlayerMode")) {
                                                String str3 = (String) p11.a("playerMode");
                                                Ia.d dVarValueOf = str3 == null ? null : Ia.d.valueOf(Q5.b.U((String) N8.n.I0(p097i9.k.I0(str3, new char[]{com.amazon.a.a.o.c.a.b.f16463a}, 6))));
                                                if (dVarValueOf == null) {
                                                    throw new IllegalStateException("playerMode is required");
                                                }
                                                pVar.g(dVarValueOf);
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -1660487654:
                                            if (str2.equals("setBalance")) {
                                                Double d12 = (Double) p11.a("balance");
                                                if (d12 == null) {
                                                    throw new IllegalStateException("balance is required");
                                                }
                                                float fDoubleValue = (float) d12.doubleValue();
                                                if (pVar.f6789h != fDoubleValue) {
                                                    pVar.f6789h = fDoubleValue;
                                                    if (!pVar.f6792l && (hVar2 = pVar.f6786e) != null) {
                                                        Ja.p.j(hVar2, pVar.f6788g, fDoubleValue);
                                                    }
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -1630329231:
                                            if (str2.equals("emitLog")) {
                                                String str4 = (String) p11.a("message");
                                                if (str4 == null) {
                                                    throw new IllegalStateException("message is required");
                                                }
                                                pVar.c(str4);
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -934426579:
                                            if (str2.equals("resume")) {
                                                if (!pVar.f6794n && !pVar.f6792l) {
                                                    pVar.f6794n = true;
                                                    if (pVar.f6786e == null) {
                                                        Ja.h hVarB = pVar.b();
                                                        pVar.f6786e = hVarB;
                                                        Ka.c cVar2 = pVar.f6787f;
                                                        if (cVar2 != null) {
                                                            hVarB.s(cVar2);
                                                            pVar.a(hVarB);
                                                        }
                                                    } else if (pVar.f6793m) {
                                                        pVar.f();
                                                    }
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -402284771:
                                            if (str2.equals("setPlaybackRate")) {
                                                Double d13 = (Double) p11.a("playbackRate");
                                                if (d13 == null) {
                                                    throw new IllegalStateException("playbackRate is required");
                                                }
                                                float fDoubleValue2 = (float) d13.doubleValue();
                                                if (pVar.f6790i != fDoubleValue2) {
                                                    pVar.f6790i = fDoubleValue2;
                                                    if (pVar.f6794n && (hVar3 = pVar.f6786e) != null) {
                                                        hVar3.q(fDoubleValue2);
                                                    }
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case -159032046:
                                            if (str2.equals("setSourceUrl")) {
                                                String str5 = (String) p11.a("url");
                                                if (str5 == null) {
                                                    throw new IllegalStateException("url is required");
                                                }
                                                Boolean bool = (Boolean) p11.a("isLocal");
                                                try {
                                                    pVar.i(new Ka.d(str5, bool != null ? bool.booleanValue() : false));
                                                    p12.b(1);
                                                    return d10;
                                                } catch (FileNotFoundException e2) {
                                                    p12.d(e2, "AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md");
                                                    return d10;
                                                }
                                            }
                                            break;
                                            break;
                                        case 3526264:
                                            if (str2.equals("seek")) {
                                                Integer num = (Integer) p11.a("position");
                                                if (num == null) {
                                                    throw new IllegalStateException("position is required");
                                                }
                                                int iIntValue2 = num.intValue();
                                                if (pVar.f6793m && ((hVar4 = pVar.f6786e) == null || !hVar4.isLiveStream())) {
                                                    Ja.h hVar8 = pVar.f6786e;
                                                    if (hVar8 != null) {
                                                        hVar8.seekTo(iIntValue2);
                                                    }
                                                    iIntValue2 = -1;
                                                }
                                                pVar.f6795o = iIntValue2;
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 3540994:
                                            if (str2.equals("stop")) {
                                                pVar.k();
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 85887754:
                                            if (str2.equals("getDuration")) {
                                                p12.b((!pVar.f6793m || (hVar5 = pVar.f6786e) == null) ? null : hVar5.getDuration());
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 106440182:
                                            if (str2.equals("pause")) {
                                                pVar.d();
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 670514716:
                                            if (str2.equals("setVolume")) {
                                                Double d14 = (Double) p11.a("volume");
                                                if (d14 == null) {
                                                    throw new IllegalStateException("volume is required");
                                                }
                                                float fDoubleValue3 = (float) d14.doubleValue();
                                                if (pVar.f6788g != fDoubleValue3) {
                                                    pVar.f6788g = fDoubleValue3;
                                                    if (!pVar.f6792l && (hVar6 = pVar.f6786e) != null) {
                                                        Ja.p.j(hVar6, fDoubleValue3, pVar.f6789h);
                                                    }
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 910310901:
                                            if (str2.equals("emitError")) {
                                                String str6 = (String) p11.a("code");
                                                if (str6 == null) {
                                                    throw new IllegalStateException("code is required");
                                                }
                                                String str7 = (String) p11.a("message");
                                                if (str7 == null) {
                                                    throw new IllegalStateException("message is required");
                                                }
                                                pVar.f6782a.getClass();
                                                p161o8.h hVar9 = (p161o8.h) rVar.f1557b;
                                                if (hVar9 != null) {
                                                    hVar9.b(null, str6, str7);
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 1090594823:
                                            if (str2.equals("release")) {
                                                pVar.e();
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 1671767583:
                                            if (str2.equals("dispose")) {
                                                pVar.e();
                                                p161o8.h hVar10 = (p161o8.h) rVar.f1557b;
                                                if (hVar10 != null) {
                                                    hVar10.a();
                                                    rVar.f1557b = null;
                                                }
                                                ((p161o8.j) rVar.f1558c).a(null);
                                                concurrentHashMap.remove(str);
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 1771699022:
                                            if (str2.equals("setSourceBytes")) {
                                                byte[] bArr = (byte[]) p11.a("bytes");
                                                if (bArr == null) {
                                                    throw new IllegalStateException("bytes are required");
                                                }
                                                pVar.i(new Ka.b(bArr));
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 1902436987:
                                            if (str2.equals("setAudioContext")) {
                                                pVar.l(Q5.b.e(p11));
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                        case 2096116872:
                                            if (str2.equals("setReleaseMode")) {
                                                String str8 = (String) p11.a("releaseMode");
                                                Ia.e eVarValueOf = str8 == null ? null : Ia.e.valueOf(Q5.b.U((String) N8.n.I0(p097i9.k.I0(str8, new char[]{com.amazon.a.a.o.c.a.b.f16463a}, 6))));
                                                if (eVarValueOf == null) {
                                                    throw new IllegalStateException("releaseMode is required");
                                                }
                                                if (pVar.f6791j != eVarValueOf) {
                                                    pVar.f6791j = eVarValueOf;
                                                    if (!pVar.f6792l && (hVar7 = pVar.f6786e) != null) {
                                                        hVar7.l(eVarValueOf == Ia.e.LOOP);
                                                    }
                                                }
                                                p12.b(1);
                                                return d10;
                                            }
                                            break;
                                            break;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    d10 = d11;
                                    p12.d(e, "AndroidAudioError", e.getMessage());
                                    return d10;
                                }
                            } else {
                                d10 = d11;
                            }
                            p12.c();
                            return d10;
                        } catch (Exception e7) {
                            e = e7;
                            p12.d(e, "AndroidAudioError", e.getMessage());
                            return d10;
                        }
                    }
                    p161o8.f fVar = cVar.f6440c;
                    if (fVar == null) {
                        kotlin.jvm.internal.m.l("binaryMessenger");
                        throw null;
                    }
                    Ca.r rVar2 = new Ca.r(new p161o8.j(fVar, "xyz.luan/audioplayers/events/".concat(str)));
                    Ia.a aVarB = Ia.a.b(cVar.f6443f);
                    M.s sVar = cVar.f6441d;
                    if (sVar == null) {
                        kotlin.jvm.internal.m.l("soundPoolManager");
                        throw null;
                    }
                    concurrentHashMap.put(str, new Ja.p(cVar, rVar2, aVarB, sVar));
                    p12.b(1);
                }
                return d11;
            case 3:
                p161o8.o p13 = (p161o8.o) obj;
                p161o8.r p14 = (p161o8.r) obj2;
                kotlin.jvm.internal.m.f(p13, "p0");
                kotlin.jvm.internal.m.f(p14, "p1");
                Ia.c cVar3 = (Ia.c) this.receiver;
                cVar3.getClass();
                String str9 = p13.f23827a;
                if (str9 != null) {
                    switch (str9) {
                        case "emitLog":
                            String str10 = (String) p13.a("message");
                            if (str10 == null) {
                                throw new IllegalStateException("message is required");
                            }
                            cVar3.b(str10);
                            p14.b(1);
                            break;
                        case "init":
                            ConcurrentHashMap concurrentHashMap2 = cVar3.f6442e;
                            Collection<Ja.p> collectionValues = concurrentHashMap2.values();
                            kotlin.jvm.internal.m.e(collectionValues, "<get-values>(...)");
                            for (Ja.p pVar2 : collectionValues) {
                                pVar2.e();
                                Ca.r rVar3 = pVar2.f6783b;
                                p161o8.h hVar11 = (p161o8.h) rVar3.f1557b;
                                if (hVar11 != null) {
                                    hVar11.a();
                                    rVar3.f1557b = null;
                                }
                                ((p161o8.j) rVar3.f1558c).a(null);
                            }
                            concurrentHashMap2.clear();
                            p14.b(1);
                            break;
                        case "emitError":
                            String str11 = (String) p13.a("code");
                            if (str11 == null) {
                                throw new IllegalStateException("code is required");
                            }
                            String str12 = (String) p13.a("message");
                            if (str12 == null) {
                                throw new IllegalStateException("message is required");
                            }
                            Ca.r rVar4 = cVar3.f6438a;
                            if (rVar4 == null) {
                                kotlin.jvm.internal.m.l("globalEvents");
                                throw null;
                            }
                            p161o8.h hVar12 = (p161o8.h) rVar4.f1557b;
                            if (hVar12 != null) {
                                hVar12.b(null, str11, str12);
                            }
                            p14.b(1);
                            break;
                        case "setAudioContext":
                            AudioManager audioManagerA = cVar3.a();
                            audioManagerA.setMode(cVar3.f6443f.f6435f);
                            audioManagerA.setSpeakerphoneOn(cVar3.f6443f.f6430a);
                            cVar3.f6443f = Q5.b.e(p13);
                            p14.b(1);
                            break;
                        default:
                            p14.c();
                            break;
                    }
                } else {
                    p14.c();
                }
                return d11;
            case 4:
                ((U1.a) this.receiver).getClass();
                return U1.a.a((String) obj, (String) obj2);
            case 5:
                ((U1.a) this.receiver).getClass();
                return U1.a.a((String) obj, (String) obj2);
            default:
                ((U1.a) this.receiver).getClass();
                return U1.a.a((String) obj, (String) obj2);
        }
    }
}
