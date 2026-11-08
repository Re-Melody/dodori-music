package p223v2;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;
import p027c.d;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f27450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, d dVar, int i10) {
        super(obj);
        this.f27449e = i10;
        this.f27450f = dVar;
    }

    @Override // p223v2.o
    public final void c(Object obj) {
        switch (this.f27449e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (MediaBrowserCompat$MediaItem) obj);
                this.f27450f.b(0, bundle);
                break;
            default:
                List list = (List) obj;
                d dVar = this.f27450f;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    dVar.b(0, bundle2);
                } else {
                    dVar.b(-1, null);
                }
                break;
        }
    }
}
