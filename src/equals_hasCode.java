public class equals_hasCode {
//    Example e = new Example();
//    == ile sadece obyektlerin hashcode nu muqayise edirik, equals ile iki obyektin daxilindeki fieldlerin beraber olmasini muqayise edirik
//    equals ve hascode arasinda  kontrakt var:
//      1: Refleksiv: Bir obyekt ozu ile beraber olmalıdır  System.out.println(e.equals(e)) ; her zaman true dönmelidir).
//      2: Simetrik:  System.out.println(e.equals(x))  ile System.out.println(x.equals(e)) eyni netice olmalıdır. ya 2 si de true ya da 2 si de false
//      3: Transitive(Kecisli): System.out.println(e.equals(x)) ile  System.out.println(x.equals(z)) tru dursa, mutleq System.out.println(e.equals(z)) true olmalidir
//      4: Consistent(Tutarli :  iki obyekt in hec bir fieldi deyisdirilmediyi  durumda  equals her defe ya true ya da false vermelidir, yeni her defe bir cur vere bilmez
//      5: NullComparison : her hansi null olmayan bir obyekti null ile muqayise etsek mutleq false qaytarmalidi
//
//    Eger custom obyektimize equalsi override edirikse mutleq hashcode u da override etmeliyik. yoxsa iki eyni value deyerine sahib obyekt ferqli
//    hash code deyerlerine sahib ola biler ve hashmap hashSet kimi collectionlarla isleyende ferqli hash code lara sahib clone obyektimiz collectiona duse biler
//
//    hash code jvm terefinden runtime zamani yaradilir ve unique olmalidir. hash codun da ozunun kontraktlari var.
//     1: eger a.equals(b) true verirse mutleq a.hashCode == b.hashCode da true vermelidir
//     2: eyni obyekt ucun her zaman eyni hash codu vermelidir
//     3: ferqli obyektler ferqli hash code a sahib ola biler amma mutleq bele olacaq demek deyil
//------------------------------------------------------------------------------------------------------
//    hash code methodunun isleme qaydasi obyekt ucun field leri istifade ederek obyektin hash codunu hesablayib tertib edir:
//
//   class Person {
//    private String name;
//    private int age;
//
//      @Override
//      public int hashCode() {
//          return name.hashCode() + age;
//      }
//   }
//-----------------------------------------------------------------------------------------------------
//   hash code hesablamaq ucun Objects.hash();  yontemi de var bunu da istifade etmek olar
//     String name = "Alice";
//        int age = 30;
//        int hashCode = Objects.hash(name, age);
//        System.out.println("Hash kodu (name, age): " + hashCode);
//----------------------------------------------------------------------------------------------
//
//          @Override
//      public int hashCode() {
//          return 1;
//      }
//  bu durumda butun generate olunan obyektler ucun eyni hash code qayidacaq bu da dogru yanasma deyil
//---------------------------------------------------------------------------------------------------------
//    java 8 e qeder bucket lerden nood larin  axtarisi linkedlist ile idi yeni (O(n)),  java 8 ile treeBinarySearch alqoritmi ile axtarilir(O(LogN))
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
