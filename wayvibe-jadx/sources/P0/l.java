package P0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9474c = 0;

    public l(CharSequence charSequence, int i10) {
        this.f9472a = charSequence;
        this.f9473b = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f9474c;
        if (i10 == this.f9473b) {
            return (char) 65535;
        }
        return this.f9472a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f9474c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f9473b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f9474c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f9473b;
        if (i10 == 0) {
            this.f9474c = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f9474c = i11;
        return this.f9472a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f9474c + 1;
        this.f9474c = i10;
        int i11 = this.f9473b;
        if (i10 < i11) {
            return this.f9472a.charAt(i10);
        }
        this.f9474c = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f9474c;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f9474c = i11;
        return this.f9472a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f9473b || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f9474c = i10;
        return current();
    }
}
