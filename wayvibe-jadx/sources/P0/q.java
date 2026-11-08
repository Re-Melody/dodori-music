package P0;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q implements v {
    @Override // P0.v
    public StaticLayout a(w wVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(wVar.f9487a, 0, wVar.f9488b, wVar.f9489c, wVar.f9490d);
        builderObtain.setTextDirection(wVar.f9491e);
        builderObtain.setAlignment(wVar.f9492f);
        builderObtain.setMaxLines(wVar.f9493g);
        builderObtain.setEllipsize(wVar.f9494h);
        builderObtain.setEllipsizedWidth(wVar.f9495i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(wVar.k);
        builderObtain.setBreakStrategy(wVar.f9497l);
        builderObtain.setHyphenationFrequency(wVar.f9500o);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            r.a(builderObtain, wVar.f9496j);
        }
        if (i10 >= 28) {
            s.a(builderObtain, true);
        }
        if (i10 >= 33) {
            t.b(builderObtain, wVar.f9498m, wVar.f9499n);
        }
        return builderObtain.build();
    }
}
