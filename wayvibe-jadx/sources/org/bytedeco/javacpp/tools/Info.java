package org.bytedeco.javacpp.tools;

/* JADX INFO: loaded from: classes2.dex */
public class Info {
    String[] annotations;
    String base;
    boolean cast;
    String[] cppNames;
    String cppText;
    String[] cppTypes;
    boolean define;
    boolean enumerate;
    boolean flatten;
    String[] javaNames;
    String javaText;
    String[] linePatterns;
    String[] pointerTypes;
    boolean purify;
    boolean skip;
    boolean skipDefaults;
    boolean translate;
    String[] valueTypes;
    boolean virtualize;

    public Info() {
        this.cppNames = null;
        this.javaNames = null;
        this.annotations = null;
        this.cppTypes = null;
        this.valueTypes = null;
        this.pointerTypes = null;
        this.linePatterns = null;
        this.cast = false;
        this.define = false;
        this.enumerate = false;
        this.flatten = false;
        this.translate = false;
        this.skip = false;
        this.skipDefaults = false;
        this.purify = false;
        this.virtualize = false;
        this.base = null;
        this.cppText = null;
        this.javaText = null;
    }

    public Info annotations(String... strArr) {
        this.annotations = strArr;
        return this;
    }

    public Info base(String str) {
        this.base = str;
        return this;
    }

    public Info cast() {
        this.cast = true;
        return this;
    }

    public Info cppNames(String... strArr) {
        this.cppNames = strArr;
        return this;
    }

    public Info cppText(String str) {
        this.cppText = str;
        return this;
    }

    public Info cppTypes(String... strArr) {
        this.cppTypes = strArr;
        return this;
    }

    public Info define() {
        this.define = true;
        return this;
    }

    public Info enumerate() {
        this.enumerate = true;
        return this;
    }

    public Info flatten() {
        this.flatten = true;
        return this;
    }

    public Info javaNames(String... strArr) {
        this.javaNames = strArr;
        return this;
    }

    public Info javaText(String str) {
        this.javaText = str;
        return this;
    }

    public Info linePatterns(String... strArr) {
        this.linePatterns = strArr;
        return this;
    }

    public Info pointerTypes(String... strArr) {
        this.pointerTypes = strArr;
        return this;
    }

    public Info purify() {
        this.purify = true;
        return this;
    }

    public Info skip() {
        this.skip = true;
        return this;
    }

    public Info skipDefaults() {
        this.skipDefaults = true;
        return this;
    }

    public Info translate() {
        this.translate = true;
        return this;
    }

    public Info valueTypes(String... strArr) {
        this.valueTypes = strArr;
        return this;
    }

    public Info virtualize() {
        this.virtualize = true;
        return this;
    }

    public Info cast(boolean z10) {
        this.cast = z10;
        return this;
    }

    public Info define(boolean z10) {
        this.define = z10;
        return this;
    }

    public Info enumerate(boolean z10) {
        this.enumerate = z10;
        return this;
    }

    public Info flatten(boolean z10) {
        this.flatten = z10;
        return this;
    }

    public Info purify(boolean z10) {
        this.purify = z10;
        return this;
    }

    public Info skip(boolean z10) {
        this.skip = z10;
        return this;
    }

    public Info skipDefaults(boolean z10) {
        this.skipDefaults = this.skip;
        return this;
    }

    public Info translate(boolean z10) {
        this.translate = z10;
        return this;
    }

    public Info virtualize(boolean z10) {
        this.virtualize = z10;
        return this;
    }

    public Info(String... strArr) {
        this.javaNames = null;
        this.annotations = null;
        this.cppTypes = null;
        this.valueTypes = null;
        this.pointerTypes = null;
        this.linePatterns = null;
        this.cast = false;
        this.define = false;
        this.enumerate = false;
        this.flatten = false;
        this.translate = false;
        this.skip = false;
        this.skipDefaults = false;
        this.purify = false;
        this.virtualize = false;
        this.base = null;
        this.cppText = null;
        this.javaText = null;
        this.cppNames = strArr;
    }

    public Info(Info info) {
        this.cppNames = null;
        this.javaNames = null;
        this.annotations = null;
        this.cppTypes = null;
        this.valueTypes = null;
        this.pointerTypes = null;
        this.linePatterns = null;
        this.cast = false;
        this.define = false;
        this.enumerate = false;
        this.flatten = false;
        this.translate = false;
        this.skip = false;
        this.skipDefaults = false;
        this.purify = false;
        this.virtualize = false;
        this.base = null;
        this.cppText = null;
        this.javaText = null;
        String[] strArr = info.cppNames;
        this.cppNames = strArr != null ? (String[]) strArr.clone() : null;
        String[] strArr2 = info.javaNames;
        this.javaNames = strArr2 != null ? (String[]) strArr2.clone() : null;
        String[] strArr3 = info.annotations;
        this.annotations = strArr3 != null ? (String[]) strArr3.clone() : null;
        String[] strArr4 = info.cppTypes;
        this.cppTypes = strArr4 != null ? (String[]) strArr4.clone() : null;
        String[] strArr5 = info.valueTypes;
        this.valueTypes = strArr5 != null ? (String[]) strArr5.clone() : null;
        String[] strArr6 = info.pointerTypes;
        this.pointerTypes = strArr6 != null ? (String[]) strArr6.clone() : null;
        this.cast = info.cast;
        this.define = info.define;
        this.flatten = info.flatten;
        this.translate = info.translate;
        this.skip = info.skip;
        this.purify = info.purify;
        this.virtualize = info.virtualize;
        this.base = info.base;
        this.cppText = info.cppText;
        this.javaText = info.javaText;
    }
}
