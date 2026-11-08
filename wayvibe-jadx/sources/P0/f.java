package P0;

import android.app.NotificationChannel;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ NotificationChannel b(CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, 2);
    }

    public static /* synthetic */ Typeface.Builder d(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* synthetic */ Typeface.Builder f(File file) {
        return new Typeface.Builder(file);
    }

    public static /* synthetic */ Typeface.Builder g(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return BasicFileAttributes.class;
    }

    public static /* synthetic */ void q() {
    }
}
