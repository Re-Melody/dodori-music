package org.bytedeco.javacpp.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/* JADX INFO: loaded from: classes2.dex */
class DeclarationList extends ArrayList<Declaration> {
    Context context;
    ListIterator<Info> infoIterator;
    InfoMap infoMap;
    DeclarationList inherited;
    String spacing;
    TemplateMap templateMap;

    public DeclarationList() {
        this.infoMap = null;
        this.context = null;
        this.templateMap = null;
        this.infoIterator = null;
        this.spacing = null;
        this.inherited = null;
    }

    public String rescan(String str) {
        if (this.spacing == null) {
            return str;
        }
        Scanner scanner = new Scanner(str);
        String str2 = "";
        while (scanner.hasNextLine()) {
            try {
                str2 = str2 + this.spacing + scanner.nextLine();
                int iLastIndexOf = this.spacing.lastIndexOf(10);
                this.spacing = iLastIndexOf >= 0 ? this.spacing.substring(iLastIndexOf) : "\n";
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        scanner.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        scanner.close();
        return str2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Declaration declaration) {
        boolean z10;
        String str;
        Declarator declarator;
        Type type;
        Parameters parameters;
        Declarator[] declaratorArr;
        Declaration declaration2;
        Declaration declaration3;
        Type type2;
        Type type3;
        Info first;
        Type type4;
        TemplateMap templateMap = this.templateMap;
        if (templateMap == null || !templateMap.empty() || ((type4 = declaration.type) == null && declaration.declarator == null)) {
            z10 = true;
        } else {
            if (this.infoIterator == null) {
                TemplateMap templateMap2 = this.templateMap;
                templateMap2.type = type4;
                Declarator declarator2 = declaration.declarator;
                templateMap2.declarator = declarator2;
                List<Info> list = this.infoMap.get(declarator2 != null ? declarator2.cppName : type4.cppName);
                Iterator<Info> it = list.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    String[] strArr = it.next().javaNames;
                    z11 |= strArr != null && strArr.length > 0;
                }
                if (!declaration.function || z11) {
                    this.infoIterator = list.size() > 0 ? list.listIterator() : null;
                }
            }
            z10 = false;
        }
        Declarator declarator3 = declaration.declarator;
        if (declarator3 != null && (type2 = declarator3.type) != null) {
            Info first2 = this.infoMap.getFirst(type2.cppName);
            if (first2 != null && first2.skip && first2.valueTypes == null && first2.pointerTypes == null) {
                z10 = false;
                break;
            }
            Parameters parameters2 = declaration.declarator.parameters;
            if (parameters2 != null) {
                for (Declarator declarator4 : parameters2.declarators) {
                    if (declarator4 != null && (type3 = declarator4.type) != null && (first = this.infoMap.getFirst(type3.cppName)) != null && first.skip && first.valueTypes == null && first.pointerTypes == null) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        Type type5 = declaration.type;
        if (type5 != null && type5.javaName.equals("Pointer")) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = arrayList.listIterator();
        listIterator.add(declaration);
        listIterator.previous();
        while (listIterator.hasNext()) {
            Declarator declarator5 = ((Declaration) listIterator.next()).declarator;
            if (declarator5 != null && (declaration3 = declarator5.definition) != null) {
                listIterator.add(declaration3);
                listIterator.previous();
            }
            if (declarator5 != null && (parameters = declarator5.parameters) != null && (declaratorArr = parameters.declarators) != null) {
                for (Declarator declarator6 : declaratorArr) {
                    if (declarator6 != null && (declaration2 = declarator6.definition) != null) {
                        listIterator.add(declaration2);
                        listIterator.previous();
                    }
                }
            }
        }
        boolean z12 = false;
        while (!arrayList.isEmpty()) {
            Declaration declaration4 = (Declaration) arrayList.remove(arrayList.size() - 1);
            Context context = this.context;
            if (context != null) {
                declaration4.inaccessible = context.inaccessible && (!context.virtualize || (declarator = declaration4.declarator) == null || (type = declarator.type) == null || !type.virtual);
            }
            if (declaration4.text.length() == 0) {
                declaration4.inaccessible = true;
            }
            ListIterator<Declaration> listIterator2 = listIterator();
            boolean z13 = false;
            while (listIterator2.hasNext()) {
                Declaration next = listIterator2.next();
                if (next != null && (str = next.signature) != null && str.length() > 0 && next.signature.equals(declaration4.signature)) {
                    if ((!next.constMember || declaration4.constMember) && ((!next.inaccessible || declaration4.inaccessible) && (!next.incomplete || declaration4.incomplete))) {
                        z13 = true;
                    } else {
                        listIterator2.remove();
                    }
                }
            }
            DeclarationList declarationList = this.inherited;
            if (declarationList != null) {
                ListIterator<Declaration> listIterator3 = declarationList.listIterator();
                while (listIterator3.hasNext()) {
                    Declaration next2 = listIterator3.next();
                    if (next2.signature.length() > 0 && next2.signature.equals(declaration4.signature) && !next2.incomplete && declaration4.incomplete) {
                        z13 = true;
                        break;
                    }
                }
            }
            if (!z13) {
                declaration4.text = rescan(declaration4.text);
                super.add(declaration4);
                z12 = true;
            }
        }
        return z12;
    }

    public DeclarationList(DeclarationList declarationList) {
        this.infoMap = null;
        this.context = null;
        this.templateMap = null;
        this.infoIterator = null;
        this.spacing = null;
        this.inherited = declarationList;
    }
}
