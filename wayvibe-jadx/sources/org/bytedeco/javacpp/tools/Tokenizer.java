package org.bytedeco.javacpp.tools;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class Tokenizer implements Closeable {
    StringBuilder buffer;
    File file;
    int lastChar;
    int lineNumber;
    String lineSeparator;
    Reader reader;
    String text;

    public Tokenizer(Reader reader, File file, int i10) {
        this.file = null;
        this.text = null;
        this.reader = null;
        this.lineSeparator = null;
        this.lastChar = -1;
        this.lineNumber = 1;
        this.buffer = new StringBuilder();
        this.reader = reader;
        this.file = file;
        this.lineNumber = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    public void filterLines(String[] strArr, boolean z10) throws IOException {
        int i10;
        String line;
        if (strArr == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Reader reader = this.reader;
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(this.reader);
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                this.reader.close();
                this.reader = new StringReader(sb.toString());
                return;
            }
            int i11 = 0;
            while (i11 < strArr.length && !line2.matches(strArr[i11])) {
                i11 += 2;
            }
            if (i11 < strArr.length) {
                if (!z10) {
                    sb.append(line2.concat("\n"));
                }
                do {
                    i10 = i11 + 1;
                    if (i10 >= strArr.length || (line = bufferedReader.readLine()) == null) {
                        break;
                    } else if (!z10) {
                        sb.append(line.concat("\n"));
                    }
                } while (!line.matches(strArr[i10]));
            } else if (z10) {
                sb.append(line2.concat("\n"));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0224  */
    /* JADX WARN: Code duplicated, block: B:154:0x0226  */
    /* JADX WARN: Code duplicated, block: B:155:0x0228  */
    /* JADX WARN: Code duplicated, block: B:156:0x022a  */
    public Token nextToken() throws IOException {
        int i10;
        int i11;
        boolean z10;
        int i12;
        Token token = new Token();
        int i13 = readChar();
        int i14 = 0;
        this.buffer.setLength(0);
        int i15 = -1;
        if (Character.isWhitespace(i13)) {
            this.buffer.append((char) i13);
            while (true) {
                i13 = readChar();
                if (i13 == -1 || !Character.isWhitespace(i13)) {
                    break;
                }
                this.buffer.append((char) i13);
            }
        }
        token.file = this.file;
        token.text = this.text;
        token.lineNumber = this.lineNumber;
        token.spacing = this.buffer.toString();
        this.buffer.setLength(0);
        if (Character.isLetter(i13) || i13 == 95) {
            token.type = 5;
            this.buffer.append((char) i13);
            while (true) {
                i10 = readChar();
                if (i10 == -1 || !(Character.isDigit(i10) || Character.isLetter(i10) || i10 == 95)) {
                    break;
                }
                this.buffer.append((char) i10);
            }
            token.value = this.buffer.toString();
            this.lastChar = i10;
            return token;
        }
        char c3 = 3;
        int i16 = 43;
        if (Character.isDigit(i13) || i13 == 46 || i13 == 45 || i13 == 43) {
            if (i13 == 46) {
                int i17 = readChar();
                if (i17 == 46) {
                    int i18 = readChar();
                    if (i18 == 46) {
                        token.type = 6;
                        token.value = "...";
                        return token;
                    }
                    this.lastChar = i18;
                } else {
                    this.lastChar = i17;
                }
            }
            token.type = i13 == 46 ? 2 : 1;
            this.buffer.append((char) i13);
            int i19 = 0;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                i11 = readChar();
                if (i11 == i15) {
                    break;
                }
                char c9 = c3;
                if (!Character.isDigit(i11) && i11 != 46 && i11 != 45 && i11 != i16 && ((i11 < 97 || i11 > 102) && i11 != 105 && i11 != 108 && i11 != 117 && i11 != 120 && ((i11 < 65 || i11 > 70) && i11 != 73 && i11 != 76 && i11 != 85 && i11 != 88))) {
                    break;
                }
                if (i11 == 46) {
                    token.type = 2;
                } else if (i11 == 69) {
                    z11 = true;
                } else if (i11 == 76) {
                    z12 = true;
                } else if (i11 == 85) {
                    z13 = true;
                } else if (i11 == 88) {
                    z14 = true;
                } else if (i11 == 101) {
                    z11 = true;
                } else if (i11 == 108) {
                    z12 = true;
                } else if (i11 == 117) {
                    z13 = true;
                } else if (i11 == 120) {
                    z14 = true;
                }
                if (i11 != 108 && i11 != 76 && i11 != 117 && i11 != 85) {
                    this.buffer.append((char) i11);
                }
                i19 = i11;
                c3 = c9;
                i15 = -1;
                i16 = 43;
            }
            if (!z14 && (z11 || i19 == 102 || i19 == 70)) {
                token.type = 2;
            }
            if (token.type == 1 && !z12) {
                try {
                    long jLongValue = Long.decode(this.buffer.toString()).longValue() >> 32;
                    z12 = (jLongValue == 0 || jLongValue == -1) ? false : true;
                } catch (NumberFormatException unused) {
                    if (this.buffer.length() >= 16) {
                        z12 = true;
                    }
                }
            }
            if (this.buffer.toString().endsWith("i64")) {
                StringBuilder sb = this.buffer;
                sb.setLength(sb.length() - 3);
                z10 = true;
            } else {
                z10 = z12;
            }
            if (token.type == 1 && (z10 || (z13 && !z14))) {
                this.buffer.append('L');
            }
            token.value = this.buffer.toString();
            this.lastChar = i11;
            return token;
        }
        if (i13 == 39) {
            token.type = 1;
            this.buffer.append('\'');
            while (true) {
                int i20 = readChar();
                if (i20 == -1 || i20 == 39) {
                    break;
                }
                this.buffer.append((char) i20);
                if (i20 == 92) {
                    this.buffer.append((char) readChar());
                }
            }
            this.buffer.append('\'');
            token.value = this.buffer.toString();
            return token;
        }
        if (i13 == 34) {
            token.type = 3;
            this.buffer.append('\"');
            while (true) {
                int i21 = readChar();
                if (i21 == -1 || i21 == 34) {
                    break;
                }
                this.buffer.append((char) i21);
                if (i21 == 92) {
                    this.buffer.append((char) readChar());
                }
            }
            this.buffer.append('\"');
            token.value = this.buffer.toString();
            return token;
        }
        if (i13 == 47) {
            int i22 = readChar();
            if (i22 == 47) {
                token.type = 4;
                StringBuilder sb2 = this.buffer;
                sb2.append('/');
                sb2.append('/');
                while (true) {
                    i12 = readChar();
                    if (i12 == -1 || (i14 != 92 && i12 == 10)) {
                        break;
                    }
                    this.buffer.append((char) i12);
                    i14 = i12;
                }
                token.value = this.buffer.toString();
                this.lastChar = i12;
                return token;
            }
            if (i22 != 42) {
                this.lastChar = i22;
                token.type = 47;
                return token;
            }
            token.type = 4;
            StringBuilder sb3 = this.buffer;
            sb3.append('/');
            sb3.append('*');
            while (true) {
                int i23 = readChar();
                if (i23 == -1 || (i14 == 42 && i23 == 47)) {
                    break;
                }
                this.buffer.append((char) i23);
                i14 = i23;
            }
            this.buffer.append('/');
            token.value = this.buffer.toString();
            return token;
        }
        if (i13 == 58) {
            int i24 = readChar();
            if (i24 == 58) {
                token.type = 6;
                token.value = "::";
                return token;
            }
            token.type = i13;
            this.lastChar = i24;
            return token;
        }
        if (i13 == 38) {
            int i25 = readChar();
            if (i25 == 38) {
                token.type = 6;
                token.value = "&&";
                return token;
            }
            token.type = i13;
            this.lastChar = i25;
            return token;
        }
        if (i13 == 35) {
            int i26 = readChar();
            if (i26 == 35) {
                token.type = 6;
                token.value = "##";
                return token;
            }
            token.type = i13;
            this.lastChar = i26;
            return token;
        }
        if (i13 == 92) {
            int i27 = readChar();
            if (i27 == 10) {
                token.type = 4;
                token.value = "\n";
                return token;
            }
            this.lastChar = i27;
        }
        token.type = i13;
        return token;
    }

    public int readChar() throws IOException {
        String str;
        int i10 = this.lastChar;
        if (i10 != -1) {
            this.lastChar = -1;
            return i10;
        }
        int i11 = this.reader.read();
        if (i11 != 13 && i11 != 10) {
            return i11;
        }
        if (this.text == null) {
            this.lineNumber++;
        }
        int i12 = i11 == 13 ? this.reader.read() : -1;
        if (this.lineSeparator == null) {
            if (i11 == 13 && i12 == 10) {
                str = "\r\n";
            } else {
                str = i11 == 13 ? "\r" : "\n";
            }
            this.lineSeparator = str;
        }
        if (i12 != 10) {
            this.lastChar = i12;
        }
        return 10;
    }

    public Token[] tokenize() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                Token tokenNextToken = nextToken();
                if (tokenNextToken.isEmpty()) {
                    return (Token[]) arrayList.toArray(new Token[arrayList.size()]);
                }
                arrayList.add(tokenNextToken);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public Tokenizer(String str, File file, int i10) {
        this.file = null;
        this.text = null;
        this.reader = null;
        this.lineSeparator = null;
        this.lastChar = -1;
        this.lineNumber = 1;
        this.buffer = new StringBuilder();
        this.text = str;
        this.reader = new StringReader(str);
        this.file = file;
        this.lineNumber = i10;
    }

    public Tokenizer(File file) {
        this(file, null);
    }

    public Tokenizer(File file, String str) {
        this.file = null;
        this.text = null;
        this.reader = null;
        this.lineSeparator = null;
        this.lastChar = -1;
        this.lineNumber = 1;
        this.buffer = new StringBuilder();
        this.file = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.reader = new BufferedReader(str != null ? new InputStreamReader(fileInputStream, str) : new InputStreamReader(fileInputStream));
    }
}
