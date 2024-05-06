import java.util.*;

public class wildcard {
    String st = "PECS  :  PRODUCER(istehsalci)extend eder,    CONSUMER(istifadeci)super istifade eder" +
            "java da varargs methodun cox parametri olduqda istifade olunur,";
//    public static int sum (int ... ededler ){
//    int sum = 0;
//     for(int eded: ededler){
//     sum+= eded;
//     }
//    return sum;
//    }

    public static int sum (double d ,int ... ededler ){
        return 0;
    }
//    bu cur yazilis da ola biler amma varargs mutleq constructorda son sirada olmalidir. varargs java 5 ile gelib





//    @SafeVarargs
//    public static <T> List<T> createList(T... elements) {
//        return Arrays.asList(elements);
//    }
//
//    public static void main(String[] args) {
//        List<String> fruits = createList("Apple", "Banana", "Orange");
//        System.out.println(fruits);
//    }
//      bu yazilisda java bize class cast dan cekindiyini , narahat oldugunu deye biler o zaman kodu control edib baxiriq emin oldugumuz halda
//    @SafeVarargs annotation ile javani narahat olmamasi ucun xeberdar edirik



//    upper bound
    List<? extends Number> list1 = new ArrayList<>();
    //    yeni burada deyirik ki menim Listime nese gele biler amma deqiq bilinmir Double Integer, ve ya Float. sen bunu numeric abstarct classini
    //    extend eden ne olsa qebul et. yeni number den asagiya dogru icaze var yuxariya dogru icaze yoxdu, yeni nese yaradan zaman extends istifade edirik




//    lower bound
    List<? super Integer> list2 = new ArrayList<Number>();
    //    yeni burada deyirik ki list2 en az Integer ve daha ustu tipde class obyekti yarada ve ya qebul ede  biler ,
    //    yeni integerden yuxariya icaze var asagiya icaze yoxdu, bir sozle muqayise etmek kimi emeliyatlarda super istifade edirik


//    java 9 dan once  @SafeVarargs static, final methodlara ve constructorlarin basina gele bilirdi. 9 ile birlikde artiq
//    private methodlarin da basina qoyula bilir
//
//

}
