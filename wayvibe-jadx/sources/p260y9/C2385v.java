package p260y9;

import A9.p;
import D7.W;
import M8.j;
import M8.q;
import N8.s;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p134m1.b;
import p219u9.a;
import p219u9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: renamed from: y9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2385v implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29333a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29336d;

    public C2385v(String str, Object objectInstance) {
        m.f(objectInstance, "objectInstance");
        this.f29334b = objectInstance;
        this.f29335c = s.f8650a;
        this.f29336d = W.R(j.PUBLICATION, new p(26, str, this));
    }

    @Override // p219u9.a
    public final Object deserialize(c decoder) {
        switch (this.f29333a) {
            case 0:
                m.f(decoder, "decoder");
                int iV = decoder.v(getDescriptor());
                Enum[] enumArr = (Enum[]) this.f29334b;
                if (iV >= 0 && iV < enumArr.length) {
                    return enumArr[iV];
                }
                throw new e(iV + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                m.f(decoder, "decoder");
                g descriptor = getDescriptor();
                p251x9.a aVarA = decoder.a(descriptor);
                int iQ = aVarA.q(getDescriptor());
                if (iQ != -1) {
                    throw new e(b.j(iQ, "Unexpected index "));
                }
                aVarA.c(descriptor);
                return this.f29334b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [M8.h, java.lang.Object] */
    @Override // p219u9.a
    public final g getDescriptor() {
        switch (this.f29333a) {
            case 0:
                return (g) ((q) this.f29336d).getValue();
            default:
                return (g) this.f29336d.getValue();
        }
    }

    @Override // p219u9.a
    public final void serialize(d encoder, Object value) {
        switch (this.f29333a) {
            case 0:
                Enum value2 = (Enum) value;
                m.f(encoder, "encoder");
                m.f(value2, "value");
                Enum[] enumArr = (Enum[]) this.f29334b;
                int iV0 = N8.m.v0(value2, enumArr);
                if (iV0 != -1) {
                    encoder.v(getDescriptor(), iV0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value2);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().a());
                sb.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                m.e(string, "toString(this)");
                sb.append(string);
                throw new e(sb.toString());
            default:
                m.f(encoder, "encoder");
                m.f(value, "value");
                encoder.a(getDescriptor()).c(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f29333a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2385v(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        m.f(objectInstance, "objectInstance");
        this.f29335c = N8.m.e0(annotationArr);
    }

    public C2385v(String str, Enum[] values) {
        m.f(values, "values");
        this.f29334b = values;
        this.f29336d = W.S(new p(25, this, str));
    }
}
