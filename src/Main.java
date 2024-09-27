import javax.swing.tree.TreeNode;
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
//    {1, 2, 3, 2, 5}
//    private static void tekrarEded(int[] array) {
//        int tekrarEded = -1;
//        int counter = 0;
//        int emeliyyat = 0;
//        for (int i = counter; i < array.length; i++) {
//            for (int j = counter + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    tekrarEded = array[i];
//                    break;
//                }
//                emeliyyat++;
//            }
//            counter++;
//            if(tekrarEded!=-1)break;
//        }
//        if (tekrarEded >= 0) {
//            System.out.println("tekrar edilen eded: " + tekrarEded);
//        } else System.out.println("tekrar edilen eded yoxdur");
//        System.out.println("emeliyyat sayi :" + emeliyyat);
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================
//    private static void cutEdedlerinCemi(int[] array) {
//        int toplam = 0;
//        for (int i : array) {
//            if (i % 2 == 0) {
//                toplam += i;
//            }
//        }
//        System.out.println("toplam = " + toplam);
//        System.out.println("--------------------------------------------\n");
//    }
//    ===================================================================================================================
//    {1, 2, 2, 3, 2, 6}
//    private static void tekrarsizElementTopla(int[] array) {
//        int toplam = 0;
//        boolean tekrarsiz;
//
//        for (int i = 0; i < array.length; i++) {
//            tekrarsiz = true;
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i] == array[j]) {
//                    tekrarsiz = false;
//                    break;
//                }
//            }
//            if (tekrarsiz) {
//                toplam += array[i];
//            }
//        }
//        System.out.println("toplam = "+toplam);    }

    //    {1, 4, 6, 2}, {2, 1, 4, 2, 5}
//    private static void kesisenElementler(int[] array1, int[] array2) {
//        Set<Integer> yekun = new HashSet<>();
//        int counter = 0;
//
//
//        for (int i = counter; i < array1.length; i++) {
//            for (int j = i + 1; j < array2.length; j++) {
//                if (array1[i] == array2[j]) {
//                    yekun.add(array1[i]);
//                    counter++;
//                    break;
//                }
//            }
//        }
//
//        yekun.forEach(System.out::println);
//    }
//    private static void cemIndeksleriTap(int[] array, int cemdeLazimOlan) {
//        int indeks1 = -1;
//        int indeks2 = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (i != j && array[i] + array[j] == cemdeLazimOlan) {
//                    indeks1 = i;
//                    indeks2 = j;
//                    break;
//                }
//            }
//            if (indeks1 != -1 && indeks2 != -1) break;
//        }
//        if (indeks1 >= -1 && indeks2 >= -1) {
//            System.out.println(cemdeLazimOlan + " ededi " + indeks1 + " ve " + indeks2 + " indekslerin elementini toplamaqla almaq olar");
//        } else System.out.println(cemdeLazimOlan + " ededini almaq ucun elementler uygun deyil");
//    }

    //    {1,0,4,5,0,2,0}
//    private static void sifirlariSagaYig(int[] array) {
//
//        int counter = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {
//                array[counter++] = array[i];
//            }
//        }
//        for (int i = counter; i < array.length; i++) {
//            array[i] = 0;
//        }
//        Arrays.stream(array).forEach(element -> System.out.print(element + ", "));
//    }


    //    public static void tekEdedleriqaytar(int[] array) {
//        int tekEdedCounter = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                tekEdedCounter++;
//            }
//        }
//
//        int index = 0;
//        int[] yekun = new int[tekEdedCounter];
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                yekun[index] = array[i];
//                index++;
//            }
//        }
//        Arrays.stream(yekun).sorted().forEach(System.out::println);
//    }
//
//    private static void ikiArrayiSeteCevir(int[] array1, int[] array2) {
//
//        int[] birlesme = new int[array1.length + array2.length];
//        int indeks = 0;
//        for (int eded : array1) {
//            birlesme[indeks++] = eded;
//        }
//
//        for (int eded : array2) {
//            birlesme[indeks++] = eded;
//        }
////        {1, 3, 1, 4, 6, 3, 5, 1, 7, 8}         {1,3,4,5,6,7,8}
//        int counter = 0;
//        int[] kecici = new int[birlesme.length];
//        for (int i = 0; i < birlesme.length; i++) {
//            boolean ferqlidir = true;
//            for (int j = i + 1; j < birlesme.length; j++) {
//                if (birlesme[j] == birlesme[i]) {
//                    ferqlidir = false;
//                    break;
//                }
//            }
//            if (ferqlidir) {
//                kecici[counter++] = birlesme[i];
//            }
//        }
//        int[] yekun = new int[counter];
//        for (int i = 0; i < yekun.length; i++) {
//            yekun[i] = kecici[i];
//        }
//        Arrays.stream(yekun).sorted().forEach(element -> System.out.print(element + ", "));
//    }


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
//        oxsarElementTapCollection(new int[]{0, 1, 2, 3, 4}, new int[]{2, 9, 11, 2, 3, 55, 4});
//        tekrarEded(new int[]{1, 2, 3, 9, 5, 8, 99, 88, 77, 66});
//        cutEdedlerinCemi(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//        tekrarsizElementTopla(new int[]{1, 2, 2, 3, 2, 6});
//        kesisenElementler(new int[]{1, 4, 5, 9, 5, 5, 5, 5, 5, 5, 33, 44, 55}, new int[]{2, 5, 1, 4, 5, 2, 5});
//        cemIndeksleriTap(new int[]{1, 5, 6, 3, 8, 2}, 9);
//        sifirlariSagaYig(new int[]{1, 0, 4, 5, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0});
//        tekEdedleriqaytar(new int[]{1, 2, 3, 11, 53, 4, 5, 6, 77, 7, 8, 9, 10});
//        ikiArrayiSeteCevir(new int[]{1, 3, 1, 4, 6}, new int[]{3, 5, 1, 7, 8});
//        enBoyukIkinciElement(new int[]{1, 4, 2, 6, 9, 5,7,8});

    }
}












