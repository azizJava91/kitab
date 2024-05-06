public class bigOnotations {
//
//    kod icinde her hansi bir isi goren method varsa bu methodun isleme verimliliyi TIME COMPLEXITY adlanir yeni bir method input parametri ile
//    mutenasib olaraq hansi seviyede verimli dir bunu analiz edirik. bu da O() notationu ile qeyd olunur. meselen 1 milyard elementi olan
//    listden data axtaririq. data 1 ci best case, ortalara yaxin cixsa average case , sonda cixarsa worst case dir , analizlerimizi her zaman
//    ola bilecek en pis hallar ucun etmeliyik yeni worst case ucun
//------------------------------------------------------------------------------
//   1: O(1) algoritm: input parametri ne qeder cox olsa da sadece 1 emeliyat yerine yetirir array 1 milyard size de olsa ferqi yoxdu
//       void printFirstElement(int[] arr) {
//        System.out.println(arr[0]);
//    }
//----------------------------------------------------------------------------------------
//   2:  O(n) algoritm: input deyeri ile yerine yetirilen emeliyat sayi eyni olur, buna lineer search algoritmini misal vere bilerik
//       deyek ki array 100 size dirsa axtarma da 100 olacaq milyard olsa milyard olacaq bu meqbul sayilir
//
//    void printAllElements(int[] arr) {
//       for (int num : arr) {
//         System.out.println(num);
//      }
//   }
//--------------------------------------------------------------------------------
//    O(n2) algoritm: input deyeri 10 olsa emeliyat 100 olacaq meselen ic ice for ;
//
//    void method1 (int [] arr){
//      for(int i = 0; i<arr.length; i++){
//           for(int j = 0; j <arr.length; j++){
//        System.out.println(arr[i]);
//     }
//   }
//      uc ic ice for olsa O(n3) ve s bele davam eder
//----------------------------------------------------------------------------------
//
//    O(log n) algoritm: en yaxsi algoritm sayilir input deyeri artdiqca emeliyat sayi mutenasib olaraq azalir
//
//     buna misal olaraq binary search gostermek olar
//
//     int binarySearch(int[] arr, int target) {
//    int left = 0, right = arr.length - 1;
//    while (left <= right) {
//        int mid = left + (right - left) / 2;
//        if (arr[mid] == target)
//            return mid;
//        else if (arr[mid] < target)
//            left = mid + 1;
//        else
//            right = mid - 1;
//      }
//      return -1;
//   }
//-------------------------------------------------------------------------------------------
//     O(2N) algoritm: meselen fibonacci hesablayan method, her bir stepde iki qat emeliyyat demekdir, hovuza 00:00 da bakteriya atiriq
//     ve bilirik ki bu bakteriyalar her deqiqe 2 qat artir ve tam bir sutkaya hovuz tam dolacaq. hovuzun yarisi 23 saat 59 deq dolursa da
//     diger yarisi sadece 1 deqiqede dolur. buna eksponensial artis deyilir
//
//
//
//
//
//
}
