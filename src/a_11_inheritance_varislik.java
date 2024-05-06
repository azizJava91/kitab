public class a_11_inheritance_varislik {
    String in = "" +
            "bir method ozunu alt classda eyni aparirsa bu varislikdir yeni oldugu kimi alir" +
            "bir class eyni anda iki class i extend ede bilmez cunki her iki classda eyni adda methodlar ola biler ve bu  diamond conflict adlanir" +
            "inheritance nin faydasi bizi ust siniflerdeki methodlari tekrar yazib kod coxlugu yaratmaqdan xilas edir" +
            "bir super classin cox subclassi ola biler amma bir subclass yalniz bir super classdan extend ede biler" +
            "bir subclassin obyekti yarananda oncelik en basdaki classlardan baslayaraq constuctorlar cagirilir en sonda subclassin ozunun constuctoru cagrilir" +
            "subclassin obyekti yaradilanda superclassin private deyisenlerine birbasa cata bilmir" +
            "subclass superclassin construktorunu cagirmaq ucun super(); nethodunu istifade edir ve her zaman ilk line da yazilmalidir. " +
            "superin birden cox constructoru(overload) varsa super(); dedikden sonra icine parametrlere uygun seyler yazilir ve ozu hemin construktorun hansi oldugunu tapib ise salir" +
            "override edilecek methodun donus tipi, method adi, parametr listi eyni olmaq mecburiyrtindedir" +
            "override ile overloadin ferqi" +
            "override da method adi, parametrler, tipler eyni olmalidir" +
            "overloadda ise parametrlerin sirasi, tipi ve ya sayinin en az biri ferqli olmalidir" +
            "FINAL ile bagli:" +
            "class final dirsa obyektini yaratmaq olmur, extend  edile bilmir" +
            "method finaldirsa override edile bilmez" +
            "parametr finaldirsa deyeri deyise bilmez" +
            "deyisen finaldirsa deyeri deyise bilmez" +
            "final deyisenlere deyer ya teyin olundugu yerde ya da constructorda verilmelidir, " +
            "method icinde ise teyin olundugu yerden blokdan cixana qeder vermek olur ve blokdan cixana qeder deyismek olur" +
            "SEALED CLASS ve ya INTERFACE ler yeni ki alt classlardan yalniz icaze verilenlerin extend impliments etmesine icaze veririk" +
            " sealed class Animal permits Cat, Dog // sealed interface Animal permits Cat, Dog" +
            "sealed classlarin permit icazesi verdiyi classlarin null olmagi mumkun deyil icaze verilen class yaradilmalidi" +
            "sealed classi extend eden class lar yalniz sealed, non-sealed, ve final teyin edile biler" +
            "sealed ve permit olan classlar eyni package de olmalidir  " +
            "sealed qavrami java 15 ile teqdim olunub java 16 da inkisaf edib java 17 de tam teqdim olunub" +
            "";
}
