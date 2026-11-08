package B6;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // B6.e
    public final int b(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        a aVar = this.f714a;
        if (!aVar.f711h[length % aVar.f708e]) {
            throw new d("Invalid input length " + charSequenceF.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceF.length()) {
            int i12 = i10 + 2;
            int iA = (aVar.a(charSequenceF.charAt(i10 + 1)) << 12) | (aVar.a(charSequenceF.charAt(i10)) << 18);
            int i13 = i11 + 1;
            bArr[i11] = (byte) (iA >>> 16);
            if (i12 < charSequenceF.length()) {
                int i14 = i10 + 3;
                int iA2 = iA | (aVar.a(charSequenceF.charAt(i12)) << 6);
                int i15 = i11 + 2;
                bArr[i13] = (byte) ((iA2 >>> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
                if (i14 < charSequenceF.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iA2 | aVar.a(charSequenceF.charAt(i14))) & ColorExtractionConstants.COLOR_COMPONENT_MASK);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i11 = i13;
                i10 = i12;
            }
        }
        return i11;
    }

    @Override // B6.e
    public final void e(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        p229v9.a.m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & ForkServer.ERROR) << 8) | ((bArr[i11] & ForkServer.ERROR) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & ForkServer.ERROR);
            a aVar = this.f714a;
            sb.append(aVar.f705b[i15 >>> 18]);
            char[] cArr = aVar.f705b;
            sb.append(cArr[(i15 >>> 12) & 63]);
            sb.append(cArr[(i15 >>> 6) & 63]);
            sb.append(cArr[i15 & 63]);
        }
        if (i11 < i10) {
            d(sb, bArr, i11, i10 - i11);
        }
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        p229v9.a.h(aVar.f705b.length == 64);
    }
}
