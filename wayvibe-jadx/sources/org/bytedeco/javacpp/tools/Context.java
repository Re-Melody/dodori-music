package org.bytedeco.javacpp.tools;

import B2.AbstractC0112b;
import V0.p;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
class Context {
    String cppName;
    boolean inaccessible;
    InfoMap infoMap;
    String javaName;
    String namespace;
    Map<String, String> namespaceMap;
    TemplateMap templateMap;
    List<String> usingList;
    Declarator variable;
    boolean virtualize;

    public Context() {
        this.namespace = null;
        this.cppName = null;
        this.javaName = null;
        this.inaccessible = false;
        this.virtualize = false;
        this.variable = null;
        this.infoMap = null;
        this.templateMap = null;
        this.usingList = null;
        this.namespaceMap = null;
        this.usingList = new ArrayList();
        this.namespaceMap = new HashMap();
    }

    public String[] qualify(String str) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }
        for (Map.Entry<String, String> entry : this.namespaceMap.entrySet()) {
            str = str.replaceAll(b.m(new StringBuilder(), entry.getKey(), "::"), entry.getValue() + "::");
        }
        if (str.startsWith("::")) {
            return new String[]{str.substring(2)};
        }
        ArrayList arrayList = new ArrayList();
        String strSubstring = this.namespace;
        if (strSubstring == null) {
            strSubstring = "";
        }
        while (strSubstring != null) {
            String strB = strSubstring.length() > 0 ? p.B(strSubstring, "::", str) : str;
            for (TemplateMap templateMap = this.templateMap; templateMap != null; templateMap = templateMap.parent) {
                if (strB.equals(templateMap.getName())) {
                    String string = "<";
                    String str2 = "";
                    for (Type type : templateMap.values()) {
                        if (type != null) {
                            StringBuilder sbT = p.t(string, str2);
                            sbT.append(type.cppName);
                            string = sbT.toString();
                            str2 = f.f16451a;
                        }
                    }
                    StringBuilder sbT2 = p.t(strB, string);
                    sbT2.append(string.endsWith(">") ? " >" : ">");
                    arrayList.add(sbT2.toString());
                    break;
                }
            }
            arrayList.add(strB);
            String strNormalize = this.infoMap.normalize(strSubstring, false, true);
            int iLastIndexOf = strNormalize.lastIndexOf("::");
            strSubstring = iLastIndexOf >= 0 ? strNormalize.substring(0, iLastIndexOf) : strNormalize.length() > 0 ? "" : null;
        }
        for (String str3 : this.usingList) {
            String strNormalize2 = this.infoMap.normalize(str, false, true);
            int iLastIndexOf2 = str3.lastIndexOf("::") + 2;
            String strSubstring2 = str3.substring(0, iLastIndexOf2);
            String strSubstring3 = str3.substring(iLastIndexOf2);
            if (strSubstring3.length() == 0 || strNormalize2.equals(strSubstring3)) {
                arrayList.add(strSubstring2 + str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String shorten(String str) {
        if (this.javaName == null) {
            return str;
        }
        String strJ = AbstractC0112b.j(new StringBuilder(), this.javaName, com.amazon.a.a.o.c.a.b.f16463a);
        int i10 = 0;
        for (int i11 = 0; i11 < str.length() && i11 < strJ.length() && str.charAt(i11) == strJ.charAt(i11); i11++) {
            if (str.charAt(i11) == '.') {
                i10 = i11;
            }
        }
        return i10 > 0 ? str.substring(i10 + 1) : str;
    }

    public Context(Context context) {
        this.namespace = null;
        this.cppName = null;
        this.javaName = null;
        this.inaccessible = false;
        this.virtualize = false;
        this.variable = null;
        this.infoMap = null;
        this.templateMap = null;
        this.usingList = null;
        this.namespaceMap = null;
        this.namespace = context.namespace;
        this.cppName = context.cppName;
        this.javaName = context.javaName;
        this.inaccessible = context.inaccessible;
        this.variable = context.variable;
        this.infoMap = context.infoMap;
        this.templateMap = context.templateMap;
        this.usingList = context.usingList;
        this.namespaceMap = context.namespaceMap;
    }
}
