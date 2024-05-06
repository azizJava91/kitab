public class a_03_variables {
    String v = "yaddas 3 yere ayrilir 1:heap 2:stack 3:metaspace" +
            "bunlari monitoring etmeek ucun, Garbage collectorun isini gormek ucun jdk nin icinde JCONSOLE tool u var ve ya java 9 dan once jvm de olan indi ise tool kimi " +
            "endire bileceyimiz visualvm ve ya jmeter var" +

            "deyisenler 3 yere ayrilir lokal, instance ve static" +

            "local variables bir metodun, constructorun ve ya blokun icinde yasayir ve kenardan gorunmur blokdan cixanda deyeri itir" +
            "static ola bilmez, mutleq deyer verilmelidir java ozu vermez, deyisen primitive dirse (int a = 15; ) variable ozu (a) de deyeri (15) de stack da saxlanilir," +
            "referansdirsa (Integer a = 100;) variable (a) stack da, deyeri (100) heap de saxlanilir " +

            "class ve ya static variables bir class in icinde metodlarin colunde olur, static keywordu ile yazilir ve classin sonuna kimi her yerden el catir" +
            "static int a; deyer verilmese java verir, variable (a) metaspace de deyeri primitive olsa metaspace, referans type olsa heap da saxlanir" +
            "methodlarin adlari, classin davranis ve ozellikleri , metadatalari da metaspace de saxlanilir" +

            "instanse variables classin obyekti ucun nezerde tutulur classin icinde metodlari colunde yazilir mes:String ad; Long id;" +
            "static ola bilmez, blokun methodun icinde olmurlar, deyer vermesen de java ozu default verir variable de deyer de heap da saxlanir " +

            "Heap bolumu 3 hisseden ibaretdir young generation, old generation, metaspace.  metaspace java 8 den evvel permgen idi string pool da burada olurdu" +

            "young generation da en birinci butun deyerler EDENSPACE e dusur oranin artiq doldugu zaman g.c silinesileri silir ve qalanlari SURVIVOR FROM 0 a atir" +
            "ve yasini 1 olaraq isareleyir sonra yene EDENSPACE den gelenlere yer acmaq ucun bir nece defe g.c dan canini qurtarmis deyerleri SURVIVOR FROM 1 e atir" +
            "ve mueyyen bir yasa catmis deyerleri artiq old generationa atir burada g.c terefinden silinme ehtimali cox azdir" +


            "garbage collectorun islediyini monitoring etmek ucun finalize methodunu da cagirib bile bilerik ki nese sildi ya yox" +
            "garbage collectorun 3 addimi var " +
            " 1: MARK(isareleme) app i basdan ayaga gezir ve referansi olan obyektleri 1, olmayanlari 0 ile isareleyir" +
            " 2: SWEEP(zibilleri supurme) mark isaresi 0 olanlari silir" +
            " 3: COMPACT(sixisdirma) silinmis obyektler aradan cixdigi ucun qalanlar arasindaki bosluqlari doldurmaq ucun bir birine sixib tek ve daha boyuk sahe yaradir" +

            "garbage collector zamana qarsi isleme mentiqine gore 4 yere  ayrilir" +
            " 1: SERIAL: 1 thread ile isleyir young gen ucundur deyerleri sira ile analiz edib sira ile temizleyir, 1 nuveli kicik app lar ucun uygundur" +
            " 2: PARALLEL: cox thread ile isleyir young gen ucundur, deyerleri paralel analiz edib temizleyir, cox nuveli app lar ucun uygundur" +
            " 3: CONCURRENT: old ve young gen ucundur, young ucun paralel, old ucun eyni vaxtda isleyir, mark etme zamani gozletme edir" +
            " 4: G(FIRST): old ve young ucundur, java9 ve sonrasi default G(FIRST) istifade edir, young gen ucun parallel temizleme edir, old gen ucun" +
            "bolge uzre (region based) temizleme edir" +

            "MEMORY LEAK yaddasda tutulan istifade olunmayan boyuk olculu deyerlerin silinmemesi durumudur bu zaman yaddas sizintisi olur ve out of memory ola biler " +

            "stack LIFO mentiqi ile isleyir deyek ki method1 den method2 cagrilib, method2 den method3 cagrilib bu zaman isleme mentiqi method3 isleyir bitirir sonra kill" +
            "olur sonra method2 isleyir bitirir kill olur en sonda ise method1 isleyir ve kill olur" +

            "test ucun java visualizer tool u istifade etmek olar" +

            "final deyiskenler teyin olundugu ilk setirde deyer verme teleb edir, ve deyeri deyismezdir, bir istisna var ki eger method icinde teyin edersek" +
            "sonraki setirlerde deyerini initialized ede bilerik" +
            "tip deyismek iki curdur" +
            " 1: widening casting(kiciyi boyuye cevirme) mes: int a = 5; double b = a;" +
            " 2: narrowing casting(boyuyu kiciye cevirme) mes: double d = 123.45; int i = (int)d;" +

            "deyisken ozunden boyuk tipe donende data itkisi olmaz amma ozunden kiciye donenede data itkisi ola biler" +
            "deyiskenlerde saylarda ayirici kimi alt cizgi qoymaq olar outputda bunlar silinir mes: int tel = 333_44_55; output: 3334455" +
            "alt xetti evvele ve sona qoymaq olmaz ancaq ortalara olar" +
            "";

}
