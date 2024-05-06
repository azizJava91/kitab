public class componentScan {
//
//   Spring proyekt yazsaq component olmasini istediyimiz class lari paket yolunu gostererek bildirmeliyik ve bunu etdiyimiz class @Configuration ile isarelemeliyiik
//   asagidaki kimi @ComponentScan ile hansi classin component oldugunu gostermeliyik, buna manual configuration deyirik
//
//   amma Spring boot da bunlari el ile gostermeyimize ehtiyac yoxdur, cunki @SpringBootApplication annotationu ile proyekti start etdiyimiz main classi isareleyirik bu
//   zaman @SpringBootApplication un icinde @EnableAutoConfiguration var ve bu ise duserek baslangic classimizin paketi ve onun butun alt paketlerini avtomatik scan edir
//   ve component olan classlarin obyekti yaradilib ioc containere elave edilme isini yerine yetirir.
//
//   @ComponentScan(basePackages) ile paketin path ini veririk bu zaman spring ayaga qalxanda bu paketin icinde ne qeder component varsa onlari scan edib tapir ve
//   instance sini yaradib ioc container e atir, eger basePackages path vermesek class in oz paketindeki butun class lari scan edir
//
//   @ComponentScan(basePackageClasses)  ile ise class listi formasinda classlar veririk ve hemin classlarin yerlesdiyi paketleri scan edir
//
//   @ComponentScan(useDefaultFiltres = false) etdiyimiz zaman hemin classin scan default hedefi olan @Component in altindakilari(service, repository ve s) sondurur ve
//   hemin class larin bean i ni ioc containere elave etmir
//
//    @ComponentScan(useDefaultFiltres = false,
//                  includeFilters = ComponentScan.Filter(type = FilterType.ANNOTATION,
//                   classes = @OzAnnotationum))                                            bu yazilisda sadece annotation ile isarelenmis ve oz annotationumuz gosterilen
//                                                                                            lerin bean i yaradilacaq
//
//    @ComponentScan(useDefaultFiltres = false,
//                  includeFilters = ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE ,
//                  classes = OzClassim.class))
//                                                                       bu yazilisda bean ini yaratmaq istediyimiz classin ustune  component tipli hec bir annotation qoymuruq
//                                                                       sadece OzClassim.class referansi veririk
//
//    @ComponentScan(basePackages = "com.project"
//                  useDefaultFiltres = false,
//                  includeFilters = ComponentScan.Filter(type = FilterType.Regex ,
//                  pattern = "*Service"))                                               com.project altinda regex patterne uygun butun classlari bean olaraq gorur
//
//     @ComponentScan(basePackages = "com.project"
//                  useDefaultFiltres = false,
//                  includeFilters = ComponentScan.Filter(type = FilterType.Regex ,
//                  pattern = "*Service",
//                  excludeFilters = ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//                  classes = CixanClassim.class))
//
//                                                     burada  CixanClassim bu scan olunacaq  paketdedi ve onu component olaraq gorme deyirem
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
