package S4;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f11101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f11103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f11104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f11105j;
    public ArrayList k;

    public b(String str, String str2, long j10, long j11, d dVar, String[] strArr, String str3) {
        this.f11096a = str;
        this.f11097b = str2;
        this.f11101f = dVar;
        this.f11103h = strArr;
        this.f11098c = str2 != null;
        this.f11099d = j10;
        this.f11100e = j11;
        str3.getClass();
        this.f11102g = str3;
        this.f11104i = new HashMap();
        this.f11105j = new HashMap();
    }

    public static b a(String str) {
        return new b(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    public static SpannableStringBuilder b(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            treeMap.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) treeMap.get(str);
    }

    public final void c(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f11104i;
        map.clear();
        HashMap map2 = this.f11105j;
        map2.clear();
        String str2 = this.f11102g;
        String str3 = "".equals(str2) ? str : str2;
        if (this.f11098c && z10) {
            b(str3, treeMap).append((CharSequence) this.f11097b);
            return;
        }
        String str4 = this.f11096a;
        if ("br".equals(str4) && z10) {
            b(str3, treeMap).append('\n');
            return;
        }
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str4)) {
            return;
        }
        long j11 = this.f11099d;
        long j12 = this.f11100e;
        if (!(j11 == -9223372036854775807L && j12 == -9223372036854775807L) && ((j11 > j10 || j12 != -9223372036854775807L) && ((j11 != -9223372036854775807L || j10 >= j12) && (j11 > j10 || j10 >= j12)))) {
            return;
        }
        boolean zEquals = "p".equals(str4);
        for (Map.Entry entry : treeMap.entrySet()) {
            map.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i10 >= (arrayList == null ? 0 : arrayList.size())) {
                if (zEquals) {
                    SpannableStringBuilder spannableStringBuilderB = b(str3, treeMap);
                    int length = spannableStringBuilderB.length() - 1;
                    while (length >= 0 && spannableStringBuilderB.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && spannableStringBuilderB.charAt(length) != '\n') {
                        spannableStringBuilderB.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    map2.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
                return;
            }
            ArrayList arrayList2 = this.k;
            if (arrayList2 == null) {
                throw new IndexOutOfBoundsException();
            }
            ((b) arrayList2.get(i10)).c(j10, z10 || zEquals, str3, treeMap);
            i10++;
        }
    }

    public final void d(Map map, TreeMap treeMap) {
        for (Map.Entry entry : this.f11105j.entrySet()) {
            String str = (String) entry.getKey();
            HashMap map2 = this.f11104i;
            int iIntValue = map2.containsKey(str) ? ((Integer) map2.get(str)).intValue() : 0;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) treeMap.get(str);
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if (iIntValue != iIntValue2) {
                d dVar = this.f11101f;
                String[] strArr = this.f11103h;
                if (dVar == null && strArr == null) {
                    dVar = null;
                } else if (dVar == null && strArr.length == 1) {
                    dVar = (d) map.get(strArr[0]);
                } else if (dVar == null && strArr.length > 1) {
                    dVar = new d();
                    for (String str2 : strArr) {
                        dVar.a((d) map.get(str2));
                    }
                } else if (dVar != null && strArr != null && strArr.length == 1) {
                    dVar.a((d) map.get(strArr[0]));
                } else if (dVar != null && strArr != null && strArr.length > 1) {
                    for (String str3 : strArr) {
                        dVar.a((d) map.get(str3));
                    }
                }
                if (dVar != null) {
                    int i10 = dVar.f11116h;
                    if (((i10 == -1 && dVar.f11117i == -1) ? -1 : (i10 == 1 ? (char) 1 : (char) 0) | (dVar.f11117i == 1 ? (char) 2 : (char) 0)) != -1) {
                        int i11 = dVar.f11116h;
                        spannableStringBuilder.setSpan(new StyleSpan((i11 == -1 && dVar.f11117i == -1) ? -1 : (i11 == 1 ? 1 : 0) | (dVar.f11117i == 1 ? 2 : 0)), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11114f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11115g == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11111c) {
                        if (!dVar.f11111c) {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.f11110b), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11113e) {
                        if (!dVar.f11113e) {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.f11112d), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11109a != null) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(dVar.f11109a), iIntValue, iIntValue2, 33);
                    }
                    if (dVar.f11120m != null) {
                        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.f11120m), iIntValue, iIntValue2, 33);
                    }
                    int i12 = dVar.f11118j;
                    if (i12 == 1) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.k, true), iIntValue, iIntValue2, 33);
                    } else if (i12 == 2) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.k), iIntValue, iIntValue2, 33);
                    } else if (i12 == 3) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.k / 100.0f), iIntValue, iIntValue2, 33);
                    }
                }
            }
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.k;
                if (i13 < (arrayList == null ? 0 : arrayList.size())) {
                    ArrayList arrayList2 = this.k;
                    if (arrayList2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    ((b) arrayList2.get(i13)).d(map, treeMap);
                    i13++;
                }
            }
        }
    }

    public final void e(TreeSet treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f11096a);
        if (z10 || zEquals) {
            long j10 = this.f11099d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f11100e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.k == null) {
            return;
        }
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            ((b) this.k.get(i10)).e(treeSet, z10 || zEquals);
        }
    }
}
