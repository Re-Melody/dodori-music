package org.bytedeco.javacpp.tools;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
class TemplateMap extends LinkedHashMap<String, Type> {
    TemplateMap parent;
    Type type = null;
    Declarator declarator = null;
    boolean variadic = false;

    public TemplateMap(TemplateMap templateMap) {
        this.parent = templateMap;
    }

    public boolean empty() {
        Iterator<Type> it = values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return false;
            }
        }
        return !isEmpty();
    }

    public boolean full() {
        Iterator<Type> it = values().iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public Type get(String str) {
        TemplateMap templateMap;
        Type type = (Type) super.get((Object) str);
        return (type != null || (templateMap = this.parent) == null) ? type : templateMap.get(str);
    }

    public String getName() {
        Type type = this.type;
        if (type != null) {
            return type.cppName;
        }
        Declarator declarator = this.declarator;
        if (declarator != null) {
            return declarator.cppName;
        }
        return null;
    }
}
