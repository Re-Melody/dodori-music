package p101j2;

import android.text.Editable;
import p078h2.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f21434a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f21435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f21436c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f21436c;
        return cls != null ? new q(cls, charSequence) : super.newEditable(charSequence);
    }
}
