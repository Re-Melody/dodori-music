package org.apache.tika.io;

import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class FilenameUtils {
    private static final Pattern ASCII_NUMERIC;
    private static final HashSet<Character> RESERVED = new HashSet<>(38);
    public static final char[] RESERVED_FILENAME_CHARACTERS;

    static {
        char[] cArr = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, '?', ':', '*', '<', '>', '|'};
        RESERVED_FILENAME_CHARACTERS = cArr;
        for (char c3 : cArr) {
            RESERVED.add(Character.valueOf(c3));
        }
        ASCII_NUMERIC = Pattern.compile("\\A\\.(?i)[a-z0-9]{1,5}\\Z");
    }

    public static String getName(String str) {
        if (str != null && !str.isEmpty()) {
            String strSubstring = str.substring(Math.max(str.lastIndexOf(":"), Math.max(str.lastIndexOf("/"), str.lastIndexOf("\\"))) + 1);
            if (!strSubstring.equals("..") && !strSubstring.equals(".")) {
                return strSubstring;
            }
        }
        return "";
    }

    public static String getSuffixFromPath(String str) {
        String name = getName(str);
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf <= -1 || name.length() - iLastIndexOf >= 6) {
            return "";
        }
        String strSubstring = name.substring(iLastIndexOf);
        return ASCII_NUMERIC.matcher(strSubstring).matches() ? strSubstring : "";
    }

    public static String normalize(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c3 = charArray[i10];
            if (RESERVED.contains(Character.valueOf(c3))) {
                sb.append('%');
                sb.append(c3 < 16 ? "0" : "");
                sb.append(Integer.toHexString(c3).toUpperCase(Locale.ROOT));
            } else {
                sb.append(c3);
            }
        }
        return sb.toString();
    }
}
