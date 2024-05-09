public class spring_giris {
//
//    spring projemizi daha keyfiyetli az kod ile yazmaq, konfiguration larla vaxt itirmeden yazmaq, asan test imkanlari teklif eden,
//    daxilinde bir cox modullar saxlayan bir kitabxanadir, springi frameworkler(modullar) toplusu olan bir framework de adlandira bilerik
//
//    Spring oz frameworklerinin yerine basqa firmalarin eyni isi goren texnologiyalarini da qebul edir.
//
//    Spring Interface lerle programlamani tercih edir, bunun sayesinde classlar arasinda daha elastik baglar qurmaq olur
//
//    Springin daxili application serveri (embedded tomcat) var, application server db access, gui, biznes logicin islenmesi kimi emeliyatlari bir serverde edir
//
//    Spring ioc containerlere is gordurmek yeni beanlari teyin etmek ucun METADATA melumatlarini bildirmeyimiz lazimdir. bunun uc yolu var:
//           1: XML file larinda
//           2: java class larinda
//           3: annotationlar ile
//
//    Spring context ve ya ioc container adlandirilan yaddas bolmesinde dependency injection ile funksionalliq veren classlarin (controller, service, repository)
//    her defe deyil bir defe jvm terefinden singleton ile yaradilib ioc container (context) icerisine atilmasidir. bunu annotationlar ile ede bilirik.
//    ioc hemin instance leri runtime lifecycle muddetinde saxlayir, bir birine referans edib elaqelendirir (inject), lazim oldugunda cagirir, ve ya gc a atir
//
//    Application context bir interface dir, ve Bean factory interface den extend edir yeni onun butun ozelliklerine sahibdir.
//    Application context in de altinda uc interface var, 1: ClasspathxmlApplicationcontext  ve 2: FilesystemxmlApplicationcontext 3: WebxmlApplicationcontext
//
//    java da classlar bir birine inheritance ve composition ile baglidir, yeni bir class da deyisiklik child classa tesir edir buna GUCLU BAGLILIQ deyirik,
//    ioc un da esas meqsedi bunun qarsisini almaq ve baglantilari ozu qurub idare etmesidir yeni controlun springe kecmesidir
//
//    Dependency injection un uc novu var:
//          1: constructor injection ile:
//          2: setter injection ile:
//          3: method injection ile:
//
//    Bean factory  design patternlerden factory pattern in bir orneyidir. ioc container yaratmaq ucun once bean factory yaradilir, yeni ioc container bir bean factory
//    obyektidir.
//
//    Standart java annotationlari spring ile isledile biler spring 3.0 version ile bu ozellik jsr-330 sozlesmesi ile mumkun olub
//
//    ioc qaydalarina uygun olan injection novleri bunlardir:
//          1: factory pattern:
//          2: service location pattern
//          3: constructor injetion
//          4: setter injection
//          5: interface injection
//          6: contextualized lookup
//
//    
//
//
//
//
//
//    spring modullari
//    1: spring core container  mutleq sekilde istifade olunmali olan tek framework dur. terkibinde frameworkler:
//               1: ioc (Inversion of Control)
//               2: aop (Aspect-Oriented Programming)
//               3: SpEL (Spring Expression Language)
//               4: context:
//               5: beans:
//
//     2: data access/integration modullari
//               1: JDBC: database emeliyatlari ucun
//               2: ORM: (Object-Relational Mapping)  hibernate , jpa kimi texnologiyalarla db ye elaqe qurur
//               3: OXM: (Object-xml Mapping) xml datalari ile obyektler arasinda cevirme edir
//               4: JMS: (Java Message Service) mesaj novunde elaqe ucun
//               5: Transaction:
//
//    3: web modullari
//               1: mvc: model view controller strukturu teklif edir
//               2: Spring WebFlux: reaktiv structur yeni bir thread requesti alib mes: db ye getdise 5 saniye gozlemek teleb olunursa, gozlemir gelib basqa request alib db ye getirir
//               3: Spring WebSocket:
//               4: servlet:
//               5: portlet
//
//    4: test modullari:
//               1: Mock Nesneler: saxta Mock obyektleri yaradir
//               2: Spring MVC Test: mvc proyektleri test edir
//               3: WebTestClient: reaktiv proyektleri test etmek ucun
//
//    5: Spring security modulu: tehlukesizlik ucun authentication autherization
//
//    6: Spring batch modulu: toplu emeliyatlar ucun
//
//    7: Spring Integration modulu: ferqli sistemler arasinda integrasiya ucun
//
//    8: instrumentation
//
//
//    Bean SCOPE  bir beanin yasama muddetini, fealiyyeti, ve istifade yeri bilinir. her bir bean  scope istifade edir. scope novleri asagidakilardir:
//
//         1: Singletone scope:
//         2: Prototype scope:
//         3: Request scope:              <-web scope
//         4: Session scope:              <-web scope
//         5: Global-session scope:       <-web scope
//
//    bir bean yarandigi zaman default olaraq singleton yaranir. yeni bir defe yaranir her muracietde eyni hash codlu obyekt isleyir
//
//    singleton design pattern ile singleton scope ferqlidir. SDP de classloader ile bir instance yaranib application boyunca o istifade olunur, SBS da ise
//    ioc container de bir intance yaradilir ve o istifade olunur.
//
//    Prototype scope ise singleton tersine her bir injection ucun yeni bir hash codlu instance yaradir
//
//    Request scope her bir http muracietinde yeni bir instance verir
//
//    Session scope bir istifadecinin sessionu boyunca bir obyekt yaradib verir ve session dagilanda onun da omru bitir
//
//    Global-session scope portlet application larda istifade olunur
//
//    bir beanin icinde basqa bean olarsa, icerideki beanin scopu ne olursa olsun avtomatik olaraq icinde oldugu beanin scopuna uygunlasir, yeni coldeki singletonsa icdeki de ele olur
//
//    WEB  proyektlerde applicationcontext classi isifade etmek olmaz, xmlWebApplicationContext classi istifade olunmalidir.
//    web scope lar istifade edende web.xml file da , eger servlet 2.3 ve daha asagi version dursa <filter> istifade edirik, servlet  2.4 ve ustu ise <listener> istifade edirik
//    web scope istifade edende <aop:scoped) proxy/> ozelliyini yazmagimiz mutleqdir
//
//    Bean in yasama muddetine mudaxile ede bilerik, bunun ucun BeanPostProcessor interface den istifade ede bilerik
//
//    bunun ucun classimizi BeanPostProcessor interfaceden implements edirik ve iki methodunu override edirik 1: postProcessBeforeInitialization ve 2: postProcessAfterInitialization
//
//    bu methodlar eynidir sadece isleme zamanlari evvel ve sonradir, iki parametr alir, Object bean ve String beanName yeni xml deki bean in id si. Object bean return typedir
//
//    meydana gele bilecek exceptionlari da springe hevale edirik her iki methodu throws BeanException ile isareleyirik
//
//    Bean basqa bir bean i miras ala biler bunun ucun xml file da parent= test  yazmaq lazimdir
//
//    <bean id="parent"  class="org.springframework.beans.Parent">
//    <property name="mesaj1" value="super salam"/>
//    <property name="mesaj2" value="super salam2"/>
//    </bean>
//
//    <bean id="child"  class="org.springframework.beans.Child">
//    <property name="mesaj1" value="sub class salam"/>
//    <property name="mesaj3" value="sub class salam3"/>
//    </bean>
//
//    child.getMesaj1,  child.getMesaj2   child.getMesaj3
//    output:  sub class salam, super salam2, sub class salam3
//
//
//    Spring de annotationlar ile xml file larinda olan qurulumlarin daha asan yolla evez olunmasini temin edir, annotationlar class , obyect, method, deyisen bir sozle
//    class ve classa aid her seyin uzerinde istifade oluna biler. java 5 ile gelib. istifade etmek ucun java 5 ve ustu versiyalar lazimdir.
//    Annotation xml den daha pratikdir amma kod deyisikliyi zamani xml daha elverislidir cunki xml kodu deyismez saxlayir
//
//    IDEMPOTENCY bir methodun her cagrildinda eyni deyer vermesidir, her defe ferqli deyer qaytaran NON-IDEMPOTENCY methoddur
//
//-------------------------------------------------------------------------------------------------------------------------
//
//   STS(Spring tool suite) bir IDE dir deye bilerik , eclipse uzerinde de istifade etmek olar Spring proyektleri daha rahat yazmaq ucundur
//
//   JSF (java server faces) bir java standartidir ve mvc strukturu uzerinde qurulmus bir framework dur
//
//   RichFaces JSF  ile islediyiniz zaman size lazim olan kitabxanalardan biridir,  ve ya MyFaces , ICEFaces kitabxanalari da ola biler
//
//   WildFly  JBoss firmasina mexsus, Apache Tomcat kimi bir application serverdir,
//---------------------------------------------------------------------------------------------------------------------------------
//
//   pom.xml de elave olunan dependency bize jar seklinde classlar interfaceler annotationlar verir. pluggin ise kodumuza mudaxile edir.
//
//   bir interface impliment eden 2 ve daha artiq impl class varsa ve biz hemin interface i hansisa classda istifade edende
//   hemin component olan impl classlarin her hansininsa uzerine @Primary annotation qoyaraq onu oncul ede bilerik
//   ve ya impl1 ve impl ikiden her hansi bir bean i referans kimi vere bilerik
//   private final UserService userService; evezine private final UserService userServiceImpl2; kimi vere bikerik
//   basqa bir variant ise constructorda @Qualifier ile hansi impl i istediyimizi bildirmekdir:
//
//    public class Test(){
//      private final UserService userService;
//
//     public test(@Qualifier("userServiceImpl2")UserService userService){
//     this.userService=userService;
//    }
//  }
//----------------------------------------------------------------------------------------------------
//
//  public class A {
//   private final B b;
//
//    public A(B b) {
//        this.b = b;
//    }
//   }
//
//    public class B {
//    private final A a;
//
//    public B(@Lazy A a) {
//        this.a = a;
//    }
//   }
//
//  public class Main {
//    public static void main(String[] args) {
//        B b = new B(a);
//        A a = new A(b);
//   }
//  }
//       burada rekuriya dongusunun qarsisini almaq ve loopdan cixmaq ucun her hansi bir classin constructoruna 2Lazy annotation
//    ile gozleme ve null alma emri veririk ve lazim oldugu anda initialize edirik ve problemin qarsisini aliriq
//
//    mappedBy relationlarda yeni table yaranmaginin qarsisini alir
//    @BuilderDefault constructor ile yox builder ile yaratmagimiza imkan verir
//    @Enumerated(enumType.String) bize enumdan almaq istediyimiz deyeri deyer kimi qaytarmaga komek edir, yoxsa table ye o deyerin index ini set edir
//    @OneToMany ve ya @OneToOne kimi relation larda cascade.type.ALL eger customer id li customeri silsek gedib o customere
//    aid olan icindeki cartid li cart lari da ozu silib repository save etmeyimize ehtiyac olmadan arxada ozu yerine yetirir
//    ve ya customer create edende icinde child cart obyektleri atmisiqsa ozu gedib cartRepository.save(cartList) edir
//    silmeni ise en child den baslayir cunki parenti silmek dogru deyil cunki onun id sini foreign kimi alan child ler var
//    @ManyToMany ve @ManyToOne da, yeni solu many olanlarda hec vaxt cascade.type.ALL vermek olmaz cunki gedib orta tablede sol tabledeki id ni silende avtomatik
//    sag tabledeki entity ni de silecek ve bu bize istemediyimiz halda sag tabledeki id ye mexsus entity den silinme edecek
//    jpa repository nin methodlarindan basqa: native query de yaza  bilerik mes:
//
//    private final  EntityManager entityManager;
//    EntityManager em = entityManager.createEntityManager();
//    em.createNativeQuery("native query example"); ile ve em.createQuery("hibernate query example"); yaza bilerik
//
//    entity de relational obyektler varsa ve eger biz parent olan obyekti cagirsaq default olaraq child obyektler ucun
//    fetch=fetch.type.lazy isleyir yeni ki parent obyekt ucun db ye sorgu atanda sadece sorgu atilan obyekt ucun sorgu gedir
//    eger biz istesek ki child obyektler ucun de sorgu getsin o zaman o entity de hemin child obyektlerin @manytomany ve s
//    relationlari icinde fetch=fetch.type.eager yazmaliyiq bu zaman zencirvari sorgular gedir ve child leri de null dan cixarir ve initialize edir
//    zencirvari coxlu sorgu da n+1 problemi adlanir ve db ni yorur
//
//    fetch=fetch.type.lazy zamani child obyektleri null teyin edir ve  parenti db den getirib sonra icindeki child ucun tekrar
//    db ye sorgu atmaq isteyende null  child in id deyerini alib db ye getmek isteyir ve bu zaman "LazyInitializationException"
//    xetasi cixir
//
//    daha inkisaf etmis yontem ile db ye zencirvari coxlu sorgular getmesinin qarsisini almaq ucun bezi variantlar var
//    meselen fetch=fetch.type.eager edib  JPA nin Fetch Graphs ozelliyini istifade ederek tek sorguda parent child leri ala bilerik
//    ve ya native sql yazib join ile getire bilerik,
//
//    entityGraph.entityGraphType.FETCH, AtributePaths ={"students"} studentleri eager getirir qalanlari lazy getirir
//    entityGraph.entityGraphType.LOAD, AtributePaths ={"students"} studentleri eager getirir qalanlari lazydirse lazy, eagerdise eager getirir
//
//    spring.jpa.open-in-view=true default veziyetde bele olur. db ye geden transaction un muddetini uzadir ve entityManager obyektini
//    mesgul edir. bunu mumkun qeder spring.jpa.open-in-view=false etmek lazimdir
//
//    JPA specification ile repository de coxlu methodlar olmasinin qarsisini aliriq. spring data jpa bu specificasiyani isletmek ucun
//    JpaSpecificationExecutor interface ni istifade edir.
//
//    public interface CustomerRepository extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
//    // ...
//    }
//
//    List<T> findAll(Specification<T> spec);
//
//    public class CustomerSpecs {
//    public static Specification<Customer> isLongTermCustomer() {
//        return (root, query, builder) -> {
//            LocalDate date = LocalDate.now().minusYears(2);
//            return builder.lessThan(root.get(Customer_.createdAt), date);
//        };
//    }
//
//    // Diğer özellikleri burada tanımlayabilirsiniz
//  }
//
//   pageble bize gelen datalari sehifeler seklinde qaytarmaga imkan verir. bu zaman list<user> yox page<user> yaziriq,
//
//   db query atilan zaman entityManagerFactory nin icinde 10-15 obyekden her hansisa biri >1< query ni(user = userRepo.findById(2)) alir ve oz icindeki "L1" casha baxir
//   eger varsa db ye getmir user i verir, eger ozunde yoxdursa entityManagerFactory nin ozunun "L2" cashi na baxir orda tapsa useri verir, tapmasa son care db ye gedir,
//   deyek ki bundan evvel hansisa sorguda >8< ve ya >11< obyekti (user = userRepo.findById(2)) db den getirib entityManagerFactory nin "L2" casina atibsa ordan ala bilerdi
//   yumru obyektlerin ozunde default "L1" cash i default enable olur amma yumru obyektlerin yerlesdiyi kvadrat "L2" cash i default disable olur, config edib acmaq lazimdir
//   Redis ile cache classimiza mutleq SerialVersionUID teyin etmeliyik yoxsa app restart olanda ferqli serialize edir
//   Cache edilen data update olunsa problem olmasin deye @CachePut methodun ustune qoyulmalidir, delete olunan method ucun ise @CacheEvict qoyulmalidir
//   java da referanslarin yaddasda nece idare olunmasina gore ferqli referanslar var
//
//   1: Strong referance: guclu referance dir GC terefinden silinmez
//      User user = new User();  user Strong referance dir
//
//   2: Weak Reference: zeifdir , GC terefinden siline biler, yaddas zeiflediyi zaman ve ya obyektin basqa referance i olmadigi zaman istifade faydalidir
//    WeakReference<User> weakUser = new WeakReference<>(user);
//
//   3:Soft Reference: yumsaq referance dir, GC terefinden siline biler, yaddas zeiflediyi zaman istifade faydalidir
//      SoftReference<User> softName = new SoftReference<>(user);
//
//   4: Phantom Reference: ruh referance , boyuk olculu datalarin siraya salinmasi ucun
//      ReferenceQueue<User> queue = new ReferenceQueue<>();
//      PhantomReference<User> phantomName = new PhantomReference<>(user, queue);
//
//    HEAP POLLUTION bir data tipinde list yaradib sonra basqa tipde bir liste hemin bu listi menimsetsek bas verir. meselen string listi (stringList) yaradib
//    icine soz add edirik sonra integer tipinde list yaradib (integerList= stringList) integerList.get(0) desek xeta olar
//
//   KIBANA elastic search coxlu mikroservice lerimiz olsa onlarda yaranmis sikayetler artiq mikroservice ler bir nece defe restart olubsa loglar itib ve kibana ile
//   gedib loglarin bir yere yazilmis halini analiz edib performans ve problemi gore bilirik
//
//    Unit test classi yoxlamaq ucundur yeni methodlarin isleme mentiqini yoxlayiriq real implimentation lar i Mock lar ile simulyasiya edirik baglantilar yoxlanilmir
//
//    MVC test sadece controller leri yoxlayiriq gorek duzgun request alib duzgun respons qaytarirmi, yeni service lere enmirik
//
//   integration test ile ise db ye de qosulmaqla real muhit simulyasiyasi ederek test edirik
//
//
//
//   when @Mock ile isarelenmis field leri cagiranda isleyir meselen repository simulyasiya etmek ucun
//
//   @ParameterizedTest, @ValueSource(ints {1,4,5,8,14,23})  annotationlarini eyni anda istifade ederek bir testi cox value ile test ede bilerik
//
//   Mapstruct dependency lombok dependency den once, annotation processor plugini ise lombok pluginden sonra pom.xml e yazmaliyiq yoxsa islemir, versionu da property de olmalidir
//
//   RabbitMQ ve Kafka isleme ferqi: RabbitMQ  producer (gonderen) mesaji qutuya atir ve RabbitMQ bilir ki  consumer (alan) kimdi, aparib teqdim edir, push mentiqi
//   Kafka da ise producer (gonderen) mesaji qutuya atir ve consumer (alan) daim yoxlayir gorek mene gelen nese var mi,  pull mentiqi
//
//   Spring actuator proyectimizin up ve ya down olmasini bean lerini gormeyimizi descriptionlara baxmagimizi ve s temin eden bir monitoring tool dur
//
//   BASE CASE bir rekursiyada emeliyatin dayandirilmasi gereken veziyetdir mes faktorial hesablayanda n 0ve ya 1 dirse cavab 1 qaytaririq ve rekursiyaya girmirik
//
//   STATIC BINDING static methodlarin cagrilmasidir. hansinin cagrilmasi compile time da bilinir
//   DYNAMIC BINDING non static methodlarin cagrilmasidir. hansinin cagrilmasi runtime da bilinir, override dynamic binding orneyidir
//
//
//   Circuit Breaker Pattern: deyek ki 5 mikroservice miz var ve 4 cude problem cixdi bu zaman diger servicelere tesir edir, bunun qarsisini almaq ucun resilience4j kimi
//   texnologiyalar isifade ede bilerik @Retry ile avtomatik tekrar istek atdirib problem davam ederse fallBack dondere bilerik, Circuit Breaker Pattern aciq, yarim aciq ve
//   qapali durumlari olur, problem olmayanda qapali olur, problem olanda acilir, yari aciga kecir sorgular atir cavab gelse yene qapali duruma kecir
//
//   Rate Limiting Pattern resilience4j diger bir ozellik gelen request sayini asqiya alma, gecikdirme, time outa gonderme istifade ede bilerik, deyek ki 100 dollar gondermek
//   isteyirik yanlisliqla 3 defe bassaq rate limit 10 saniyede 1 isteye icaze vermisikse bizi bu xetadan xilas edecek
//
//   Deyek ki db den melumat aliriq ve hansisa setiri indexleye bilerik ve o index ile cagirib suret elde ede bilerik, composit index ile ise birden cox setir cagira bilerik
//
//   SQL novunde ve NO-SQL novunde db ler var, sql novunde adeten obyektler, elaqelenmis varliqlar, sutunlar ve setirler seklinde strukturlasdirilmis db dir
//   NO-SQL ise esasen documentasiya, json, sekil ve s datalar saxlanilir
//
//   COMPILE ve BUILD ferqi: compile bizim classlari .class a cevirir build ise .jar, .war a cevirir, bezen build zamani compiler i cagirib ozune komek etdirir
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
