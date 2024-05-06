public class a_01_javaya_giris {
//    String a = "23 may 1995 de James Goshling terefinden yaradilib" +
//            "platformadan asili deyil, guvenlik ust seviyededir" +
//            "kod (.java), java compiler terefinden compile olunur (javac), ve source code byte coda yeni (.class) cevrilir " +
//            "JVM byte codu(.class) oxuyur ve windows ios linux kimi os lerine gonderir" +
//            bezi diller compayler yox interpreter ile isleyir, ferqler budur ki compayler bir defe butun source codu byte coda cevirir
//            yeni baslangicda daha cox vaxt itirir interpreter ise her setiri oxuyub byte coda cevirir
//            numune ile desek compailer 100 dasi 3 saata yukleyib basqa yere 3 saata aparir, interpreter 100 dasi bir deqiqeye yukleyib 3 saata
//            basqa yere aparir ve bunu 100 defe tekrar edir
//            "JRE icerisinde java libraries ve JVM olur yeni JRE yuklesek avtomatik JVM de yuklenir" +
//            "JDK ile yazilmis kodun islemesi ucun JRE  versiyasi JDK dan yuksek olmalidir. JDK 1.4 ile yazilani JRE 1.3 ile ise salmaq olmaz(xeta)" +
//            "JDK nin icinde java libs, compiler interpreter, JVM ve JRE    var" +
//            "yeni ki bir defe yaz her yerde islet mentiqinin sebebkari JVM dir. her os e uygun jvm var" +
//            "JVM sadece java dilinde yazilmis codlari deyil byte coda cevrile bilen her dili isledir" +
//            "java da yaddas temizleyici GARBAGE COLLECTOR (GC) var" +
//            "MULTITHREADING ozelliyi var" +
//            "Java===> Spring framework, Hibernate, Struts JSF (JavaServer Faces) kimi framework ler var" +
//
//            "Java versiyalari LTS (long term support) ve non-LTS dir " +
//            "Java asagidaki platformalar var" +
//            "1: j2se  core java olaraq da deyilir kicik projectler ucundur java.lang, java.util ve s kitabxanalar var, JVM ilk bu versiya ile gelib" +
//            "2: j2me  mobil projectlerde kicik cihazlarda istifade olunan proqramlarda istifade olunur" +
//            "3: j2ee boyuk project lerde istifade olunur terkibinde Servlet Jpa Jsp kimi classlar var" +
//            "java nin esas elementleri" +
//            "1:data typeler" +
//            "2:variables verilenler" +
//            "3:operators" +
//            "4:string class" +
//            "5:control flow" +
//            "6:loops" +
//            "7:arrays";
//
//   bir obyekti clonlayib basqa bir obyekt yaratmagin iki yontemi var deep copy ve shallow copy
//
//   Student student = new Student(1991, "Aziz");         esas obyekt;
//   Student student2 = new Student();
//   student2.setAge(student.getAge());                   shallow copy
//   student2.setName(student.getName());                 shallow copydir cunki ikisinin de hashcode eynidir 2 referans da 1 heap hash coduna isare edir
//
//   deep copy ucun ise Clonnable marker interface impliments etmek lazimdir, biz Clonnable impliments etmesek de Object classindan gelen clone methodu bizim custom class
//   da default olaraq olur amma sadece shallow copy edir Clonnable impliments edende ise deep copy etmeye imkan verir ve bire bir eyni deyerlere sahib obyektler ucun
//   ferqli hash code generasiya edir.
//
//   Student student3 = new Student();
//   student3 = student.clone();
//
//   Student student4 = new Student();
//   student4 = student.clone();
//
//   bu zaman student ve student2 shallow copy oldugu ucun hash code eyni olacaq amma student3 ve student4 her biri tam ferqli hash code a sahib olacaq
//
//   Serializable marker interface dir ve classimiz bunu impliments etse classin deyerini byte deyerlere serialize edib harasa yaza ve deserialize edib geri ala bilerik
//
//   java da composition ve inheritance ferqi: composition has a, inheritance ise is a dir, meselen deyek ki avtomobil classimiz var ve butun avtomobillerde marka, reng,
//   model ve s olur, bu zaman bizim basqa minik ve yuk classlarimiz avtomobili extend ede biler cunki bunlar da ferqli teyinatli avtomobildir ve marka model rengi var
//   minik masini is a avtomobil dir, kompositionda ise deyek ki kitab ve kitabxana classlarimiz var ve elaqe qurmaq isteyirikse bunlar bir biri deyil sadece kitabxananin
//   kitabi ve ya kitablari var, bu zaman kitabxana clasinin icinde kitab classini ve ya kitab listini istifade edirik, kitabxana has a kitabs, sahiblik elaqesi olur
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
}
