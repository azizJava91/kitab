import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
//    private static void artanPille() {
//        System.out.println("artan pille ucun yukseklik teyin et:");
//        int yukseklik = new Scanner(System.in).nextInt();
//        for (int i = 0; i <= yukseklik; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------\n");
//    }
////    ===================================================================================================================
//
//    private static void ucluFiqur() {
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//            for (int j = 1; j < 6; j++) {
//                System.out.print("-");
//            }
//            System.out.println("*");
//            for (int j = 0; j < 2; j++) {
//                System.out.println("=======");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------\n");
//    }
////    ===================================================================================================================
//
//    private static void artanOx() {
//        System.out.println("artan ox ucun yukseklik teyin et:");
//        int yukseklik = new Scanner(System.in).nextInt();
//
//        for (int i = 0; i < yukseklik; i++) {
//            for (int j = yukseklik; j > i; j--) {
//                System.out.print("-");
//            }
//            System.out.println(">");
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//
//    //    ===================================================================================================================
//
//    private static void sagaDuzArtanOx() {
//        System.out.println("artan ox ucun yukseklik teyin et:");
//        int yukseklik = new Scanner(System.in).nextInt();
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 5; k > i; k--) {
//                System.out.print("-");
//            }
//            System.out.println(">");
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//
//    //    ===================================================================================================================
//
//    private static void diamond() {
//        System.out.println("diamond ucun yukseklik:");
//        int boy = new Scanner(System.in).nextInt();
//
//        int merkez = boy / 2;
//        if (boy % 2 == 0 || boy <= 1) {
//            System.out.println("1 den buyuk  tek adet yazin");
//        } else {
//            int sol = merkez;
//            int sag = merkez;
//
//            for (int i = 0; i < boy; i++) {
//                for (int j = 0; j < boy; j++) {
//                    if (j < sol || j > sag) {
//                        System.out.print(" ");
//                    } else System.out.print("*");
//                }
//                System.out.println();
//                if (i >= merkez) {
//                    sol++;
//                    sag--;
//                } else {
//                    sol--;
//                    sag++;
//                }
//            }
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//
//    //    ===================================================================================================================
//
//    private static void arrayUzunCopySeriya(int[] arr) {
////        int[] arr = {1, 1, 1, 1, 0, 0, 1, 0, 1};
//        int toplam = 0;
//        int max = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            toplam = toplam + arr[i];
//            if (arr[i] == 0 || i == arr.length - 1) {
//                if (toplam > max) {
//                    max = toplam;
//                    toplam = 0;
//                } else {
//                    toplam = 0;
//                }
//            }
//        }
//        System.out.println(max);
//        System.out.println("--------------------------------------------\n");
//    }
//
//    //    ===================================================================================================================
//
//    private static void isPolindrom() {
//        System.out.println("sozu daxil edin:");
//        String soz = new Scanner(System.in).nextLine();
//
//        int sol = 0;
//        int sag = soz.length() - 1;
//
//        while (sol < sag) {
//            if (soz.charAt(sol) != soz.charAt(sag)) {
//                System.out.println(soz + " polindrom deyil");
//                return;
//            }
//            sol++;
//            sag--;
//        }
//        System.out.println(soz + " polindromdur");
//        System.out.println("--------------------------------------------\n");
//    }
//
//
//    //    ===================================================================================================================
//
//    private static void bosPiramida() {
//        System.out.println("hundurluk daxil edin");
//        int hundurluk = new Scanner(System.in).nextInt();
//
//        int merkez = hundurluk / 2;
//        if (hundurluk % 2 == 0 || hundurluk < 1) {
//            System.out.println("1 den boyuk tek eded daxil edin");
//        } else {
//            int sol = merkez;
//            int sag = merkez;
//
//            for (int i = 0; i < hundurluk; i++) {
//                for (int j = 0; j < hundurluk; j++) {
//                    if (j == sol || j == sag) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//                if (i >= merkez) {
//                    sol++;
//                    sag--;
//                } else {
//                    sol--;
//                    sag++;
//                }
//            }
//            System.out.println("--------------------------------------------\n");
//        }
//    }

    //    ===================================================================================================================
// *****
// *   *
// *   *
// *   *
// *****
//    private static void bosKvadrat() {
//        System.out.println("kvadratin hundurluyunu daxil edin:");
//        int hundurluk = new Scanner(System.in).nextInt();
//
//        if (hundurluk <= 2) {
//            System.out.println("2 den boyuk eded daxil edin");
//        } else {
//
//            for (int i = 0; i < hundurluk; i++) {
//                for (int j = 0; j < hundurluk; j++) {
//                    if (i == 0 || i == hundurluk - 1 || j == 0 || j == hundurluk - 1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================

//    private static void sagaUcbucaq() {
//        System.out.println("ucbucagin hundurluyunu daxil edin:");
//        int hundurluk = new Scanner(System.in).nextInt();
//        int artim = 0;
//        int orta = hundurluk / 2;
//        for (int i = 0; i < hundurluk; i++) {
//            for (int j = 0; j < hundurluk; j++) {
//                if (j == 0 || j == artim) {
//                    System.out.print("*  ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            if (i < orta) {
//                artim++;
//            } else artim--;
//            System.out.println();
//        }
//        if (hundurluk % 2 == 0) {
//            System.out.println("*");
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================

//    private static void asagiUcbucaq() {
//        System.out.println("ucbucagin hundurluyunu daxil edin:");
//        int hundurluk = new Scanner(System.in).nextInt();
//        if (hundurluk % 2 == 0) {
//            System.out.println("tek eded daxil edin");
//        } else {
//            int sol = 0;
//            int sag = hundurluk - 1;
//
//            for (int i = 0; i <= hundurluk / 2; i++) {
//                for (int j = 0; j < hundurluk; j++) {
//                    if (i == 0 || sag == j || sol == j) {
//                        System.out.print(" *");
//                    } else System.out.print("  ");
//                }
//                System.out.println();
//                sol++;
//                sag--;
//            }
//        }
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================

//    private static void sadeMurekkebEdedTap(int eded) {
//
//
//        int emeliyyatSayi = 0;
//        for (int i = 2; i < eded; i++) {
//            if (eded % i == 0) {
//                emeliyyatSayi++;
//                System.out.println(eded + " murekkeb ededdir");
//                System.out.println("emeliyyat sayi : " + emeliyyatSayi);
//                return;
//            }
//            emeliyyatSayi++;
//        }
//        System.out.println(eded + " sade ededdir");
//        System.out.println("emeliyyat sayi : " + emeliyyatSayi);
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================

//    private static void oxsarElementTap(int[] array1, int[] array2) {
//        int[] kecici = new int[Math.min(array1.length, array2.length)];
//        int index = 0;
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i] == array2[j]) {
//                    boolean artiqVar = false;
//                    for (int k = 0; k < index; k++) {
//                        if (kecici[k] == array1[i]) {
//                            artiqVar = true;
//                            break;
//                        }
//                    }
//                    if (!artiqVar) {
//                        kecici[index++] = array1[i];
//                    }
//                }
//            }
//        }
//
//        int[] netice = new int[index];
//        for (int i = 0; i < index; i++) {
//            netice[i] = kecici[i];
//        }
//
//        Arrays.stream(netice).sorted().forEach(System.out::println);
//        System.out.println("--------------------------------------------\n");
//
//    }

//    ===================================================================================================================


//    private static void oxsarElementTapCollection(int[] array1, int[] array2) {
//        Set<Integer> yekun = new HashSet<>();
//        Arrays.stream(array1).forEach(array1Element -> Arrays.stream(array2).forEach(array2Element -> {
//            if (array1Element == array2Element) {
//                yekun.add(array1Element);
//            }
//        }));
//        yekun.forEach(System.out::println);
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================

    public static void main(String[] args) {

//        artanPille();
//        ucluFiqur();
//        artanOx();
//        sagaDuzArtanOx();
//          diamond();
//        int[] arr = {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1};
//        arrayUzunCopySeriya(arr);
//        isPolindrom();
//        bosPiramida();
//        bosKvadrat();
//        sagaUcbucaq();
//        asagiUcbucaq();
//        sadeMurekkebEdedTap(new Scanner(System.in).nextInt());
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {2, 9, 11, 2, 3, 55, 4};
//        oxsarElementTapCollection(arr1, arr2);

    }
}













