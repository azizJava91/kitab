import java.util.concurrent.Callable;
 public class thread {
//
//    thread bir isin bitmesini gozlemeden basqa bir isi de goren, program icinde kicik alt programlardir
//    thread uc cur yaradilir Thread class indan extend etmekle bu zaman basqa class extend etmek olmur,
//    Runnable interface ini impliments etmekle, bu zaman run methodu override olunur
//    Runnable functional interface dir sadece bir methodu var o da abstract void run() methodudur, void methodlar ucun isledilir
//    Callable functional interface impliments etmekle, call methodu override olunur, return eden emeliyatlar ucun meslehet gorulur
//    callable emeliyatlar return edir deye onlari temsil eden Future<obyekt> future = executor.submit(new MyCallable()); obyekti var
//
//    threadi ise salmaq ve dayandirmaq ucun thread classin start() ve stop() methodlarini istifade ede bilerik
//
//    thread a oncelik vermek ucun setPriority() methodu istifade olunur uc priority var
//    setPriority(MIN_PRIORITY), setPriority(NORM_PRIORITY), setPriority(MAX_PRIORITY)
//    default min (1), norm(5), max(10) olur bunlari elle de teyin etmek olar setPriority(3), setPriority(8)
//
//    Thread in islek olub olmadigini yoxlamaq ucun isAlive() istifade olunur
//    runnable veziyetde true, terminated veziyetde ise false donderir
//
//    thread lar bezen ortaq datalari isleye biler ve bu zaman toqqusmani engellemek ucun senchronized keywordu istifade olunur
//    senchronized elan edilen method isini bitirene qeder basqa thread ler onu gozleyir
//    senchronized methodda sleep() methodu istifade olunubsa thread obyekti yuxuya gedir  ve istifadede olan methoda
//    basqa bir thread girmeye calissa obyektin isi bitene qeder thread methoda cata bilmir
//
//    volatile ile deyisenin deyerini iki threadin cashin den yox main memoryden oxumaq ucun istifade olunur.
//    meselen adi veziyetde thread1(yenileyen) ve thread2(oxuyan) main memory deki (int deyisen =0;) goturub deyisen = deyisen+1 edir. bu zaman
//    thread2 ye deyirik ki deyisenin deyyeri deyisibse xeberdar et. bu zaman oxuma threadi ise dusmur cunki o oz cash inde
//    hele de deyisen=0; gorur. eger (violated int deyisen =0;) etsek oxuyucu da ise dusecek cunki oz cash indan yox main memory den oxuyacaq
//    bu performansi dusurur amma lazim olanda istifade etmek ucun istifaade edilir
//
//    Concurency: eyni anda bir is gore bilmek serti ile bir nece is gormekdir. yeni mes: 12 proces var ve sadece bir is goren thread var
//    thread da 1 isi 1 saniyede gorur deyek, ve sira ile bu 1 thread 12 saniyede 12 proces i bitirir
//
//    Paralelism: eyni anda bir isi gore bilen 4 thread var ve 12 process var bu 4 thread 12 isden heresi 3 process edecek ve 3 saniyede 12
//    process bitecek
//
//    Synchronization: 4 threadin 15:00:00:00 kimi deqiq vaxtda baslayib her biri digeri ile eyni vaxtda diger procese kecmesi durumudur
//    Asynchronization: 4 threaddan hansinin isi yungul olsa tez bitirse o birini gozlemeden basqa is goture bilmesi durumudur
//
//    Executors classinin methodlarini istifade ederek istediyimiz sayda istediyimiz zamanda istediyimiz araliqda thread yarada bilerik
//    mes: newSingleThreadExecutor(); methodu yalnizca 1 thread yaradaraq isleri ona gordurer ve concurrency heyata kecirer
//         newFixedThreadPool(50); bize istediyimiz qeder static sayda thread hovuzu yaratmaga imkan verir
//         newCachedThreadPool(); lazim gelende thread poola yeni threadler elave edir
//         newScheduledThreadPool() mueyyen zaman araliqlari ile yeni threadleri poola elave edir ve sair bir cox method var
//
//   deamon thread ler user thread lere komek edir ve onlarin isi bitende deamon threadler de yox olur
//
//   thread lerin yasam muddeti 1:New, yeni yaradilib, 2:Runnable, yeni ise hazirdi, 3:Running yeni isleyir, 4:Waiting, yeni sleep ve ya wait
//   5:Terminated, yeni dagidilib olub,
//
//   Notify ve ya NotifyAll threadleri oyandirmaq ucun istifade olunur, sinxron islemezamani thread lerin kordinasiyasi ucun lazimdir
//
//
//   SEMAPHORA classi threadlerin idare olunmasi ucun istifade olunur, iki durumu olur , COUNTING ve BINARY. counting mueyyen sayda, binary bir  resursun olmasidir
//   deadlock yeni iki threadin bir birini sonsuz loop a duserek gozlemesi probleminin hell olunmasi ucun istifade olunur.
//
//  DOUBLE CHECK LOCKING patterndir deyek ki singleton class yaradiriq ve obyekt null dursa thread yeni copya yaradir amma bir nece threadin girme aninda synchronized
//   en ustde yazsaq bunlar gozleyecek ve yavaslayacaq, ona gore de eger obyekt null dursa yoxlayiriq null olsa bloka girecek ve burada synchronized teyin edirik ve yene
//   null lugu yoxlayiriq. belece coxlu thread den yalniz biri obyekti yaradir
//
//   RACE CONDITION coxlu threadlerin bir resursu yenilemesi zamani bas verir, meselen 2 thread a bir counteri 500 defe artirmagi tapsirsaq counterin 750 teyin edilmesi
//   durumudur gozlenen 1000 deyerinin altina dusulur. bunun qarsisini almaq ucun counteri synchronized etmek yeni counteri critic sectiona almaq lazimdir
//
//
//
//
//
//
//
//

}