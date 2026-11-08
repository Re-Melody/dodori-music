package B8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f762c = Logger.getLogger(Y.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Y f763d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f764a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f765b = Collections.EMPTY_LIST;

    public static List a() {
        Logger logger = f762c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(E8.k.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e4);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e7) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e7);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
