package K1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: K1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0601d implements InterfaceC0599c, InterfaceC0603e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7276a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f7277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f7280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f7281f;

    public /* synthetic */ C0601d() {
    }

    @Override // K1.InterfaceC0599c
    public void b(Bundle bundle) {
        this.f7281f = bundle;
    }

    @Override // K1.InterfaceC0599c
    public C0604f build() {
        return new C0604f(new C0601d(this));
    }

    @Override // K1.InterfaceC0603e
    public ClipData c() {
        return this.f7277b;
    }

    @Override // K1.InterfaceC0603e
    public int f() {
        return this.f7278c;
    }

    @Override // K1.InterfaceC0599c
    public void j(Uri uri) {
        this.f7280e = uri;
    }

    @Override // K1.InterfaceC0603e
    public int k() {
        return this.f7279d;
    }

    @Override // K1.InterfaceC0599c
    public void l(int i10) {
        this.f7279d = i10;
    }

    @Override // K1.InterfaceC0603e
    public ContentInfo t() {
        return null;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f7276a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f7277b.getDescription());
                sb.append(", source=");
                int i10 = this.f7278c;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i11 = this.f7279d;
                sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                Uri uri = this.f7280e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return p134m1.b.m(sb, this.f7281f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0601d(C0601d c0601d) {
        ClipData clipData = c0601d.f7277b;
        clipData.getClass();
        this.f7277b = clipData;
        int i10 = c0601d.f7278c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f7278c = i10;
        int i11 = c0601d.f7279d;
        if ((i11 & 1) == i11) {
            this.f7279d = i11;
            this.f7280e = c0601d.f7280e;
            this.f7281f = c0601d.f7281f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
