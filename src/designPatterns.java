public class designPatterns {
//
//    design patternler 3 esas hisseye bolunur: 1: Creational Patterns(Yaradici), 2: Structural Patterns(Strukturlasdirma), 3:Behavioral Patterns(Davranissal)
//
//
//**********************************************************CREATIONAL DESIGN PATTERNS:******************************************************
//
//      SINGLETON DESIGN PATTERN:
//   Singleton (class Test) class yaratmaq uc serti var 1: constructorunu private etmek, 2: private static ile o classin obyektini yaratmaq,
//   (private static Test test;)  3: method yazib if (test == null){test = new Test();} return test; her muracietde eyni hash codlu obyekti verir
//------------------------------------------------------------------------------------------------------------------------------------------------
//
//       PROTOTYPE DESIGN PATTERN:
//   her muracietde yeni hash codlu obyekt verir, bir nov deep copy kimi isleyir, eyni ozelliklere sahib ferqli hash codlu obyektler yarada bilir
//--------------------------------------------------------------------------------------------------------------------------------------------------
//
//       BUILDER DESIGN PATTERN:
//   coxlu fieldleri olan classlar ucun ya ferqli ferqli overload constructorlar yaratmaliyiq ya da bir constructorun icinde butun parametrleri qebul etmeliyik bu da hem
//   oxunaqligi azaldir hem de artiq kod yaziriq hem de manevr imkanlarimizi qisitlayir, bunun qarsisini almaq ucun Student clasimizin icinde nested static Builder clasi
//   yaradib butun fieldleri onun icinde doldurmaliyiq ve bu nested static clasimizin yekun Build methodu fieldleri set olunmus yeni Student obyekti qaytarmalidir
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//
//     FACTORY DESIGN PATTERN:
//  Deyek ki bir telefon interfacemiz var, not8 ve s8 de telefondan impliments edir, bir de sifaris vermek ucun bir classimiz var, bu classimiz birbasa not8 ve ya s8 in
//  obyektini yaratmir, elave bir fabrik classi yaradiriq icinde de telefon qaytaran method yaziriq ve methoda deyirik ki sifaris modeli s8 dirse yeni s8 obyekti yarat
//  notr8 dirse yeni note8 obyekti yarat, yeni obyekt  yaratmagi basqa bir fabrik classinin methoduna hevale edirik, butun obyektler(telefon modeli) bir fabrikde yaradilir
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//       ABSTRACT FACTORY DESIGN PATTERN:
//   Deyek ki bir telefon interfacemiz var, not8 ve s8 de telefondan impliments edir, bir de sifaris vermek ucun bir classimiz var, bu classimiz birbasa not8 ve ya s8 in
//   obyektini yaratmir, elave olaraq bir telefon fabriki interface yaradiriq ve bunu impliments eden not8Fabriki ve s8Fabriki yaradiriq, yeni her bir classin obyektini
//   yaratmaq ucun ozunun fabriki olmalidir biz de bu fabriki cagirmaliyiq, her obyekt(telefon modeli) oz fabrikinde istehsal olunur
//
//************************************************************************************************************************************************************************
// ********************************************************* STRUCTURAL DESIGN PATTERNS:*********************************************************************************
//
//     PROXY DESIGN PATTERN:
//    Proxy desing pattern hansisa obyektin vekilini yaratmaqdir. meselen deyek ki isci listi var ve onlardan sadece idare heyetinde olanlar sirketin gelirini gore biler
//    bu zaman username password daxil ederek authentication emeliyati yerine yetirilecek eger idareci funksiyasi true ise gelirleri gore bilecek, bu zaman proxy idareci
//    obyekti kimi bazaya istek atilir eger sifre parol dogrudursa bilgileri gorur eks halda mesaj verilir,
//
//    1: Tembel Yükleme (Lazy Loading): yeni ki hansisa obyekti cox costly oldugu ucun lazy loading edirik ve lazim oldugu zaman obyektini yaradiriq
//    2: Accessing Remote Objects: uzaq serverden ve ya basqa mikroservice lerdeki data base lerden data aldigimiz zaman oz service mizdeki obyekt uzaqdakini temsil eden proxydir
//    3: Caching Queries or Results: Cache ler de istenildiyi zaman verilir biz birbasa hemin data ni almasaq da proxy sini aliriq amma gercek ve ya cache oldugunu bilmirik
//    4: Substituting Costly Objects: yuksek maliyyetli obyektin yerine kecmek durumudur
//
//     yeni ki proxy pattern  real obyektin yerine kecib onun funksiyasini deyismeden yeni funksiyalar elave etmekdir. ve alici bu obyektin real ve ya proxy oldugunu bilmir
//
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        DECORATOR DESIGN PATTERN:
//    bir interfaceden yaradilan kok obyektimiz olur, dekorator classimiz olur bu classin constructoru kok obyekt qebul edir, kok obyektin movcud deyerlerini deyismeden
//    uzerine yeni deyerler elave eden classlar olur ve onlar decorator classi extend edir. deyek ki telefon interface var ve onu impliments eden kok obyekt classi IPhone
//    classimiz var, dekorator clasimiz da telefon interface impliments edir ve constructoruna IPhone obyekti alir, dekoratoru extend eden IPhone 11 classi ve IPhone 11 pro
//    IPhone 11 pro max classlari olur ve dekorator daki kok baslangic deyerleri olan IPhone u bir nov her biri modifikasiya edib elave ozelliler qataraq yukseldir
//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        ADAPTER DESIGN PATTERN:
//    Deyek ki evAletleri interface var ve bunu impliments eden utu, soyudcu kimi klasslar var bunlar 220 volt ile isleyir, bir de razetka klasimiz var ve islet methodu
//    var 220 volt elektrik verir, bir de telefon interface var enerjiAl methodu var onu impliments eden samsung classi var ve 10 volt ile isleyir, bu zaman adapter
//    classina ehtiyac olacaq, adapter classi yaradiriq ve o da evAletleri interface impliments edir constructoruna telefon qebul edir, this.telefon.enerjiAl geri donderir
//    bu zama Adapter adapter = new Adapter(samsung); razetka.islet(adapter); yeni ki telefonu evAletleri kimi istifade etmek ucun araya adapter elave edirik
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//       Bridge DESIGN PATTERN:
//   Deyek ki bir kvadrat seklimiz var ve onun icini qirmizi renglemek isteyirik, basqa bir vaxt bizden daire ve sari renglenmeyimiz teleb olunsa yeniden gedib buna uygun
//   yeni classlar yaratmali olariq, bunun qarsisini almaq ucun bir Abstract class yaradiriq ve constructoru reng ve sekil qebul edir, onun icinde sekili ve rengi birlesdiririk
//
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        COMPOSIT DESIGN PATTERN:
//   Agac hiyerarxiyasini bir merkez altinda toplamaga imkan verir. Deyek ki bir market sebetimiz var ve icine hem tek product hem de terevez paketi adlanan product listi
//   yiga bilirik yekun qiymet hesablamaq ucun hem productun qiymetini hem de for dongusu ile list deki productlarin qiymetini toplamagimiz lazim olur, deyek ki gelecekde
//   bizden sebet icinde basqa sebet funksiyasi da teleb olundu bu zaman girib kodu da deyismeye mecbur oluruq ve open close prinsipine zidd olan kodumuz var demekdir
//   bunun qarsisini almaq ucun hem productu hem product listini hem paketi hem de yeni elave olunan sebet icinde sebeti hamisini satilaBilen interface si altinda yigib
//   ondan impliments etsek ne yenilik elave olunsa sadece ona uygun hesablama aparilacaq ve ana koda toxunulmayacaq hem de qisa anlasilir kod elde edeceyik
//
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        FACADE DESIGN PATTERN:
//    Deyek ki musterinin kredit almasi ucun bir API miz var ve musteri kredit ucun online muraciet edir, bu zaman musterinin daha evvel aldigi kreditlere baxilir, onun
//    kreditlerinde problem olub olmadigi kontrol edilir, problem yoxdursa istediyi kreditin miqdarina uygun yoxlama aparilir gorek bu musteri odeme qabiliyeti ne qederdir
//    ve s emeliyatlar aparilir amma musteriye sadece melumat verilir ki siz bu meblegde kredit ala bilersiniz ve ya inkar cavabi verilir, bir nov o musteriye arxada geden
//    processler barede melumat verib yormuruq sadece yekun neticeni veririk. bir nov facade pattern istifadeci dostu arauz yaratmaq meqsedi gudur
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//         FLYWEIGT DESIGN PATTERN:
//    coxlu sayda benzer obyektlere ehtiyac oldugu zaman yeni obyektler yaratmaq evezine var olan obyektin onun yerine kecmesini temin edir ve belece yaddas istifadesine
//    qenaet edir. meselen deyek ki oyun kodu yazilir ve eyni ada ve xususiyetlere sahib 100 esker istenilir, bu zaman gedib 100 esger yaratmaq yerine birini yaradib geri
//    qalan 99 nun yerine hemin obyekti vermekle hem yaddas hem de suret cehetden qenaet etmis oluruq
//
//
//***********************************************************BEHAVIORAL DESIGN PATTERNS:**********************************************************
//
//       CHAIN OF RESPONSIBILITY:
//    Istekleri bir izin zincirine salmaq ve hansinin isidirse ona gordurmek, onun isi deyilse bir sonrakina oturub basindan etmek ucun istifade olunan hereket patternidir
//    deyek ki bir kargo sirketini avtomatlasdiririq ve bakidan aldigi yuku yol boyunca duzulen sobelerine teslim ede ede Sekiye qeder gedir, baslangic Baki, sonraki
//    Samaxi, sonraki Ismayilli , sonraki Qebele, sonraki Oguz sonda ise Seki dir, biz kargo nu Bakidan teslim edirik ve Qebeleye gonderirik, bu zaman method yoxlayir
//    sonraki hansidir (Samaxi) teslim ala bilmez oturur sonrakina (Ismayilli) teslim ala bilmez ve yene sonrakina(Qebele) teslim alir ve adresse catdirma isini oz
//    ohdesine goturur
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        COMMAND DESIGN PATTERN:
//   Deyek ki restoranda musteri garsona sifaris verir ve bizim sifarisleri qebul eden bir klassimiz var orada deyirik ki if sifaris makaronsa makaron else if kabab sa
//   kabab else if pizza ise pizza ve s bele davam edir. bu da hem kod oxunaqligini azaldir hem de open close prinsipine ziddir cunkli sabah menu ya basqa yemek daxil
//   olsa kodu deyismeli oluruq. bunun qarsini almaq ucun command design pattern den istifade etmek olar, bir interface yaradiriq ve adini sifaris yaziriq, bunun da
//   sifarisAl abstract methodu olur, makaronCommand, kababCommand, pizzaComand klass lari bu interfaceden impliments edir ve sifarisi makaron olaraq gosterir
//   yeni ki her istek bir obyekt kimi nezere alinir ve gorulecek isi ozunde saxlayir
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//          ITERATOR DESIGN PATTERN:
//    deyek ki sual cavab kitabimiz var ve onun bir hissesi(1-10) riyaziyat suallari alir ve array seklinde gelib, diger hissesi edebiyyat (11-20) list seklinde gelib,
//    ve diger hissesi kimya (21-30) set seklinde gelib, biz bunlari toplayib bir struktur seklinde 30 sualdan ibaret bir list elde etmek ucun bir method yazsaq mes: deyek
//    ki list qebul eden methoddur, o zaman bize hansi 10 sual list seklinde gelibse biz sadece onu ala bileceyik diger collection ve ya array formatinda gelen suallari
//    bizim method isleye bilmeyecek. ona gore de cixis yolu Iterator istifade etmekdir, yeni hemin listi set i arrayi deyisib iterator etsek hasnext ve next methodlarini
//    istifade ederek rahatliqla methodumuza daxil ede bilerik
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//          MEDIATOR(ARACI) DESIGN PATTERN:
//    Deyek ki mesajlasma applicationumuz var, ve istifadeciler bir birine mesaj gondere bilir, butun istifadecilerin bir birine mesaj gonderme durumu var ve bu zaman
//    cox qarmasiq elaqeler olur bunun qarsisini almaq ucun istifadecileri ortaq bir noqtede qarsilasdirmaq mentiqli olar bunu ucun ortada bir class yaradiriq sohbetOtagi
//    ve butun istifadeciler mesaji bu otaga yazir, ve her bir istifadeci ona mesaj geldiyini burdan yoxlayir
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//          MEMENTO(XATIRE) DESIGN PATTERN:
//   Deyek ki hansisa obyekti mutemadi deyisdiririk ve bir noqtede yanlis etdiyimizi gorub obyekti evvelki halina qaytarmaq isteyirik, bu zaman memento design patternden
//   istifade ede bilerik, deyek ki bir metn yazan classimiz var ve bu klass metnIsleme interfaceden impliments edir ve onun metinDuzelt, metinYaddasaYaz methodlarini
//   override edir, istediyimiz vaxt metnimizi evvelki versiyalara qaytaririq
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//           OBSERVER(MUSAHIDECI) DESIGN PATTERN:
//   Obyektlerin deyisikliyini diger obyektlere xeber vermesidir, deyek ki termometr obyektimiz var ve insan obyektimiz var, amma insan obyekti her zaman izlemek
//   mecburiyetinde qalir, bunun qarsisini almaq ucun bir musahideEdilen interface yaradiriq ve termometri elave edirik, temperatur siqnal verilecek dereceye catanda
//   musahideci obyekti butun insan obyektlerine xeberdarliq edir
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//            STATE(VEZIYYET) DESIGN PATTERN:
//   Deyek ki playstation simulyasiya edirik. oyunun pultunda x o ^ # var biz mudafie durumunda x pressing, o surusme, ^ qapici topa cixma, # mudaxile kimi qiymetlenir
//   biz hucumda olanda ise x ayaga pas, o hava pasi, ^ ara pasi, # ise zerbe kimi qiymetlendirilir, bunu simulyasiya etsek, bir oyun classimiz olur ve icinde butun
//   duymelere basma funksiyasi olur ve iki methodu olur topBizde methodu ve topReqibde methodu, topBizde methodu zamani new Hucum, topReqibde methodu zamani new Mudafie
//   obyekti yaradir, mudafie ve hucum classlari da muvafiq duruma uygun duymeleri qiymetlendirir, butun bu duymelei basma ise bir Pult interface den gelir
//   yeni ki State design pattern obyektlerin durumuna gore davranislarinin deyismesini temin edir
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//       STRATEGY DESIGN PATTERN:
//    Obyekti bir vezife ucun birden cox algoritm ile isleyecek sekiklde dizayn edin ki, algoritmi calisma zamaninda client teyin edende ona uygun calissin, meslen deyek
//    ki bir odeme sistemi simulyasiya edirik ve burada odeme usulunu client ne verecekse verecek bizim obyekt bu alqoritme uygun calismaq mecburiyyrtindedir, deyek ki
//    odeme usulu kart, paypal ve ya skrill ile mumkundur bizim odenis obyekti her uc alqoritm ucun de calismalidir
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//         TEMPLATE (SABLON) DESIGN PATTERN:
//    Bir algoritmin skeletini yaratmaq ve alt siniflerin bu skeleti deyismeden algoritmi istifade ede bilmesidir, deyek ki erize yazmaq teleb olunur, amma her kes erize
//    yazma qaydasini bilmir, bunun ucun erizenin mentiqini yaziriq ve orada doldurulmali olan tarix, seher, veren sexs, verilen sexs, uzrlu sebeb kimi fieldleri bos
//    saxlayaraq methoda cekirik ve bunlari bir nov sual cavab kimi istifadeciye teqdim edirik o da lazimli cavablari yazir, neticede algoritmin skeleti deyismez qalmali
//    yerleri deyismir, istifadeciden istenen fieldleri ozu doldurur.
//
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//        VISITOR DESIGN PATTERN:
//
//    Deyek ki ic ice kicikden boyuye  geden bir qurulusumuz var meselen umumdunya sehiyye nazirliyine hesabat veren bir qurulus tesevvur edek, deyek ki en asagi birim
//    xestexana, ustunde rayon, ustunde seher, ustunde olke olsun, bu hiyerarxiyada xestexanalardan verilen hesabatlar en sonda ic ice gedib olkede toplanir, bu qurulusu
//    ic ice classlar ile etmek asagi noqtelerden birinde olan yanlisliq butun ust quruluslara zerer verecek anlamina gelir. ona gore de bir visitor interface yaradib,
//    onun icinde visitXestexana, visitRayon, visitSeher, ve visitOlke methodlari yazsaq, ve diger butun obyektler de accept methodu ile visitor qebul etse ayri ayriliqda
//    melumat vermek olacaq.
//
//
}
