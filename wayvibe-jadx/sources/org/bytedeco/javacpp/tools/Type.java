package org.bytedeco.javacpp.tools;

/* JADX INFO: loaded from: classes2.dex */
class Type {
    String annotations;
    boolean anonymous;
    Type[] arguments;
    Attribute[] attributes;
    boolean constPointer;
    boolean constValue;
    boolean constructor;
    String cppName;
    boolean destructor;
    boolean friend;
    int indirections;
    String javaName;
    String[] javaNames;
    boolean operator;
    boolean reference;
    boolean simple;
    boolean staticMember;
    boolean typedef;
    boolean using;
    boolean value;
    boolean virtual;

    public Type() {
        this.indirections = 0;
        this.anonymous = false;
        this.constPointer = false;
        this.constValue = false;
        this.constructor = false;
        this.destructor = false;
        this.operator = false;
        this.simple = false;
        this.staticMember = false;
        this.using = false;
        this.reference = false;
        this.value = false;
        this.friend = false;
        this.typedef = false;
        this.virtual = false;
        this.annotations = "";
        this.cppName = "";
        this.javaName = "";
        this.javaNames = null;
        this.arguments = null;
        this.attributes = null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Type type = (Type) obj;
            if (this.cppName.equals(type.cppName) && this.javaName.equals(type.javaName)) {
                return true;
            }
        }
        return false;
    }

    public Type(String str) {
        this.indirections = 0;
        this.anonymous = false;
        this.constPointer = false;
        this.constValue = false;
        this.constructor = false;
        this.destructor = false;
        this.operator = false;
        this.simple = false;
        this.staticMember = false;
        this.using = false;
        this.reference = false;
        this.value = false;
        this.friend = false;
        this.typedef = false;
        this.virtual = false;
        this.annotations = "";
        this.javaNames = null;
        this.arguments = null;
        this.attributes = null;
        this.javaName = str;
        this.cppName = str;
    }
}
