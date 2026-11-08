package p262z0;

import D4.u;
import android.view.MotionEvent;
import java.util.List;
import p161o8.p;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f29756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29758d;

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    public i(List list, u uVar) {
        this.f29755a = list;
        this.f29756b = uVar;
        MotionEvent motionEvent = uVar != null ? (MotionEvent) ((p) uVar.f2107d).f23830b : null;
        int i10 = 0;
        this.f29757c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = uVar != null ? (MotionEvent) ((p) uVar.f2107d).f23830b : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = uVar != null ? (MotionEvent) ((p) uVar.f2107d).f23830b : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i10 = 1;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i10 < size) {
                    r rVar = (r) list.get(i10);
                    if (p.c(rVar)) {
                        i10 = 2;
                    } else if (p.a(rVar)) {
                        i10 = 1;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = 3;
                }
            }
        }
        this.f29758d = i10;
    }
}
