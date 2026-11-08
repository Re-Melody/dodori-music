package org.bytedeco.javacpp.tools;

/* JADX INFO: loaded from: classes2.dex */
class Declaration {
    Type type = null;
    Declarator declarator = null;
    boolean abstractMember = false;
    boolean constMember = false;
    boolean inaccessible = false;
    boolean incomplete = false;
    boolean function = false;
    boolean variable = false;
    boolean comment = false;
    String signature = "";
    String text = "";
}
