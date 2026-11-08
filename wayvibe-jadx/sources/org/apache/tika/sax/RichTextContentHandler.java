package org.apache.tika.sax;

import V0.p;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String strO = p.o("[image: ", attributes.getValue("alt"), "]");
            characters(strO.toCharArray(), 0, strO.length());
        }
        if (!"a".equals(str2) || attributes.getValue("name") == null) {
            return;
        }
        String strO2 = p.o("[bookmark: ", attributes.getValue("name"), "]");
        characters(strO2.toCharArray(), 0, strO2.length());
    }
}
