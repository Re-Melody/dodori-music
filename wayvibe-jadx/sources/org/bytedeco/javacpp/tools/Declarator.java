package org.bytedeco.javacpp.tools;

/* JADX INFO: loaded from: classes2.dex */
class Declarator {
    Type type = null;
    Parameters parameters = null;
    Declaration definition = null;
    int infoNumber = 0;
    int indices = 0;
    int indirections = 0;
    boolean constPointer = false;
    boolean operator = false;
    boolean reference = false;
    String cppName = "";
    String javaName = "";
    String signature = "";
}
