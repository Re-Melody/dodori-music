package W7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12939b;

    public m(String str, List list) {
        this.f12938a = str;
        this.f12939b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f12938a;
        if (str != null) {
            if (!str.equals(mVar.f12938a)) {
                return false;
            }
        } else if (mVar.f12938a != null) {
            return false;
        }
        List list = this.f12939b;
        if (list.size() != mVar.f12939b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            boolean z10 = list.get(i10) instanceof byte[];
            List list2 = mVar.f12939b;
            if (z10 && (list2.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                    return false;
                }
            } else if (!list.get(i10).equals(list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f12938a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12938a);
        List list = this.f12939b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = StringUtils.SPACE + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
