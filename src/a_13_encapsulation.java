public class a_13_encapsulation {
    String enc = "" +
            "encapsulation classin oz method ve deyisenlerini qorumasidir, private deyisenlere deyer set etmek ve almaq ucun prinsipdir" +
            "access modifiers: " +
            " 1: public classdan, subclassdan, basqa paketden, elcatandir" +
            " 2: private sadece classda elcatan, subclass ve basqa paketlerden elcatmaz" +
            " 3: protected classdan, subclassdan, eyni paketdeki classdan elcatandir, basqa paketden elcatmazdir" +
            " 4: default classdan ve paketdeki basqa classdan elcatandir" +

            "encapsulation iki cur olur" +
            " 1: setter getter ile deyer oturme goturme" +
            " 2: constructor ile deyer oturme" +

            "java da .java uzantili file icerisinde birden cox class istifade edeceyikse bunlardan yalniz biri public ola biler " +
            "getter setter bize private deyisenlere basqa classlardan kontrollu sekilde mudaxile ede bilme  imkani yaradir" +
            "this keywordu ile classin icindeki deyisenlere mudaxile etmek olur this.name= name ,ve eyni zamanda this ile classin constructorunu da cagirmaq olur this(); " +
            "ayrice hansisa methodun icinde return this; de deyer kimi dondermek olar. o anda isleyen obyektin referansini donderir";
}
