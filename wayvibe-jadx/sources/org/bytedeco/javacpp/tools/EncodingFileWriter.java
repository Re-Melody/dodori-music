package org.bytedeco.javacpp.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class EncodingFileWriter extends OutputStreamWriter {
    String newline;

    public EncodingFileWriter(File file, String str) {
        super(new FileOutputStream(file));
        this.newline = "\n";
        if (str != null) {
            this.newline = str;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return super.append((CharSequence) ((String) charSequence).replace("\n", this.newline).replace("\\u", "\\u005Cu"));
    }

    public EncodingFileWriter(File file, String str, String str2) {
        super(new FileOutputStream(file), str);
        this.newline = "\n";
        if (str2 != null) {
            this.newline = str2;
        }
    }
}
