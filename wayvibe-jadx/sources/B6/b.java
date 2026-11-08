package B6;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f712d;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f712d = new char[512];
        char[] cArr = aVar.f705b;
        p229v9.a.h(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f712d;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override // B6.e
    public final int b(byte[] bArr, CharSequence charSequence) throws d {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            a aVar = this.f714a;
            bArr[i11] = (byte) ((aVar.a(cCharAt) << 4) | aVar.a(charSequence.charAt(i10 + 1)));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // B6.e
    public final void e(StringBuilder sb, byte[] bArr, int i10) {
        p229v9.a.m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & ForkServer.ERROR;
            char[] cArr = this.f712d;
            sb.append(cArr[i12]);
            sb.append(cArr[i12 | 256]);
        }
    }
}
