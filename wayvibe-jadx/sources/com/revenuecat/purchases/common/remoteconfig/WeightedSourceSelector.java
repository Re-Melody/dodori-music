package com.revenuecat.purchases.common.remoteconfig;

import D7.W;
import N8.n;
import N8.o;
import R3.a;
import com.revenuecat.purchases.common.remoteconfig.WeightedSource;
import d9.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class WeightedSourceSelector<T extends WeightedSource> {
    private static final Companion Companion = new Companion(null);
    private T current;
    private Iterator<? extends T> iterator;
    private final List<T> orderedSources;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final <T extends WeightedSource> List<T> computeOrder(List<? extends T> sources, d random) {
            m.f(sources, "sources");
            m.f(random, "random");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : sources) {
                Integer numValueOf = Integer.valueOf(((WeightedSource) obj).getPriority());
                Object arrayList = linkedHashMap.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            List listR0 = n.R0(new Comparator() { // from class: com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector$Companion$computeOrder$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return a.v((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
                }
            }, linkedHashMap.entrySet());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                n.u0(arrayList2, WeightedSourceSelector.Companion.weightedShuffle((List) ((Map.Entry) it.next()).getValue(), random));
            }
            return arrayList2;
        }

        public final int sumOrIntMax(int i10, int i11) {
            long j10 = ((long) i10) + ((long) i11);
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return (int) j10;
        }

        public final <T extends WeightedSource> int weightedPickIndex(List<? extends T> sources, d random) {
            int i10;
            m.f(sources, "sources");
            m.f(random, "random");
            ArrayList arrayList = new ArrayList(o.o0(sources, 10));
            Iterator<T> it = sources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(Integer.valueOf(Math.max(0, ((WeightedSource) it.next()).getWeight())));
            }
            Iterator it2 = arrayList.iterator();
            int iSumOrIntMax = 0;
            while (it2.hasNext()) {
                iSumOrIntMax = sumOrIntMax(iSumOrIntMax, ((Number) it2.next()).intValue());
            }
            if (iSumOrIntMax <= 0) {
                return random.g(sources.size());
            }
            int iG = random.g(iSumOrIntMax);
            int iG2 = W.G(arrayList);
            int size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                iG -= ((Number) arrayList.get(i10)).intValue();
                if (iG < 0) {
                    return i10;
                }
            }
            return iG2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T extends WeightedSource> List<T> weightedShuffle(List<? extends T> tier, d random) {
            m.f(tier, "tier");
            m.f(random, "random");
            if (tier.size() <= 1) {
                return tier;
            }
            ArrayList arrayListY0 = n.Y0(tier);
            ArrayList arrayList = new ArrayList(arrayListY0.size());
            while (arrayListY0.size() > 1) {
                arrayList.add(arrayListY0.remove(weightedPickIndex(arrayListY0, random)));
            }
            arrayList.add(n.B0(arrayListY0));
            return arrayList;
        }

        private Companion() {
        }
    }

    public WeightedSourceSelector(List<? extends T> sources, d random) {
        m.f(sources, "sources");
        m.f(random, "random");
        List<T> listComputeOrder = Companion.computeOrder(sources, random);
        this.orderedSources = listComputeOrder;
        this.iterator = listComputeOrder.iterator();
        this.current = (T) nextOrNull();
    }

    private final T nextOrNull() {
        if (this.iterator.hasNext()) {
            return this.iterator.next();
        }
        return null;
    }

    public final T advance() {
        T t10 = (T) nextOrNull();
        this.current = t10;
        return t10;
    }

    public final T getCurrent() {
        return this.current;
    }

    public final void reset() {
        this.iterator = this.orderedSources.iterator();
        this.current = (T) nextOrNull();
    }

    public /* synthetic */ WeightedSourceSelector(List list, d dVar, int i10, f fVar) {
        this(list, (i10 & 2) != 0 ? d.f19429a : dVar);
    }
}
