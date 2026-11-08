package Z5;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: Z5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0993h {
    Task getLastLocation();

    Task removeLocationUpdates(l lVar);

    Task requestLocationUpdates(LocationRequest locationRequest, l lVar, Looper looper);
}
