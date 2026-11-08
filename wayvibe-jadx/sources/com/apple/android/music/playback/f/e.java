package com.apple.android.music.playback.f;

import com.apple.android.music.playback.model.PlayerMediaItem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f17405a = Pattern.compile("(\\{w\\})|(\\{h\\})|(\\{c\\})|(\\{f\\})");

    public static String a(String str, int i10, int i11, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f17405a.matcher(str);
        int iGroupCount = matcher.groupCount();
        while (matcher.find()) {
            for (int i12 = 1; i12 <= iGroupCount; i12++) {
                String strGroup = matcher.group(i12);
                if (strGroup != null && !strGroup.isEmpty()) {
                    if (i12 == 1) {
                        matcher.appendReplacement(stringBuffer, Integer.toString(i10));
                    } else if (i12 == 2) {
                        matcher.appendReplacement(stringBuffer, Integer.toString(i11));
                    } else if (i12 == 3) {
                        matcher.appendReplacement(stringBuffer, str2);
                    } else if (i12 == 4) {
                        matcher.appendReplacement(stringBuffer, "jpg");
                    }
                }
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static long a(PlayerMediaItem playerMediaItem) {
        if (playerMediaItem == null) {
            return -9223372036854775807L;
        }
        long duration = playerMediaItem.getDuration();
        if (duration == -1) {
            return -9223372036854775807L;
        }
        return duration * 1000;
    }
}
