package org.maplibre.android.location;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Float f24762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Float f24763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RectF f24764C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f24765D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f24766E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Float f24767F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Boolean f24768G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Boolean f24769H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Boolean f24770I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Boolean f24771J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f24772K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f24773L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f24774M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f24775N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Float f24776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f24777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f24778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f24780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f24782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f24784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24785j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f24787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f24789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f24790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f24791q;
    public Integer r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f24792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f24793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f24794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Long f24795v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f24796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Float f24797x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Float f24798y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f24799z;

    public final z a() {
        String strN = this.f24776a == null ? " accuracyAlpha" : "";
        if (this.f24777b == null) {
            strN = strN.concat(" accuracyColor");
        }
        if (this.f24778c == null) {
            strN = V0.p.n(strN, " backgroundDrawableStale");
        }
        if (this.f24780e == null) {
            strN = V0.p.n(strN, " foregroundDrawableStale");
        }
        if (this.f24782g == null) {
            strN = V0.p.n(strN, " gpsDrawable");
        }
        if (this.f24784i == null) {
            strN = V0.p.n(strN, " foregroundDrawable");
        }
        if (this.k == null) {
            strN = V0.p.n(strN, " backgroundDrawable");
        }
        if (this.f24787m == null) {
            strN = V0.p.n(strN, " bearingDrawable");
        }
        if (this.f24793t == null) {
            strN = V0.p.n(strN, " elevation");
        }
        if (this.f24794u == null) {
            strN = V0.p.n(strN, " enableStaleState");
        }
        if (this.f24795v == null) {
            strN = V0.p.n(strN, " staleStateTimeout");
        }
        if (this.f24796w == null) {
            strN = V0.p.n(strN, " padding");
        }
        if (this.f24797x == null) {
            strN = V0.p.n(strN, " maxZoomIconScale");
        }
        if (this.f24798y == null) {
            strN = V0.p.n(strN, " minZoomIconScale");
        }
        if (this.f24799z == null) {
            strN = V0.p.n(strN, " trackingGesturesManagement");
        }
        if (this.f24762A == null) {
            strN = V0.p.n(strN, " trackingInitialMoveThreshold");
        }
        if (this.f24763B == null) {
            strN = V0.p.n(strN, " trackingMultiFingerMoveThreshold");
        }
        if (this.f24767F == null) {
            strN = V0.p.n(strN, " trackingAnimationDurationMultiplier");
        }
        if (!strN.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strN));
        }
        float fFloatValue = this.f24776a.floatValue();
        int iIntValue = this.f24777b.intValue();
        int iIntValue2 = this.f24778c.intValue();
        int iIntValue3 = this.f24780e.intValue();
        int iIntValue4 = this.f24782g.intValue();
        int iIntValue5 = this.f24784i.intValue();
        int iIntValue6 = this.k.intValue();
        int iIntValue7 = this.f24787m.intValue();
        Integer num = this.f24789o;
        Integer num2 = this.f24790p;
        Integer num3 = this.f24791q;
        Integer num4 = this.r;
        Integer num5 = this.f24792s;
        float fFloatValue2 = this.f24793t.floatValue();
        boolean zBooleanValue = this.f24794u.booleanValue();
        long jLongValue = this.f24795v.longValue();
        int[] iArr = this.f24796w;
        float fFloatValue3 = this.f24797x.floatValue();
        float fFloatValue4 = this.f24798y.floatValue();
        boolean zBooleanValue2 = this.f24799z.booleanValue();
        float fFloatValue5 = this.f24762A.floatValue();
        float fFloatValue6 = this.f24763B.floatValue();
        String str = this.f24765D;
        String str2 = this.f24766E;
        float fFloatValue7 = this.f24767F.floatValue();
        boolean zBooleanValue3 = this.f24768G.booleanValue();
        boolean zBooleanValue4 = this.f24769H.booleanValue();
        Boolean bool = this.f24770I;
        Boolean bool2 = this.f24771J;
        Integer numValueOf = Integer.valueOf(this.f24772K);
        float f10 = this.f24773L;
        float f11 = this.f24774M;
        float f12 = this.f24775N;
        z zVar = new z();
        zVar.f24815a = fFloatValue;
        zVar.f24816b = iIntValue;
        zVar.f24817c = iIntValue2;
        zVar.f24818d = this.f24779d;
        zVar.f24819e = iIntValue3;
        zVar.f24820f = this.f24781f;
        zVar.f24821g = iIntValue4;
        zVar.f24822h = this.f24783h;
        zVar.f24823i = iIntValue5;
        zVar.f24824j = this.f24785j;
        zVar.k = iIntValue6;
        zVar.f24825l = this.f24786l;
        zVar.f24826m = iIntValue7;
        zVar.f24827n = this.f24788n;
        zVar.f24828o = num;
        zVar.f24829p = num2;
        zVar.f24830q = num3;
        zVar.r = num4;
        zVar.f24831s = num5;
        zVar.f24832t = fFloatValue2;
        zVar.f24833u = zBooleanValue;
        zVar.f24834v = jLongValue;
        if (iArr == null) {
            throw new NullPointerException("Null padding");
        }
        zVar.f24835w = iArr;
        zVar.f24836x = fFloatValue3;
        zVar.f24837y = fFloatValue4;
        zVar.f24838z = zBooleanValue2;
        zVar.f24801A = fFloatValue5;
        zVar.f24802B = fFloatValue6;
        zVar.f24803C = this.f24764C;
        zVar.f24804D = str;
        zVar.f24805E = str2;
        zVar.f24806F = fFloatValue7;
        zVar.f24807G = zBooleanValue3;
        zVar.f24808H = zBooleanValue4;
        zVar.f24809I = bool;
        zVar.f24810J = bool2;
        zVar.f24811K = numValueOf;
        zVar.f24812L = f10;
        zVar.f24813M = f11;
        zVar.f24814N = f12;
        if (fFloatValue < 0.0f || fFloatValue > 1.0f) {
            throw new IllegalArgumentException("Accuracy alpha value must be between 0.0 and 1.0.");
        }
        if (fFloatValue2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + fFloatValue2 + ". Must be >= 0");
        }
        if (str != null && str2 != null) {
            throw new IllegalArgumentException("You cannot set both layerAbove and layerBelow options. Choose one or the other.");
        }
        if (bool == null) {
            String strConcat = (bool2 != null ? " pulseFadeEnabled" : "").concat(" pulseColor");
            if (f10 > 0.0f) {
                strConcat = V0.p.n(strConcat, " pulseSingleDuration");
            }
            if (f11 > 0.0f) {
                strConcat = V0.p.n(strConcat, " pulseMaxRadius");
            }
            if (f12 >= 0.0f && f12 <= 1.0f) {
                strConcat = V0.p.n(strConcat, " pulseAlpha");
            }
            if (!strConcat.isEmpty()) {
                throw new IllegalStateException(V0.p.o("You've set up the following pulsing circle options but have not enabled the pulsing circle via the LocationComponentOptions builder:", strConcat, ". Enable the pulsing circle if you're going to set pulsing options."));
            }
        }
        return zVar;
    }
}
