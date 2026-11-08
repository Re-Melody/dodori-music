package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes2.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {65533};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    public interface Output {
        void write(char[] cArr, int i10, int i11);
    }

    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(int i10) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        final int i10 = 0;
        this.charactersOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f24614b;

            {
                this.f24614b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i11, int i12) throws SAXException {
                switch (i10) {
                    case 0:
                        this.f24614b.lambda$new$0(cArr, i11, i12);
                        break;
                    default:
                        this.f24614b.lambda$new$1(cArr, i11, i12);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.ignorableWhitespaceOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f24614b;

            {
                this.f24614b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i12, int i13) throws SAXException {
                switch (i11) {
                    case 0:
                        this.f24614b.lambda$new$0(cArr, i12, i13);
                        break;
                    default:
                        this.f24614b.lambda$new$1(cArr, i12, i13);
                        break;
                }
            }
        };
    }

    private void filter(char[] cArr, int i10, int i11, Output output) {
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            int iCodePointAt = Character.codePointAt(cArr, i10, i12);
            int iCharCount = Character.charCount(iCodePointAt) + i10;
            if (isInvalid(iCodePointAt)) {
                if (i10 > i13) {
                    output.write(cArr, i13, i10 - i13);
                }
                writeReplacement(output);
                i13 = iCharCount;
            }
            i10 = iCharCount;
        }
        output.write(cArr, i13, i12 - i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(char[] cArr, int i10, int i11) throws SAXException {
        super.characters(cArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(char[] cArr, int i10, int i11) throws SAXException {
        super.ignorableWhitespace(cArr, i10, i11);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        filter(cArr, i10, i11, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        filter(cArr, i10, i11, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i10) {
        if (i10 < 32) {
            return (i10 == 9 || i10 == 10 || i10 == 13) ? false : true;
        }
        if (i10 < 57344) {
            return i10 > 55295;
        }
        if (i10 < 65536) {
            return i10 > 65533;
        }
        return i10 > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i10 = 0;
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (isInvalid(attributes.getValue(i11))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                    String value = attributes.getValue(i12);
                    if (i12 >= i11 && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(i10);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i12), attributes.getLocalName(i12), attributes.getQName(i12), attributes.getType(i12), value);
                }
                attributes = attributesImpl;
                break;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int iCharCount = 0;
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            if (isInvalid(iCodePointAt)) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}
