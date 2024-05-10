public class entity {
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



}
