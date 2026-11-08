package org.bytedeco.javacpp;

import java.util.ArrayDeque;
import java.util.Deque;
import org.bytedeco.javacpp.tools.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class PointerScope implements AutoCloseable {
    private static final Logger logger = Logger.create(PointerScope.class);
    static final ThreadLocal<Deque<PointerScope>> scopeStack = new ThreadLocal<Deque<PointerScope>>() { // from class: org.bytedeco.javacpp.PointerScope.1
        @Override // java.lang.ThreadLocal
        public Deque<PointerScope> initialValue() {
            return new ArrayDeque();
        }
    };
    boolean deallocateOnClose;
    Deque<Pointer> pointerStack;

    public PointerScope() {
        this(true);
    }

    public static PointerScope getInnerScope() {
        return scopeStack.get().peek();
    }

    public PointerScope attach(Pointer pointer) {
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Attaching " + pointer + " to " + this);
        }
        this.pointerStack.push(pointer);
        return this;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Closing " + this);
        }
        if (deallocateOnClose()) {
            deallocate();
        }
        scopeStack.get().remove(this);
    }

    public void deallocate() {
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Deallocating " + this);
        }
        while (this.pointerStack.size() > 0) {
            this.pointerStack.pop().deallocate();
        }
        this.pointerStack = null;
    }

    public PointerScope deallocateOnClose(boolean z10) {
        this.deallocateOnClose = z10;
        return this;
    }

    public PointerScope detach(Pointer pointer) {
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Detaching " + pointer + " from " + this);
        }
        this.pointerStack.remove(pointer);
        return this;
    }

    public PointerScope(boolean z10) {
        this.pointerStack = new ArrayDeque();
        this.deallocateOnClose = true;
        Logger logger2 = logger;
        if (logger2.isDebugEnabled()) {
            logger2.debug("Opening " + this);
        }
        this.deallocateOnClose = z10;
        scopeStack.get().push(this);
    }

    public boolean deallocateOnClose() {
        return this.deallocateOnClose;
    }
}
