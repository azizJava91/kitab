public class a_07_method {
    String m = "" +
            "metodlarin hisseleri:" +
            " 1: access modifier (public private protected default)" +
            " 2: static (class.method) non static (referans.method)" +
            " 3: void non void " +
            " 4: method adi" +
            " 5: qebul etdiyi parametr " +
            " 6; methodun govdesi" +

            "methodlar overloading edile bilir adi eyni parametrleri ferqli olur" +
            "recursiv funksiya methodun ozunu cagirmasidir.  static int topla (int x){return (x + (topla(x-1)));  }" +
            "static methodlar her obyekt ucun eyni isi gormek ucun istifade olunur ve obyekt yaratmaga ehtiyac olmadigi ucun yaddasa qenaet edir" +
            "static  methodun icinden  non static metodu ve ya non static deyiseni cagirmaq olmur, cunki obyekt yaratmaq sertdir" +
            "non static metodun icinden static metodu ve ya static deyiseni cagirmaq  olur" +
            "static metodlar override ve overload edile bilmez" +
            "static methodlari classadi.method ile deyil birbasa methodun adi ile cagirmaq olur bunu ucun STATIC IMPORT lazimdir import static java.lang.Math" +

            "RECORD class data dasiyicisi sayilir, final olur, deyisenleri bir defe set olunur, avtomatic equals hashcode tostring methodlari yaradir," +
            "basqa classlari  extend etmir, interfaceleri implement edir, basqa classlar recordu extends ede bilmir" +

            "CONCREATE class butun methodlari oz icinde olmali, basqa abstract class ve ya interface den implement etdiyi methodlari mutleq override" +
            "etmeli, govdelereni doldurmalidir, abstract hec ne olmamalidir, bizim impl classlar concreate classlardir" +

            "A classin ve ya interface in icinde public static void methodFoo(){System.out.println(parent);}   varsa ve B classi A ni extend edirse ve public static" +
            "void methodFoo{System.out.println(child);}  edirse bu METHOD HIDDING sayilir yeni B classin methodFoo methodu A class daki methodunyerine" +
            "kecir, bir sozle override etmir, Eger ki methodFoo non static olsaydi override olacaqdi";


//    public method(String ad, int yas){
//        System.out.println("ad: " + ad + " yas: " + yas );
//    }

}
