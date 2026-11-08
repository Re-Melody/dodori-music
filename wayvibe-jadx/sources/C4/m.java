package C4;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1399a = X4.j.k("nam");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1400b = X4.j.k("trk");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1401c = X4.j.k("cmt");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1402d = X4.j.k("day");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1403e = X4.j.k("ART");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1404f = X4.j.k("too");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f1405g = X4.j.k("alb");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f1406h = X4.j.k("com");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1407i = X4.j.k("wrt");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f1408j = X4.j.k("lyr");
    public static final int k = X4.j.k("gen");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f1409l = X4.j.k("covr");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f1410m = X4.j.k("gnre");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f1411n = X4.j.k("grp");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1412o = X4.j.k("disk");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f1413p = X4.j.k("trkn");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f1414q = X4.j.k("tmpo");
    public static final int r = X4.j.k("cpil");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f1415s = X4.j.k("aART");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f1416t = X4.j.k("sonm");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f1417u = X4.j.k("soal");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f1418v = X4.j.k("soar");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f1419w = X4.j.k("soaa");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f1420x = X4.j.k("soco");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f1421y = X4.j.k("rtng");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f1422z = X4.j.k("pgap");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f1395A = X4.j.k("sosn");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f1396B = X4.j.k("tvsh");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f1397C = X4.j.k("----");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f1398D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static H4.e a(int i10, X4.f fVar) {
        String strJ = null;
        String strJ2 = null;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int i13 = fVar.f13221b;
            if (i13 >= i10) {
                break;
            }
            int iN = fVar.n();
            int iN2 = fVar.n();
            fVar.g(4);
            if (iN2 == c.f1237D0) {
                strJ = fVar.j(iN - 12);
            } else if (iN2 == c.f1239E0) {
                strJ2 = fVar.j(iN - 12);
            } else {
                if (iN2 == c.f1241F0) {
                    i11 = i13;
                    i12 = iN;
                }
                fVar.g(iN - 12);
            }
        }
        if (!"com.apple.iTunes".equals(strJ) || !"iTunSMPB".equals(strJ2) || i11 == -1) {
            return null;
        }
        fVar.f(i11);
        fVar.g(16);
        return new H4.e("und", strJ2, fVar.j(i12 - 16));
    }

    public static H4.i b(int i10, String str, X4.f fVar, boolean z10, boolean z11) {
        int iMin;
        fVar.g(4);
        if (fVar.n() == c.f1241F0) {
            fVar.g(8);
            iMin = fVar.i();
        } else {
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z10 ? new H4.k(str, null, Integer.toString(iMin)) : new H4.e("und", str, Integer.toString(iMin));
        }
        c.b(i10);
        return null;
    }

    public static H4.k c(int i10, X4.f fVar, String str) {
        int iN = fVar.n();
        if (fVar.n() == c.f1241F0) {
            fVar.g(8);
            return new H4.k(str, null, fVar.j(iN - 16));
        }
        c.b(i10);
        return null;
    }

    public static H4.k d(int i10, X4.f fVar, String str) {
        int iN = fVar.n();
        if (fVar.n() == c.f1241F0 && iN >= 22) {
            fVar.g(10);
            int iK = fVar.k();
            if (iK > 0) {
                String strJ = p134m1.b.j(iK, "");
                int iK2 = fVar.k();
                if (iK2 > 0) {
                    strJ = strJ + "/" + iK2;
                }
                return new H4.k(str, null, strJ);
            }
        }
        c.b(i10);
        return null;
    }
}
