

public class a_19_lambdalar {
//
//    lambdalar java 8 ile gelmisdir ve kodu daha qisa ve anlasiqli yazmaq ucun yararlidir
//
//    lambdalar esasen 3 hisseden ibaret olur 1: parametr listi 2: -> ox isaresi 3: gorulecek is yeni govde
//
//    parametrsiz de ola biler          Interface interface = ()-> System.out.println("salam");  ve ya parametrli
//
//    lambda istifade ederek bir interface impliments etmeden methodunu istifade ede bilerik
//
//    Interface interface = (String message)-> System.out.println("salam" + message);
//    Interface interface = (int i, int j)-> System.out.println("cem" + i+j);
//
//    lambdalar yalnizca functional interfaceler ucun istifade oluna biler yeni hemin interface nin yalniz bir abstract methodu olmalidir
//
//    coxlu abstract methodu olan interfaceler ucun anonim class istifade oluna biler
//
//
//     MyInterface myAnonymousClass = new MyInterface() {
//            @Override
//            public void doSomething() {
//                System.out.println("Anonim sınıfta bir şeyler yapılıyor!");
//            }
//        };
//
//          myAnonymousClass.doSomething();
//
//       methoda parametr olaraq interface gondermek olur
//
//      abstract methodun geri donus tipi "var" ola bilmez
//
//      eger bir functional interface deki abstract method ile eyni sayda, sirada, novde parametri ve de
//      eyni donus tipinde basqa bir classin methodu varsa o zaman hemin class in methodunu da lambda kimi vermek olar
//
//      public interface InterfaceTest {
//           void mesaj(String ad, int yas);
//      }
//
//
//       public class method {
//       public static void testttt(String ad, int yas) {
//        System.out.println("ad: " + ad + " yas: " + yas);
//       }
//   }
//
//
//      public class Main {
//    public static void main(String[] args) {
//        InterfaceTest interfaceTest = (ad, yas) -> method.testttt(ad, yas);
//        interfaceTest.mesaj("Aziz", 33);
//       }
//  }
//
//   en clean yazilis ise method referans dir
//
//     public class Main {
//      public static void main(String[] args) {
//          InterfaceTest interfaceTest = method::testttt;
//          interfaceTest.mesaj("Aziz", 33);
//      }
//   }
//
//    method referansi uc cur olur 1: yuxaridaki kimi static methodun referansi kimi
//         2: non static methodun referansi kimi bu zaman classin obyekti yaranmali ve referans verilmelidir
//         3: constructor referansi
//
//
//       public class method {                              interface methodu ile eyni parametrli constructor
//          public method (String ad, int yas) {
//           System.out.println("ad: " + ad + " yas: " + yas);
//       }
//     }
//
//    functional  interfacein methodu class tipinde return etmelidir
//
//         public interface InterfaceTest {
//        method mesaj(String ad, int yas);
//    }
//
//    public class Main {
//      public static void main(String[] args) {
//          IInterfaceTest interfaceTest = (ad, yas)-> new method(ad,yas);
//          interfaceTest.mesaj("Aziz", 33);
//      }
//   }
//
//     clean yazilis ise beledir
//
//      public class Main {
//        public static void main(String[] args) {
//            InterfaceTest interfaceTest = method::new;
//           interfaceTest.mesaj("Aziz", 33);
//        }
//     }
//
//
//

}
