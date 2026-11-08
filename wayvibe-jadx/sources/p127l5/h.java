package p127l5;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22023j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22024l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f22014a = num;
        this.f22015b = str;
        this.f22016c = str2;
        this.f22017d = str3;
        this.f22018e = str4;
        this.f22019f = str5;
        this.f22020g = str6;
        this.f22021h = str7;
        this.f22022i = str8;
        this.f22023j = str9;
        this.k = str10;
        this.f22024l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f22014a;
            if (num != null ? num.equals(((h) aVar).f22014a) : ((h) aVar).f22014a == null) {
                String str = this.f22015b;
                if (str != null ? str.equals(((h) aVar).f22015b) : ((h) aVar).f22015b == null) {
                    String str2 = this.f22016c;
                    if (str2 != null ? str2.equals(((h) aVar).f22016c) : ((h) aVar).f22016c == null) {
                        String str3 = this.f22017d;
                        if (str3 != null ? str3.equals(((h) aVar).f22017d) : ((h) aVar).f22017d == null) {
                            String str4 = this.f22018e;
                            if (str4 != null ? str4.equals(((h) aVar).f22018e) : ((h) aVar).f22018e == null) {
                                String str5 = this.f22019f;
                                if (str5 != null ? str5.equals(((h) aVar).f22019f) : ((h) aVar).f22019f == null) {
                                    String str6 = this.f22020g;
                                    if (str6 != null ? str6.equals(((h) aVar).f22020g) : ((h) aVar).f22020g == null) {
                                        String str7 = this.f22021h;
                                        if (str7 != null ? str7.equals(((h) aVar).f22021h) : ((h) aVar).f22021h == null) {
                                            String str8 = this.f22022i;
                                            if (str8 != null ? str8.equals(((h) aVar).f22022i) : ((h) aVar).f22022i == null) {
                                                String str9 = this.f22023j;
                                                if (str9 != null ? str9.equals(((h) aVar).f22023j) : ((h) aVar).f22023j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((h) aVar).k) : ((h) aVar).k == null) {
                                                        String str11 = this.f22024l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f22024l) : ((h) aVar).f22024l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f22014a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f22015b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f22016c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22017d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f22018e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f22019f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f22020g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f22021h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f22022i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f22023j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f22024l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f22014a);
        sb.append(", model=");
        sb.append(this.f22015b);
        sb.append(", hardware=");
        sb.append(this.f22016c);
        sb.append(", device=");
        sb.append(this.f22017d);
        sb.append(", product=");
        sb.append(this.f22018e);
        sb.append(", osBuild=");
        sb.append(this.f22019f);
        sb.append(", manufacturer=");
        sb.append(this.f22020g);
        sb.append(", fingerprint=");
        sb.append(this.f22021h);
        sb.append(", locale=");
        sb.append(this.f22022i);
        sb.append(", country=");
        sb.append(this.f22023j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return b.m(sb, this.f22024l, "}");
    }
}
