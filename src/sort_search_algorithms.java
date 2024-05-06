public class sort_search_algorithms {
//
//    SORT:
//
//  Bubble sort: boyuk deyerlinin saga dasinmasi mentiqi isleyir, boyuk deyer ozunden boyuk gorende muveqqeti dayanir ve gorduyu muqayise etmeye baslayir bu mentiq en
//  boyuklerin  saga dasinib bitmesine qeder davam edir.  time complexity O(n2) dir
//
//  Selection sort: listin 0 ci indexini en kicik qebul edib sona qeder hamisi ile qarsilasdirir ve kicik olani sola alir time complexity O(n2) dir
//
//  Insertion sort: listin 0 ve 1 ci indexlerini alib qarsilasdirir kicik olani sola alir, sonra 1 ve 2 belece davam edir, time complexity O(n2) dir
//
//  Quick sort: pivot bir element tapib sola pivotdan kicikleri saga pivotdan boyukleri yigir, sonra sag sol ucun de yene pivot tapir belece her defe bol ve feth et
//    mentiqi istifade ederek her defe is sayini azaldir, time complexity si yaxsi ve orta halda O(n*log(n)), pis halda O(n2) dir, java bunu istifade edir
//
//  Merge sort: list i her defe ortadan bolur ve bolunen qismleri de tekrar bolur ta ki her biri 1 elementli list lere qeder parcalana qeder, sonra her bir listi bir uste
//    qaytarib siralayib merge edir ve en sonda yene qaytarib listi sirali formada qaytarir. her bir case de time complexity si O(n*log(n)) dir
//
//  Heap sort: tree yaradir ya max ya min heapify edir yeni ya parent child lerinden boyuk sort etme var ya da parent child lerinden kicik olmagi. her ikisi de eyni mentiqle
//    isleyir deye ferqi yoxdu esas sonraki islemdir. agacdaki en ust parenti silir ve listin en sonuna qoyur ve agacdaki en balacani getirib en basa qoyur ve yeniden
//    heapify edir boyuk basa cixir, sonra tekrar tekrar bu isi gorub boyuyu liste soldan saga yazir, en sonda parent tek qalanda en kicik element olur ve 0 ci indexe yazir
//
//
//      SEARCH:
//
//   Lineer search: 100 elementli array olsa axtardigimiz elementi arrayda bir bir gezib equal dirmi yoxlayar, worst case nezere alsaq 100 cu indeksde olsa 100 is gorur
//       time compleksitysi o(n) dir
//
//   Hash search: key ile hash codu muqayise ederek axtarir
//
//   Binary search: listi ortadan bolerek hansi yarimlistde oldugunu axtarir, input deyer artdiqca gorulecek is az artir, time compleksity O(logn) dir
//
//
//
//   Depth First Search
//   Breadth First Search
//   Uniform Cost Search
//
//   eger ozumuz custom class listimizin obyekt listini sort etmek isteyirikse  o zaman classimiz Comporable interfaceden impliments etmeliyik, compareTo override etmeliyik
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
