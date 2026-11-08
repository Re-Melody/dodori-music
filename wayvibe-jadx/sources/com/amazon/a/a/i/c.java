package com.amazon.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f16144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f16145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16149i;

    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, false);
    }

    public String a() {
        return this.f16144d[this.f16148h];
    }

    public String[] b() {
        return this.f16144d;
    }

    public a[] c() {
        return this.f16145e;
    }

    public String d() {
        return this.f16143c;
    }

    public String e() {
        return this.f16142b;
    }

    public String f() {
        return this.f16141a;
    }

    public int g() {
        return this.f16149i;
    }

    public boolean h() {
        return this.f16146f;
    }

    public boolean i() {
        return this.f16147g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f16141a + ", message: " + this.f16143c + ", label: " + this.f16144d[0] + ", visible: " + this.f16146f + ", shouldShowFixup: " + this.f16147g + "]";
    }

    public c(String str, String str2, String str3, boolean z10, boolean z11) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z10, z11, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(new String[]{str}, str2, strArr, aVarArr, z10, z11, i10);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(strArr, str, strArr2, aVarArr, z10, z11, i10, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10, int i11) {
        String str2 = strArr[0];
        this.f16141a = str2;
        if (strArr.length > 1) {
            this.f16142b = strArr[1];
        } else {
            this.f16142b = str2;
        }
        this.f16143c = str;
        this.f16144d = strArr2;
        this.f16145e = aVarArr;
        this.f16146f = z10;
        this.f16147g = z11;
        this.f16148h = i10;
        this.f16149i = i11;
    }
}
