package p150n8;

import B2.AbstractC0112b;
import org.json.JSONObject;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23033e;

    public u(String str, int i10, int i11, int i12, int i13) {
        if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
            throw new IndexOutOfBoundsException(AbstractC0112b.f("invalid selection: (", i10, ", ", i11, ")"));
        }
        if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
            throw new IndexOutOfBoundsException(AbstractC0112b.f("invalid composing range: (", i12, ", ", i13, ")"));
        }
        if (i13 > str.length()) {
            throw new IndexOutOfBoundsException(b.j(i12, "invalid composing start: "));
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException(b.j(i10, "invalid selection start: "));
        }
        if (i11 > str.length()) {
            throw new IndexOutOfBoundsException(b.j(i11, "invalid selection end: "));
        }
        this.f23029a = str;
        this.f23030b = i10;
        this.f23031c = i11;
        this.f23032d = i12;
        this.f23033e = i13;
    }

    public static u a(JSONObject jSONObject) {
        return new u(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
