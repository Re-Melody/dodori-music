package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p087i.a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14415b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f20384t);
        this.f14415b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f14414a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
