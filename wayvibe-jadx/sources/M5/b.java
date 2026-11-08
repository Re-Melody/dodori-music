package M5;

import V0.p;
import android.util.Base64;
import com.google.android.gms.common.internal.E;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void b(StringBuilder sb, a aVar, Object obj) {
        int i10 = aVar.f8340b;
        if (i10 == 11) {
            Class cls = aVar.f8346h;
            E.h(cls);
            sb.append(((b) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(O5.b.a((String) obj));
            sb.append("\"");
        }
    }

    public static final Object zaD(a aVar, Object obj) {
        L5.a aVar2 = aVar.k;
        if (aVar2 != null) {
            obj = (String) aVar2.f7883c.get(((Integer) obj).intValue());
            if (obj == null && aVar2.f7882b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a aVar, Object obj) {
        L5.a aVar2 = aVar.k;
        E.h(aVar2);
        HashMap map = aVar2.f7882b;
        Integer num = (Integer) map.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) map.get("gms_unknown");
        }
        E.h(num2);
        int i10 = aVar.f8342d;
        String str = aVar.f8344f;
        switch (i10) {
            case 0:
                setIntegerInternal(aVar, str, num2.intValue());
                return;
            case 1:
                zaf(aVar, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(aVar, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(p134m1.b.j(i10, "Unsupported type for conversion: "));
            case 4:
                zan(aVar, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(aVar, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(aVar, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(aVar, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(aVar, str, (byte[]) num2);
                return;
        }
    }

    public <T extends b> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends b> void addConcreteTypeInternal(a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        String str = aVar.f8344f;
        if (aVar.f8346h == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + aVar.f8344f);
        }
        try {
            return getClass().getMethod(com.amazon.a.a.o.b.au + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f8342d != 11) {
            return isPrimitiveFieldSet(aVar.f8344f);
        }
        if (aVar.f8343e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object objZaD = zaD(aVar, getFieldValue(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(com.amazon.a.a.o.b.f.f16451a);
                }
                p.x(sb, "\"", str, "\":");
                if (objZaD != null) {
                    switch (aVar.f8342d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            O5.a.h(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (aVar.f8341c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb.append(com.amazon.a.a.o.b.f.f16451a);
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        b(sb, aVar, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                b(sb, aVar, objZaD);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.k != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f8344f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.k != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f8344f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f8344f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.k != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f8344f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.k != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f8344f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z10) {
        if (aVar.k != null) {
            a(aVar, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(aVar, aVar.f8344f, z10);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.k != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f8344f, bArr);
        }
    }

    public final void zam(a aVar, double d10) {
        if (aVar.k != null) {
            a(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f8344f, d10);
        }
    }

    public void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f10) {
        if (aVar.k != null) {
            a(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f8344f, f10);
        }
    }

    public void zar(a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i10) {
        if (aVar.k != null) {
            a(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f8344f, i10);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j10) {
        if (aVar.k != null) {
            a(aVar, Long.valueOf(j10));
        } else {
            setLongInternal(aVar, aVar.f8344f, j10);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.k != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f8344f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
