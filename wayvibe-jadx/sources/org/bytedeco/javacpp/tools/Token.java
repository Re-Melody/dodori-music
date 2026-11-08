package org.bytedeco.javacpp.tools;

import java.io.File;
import org.apache.tika.metadata.TikaCoreProperties;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
class Token implements Comparable<Token> {
    static final int COMMENT = 4;
    static final int FLOAT = 2;
    static final int IDENTIFIER = 5;
    static final int INTEGER = 1;
    static final int STRING = 3;
    static final int SYMBOL = 6;
    File file;
    int lineNumber;
    String spacing;
    String text;
    int type;
    String value;
    static final Token EOF = new Token(-1, "EOF");
    static final Token AUTO = new Token(5, "auto");
    static final Token CONST = new Token(5, "const");
    static final Token __CONST = new Token(5, "__const");
    static final Token CONSTEXPR = new Token(5, "constexpr");
    static final Token DECLTYPE = new Token(5, "decltype");
    static final Token DEFAULT = new Token(5, "default");
    static final Token DEFINE = new Token(5, "define");
    static final Token IF = new Token(5, "if");
    static final Token IFDEF = new Token(5, "ifdef");
    static final Token IFNDEF = new Token(5, "ifndef");
    static final Token ELIF = new Token(5, "elif");
    static final Token ELSE = new Token(5, "else");
    static final Token ENDIF = new Token(5, "endif");
    static final Token ENUM = new Token(5, "enum");
    static final Token EXPLICIT = new Token(5, "explicit");
    static final Token EXTERN = new Token(5, "extern");
    static final Token FINAL = new Token(5, "final");
    static final Token FRIEND = new Token(5, "friend");
    static final Token INLINE = new Token(5, "inline");
    static final Token STATIC = new Token(5, "static");
    static final Token CLASS = new Token(5, "class");
    static final Token INTERFACE = new Token(5, "interface");
    static final Token __INTERFACE = new Token(5, "__interface");
    static final Token MUTABLE = new Token(5, "mutable");
    static final Token STRUCT = new Token(5, "struct");
    static final Token UNION = new Token(5, "union");
    static final Token TEMPLATE = new Token(5, "template");
    static final Token TYPEDEF = new Token(5, "typedef");
    static final Token TYPENAME = new Token(5, "typename");
    static final Token USING = new Token(5, "using");
    static final Token NAMESPACE = new Token(5, "namespace");
    static final Token NEW = new Token(5, "new");
    static final Token DELETE = new Token(5, "delete");
    static final Token OPERATOR = new Token(5, "operator");
    static final Token PRIVATE = new Token(5, "private");
    static final Token PROTECTED = new Token(5, TikaCoreProperties.PROTECTED);
    static final Token PUBLIC = new Token(5, "public");
    static final Token REGISTER = new Token(5, "register");
    static final Token THREAD_LOCAL = new Token(5, "thread_local");
    static final Token VIRTUAL = new Token(5, "virtual");
    static final Token VOLATILE = new Token(5, "volatile");

    public Token() {
        this.file = null;
        this.text = null;
        this.lineNumber = 0;
        this.type = -1;
        this.spacing = "";
        this.value = "";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == Integer.class) {
            return this.type == ((Integer) obj).intValue();
        }
        if (obj.getClass() == Character.class) {
            return this.type == ((Character) obj).charValue();
        }
        if (obj.getClass() == String.class) {
            return obj.equals(this.value);
        }
        if (obj.getClass() == getClass()) {
            Token token = (Token) obj;
            if (this.type == token.type && (((str = this.value) == null && token.value == null) || (str != null && str.equals(token.value)))) {
                return true;
            }
        }
        return false;
    }

    public Token expect(Object... objArr) throws ParserException {
        if (match(objArr)) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.file);
        sb.append(":");
        sb.append(this.lineNumber);
        sb.append(":");
        sb.append(this.text != null ? b.m(new StringBuilder("\""), this.text, "\": ") : "");
        sb.append("Unexpected token '");
        throw new ParserException(b.m(sb, toString(), "'"));
    }

    public int hashCode() {
        return this.type;
    }

    public boolean isEmpty() {
        return this.type == -1 && this.spacing.isEmpty();
    }

    public boolean match(Object... objArr) {
        boolean z10 = false;
        for (Object obj : objArr) {
            z10 = z10 || equals(obj);
        }
        return z10;
    }

    public String toString() {
        String str = this.value;
        return (str == null || str.length() <= 0) ? String.valueOf((char) this.type) : this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(Token token) {
        return toString().compareTo(token.toString());
    }

    public Token(int i10, String str) {
        this.file = null;
        this.text = null;
        this.lineNumber = 0;
        this.spacing = "";
        this.type = i10;
        this.value = str;
    }

    public Token(Token token) {
        this.file = null;
        this.text = null;
        this.lineNumber = 0;
        this.type = -1;
        this.spacing = "";
        this.value = "";
        this.file = token.file;
        this.text = token.text;
        this.lineNumber = token.lineNumber;
        this.type = token.type;
        this.spacing = token.spacing;
        this.value = token.value;
    }
}
