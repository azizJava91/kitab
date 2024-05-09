public class transaction {


//
//   @Transactional database ye geden butun deyisiklik query lerini bir entity manager ve bir sessionda ve eyni zamanda bir emeliyatin icinde edir
//    ve deyek ki gonderen accauntun balansindan 50 azn cixdi ve qebul eden accauntun balansina 50 azn elave etdi ve deyek ki gonderen emeliyati yerine yetdiyi
//   anda server problemi yarandi bu zaman transaction rollback kimi qeyde alinir ve butun emeliyatlar ehemiyyet kesb etdiyi ucun hamisi tamamlanmadigi
//   ucun commit etmir ve sorgu baslamazdan evvel balanslar nece idise ele de qalir, Transaction bitimi yalniz iki netice ola biler ya commit ve ya rollback
//
//    Transaction PROPOGATION LEVEL @Transactional ile isarelenmis methodun basqa bir methoddan cagrildigi zaman transactionlarin nece davrandigini gosterir
//    propogation leveller 7 yere ayrilir
//    1: REQUIRED: default leveldir, bir nece emeliyat ugurlu biri ugursuz olsa hamisini rollback edir, yeni cagirib data istediyi hansisa methodda xeta olsa onu da oz xetasi kimi qebul edir
//    2: REQUIRES_NEW: oz methodu icinde xeta yoxdursa basqa cagirdigi methoddaki xetalari nezere almir, onlarin neticesini bos verib oz icindeki yenilikleri db ye isleyir
//    3: MANDATORY: eger mandatory methodu cagiran hansisa basqa method aktiv transaction baslatmayibsa callMethod  onunla islemekden imtina edir ve EXCEPTION atir
//    4: SUPPORTS: eger ozunden evvel bir transaction varsa ona qatilir, yoxdursa transaction olmadan davam edir
//    5: NOT_SUPPORTED: icinde cagirdigi methodlarin transactionu olsa da bu methodun icinde onlar non-transaction kimi davam eder
//    6: NESTED: ic ice zencirvari cagrilan methodlarda ozunden sonrakilarda xeta olsa, b,c,d methodlari transactional ise a dan d ye qder hamisi rollback olur, yox eger
//       b,c,d non transactional dirsa onlar da commit olur
//    7: NEVER: eger cagirdigi methodun activ transactionu varsa exception atir, yoxdursa davam edir, meqsedi hec bir transactiona qatilmamaqdir
//
//   amma bir sert var ki @Transactional runtime exceptionlari catch edir burada diqqetli olmaq lazimdir, ya exceptionu runtime etmek lazimdir ya da
//   @Transactional(rollbackFor = Exception.class)
//
//   Transaction  isolation level dord cur olur   mes: accauntId=15 balance = 100;
//
//   1: Uncommited: bu zaman transaction1 15 id li accauntu deyisib balansi 70 etse commit etmese bele eyni anda giren transaction2 commit olmamis datani hem 70 olaraq
//   gore hem de 70 deyeri uzerinden update ede bilir bu en asagi isolation seviyesidir. demek olar istifade olunmur
//   DirtyRead(comit olmamis data gorme), NONREPEATABLE(update, delete), Phantom(insert)
//   READ aciq UPDATE lock
//   transaction2 insert, update,  leri gorur
//
//   2: Commited: bu zaman transaction1 15 id li accauntu deyisib balansi 70 etse ve hele commit etmese eyni anda giren transaction2 commit olmamis datani hele de 100
//    olaraq gorur amma update ede bilmir lock veziyetinde olur. ekser db lerin default isolation leveli commited dir
//    NONREPEATABLE(update, delete), Phantom(insert) gorur
//    READ aciq UPDATE lock
//    transaction2 , commit olunmus  datani gorur
//
//   3:Repeatable Read: bu zaman transaction1 ile transaction2 eyni anda baslayib ve transaction1 update delete insert islerini gorub ve commit edib transactionu
//   bitirib amma hele de transaction2 emeliyata basladigi zaman 15 id li accauntun  deyeri ne idise onu gorur hele de transaction1 in commit olmus deyisikliklerini
//   gore bilmir. gormesi ucun yeni transaction baslatmalidir.
//    Phantom(insert) gorur amma db ler bunu gostermir
//   READ transactiona girende aldigi kimi qalir, UPDATE lock
//
//   4: Serializable: bu zaman transaction1 ve transaction2 eyni anda baslayibsa ve transaction1 15 id li accauntun  deyeri hetta select bele edibse transaction2
//    15 id li accauntu gormek ucun gozlemeli olur deyisdirmesi ise umumiyetle elcatmazdir. transaction1 isini bitirib commit edenden sonra oxuya biler, gozleyir
//    READ lock UPDATE lock
//
//    isolation guclu seviyeye qalxdiqca performance asagi dusur en suretsiz Serializable dir
//
//    cash leme yalniz primary key(id) ile cagrilan entity lericash a yazir
//
//   @ManyToMany ucun ucuncu table de customer a account set etmek ucun db ye accountu tapmaq ucun sorgu (account= accountRepository.findAccountById) atmadan
//   sadece context den valid id referansin (account= accountRepository.GetReferenceById) getirib birlesdirmek olar. getId den basqa her sey null gorunur sadece
//   olaraq context de bu id nin olub olmamasini yoxlayir heqiqeten valid dirse verir, query atmaqdan xilas edir
//
//   Transaction da ACID prinsipi var :
//    A: atomicy, yeni bir transaction icinde butun emeliyatlar ya hamisi success olmalidir ya da bir denesi bele fail olsa hamisi fail edilir
//    C: Consistency transaction sonucu mutleq database de oz eksini tapmalidir yeni bir accountun cixisi basqa accountun artisi olmalidir
//    I: Isolation eyni anda isleyen transactionlar bir birinin deyisikliklerini gormeli deyil
//    D: Durability yeni transaction sonrasi deyisiklikler itmeli deyil, database cokse bele emeliyatin neticeleri qorunmalidir
//
//    Entity obyektinin asagidaki veziyetleri ola biler
//    1: Transient (Keçici) Durum: heleki id si yoxdur codda var amma entity context de yoxdur
//         Person person = new Person();
//         person.setName("John Doe");
//
//    2: Managed (Idare olunan) Durum:  id si var ve hal hazirda session dadir ve uzerinde is gedir
//        Long id = (Long) session.save(person);
//
//    3: Detached (Ayrılmış) Durum:  id si var amma sessionile elaqesi kesilib db de movcuddur yeni session lazimdir
//        session.close();
//
//    4: Removed (Silinmiş) Durum:  silinib id si var qalan her seyi silinib
//        session.delete(person);
//    @Builder ile obyekt yaradanda mutleq allArgdConstructor ve noArgsConstructor elave etmeliyik
//    @Component ve ya onun alt repo, service, configuration, controller kimi annotationlari ile isarelenmemis classlarda diger hec bir annotation islemir
//    @Component ile @Bean ferqi component custom classlarimiza qoyuruq ve spring onun bir obyektini yaradib referansini ioc containere elave edir,
//    @Bean ise esasen methodlarda istifade olunur meselen configuration classimizda BCryptPasswordEncoder spring classini donduren ve bir referansini yaradib ioc
//    containere atan bir method yazdiq, yeni component esasen oz classlarimiza, bean ise esasen methodlara aiddir
//
//           @Configuration
//          public class SecurityConfig {
//           @Bean
//          public BCryptPasswordEncoder passwordEncoder() {
//           return new BCryptPasswordEncoder();
//         }
//      }
//
//    CGLIB library si spring boot da istifade ede bileceyimiz bir ozellikdir, bize ozumuzun proxy lerimizi yaratmaga imkan verir, final methodu olan classlarin proxy sini
//    yaratmir cunki hemin classi extend etmis olur, esas classin ozelliklerine deymeden elave funksionalliqlar elave etmeyimize imkan verir mes: log yazma, transaction,
//    security, cache. jdk proxy den ferqli olaraq interface impliments etmeyen classlarin da proxsini yaradir
//
//    @Transactional olan yerde repo.save ehtiyac yoxdur ozu commit edir , @Transactional yalniz @Component yeni bean olan class larda public methodlarda isleyir
//    ve hemin class dan kenarda cagrilmalidir
//
//    @Transactional ile mes:UserServiceImpl da bir method yazdigimiz zaman spring arxada hemin classin proxy kolgesini yaradir UserServiceImpl kimi UserService i
//    impliments edir ve methoddaki butun emeliyatlari bir nov try-catch icinde edirve butun muraciet etdiyi yerlerden problem almadisa, emeliyyatlar ugurlu oldusa
//    en sonda umumi commit edir, her bir emeliyyati bir bir commit etmir
//
//      @Transactional(readOnly = true) sadece db den melumatlari get edib getirir update etmir


































}
