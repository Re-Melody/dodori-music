package O4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9160a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9161b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f9162c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SpannableStringBuilder f9163d = new SpannableStringBuilder();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9169j;

    public b(int i10, int i11) {
        a(i10, i11);
    }

    public final void a(int i10, int i11) {
        this.f9160a.clear();
        this.f9161b.clear();
        this.f9162c.clear();
        this.f9163d.clear();
        this.f9164e = 15;
        this.f9165f = 0;
        this.f9166g = 0;
        this.f9167h = i10;
        this.f9168i = i11;
        this.f9169j = -1;
    }

    public final void b(CharacterStyle characterStyle, int i10) {
        this.f9161b.add(new a(characterStyle, this.f9163d.length(), i10));
    }

    public final boolean c() {
        return this.f9160a.isEmpty() && this.f9161b.isEmpty() && this.f9162c.isEmpty() && this.f9163d.length() == 0;
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = this.f9163d;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f9160a;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.setSpan(arrayList.get(i11), 0, length, 33);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f9161b;
            if (i10 >= arrayList2.size()) {
                break;
            }
            a aVar = (a) arrayList2.get(i10);
            int size = arrayList2.size();
            int i12 = aVar.f9159c;
            spannableStringBuilder.setSpan(aVar.f9157a, aVar.f9158b, i10 < size - i12 ? ((a) arrayList2.get(i12 + i10)).f9158b : length, 33);
            i10++;
        }
        if (this.f9169j != -1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9169j, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final String toString() {
        return this.f9163d.toString();
    }
}
