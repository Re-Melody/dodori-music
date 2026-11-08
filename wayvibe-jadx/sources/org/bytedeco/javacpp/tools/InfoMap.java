package org.bytedeco.javacpp.tools;

import B2.AbstractC0112b;
import V0.p;
import com.amazon.a.a.o.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class InfoMap extends HashMap<String, List<Info>> {
    static final InfoMap defaults = new InfoMap(null).put(new Info("basic/containers").cppTypes("std::bitset", "std::deque", "std::list", "std::map", "std::queue", "std::set", "std::stack", "std::vector", "std::valarray", "std::pair", "std::forward_list", "std::priority_queue", "std::unordered_map", "std::unordered_set")).put(new Info("basic/types").cppTypes("signed", "unsigned", "char", "short", "int", "long", "bool", "float", "double", "_Bool", "_Complex", "_Imaginary", "complex", "imaginary")).put(new Info("noexcept").annotations("@NoException")).put(new Info("__COUNTER__").cppText("#define __COUNTER__ 0")).put(new Info(" __attribute__", "__declspec", "static_assert").annotations(new String[0]).skip()).put(new Info("void").valueTypes("void").pointerTypes("Pointer")).put(new Info("std::nullptr_t").valueTypes("Pointer").pointerTypes("PointerPointer")).put(new Info("FILE", "time_t", "va_list", "std::exception", "std::istream", "std::ostream", "std::iostream", "std::ifstream", "std::ofstream", "std::fstream").cast().pointerTypes("Pointer")).put(new Info("int8_t", "__int8", "jbyte", "signed char").valueTypes("byte").pointerTypes("BytePointer", "ByteBuffer", "byte[]")).put(new Info("uint8_t", "unsigned __int8", "char", "unsigned char").cast().valueTypes("byte").pointerTypes("BytePointer", "ByteBuffer", "byte[]")).put(new Info("int16_t", "__int16", "jshort", "short", "signed short", "short int", "signed short int").valueTypes("short").pointerTypes("ShortPointer", "ShortBuffer", "short[]")).put(new Info("uint16_t", "unsigned __int16", "unsigned short", "unsigned short int").cast().valueTypes("short").pointerTypes("ShortPointer", "ShortBuffer", "short[]")).put(new Info("int32_t", "__int32", "jint", "int", "signed int", "signed").valueTypes("int").pointerTypes("IntPointer", "IntBuffer", "int[]")).put(new Info("uint32_t", "unsigned __int32", "unsigned int", "unsigned").cast().valueTypes("int").pointerTypes("IntPointer", "IntBuffer", "int[]")).put(new Info("jlong", "long long", "signed long long", "long long int", "signed long long int").valueTypes("long").pointerTypes("LongPointer", "LongBuffer", "long[]")).put(new Info("int64_t", "__int64", "uint64_t", "unsigned __int64", "unsigned long long", "unsigned long long int").cast().valueTypes("long").pointerTypes("LongPointer", "LongBuffer", "long[]")).put(new Info("long", "signed long", "long int", "signed long int").valueTypes("long").pointerTypes("CLongPointer")).put(new Info("unsigned long", "unsigned long int").cast().valueTypes("long").pointerTypes("CLongPointer")).put(new Info("size_t", "ptrdiff_t", "intptr_t", "uintptr_t", "off_t").cast().valueTypes("long").pointerTypes("SizeTPointer")).put(new Info("float", "jfloat").valueTypes("float").pointerTypes("FloatPointer", "FloatBuffer", "float[]")).put(new Info("double", "jdouble").valueTypes("double").pointerTypes("DoublePointer", "DoubleBuffer", "double[]")).put(new Info("long double").cast().valueTypes("double").pointerTypes("Pointer")).put(new Info("std::complex<float>", "float _Complex", "float _Imaginary", "float complex", "float imaginary").cast().pointerTypes("FloatPointer", "FloatBuffer", "float[]")).put(new Info("std::complex<double>", "double _Complex", "double _Imaginary", "double complex", "double imaginary").cast().pointerTypes("DoublePointer", "DoubleBuffer", "double[]")).put(new Info("_Bool", "bool", "jboolean").cast().valueTypes("boolean").pointerTypes("BoolPointer", "boolean[]")).put(new Info("wchar_t", "WCHAR").cast().valueTypes("char", "int").pointerTypes("CharPointer", "IntPointer")).put(new Info("const char").valueTypes("byte").pointerTypes("@Cast(\"const char*\") BytePointer", "String")).put(new Info("boost::shared_ptr", "std::shared_ptr").annotations("@SharedPtr")).put(new Info("boost::movelib::unique_ptr", "std::unique_ptr").annotations("@UniquePtr")).put(new Info("std::string").annotations("@StdString").valueTypes("BytePointer", "String").pointerTypes("BytePointer")).put(new Info("std::wstring").annotations("@StdWString").valueTypes("CharPointer", "IntPointer").pointerTypes("CharPointer", "IntPointer")).put(new Info("std::vector").annotations("@StdVector")).put(new Info("abstract").javaNames("_abstract")).put(new Info("boolean").javaNames("_boolean")).put(new Info("byte").javaNames("_byte")).put(new Info("extends").javaNames("_extends")).put(new Info("finally").javaNames("_finally")).put(new Info("implements").javaNames("_implements")).put(new Info("import").javaNames("_import")).put(new Info("instanceof").javaNames("_instanceof")).put(new Info("native").javaNames("_native")).put(new Info("package").javaNames("_package")).put(new Info("super").javaNames("_super")).put(new Info("synchronized").javaNames("_synchronized")).put(new Info("transient").javaNames("_transient")).put(new Info("operator ->").javaNames("access")).put(new Info("operator ()").javaNames("apply")).put(new Info("operator []").javaNames(b.au)).put(new Info("operator =").javaNames("put")).put(new Info("operator +").javaNames("add")).put(new Info("operator -").javaNames("subtract")).put(new Info("operator *").javaNames("multiply")).put(new Info("operator /").javaNames("divide")).put(new Info("operator %").javaNames("mod")).put(new Info("operator ++").javaNames("increment")).put(new Info("operator --").javaNames("decrement")).put(new Info("operator ==").javaNames("equals")).put(new Info("operator !=").javaNames("notEquals")).put(new Info("operator <").javaNames("lessThan")).put(new Info("operator >").javaNames("greaterThan")).put(new Info("operator <=").javaNames("lessThanEquals")).put(new Info("operator >=").javaNames("greaterThanEquals")).put(new Info("operator !").javaNames("not")).put(new Info("operator &&").javaNames("and")).put(new Info("operator ||").javaNames("or")).put(new Info("operator &").javaNames("and")).put(new Info("operator |").javaNames("or")).put(new Info("operator ^").javaNames("xor")).put(new Info("operator ~").javaNames("not")).put(new Info("operator <<").javaNames("shiftLeft")).put(new Info("operator >>").javaNames("shiftRight")).put(new Info("operator +=").javaNames("addPut")).put(new Info("operator -=").javaNames("subtractPut")).put(new Info("operator *=").javaNames("multiplyPut")).put(new Info("operator /=").javaNames("dividePut")).put(new Info("operator %=").javaNames("modPut")).put(new Info("operator &=").javaNames("andPut")).put(new Info("operator |=").javaNames("orPut")).put(new Info("operator ^=").javaNames("xorPut")).put(new Info("operator <<=").javaNames("shiftLeftPut")).put(new Info("operator >>=").javaNames("shiftRightPut")).put(new Info("operator new").javaNames("_new")).put(new Info("operator delete").javaNames("_delete")).put(new Info("getClass").javaNames("_getClass")).put(new Info("notify").javaNames("_notify")).put(new Info("notifyAll").javaNames("_notifyAll")).put(new Info("wait").javaNames("_wait")).put(new Info("allocate").javaNames("_allocate")).put(new Info("close").javaNames("_close")).put(new Info("deallocate").javaNames("_deallocate")).put(new Info("address").javaNames("_address")).put(new Info("position").javaNames("_position")).put(new Info("limit").javaNames("_limit")).put(new Info("capacity").javaNames("_capacity")).put(new Info("fill").javaNames("_fill")).put(new Info("zero").javaNames("_zero"));
    InfoMap parent;

    public InfoMap() {
        this.parent = defaults;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (super.containsKey(obj)) {
            return true;
        }
        InfoMap infoMap = this.parent;
        return infoMap != null && infoMap.containsKey(obj);
    }

    public List<Info> get(String str) {
        return get(str, true);
    }

    public Info getFirst(String str) {
        return getFirst(str, true);
    }

    public String normalize(String str, boolean z10, boolean z11) {
        String string = str;
        if (string == null || string.length() == 0 || string.startsWith("basic/")) {
            return string;
        }
        String str2 = null;
        Token[] tokenArr = new Tokenizer(string, (File) null, 0).tokenize();
        int length = tokenArr.length;
        Info first = getFirst("basic/types");
        String[] strArr = first != null ? first.cppTypes : new String[0];
        Arrays.sort(strArr);
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            if (i10 >= length) {
                Arrays.sort(tokenArr, 0, length);
                StringBuilder sb = new StringBuilder();
                sb.append(z12 ? "const " : "");
                sb.append(tokenArr[0].value);
                string = sb.toString();
                for (int i11 = 1; i11 < length; i11++) {
                    StringBuilder sbT = p.t(string, StringUtils.SPACE);
                    sbT.append(tokenArr[i11].value);
                    string = sbT.toString();
                }
                break;
            }
            if (!tokenArr[i10].match(Token.CONST, Token.CONSTEXPR)) {
                if (!tokenArr[i10].match(Token.CLASS, Token.STRUCT, Token.UNION)) {
                    if (Arrays.binarySearch(strArr, tokenArr[i10].value) < 0) {
                        if (!z11) {
                            break;
                        }
                        int i12 = 0;
                        int i13 = -1;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (tokenArr[i14].match('<')) {
                                if (i12 == 0) {
                                    i13 = i14;
                                }
                                i12++;
                            } else if (tokenArr[i14].match('>') && (i12 = i12 - 1) == 0 && i14 + 1 != length) {
                                i13 = -1;
                            }
                        }
                        if (i13 < 0) {
                            break;
                        }
                        String string2 = z12 ? "const " : "";
                        for (int i15 = 0; i15 < i13; i15++) {
                            StringBuilder sbO = AbstractC0112b.o(string2);
                            sbO.append(tokenArr[i15].value);
                            string2 = sbO.toString();
                        }
                        string = string2;
                        break;
                    }
                } else {
                    str2 = tokenArr[i10].value;
                    for (int i16 = i10 + 1; i16 < length; i16++) {
                        tokenArr[i16 - 1] = tokenArr[i16];
                    }
                    i10--;
                    length--;
                }
            } else {
                for (int i17 = i10 + 1; i17 < length; i17++) {
                    tokenArr[i17 - 1] = tokenArr[i17];
                }
                i10--;
                length--;
                z12 = true;
            }
            i10++;
        }
        if (z10 && z12) {
            string = string.substring(string.indexOf("const") + 5);
        }
        if (str2 != null) {
            string = string.substring(str2.length() + string.indexOf(str2));
        }
        return string.trim();
    }

    public InfoMap put(int i10, Info info) {
        String[] strArr = info.cppNames;
        if (strArr == null) {
            strArr = new String[]{null};
        }
        for (String str : strArr) {
            String[] strArr2 = {normalize(str, false, false), normalize(str, false, true)};
            for (int i11 = 0; i11 < 2; i11++) {
                String str2 = strArr2[i11];
                List arrayList = (List) super.get((Object) str2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    super.put(str2, arrayList);
                }
                if (!arrayList.contains(info)) {
                    if (i10 != -1) {
                        arrayList.add(i10, info);
                    } else {
                        arrayList.add(info);
                    }
                }
            }
        }
        return this;
    }

    public InfoMap putFirst(Info info) {
        return put(0, info);
    }

    public InfoMap(InfoMap infoMap) {
        this.parent = infoMap;
    }

    public List<Info> get(String str, boolean z10) {
        List<Info> list;
        List<Info> arrayList = (List) super.get((Object) normalize(str, false, false));
        boolean z11 = true;
        if (arrayList == null) {
            arrayList = (List) super.get((Object) normalize(str, true, false));
        }
        if (arrayList == null && z10) {
            arrayList = (List) super.get((Object) normalize(str, true, true));
        } else {
            z11 = false;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        InfoMap infoMap = this.parent;
        if (infoMap == null || (list = infoMap.get(str, z10)) == null || list.size() <= 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (z11) {
            arrayList2.addAll(0, list);
            return arrayList2;
        }
        arrayList2.addAll(list);
        return arrayList2;
    }

    public Info getFirst(String str, boolean z10) {
        List<Info> list = get(str, z10);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public InfoMap put(Info info) {
        return put(-1, info);
    }

    public Info get(int i10, String str) {
        return get(i10, str, true);
    }

    public Info get(int i10, String str, boolean z10) {
        List<Info> list = get(str, z10);
        if (list.size() > 0) {
            return list.get(i10);
        }
        return null;
    }
}
