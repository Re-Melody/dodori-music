package G2;

import A6.G;
import B2.C;
import R2.D;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.regex.Matcher;
import p255y2.C2339o;
import p255y2.C2343t;
import p255y2.E;
import p255y2.M;
import p255y2.N;
import p255y2.O;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5397A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f5400c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f5407j;
    public int k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E f5410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public G f5411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public G f5412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public G f5413q;
    public C2339o r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2339o f5414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2339o f5415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5420y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5421z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f5402e = new N();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f5403f = new M();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f5405h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f5404g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5401d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5408l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5409m = 0;

    public k(Context context, PlaybackSession playbackSession) {
        this.f5398a = context.getApplicationContext();
        this.f5400c = playbackSession;
        h hVar = new h();
        this.f5399b = hVar;
        hVar.f5393d = this;
    }

    public final boolean a(G g3) {
        String str;
        if (g3 == null) {
            return false;
        }
        String str2 = (String) g3.f306d;
        h hVar = this.f5399b;
        synchronized (hVar) {
            str = hVar.f5395f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f5407j;
        if (builder != null && this.f5397A) {
            builder.setAudioUnderrunCount(this.f5421z);
            this.f5407j.setVideoFramesDropped(this.f5419x);
            this.f5407j.setVideoFramesPlayed(this.f5420y);
            Long l10 = (Long) this.f5404g.get(this.f5406i);
            this.f5407j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f5405h.get(this.f5406i);
            this.f5407j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f5407j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f5400c.reportPlaybackMetrics(this.f5407j.build());
        }
        this.f5407j = null;
        this.f5406i = null;
        this.f5421z = 0;
        this.f5419x = 0;
        this.f5420y = 0;
        this.r = null;
        this.f5414s = null;
        this.f5415t = null;
        this.f5397A = false;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    public final void c(O o10, D d10) {
        int iB;
        Matcher matcher;
        String strGroup;
        char c3;
        int i10 = 3;
        char c9 = 0;
        PlaybackMetrics.Builder builder = this.f5407j;
        if (d10 == null || (iB = o10.b(d10.f10651a)) == -1) {
            return;
        }
        M m8 = this.f5403f;
        o10.f(iB, m8, false);
        int i11 = m8.f28780c;
        N n6 = this.f5402e;
        o10.n(i11, n6);
        C2343t c2343t = n6.f28788c.f28984b;
        if (c2343t == null) {
            i10 = 0;
        } else {
            String str = c2343t.f28976b;
            if (str != null) {
                switch (str) {
                    case "application/x-mpegURL":
                        c9 = 2;
                        break;
                    case "application/vnd.ms-sstr+xml":
                        c9 = 1;
                        break;
                    case "application/dash+xml":
                        break;
                    case "application/x-rtsp":
                        c9 = 3;
                        break;
                    default:
                        c9 = 4;
                        break;
                }
            } else {
                Uri uri = c2343t.f28975a;
                String scheme = uri.getScheme();
                if (scheme == null || !p224v4.i.d("rtsp", scheme)) {
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        c9 = 4;
                    } else {
                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                        if (iLastIndexOf >= 0) {
                            String strE = p224v4.i.e(lastPathSegment.substring(iLastIndexOf + 1));
                            strE.getClass();
                            switch (strE.hashCode()) {
                                case 104579:
                                    if (strE.equals("ism")) {
                                    }
                                    break;
                                case 108321:
                                    if (strE.equals("mpd")) {
                                    }
                                    break;
                                case 3242057:
                                    if (strE.equals("isml")) {
                                    }
                                    break;
                                case 3299913:
                                    if (strE.equals("m3u8")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                */
                            /*
                                Method dump skipped, instruction units count: 384
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: G2.k.c(y2.O, R2.D):void");
                        }

                        public final void d(a aVar, String str) {
                            D d10 = aVar.f5354d;
                            if ((d10 == null || !d10.b()) && str.equals(this.f5406i)) {
                                b();
                            }
                            this.f5404g.remove(str);
                            this.f5405h.remove(str);
                        }

                        public final void e(int i10, long j10, C2339o c2339o, int i11) {
                            int i12;
                            TrackChangeEvent.Builder timeSinceCreatedMillis = B1.f.l(i10).setTimeSinceCreatedMillis(j10 - this.f5401d);
                            if (c2339o != null) {
                                timeSinceCreatedMillis.setTrackState(1);
                                if (i11 != 1) {
                                    i12 = 3;
                                    if (i11 != 2) {
                                        i12 = i11 != 3 ? 1 : 4;
                                    }
                                } else {
                                    i12 = 2;
                                }
                                timeSinceCreatedMillis.setTrackChangeReason(i12);
                                String str = c2339o.f28953l;
                                if (str != null) {
                                    timeSinceCreatedMillis.setContainerMimeType(str);
                                }
                                String str2 = c2339o.f28954m;
                                if (str2 != null) {
                                    timeSinceCreatedMillis.setSampleMimeType(str2);
                                }
                                String str3 = c2339o.f28952j;
                                if (str3 != null) {
                                    timeSinceCreatedMillis.setCodecName(str3);
                                }
                                int i13 = c2339o.f28951i;
                                if (i13 != -1) {
                                    timeSinceCreatedMillis.setBitrate(i13);
                                }
                                int i14 = c2339o.f28959s;
                                if (i14 != -1) {
                                    timeSinceCreatedMillis.setWidth(i14);
                                }
                                int i15 = c2339o.f28960t;
                                if (i15 != -1) {
                                    timeSinceCreatedMillis.setHeight(i15);
                                }
                                int i16 = c2339o.f28932A;
                                if (i16 != -1) {
                                    timeSinceCreatedMillis.setChannelCount(i16);
                                }
                                int i17 = c2339o.f28933B;
                                if (i17 != -1) {
                                    timeSinceCreatedMillis.setAudioSampleRate(i17);
                                }
                                String str4 = c2339o.f28946d;
                                if (str4 != null) {
                                    int i18 = C.f560a;
                                    String[] strArrSplit = str4.split("-", -1);
                                    Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                                    timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                                    Object obj = pairCreate.second;
                                    if (obj != null) {
                                        timeSinceCreatedMillis.setLanguageRegion((String) obj);
                                    }
                                }
                                float f10 = c2339o.f28961u;
                                if (f10 != -1.0f) {
                                    timeSinceCreatedMillis.setVideoFrameRate(f10);
                                }
                            } else {
                                timeSinceCreatedMillis.setTrackState(0);
                            }
                            this.f5397A = true;
                            this.f5400c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
                        }
                    }
