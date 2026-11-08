package p143n0;

import B2.s;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.m;
import p133m0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends AbstractC2091s {
    private long createdSize = 9205357640488583168L;
    private Shader internalShader;

    @Override // p143n0.AbstractC2091s
    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public final void mo913applyToPq9zytI(long j10, S s8, float f10) {
        Shader shaderMo437createShaderuvyYCjk = this.internalShader;
        if (shaderMo437createShaderuvyYCjk == null || !f.a(this.createdSize, j10)) {
            if (f.e(j10)) {
                shaderMo437createShaderuvyYCjk = null;
                this.internalShader = null;
                this.createdSize = 9205357640488583168L;
            } else {
                shaderMo437createShaderuvyYCjk = mo437createShaderuvyYCjk(j10);
                this.internalShader = shaderMo437createShaderuvyYCjk;
                this.createdSize = j10;
            }
        }
        s sVar = (s) s8;
        long jC = W.c(((Paint) sVar.f619b).getColor());
        long j11 = C2096x.f22792b;
        if (!C2096x.c(jC, j11)) {
            sVar.l(j11);
        }
        if (!m.b((Shader) sVar.f620c, shaderMo437createShaderuvyYCjk)) {
            sVar.o(shaderMo437createShaderuvyYCjk);
        }
        if (((Paint) sVar.f619b).getAlpha() / 255.0f == f10) {
            return;
        }
        sVar.j(f10);
    }

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo437createShaderuvyYCjk(long j10);
}
