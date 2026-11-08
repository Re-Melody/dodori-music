package p160o7;

import E3.d;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: o7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2189s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f23791c = new d(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23793b;

    public void a(Long l10) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f23793b;
        if (priorityQueue.size() < this.f23792a) {
            priorityQueue.add(l10);
            return;
        }
        if (l10.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l10);
        }
    }
}
