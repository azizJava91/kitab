public class a_09_collections {
    String coll = ""+
            " collection lar   set list  queue ve map olmaqla 4 tipe ayrilir  " +
            " set queue ve list  Collection interface si implements edir  collection da itterable interface si extend edir" +
            " Map ise ayri bir tip olaraq   key value strukturuna malikdir key unikal yeni benzersiz olmalidir" +
            " set  list queue map umumilikde  collection framework adi altinda toplanib" +
            "collectionlar data depolamaq, depolanan datalari cekmek, data islemek, ucun istifade olunur  " +
            "array larin gorduyu isi daha da asanlasdirir ve daha suretlidir" +
            "collection siraliliq ve sirasizliq prinsipine gore iki curdur; list sirali set sirasizdir" +
            "size lari dynamikdir yeni data elave etdikce artir cixaranda azalir default 10 artim 10 dur, elle de modifikasiya olur" +
            "collection lar da verilen tipi ile teyin olunur yalniz oz tipinde datalari yigib saxlayir" +
            "collection interface i collectionlarin hiyerarxik duzulusunde en bas birimdir  java.util paketinden gelir" +
            "ancaq referans tipde deyer alir, ";
          String s = """
            
                               COLLECTION                                                              MAP
                                    |                                                                   |
                                    |                                                                   |
             __________________________________________________________                             SORTEDMAP
             |                      |                                 |
             |                      |                                 |
            SET                    LIST                             QUEUE
             |   
             | 
         SORTEDSET
                   """;
          String sss = """
                  LIST:  icerisinde bir elementden birden cox olmasina icaze verir 
                  siraliliq prinsipine emel edir elementleri  indeks deyerleri ile islemek olur
                  
                  SET: elementleri sirali tutmaz copy element saxlamaga icaze vermir 
                  
                  SORTEDSET: siralidir , copy icaze vermir 
                  
                  QUEUE: siralidir, FIFO mentiqlidir, index ile islemir,
                  
                  MAP:  key-value tiplidir, key unikaldi
                  
                  SORTEDMAP: keyleri keywordleri artan sirada saxlayir
                  
                  
                  """;

//     list interfacenin linkedlist ve arraylist ferqi: arraylist index ile isleyir searching ucun elverislidir, 500 cu index deki deyeri silsek
//     1000 ci indekse qeder hamisi sola dasinir bu semerli deyil, arraylist yaddasda az yer tutur cunki linkedlistlerdeki kimi referans nood mentiqi yoxdu
//     linkedlist nood lar ile isleyir nood da bir daxil edilen deyer ve bir de ozunden sonraki deyerin hash adresini saxlayir, yeni her bir obyekt ozunden
//      sonraki deyerin hash ini bilir, linkedlistin en sonundaki deyer olan nodda referans bilgisi null olur. aradan hansisa deyeri silende
//     index ile sola surusdurme olmur birbasa silinenin sol qonsusu sonrakini taniyir, araya deyer salanda ise soldaki yeni geleni taniyir yeni gelen
//     de solundakinin kecmis tanisi ile tanis olur, linkedlist silme ve daxil etme ucun faydalidi. LinkedListe add evvele ve sona O(1) digerleri O(n) dir

//    HASHMAP: nood mentiqi ile isleyir capasity ise bucket mentiqi iledir. default 16 yer olur 17 ci gelse kapasity 75 faiz artir bu her zaman bele davam edir
//    nood lar olur ve nood larin icinde put olunan obyektin key inin hash codu hesablanir sonra onun necenci indekse getmesi hesablanir
//    indeksde nood dusur, nood da key yazilir, key in hash i yazilir, key in valuesi yazilir, ve eger bu nood dan sonra nood varsa onun key hash i yzilir
//    yoxdursa null yazilir, yeni meselen deyek ki eyni indek de birden cox nood ola biler ve onlar hamisi ozunden sonrakinin hash ini bilir
//
//
//
//
//
//
//
//

}
