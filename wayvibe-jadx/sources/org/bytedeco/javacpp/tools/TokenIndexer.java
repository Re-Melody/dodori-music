package org.bytedeco.javacpp.tools;

import B2.AbstractC0112b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class TokenIndexer {
    Token[] array;
    InfoMap infoMap;
    final boolean isCFile;
    boolean raw = false;
    int index = 0;
    int counter = 0;

    public TokenIndexer(InfoMap infoMap, Token[] tokenArr, boolean z10) {
        this.infoMap = infoMap;
        this.array = tokenArr;
        this.isCFile = z10;
    }

    public Token[] expand(Token[] tokenArr, int i10) {
        String str;
        int i11;
        int i12;
        List[] listArr;
        int i13;
        char c3;
        if (i10 < tokenArr.length && this.infoMap.containsKey(tokenArr[i10].value)) {
            Info info = null;
            for (Info info2 : this.infoMap.get(tokenArr[i10].value)) {
                if (info2 != null && info2.cppText != null) {
                    info = info2;
                }
            }
            if (info != null && (str = info.cppText) != null) {
                try {
                    Token token = tokenArr[i10];
                    Tokenizer tokenizer = new Tokenizer(str, token.file, token.lineNumber);
                    if (tokenizer.nextToken().match('#') && tokenizer.nextToken().match(Token.DEFINE) && tokenizer.nextToken().match(info.cppNames[0])) {
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = 0; i14 < i10; i14++) {
                            arrayList.add(tokenArr[i14]);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Token tokenNextToken = tokenizer.nextToken();
                        if (info.cppNames[0].equals("__COUNTER__")) {
                            int i15 = this.counter;
                            this.counter = i15 + 1;
                            tokenNextToken.value = Integer.toString(i15);
                        }
                        String str2 = tokenArr[i10].value;
                        if (tokenNextToken.match('(')) {
                            tokenNextToken = tokenizer.nextToken();
                            while (true) {
                                c3 = ')';
                                if (tokenNextToken.isEmpty()) {
                                    break;
                                }
                                if (!tokenNextToken.match(5)) {
                                    if (tokenNextToken.match(')')) {
                                        tokenNextToken = tokenizer.nextToken();
                                        break;
                                    }
                                } else {
                                    arrayList2.add(tokenNextToken.value);
                                }
                                tokenNextToken = tokenizer.nextToken();
                            }
                            int i16 = i10 + 1;
                            if (arrayList2.size() <= 0 || (i16 < tokenArr.length && tokenArr[i16].match('('))) {
                                str2 = str2 + tokenArr[i16].spacing + tokenArr[i16];
                                int size = arrayList2.size();
                                listArr = new List[size];
                                i12 = i10 + 2;
                                int i17 = 0;
                                int i18 = 0;
                                while (i12 < tokenArr.length) {
                                    Token token2 = tokenArr[i12];
                                    char c9 = c3;
                                    str2 = str2 + token2.spacing + token2;
                                    if (i18 == 0 && token2.match(Character.valueOf(c9))) {
                                        break;
                                    }
                                    if (i18 == 0 && token2.match(',')) {
                                        i17++;
                                    } else {
                                        if (token2.match('(', '[', '{')) {
                                            i18++;
                                        } else if (token2.match(Character.valueOf(c9), ']', '}')) {
                                            i18--;
                                        }
                                        if (i17 < size) {
                                            if (listArr[i17] == null) {
                                                listArr[i17] = new ArrayList();
                                            }
                                            listArr[i17].add(token2);
                                        }
                                    }
                                    i12++;
                                    c3 = c9;
                                }
                                for (int i19 = 0; i19 < size; i19++) {
                                    if (this.infoMap.containsKey(((Token) listArr[i19].get(0)).value)) {
                                        List list = listArr[i19];
                                        listArr[i19] = Arrays.asList(expand((Token[]) list.toArray(new Token[list.size()]), 0));
                                    }
                                }
                                i11 = 0;
                            }
                        } else {
                            i11 = 0;
                            i12 = i10;
                            listArr = null;
                        }
                        int size2 = arrayList.size();
                        Info first = this.infoMap.getFirst(str2);
                        while (true) {
                            if ((first != null && first.skip) || tokenNextToken.isEmpty()) {
                                break;
                            }
                            int i20 = i11;
                            while (true) {
                                if (i20 >= arrayList2.size()) {
                                    if (tokenNextToken.type == -1) {
                                        tokenNextToken.type = 4;
                                    }
                                    arrayList.add(tokenNextToken);
                                    break;
                                }
                                if (((String) arrayList2.get(i20)).equals(tokenNextToken.value)) {
                                    String str3 = tokenNextToken.spacing;
                                    Iterator it = listArr[i20].iterator();
                                    while (it.hasNext()) {
                                        Token token3 = new Token((Token) it.next());
                                        if (str3 != null) {
                                            token3.spacing += str3;
                                        }
                                        arrayList.add(token3);
                                        str3 = null;
                                    }
                                    break;
                                }
                                i20++;
                            }
                            tokenNextToken = tokenizer.nextToken();
                        }
                        int i21 = size2;
                        while (i21 < arrayList.size()) {
                            if (((Token) arrayList.get(i21)).match("##") && i21 > 0 && (i13 = i21 + 1) < arrayList.size()) {
                                StringBuilder sb = new StringBuilder();
                                Token token4 = (Token) arrayList.get(i21 - 1);
                                sb.append(token4.value);
                                sb.append(((Token) arrayList.get(i13)).value);
                                token4.value = sb.toString();
                                arrayList.remove(i21);
                                arrayList.remove(i21);
                                i21--;
                            }
                            i21++;
                        }
                        while (true) {
                            i12++;
                            if (i12 >= tokenArr.length) {
                                break;
                            }
                            arrayList.add(tokenArr[i12]);
                        }
                        if ((first == null || !first.skip) && size2 < arrayList.size()) {
                            ((Token) arrayList.get(size2)).spacing = tokenArr[i10].spacing;
                        }
                        return (Token[]) arrayList.toArray(new Token[arrayList.size()]);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return tokenArr;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x018d A[PHI: r10
  0x018d: PHI (r10v4 org.bytedeco.javacpp.tools.Info) = 
  (r10v1 org.bytedeco.javacpp.tools.Info)
  (r10v1 org.bytedeco.javacpp.tools.Info)
  (r10v5 org.bytedeco.javacpp.tools.Info)
  (r10v5 org.bytedeco.javacpp.tools.Info)
 binds: [B:65:0x01b2, B:66:0x01b4, B:61:0x01a1, B:56:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x018f A[PHI: r10
  0x018f: PHI (r10v3 org.bytedeco.javacpp.tools.Info) = 
  (r10v1 org.bytedeco.javacpp.tools.Info)
  (r10v5 org.bytedeco.javacpp.tools.Info)
  (r10v5 org.bytedeco.javacpp.tools.Info)
 binds: [B:66:0x01b4, B:61:0x01a1, B:56:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    public Token[] filter(Token[] tokenArr, int i10) {
        Token token;
        int i11 = i10;
        int i12 = i11 + 1;
        if (i12 < tokenArr.length) {
            char c3 = '#';
            if (tokenArr[i11].match('#') && tokenArr[i12].match(Token.IF, Token.IFDEF, Token.IFNDEF)) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < i11; i13++) {
                    arrayList.add(tokenArr[i13]);
                }
                int i14 = 1;
                boolean z10 = true;
                int i15 = 0;
                boolean z11 = false;
                Info first = null;
                while (i11 < tokenArr.length) {
                    String str = tokenArr[i11].spacing;
                    int iLastIndexOf = str.lastIndexOf(10) + i14;
                    if (tokenArr[i11].match(Character.valueOf(c3))) {
                        int i16 = i11 + 1;
                        Token token2 = tokenArr[i16];
                        Token token3 = Token.IF;
                        Token token4 = Token.IFDEF;
                        Token token5 = Token.IFNDEF;
                        if (token2.match(token3, token4, token5)) {
                            i15++;
                        }
                        token = (i15 == i14 && tokenArr[i16].match(token3, token4, token5, Token.ELIF, Token.ELSE, Token.ENDIF)) ? tokenArr[i16] : null;
                        if (tokenArr[i16].match(Token.ENDIF)) {
                            i15--;
                        }
                    } else {
                        token = null;
                    }
                    if (token != null) {
                        i11 += 2;
                        Token token6 = new Token();
                        int i17 = 4;
                        token6.type = 4;
                        token6.spacing = str.substring(0, iLastIndexOf);
                        token6.value = "// " + str.substring(iLastIndexOf) + "#" + token.spacing + token;
                        arrayList.add(token6);
                        String string = "";
                        while (i11 < tokenArr.length && tokenArr[i11].spacing.indexOf(10) < 0) {
                            if (!tokenArr[i11].match(Integer.valueOf(i17))) {
                                StringBuilder sbO = AbstractC0112b.o(string);
                                sbO.append(tokenArr[i11].spacing);
                                sbO.append(tokenArr[i11]);
                                string = sbO.toString();
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(token6.value);
                            String str2 = "\n// ";
                            if (!tokenArr[i11].match("\n")) {
                                str2 = tokenArr[i11].spacing + tokenArr[i11].toString().replaceAll("\n", "\n// ");
                            }
                            sb.append(str2);
                            token6.value = sb.toString();
                            i11++;
                            i17 = 4;
                        }
                        Token token7 = Token.IF;
                        Token token8 = Token.IFDEF;
                        Token token9 = Token.IFNDEF;
                        if (token.match(token7, token8, token9, Token.ELIF)) {
                            z10 = first == null || !z11;
                            first = this.infoMap.getFirst(string);
                            if (first == null) {
                                try {
                                    if (Integer.decode(string.trim()).intValue() != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            } else if (!token.match(token9)) {
                                z10 = first.define;
                            } else if (first.define) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (!token.match(Token.ELSE)) {
                            if (token.match(Token.ENDIF) && i15 == 0) {
                                break;
                            }
                        } else if (first == null || !z10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (z10) {
                        arrayList.add(tokenArr[i11]);
                        i11++;
                    } else {
                        i11++;
                    }
                    z11 = z10 || z11;
                    c3 = '#';
                    i14 = 1;
                }
                while (i11 < tokenArr.length) {
                    arrayList.add(tokenArr[i11]);
                    i11++;
                }
                return (Token[]) arrayList.toArray(new Token[arrayList.size()]);
            }
        }
        return tokenArr;
    }

    public Token get() {
        return get(0);
    }

    public Token next() {
        int iPreprocess = this.raw ? this.index + 1 : preprocess(this.index, 1);
        this.index = iPreprocess;
        Token[] tokenArr = this.array;
        if (iPreprocess < tokenArr.length) {
            return tokenArr[iPreprocess];
        }
        Token token = tokenArr[tokenArr.length - 1];
        Token token2 = Token.EOF;
        if (!token.match(token2)) {
            return token2;
        }
        Token[] tokenArr2 = this.array;
        return tokenArr2[tokenArr2.length - 1];
    }

    public int preprocess(int i10, int i11) {
        Token[] tokenArr;
        Token[] tokenArr2;
        while (true) {
            tokenArr = null;
            if (i10 >= this.array.length) {
                break;
            }
            Token[] tokenArr3 = null;
            while (true) {
                tokenArr2 = this.array;
                if (tokenArr3 == tokenArr2) {
                    break;
                }
                Token[] tokenArrFilter = filter(tokenArr2, i10);
                this.array = tokenArrFilter;
                this.array = expand(tokenArrFilter, i10);
                tokenArr3 = tokenArr2;
            }
            if (!tokenArr2[i10].match(4) && (i11 = i11 - 1) < 0) {
                break;
            }
            i10++;
        }
        while (true) {
            Token[] tokenArr4 = this.array;
            if (tokenArr == tokenArr4) {
                return i10;
            }
            Token[] tokenArrFilter2 = filter(tokenArr4, i10);
            this.array = tokenArrFilter2;
            this.array = expand(tokenArrFilter2, i10);
            tokenArr = tokenArr4;
        }
    }

    public Token get(int i10) {
        int iPreprocess = this.raw ? this.index + i10 : preprocess(this.index, i10);
        Token[] tokenArr = this.array;
        if (iPreprocess < tokenArr.length) {
            return tokenArr[iPreprocess];
        }
        Token token = tokenArr[tokenArr.length - 1];
        Token token2 = Token.EOF;
        if (!token.match(token2)) {
            return token2;
        }
        Token[] tokenArr2 = this.array;
        return tokenArr2[tokenArr2.length - 1];
    }
}
