package Ha;

import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static void a(Object... args) {
        m.f(args, "args");
        for (a aVar : b.f6246c) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            aVar.getClass();
            a(objArrCopyOf);
        }
    }

    public static void b(Object... args) {
        m.f(args, "args");
        for (a aVar : b.f6246c) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            aVar.getClass();
            b(objArrCopyOf);
        }
    }

    public static void c(Object... args) {
        m.f(args, "args");
        for (a aVar : b.f6246c) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            aVar.getClass();
            c(objArrCopyOf);
        }
    }
}
