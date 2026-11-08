package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.RecursiveParserWrapperHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
class RecursiveMetadataContentHandlerResource implements ForkResource {
    private static final ContentHandler DEFAULT_HANDLER = new DefaultHandler();
    private final AbstractRecursiveParserWrapperHandler handler;

    public RecursiveMetadataContentHandlerResource(RecursiveParserWrapperHandler recursiveParserWrapperHandler) {
        this.handler = recursiveParserWrapperHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws IOException {
        byte b10 = dataInputStream.readByte();
        byte b11 = dataInputStream.readByte();
        ContentHandler contentHandler = DEFAULT_HANDLER;
        if (b11 == 3) {
            contentHandler = (ContentHandler) readObject(dataInputStream);
        } else if (b11 != 4) {
            throw new IllegalArgumentException(b.j(b11, "Expected HANDLER_AND_METADATA or METADATA_ONLY, but got:"));
        }
        Metadata metadata = (Metadata) readObject(dataInputStream);
        if (b10 == 1) {
            this.handler.endEmbeddedDocument(contentHandler, metadata);
        } else {
            if (b10 != 2) {
                throw new IllegalArgumentException(b.j(b10, "Expected either 0x01 or 0x02, but got: "));
            }
            this.handler.endDocument(contentHandler, metadata);
        }
        byte b12 = dataInputStream.readByte();
        if (b12 != 5) {
            throw new IOException(b.j(b12, "Expected the 'complete' signal, but got: "));
        }
    }

    private Object readObject(DataInputStream dataInputStream) throws IOException {
        try {
            return ForkObjectInputStream.readObject(dataInputStream, getClass().getClassLoader());
        } catch (ClassNotFoundException e2) {
            throw new IOException(e2);
        }
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        try {
            internalProcess(dataInputStream);
            return null;
        } catch (SAXException e2) {
            return e2;
        }
    }
}
