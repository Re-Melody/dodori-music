package androidx.media;

import java.util.Arrays;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15584a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15585b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15587d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f15587d;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f15586c, this.f15584a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f15585b == audioAttributesImplBase.f15585b) {
            int i10 = this.f15586c;
            int i11 = audioAttributesImplBase.f15586c;
            int iA = audioAttributesImplBase.a();
            if (iA == 6) {
                i11 |= 4;
            } else if (iA == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f15584a == audioAttributesImplBase.f15584a && this.f15587d == audioAttributesImplBase.f15587d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15585b), Integer.valueOf(this.f15586c), Integer.valueOf(this.f15584a), Integer.valueOf(this.f15587d)});
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f15587d != -1) {
            sb.append(" stream=");
            sb.append(this.f15587d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f15584a;
        int i11 = AudioAttributesCompat.f15580b;
        switch (i10) {
            case 0:
                strJ = "USAGE_UNKNOWN";
                break;
            case 1:
                strJ = "USAGE_MEDIA";
                break;
            case 2:
                strJ = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strJ = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strJ = "USAGE_ALARM";
                break;
            case 5:
                strJ = "USAGE_NOTIFICATION";
                break;
            case 6:
                strJ = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strJ = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strJ = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strJ = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strJ = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strJ = "USAGE_GAME";
                break;
            case 15:
            default:
                strJ = b.j(i10, "unknown usage ");
                break;
            case 16:
                strJ = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strJ);
        sb.append(" content=");
        sb.append(this.f15585b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f15586c).toUpperCase());
        return sb.toString();
    }
}
