package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f21173g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f21167a = name;
        this.f21168b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f21168b;
        String str = this.f21167a;
        if (i13 >= i14) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f21173g;
        char c3 = cArr[i10];
        if (c3 >= '0' && c3 <= '9') {
            i11 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i11 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c3 - '7';
        }
        char c9 = cArr[i13];
        if (c9 >= '0' && c9 <= '9') {
            i12 = c9 - '0';
        } else if (c9 >= 'a' && c9 <= 'f') {
            i12 = c9 - 'W';
        } else {
            if (c9 < 'A' || c9 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i12 = c9 - '7';
        }
        return (i11 << 4) + i12;
    }

    public final char b() {
        int i10;
        int i11;
        int i12 = this.f21169c + 1;
        this.f21169c = i12;
        int i13 = this.f21168b;
        if (i12 == i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f21167a);
        }
        char c3 = this.f21173g[i12];
        if (c3 != ' ' && c3 != '%' && c3 != '\\' && c3 != '_' && c3 != '\"' && c3 != '#') {
            switch (c3) {
                default:
                    switch (c3) {
                        case ';':
                        case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i12);
                            this.f21169c++;
                            if (iA < 128) {
                                return (char) iA;
                            }
                            if (iA < 192 || iA > 247) {
                                return '?';
                            }
                            if (iA <= 223) {
                                i10 = iA & 31;
                                i11 = 1;
                            } else if (iA <= 239) {
                                i10 = iA & 15;
                                i11 = 2;
                            } else {
                                i10 = iA & 7;
                                i11 = 3;
                            }
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = this.f21169c;
                                int i16 = i15 + 1;
                                this.f21169c = i16;
                                if (i16 == i13 || this.f21173g[i16] != '\\') {
                                    return '?';
                                }
                                int i17 = i15 + 2;
                                this.f21169c = i17;
                                int iA2 = a(i17);
                                this.f21169c++;
                                if ((iA2 & 192) != 128) {
                                    return '?';
                                }
                                i10 = (i10 << 6) + (iA2 & 63);
                            }
                            return (char) i10;
                    }
                case '*':
                case '+':
                case ',':
                    return c3;
            }
        }
        return c3;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c3;
        int i13;
        char c9;
        char c10;
        while (true) {
            i10 = this.f21169c;
            i11 = this.f21168b;
            if (i10 >= i11 || this.f21173g[i10] != ' ') {
                break;
            }
            this.f21169c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f21170d = i10;
        this.f21169c = i10 + 1;
        while (true) {
            i12 = this.f21169c;
            if (i12 >= i11 || (c10 = this.f21173g[i12]) == '=' || c10 == ' ') {
                break;
            }
            this.f21169c = i12 + 1;
        }
        String str = this.f21167a;
        if (i12 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f21171e = i12;
        if (this.f21173g[i12] == ' ') {
            while (true) {
                i13 = this.f21169c;
                if (i13 >= i11 || (c9 = this.f21173g[i13]) == '=' || c9 != ' ') {
                    break;
                }
                this.f21169c = i13 + 1;
            }
            if (this.f21173g[i13] != '=' || i13 == i11) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f21169c++;
        while (true) {
            int i14 = this.f21169c;
            if (i14 >= i11 || this.f21173g[i14] != ' ') {
                break;
            }
            this.f21169c = i14 + 1;
        }
        int i15 = this.f21171e;
        int i16 = this.f21170d;
        if (i15 - i16 > 4) {
            char[] cArr = this.f21173g;
            if (cArr[i16 + 3] == '.' && (((c3 = cArr[i16]) == 'O' || c3 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.f21170d = i16 + 4;
            }
        }
        char[] cArr2 = this.f21173g;
        int i17 = this.f21170d;
        return new String(cArr2, i17, i15 - i17);
    }
}
