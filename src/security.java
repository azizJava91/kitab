public class security {
//
//    security iki hisseden ibaretdir: 1:AUTHENTICATION(who i am?)  2: AUTHORIZATION(what can i do?)
//
//    AUTHENTICATION novleri var: username password,  JWT, LDAP, AD ve s
//
//    AUTHORIZATION iki novu var,   1: RBAC (role based access control) ve ABAC(attribute based access control)
//
//   spring e security dependency elave edirik. @Configuration ile config classimizi yaradiriq, @EnableWebSecurity yaziriq ki oz security
//   logicimizi yazaq, config classimizin icinde @Bean yaradiriq ve bean SecurityFilterChain qaytaran ve HttpSecurity httpSecurity qebul eden
//   method olur ve icinde permit (String tipinde http path veririk: mes: /user) bu production ucun yaxsi yontem deyil, ayrica spring security icinde inmemory test ucun de
//   method movcuddur test ucun istifade etmek olar
//
//   RBAC ucun userdetailsService interface ni impliments eden classimizi yaratmaliyiq ve UserDeatails donen bir loadUserByUsername methodunu override etmeliyik,
//   sonra BCryptPasswordEncoder bean i yaradib passwordlari encode olunmus formada database e yazmaliyiq.
//
//   JWT ile secutirty yaradan zaman SecurityFilterChain de CSRF-disable(session hucumu session ogurlama), CORS-disable(basqa api den bu apinin  cagrilmasi),
//   SessionManagment(Stateless) edirik, jwt uc hisseden ibaret olur, 1: Header(encode alqoritmi ve token novu), 2: Payload(username, token verilmeve bitme tarixi, rollar),
//   3: Signature(header+payload+private key imizin encript olunmus codu). oz custom security mizi yaradan zaman UsernamePasswordAuthFilter den one bizim filter dusur ve
//   UsernamePasswordAuthFilter baglayiriq, yeni ki bu filtere catana qeder SecurityContext e user elave etsek artiq UsernamePasswordAuthFilter bizden sifre giris istemeyecek
//
//    antMatchers() ile hansi url deki api lere hansi giris icaze seviyesi teyin edeceyimizi yaziriq, mvcMatchers() de mvc proyektlerde istifade olunur
//
//   asimmetrik alqoritmde public ve private key olur, simmetrik alqoritmde ise sadece public key olur onunla hem decode encode edir
//
//   spring security 16 filter var:
//    1:BrowserHttpRequest 2:SecurityContextPersistenceFlter 3:HeaderWriterFilter 4:CsrfFilter 5:LogOutFilter <-> 6:UsernamePasswordAuthFilter 7:DefaultLoginPageGeneratingFilter
//    8:DefaultLogoutPageGeneratingFilter 9:BasicAuthenticationFilter 10:RequestCacheAwareFilter 11:SecurityContextHolderAwareRequestFilter 12:AnonymousAuthenticationFilter
//    13:SessionManagementFilter 14:ExceptionTranslationFilter 15:FilterSecurityInterceptor 16:Our@Controller
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
