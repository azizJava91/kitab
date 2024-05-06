
public class stream {
//   Stream  interfacedir ve BaseStream interface den extend edir. doublestream, intstream kimi primitive parametr alanlari da var amma en cox istifade olunan generik <T>
//    alan stream dir.  stream 3 hisseden ibaretdir
//   1: stream source (list ve ya arrays dan qidalanir),
//   2: intermediate emeliyatlar(map, flatmap, sort, filter ve s), her zaman stream qaytarir
//   3: terminal emeliyatlar (bitirir ve stream close olunur)
//
//   stream da source ile terminal arasina bir nece ard arda intermediate emeliyyat yazmaq olar, bu zaman birinci (deyek ki filter) isini bitirmeden altindaki (deyek ki map)
//   gozlemir filterden keceni alib isleyir. intermediate emeliyyatlar her zaman stream qaytarir ta ki terminal gorene
//   qeder, terminal goren kimi stream close olunur. streamlar source aldigi qaynagi hec vaxt deyismir, yeni qaynaq yarada bilir,
//
//    stream ler parallel ve ardicil stream olaraq iki yere ayrilir, parallel boyuk data larla cox thread le islemek ucun dur, menbeden source ni her thread random alir
//    sira ile almir, ardicil stream ise sira ile alir. stream lazy evalution mentiqi ile isleyir, yeni  intermediate emeliyat cagrildigi zaman is gormur, stream yaranir
//    terminal emeliyat cagrildigi zaman islemeye baslayir.
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
