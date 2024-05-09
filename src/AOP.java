public class AOP {

//    Springin modullarindan biri olan AOP Aspect oriented programming proyektimizde cox tekrar olunan emeliyatlari mes: loglama, transaction, security, monitoring  bir merkeze toplayib
//    programdan asili olmadan istifade etmeyimize ve modulyarliq qazandirmagimiza  imkan yaradir. temir asanlasir ve tekrar kodlar en aza endirilir
//
//    AOP nin esas elementleri Aspect , Join point, Advice, Pointcut, Weaving, Cross-Cutting Concern, AspectJ, Proxy kimi elementlerdir.
//
//    spring boot da aop nin esasinda isleyen ASPECTJ kitabxanasi var
//
//    Join Point after before kimi yeni bir methoda girmeden evvel, methodun isini gordukden sonraki an, ve ya exception dan evvelki ve ya sonraki an ve ya return olunandan
//    sonraki andir, buralara giris edib emeliyat heyata kecirmeye ise Cross-Cutting Concern, yeni capraz girisme narahatligi, ehtiyatli olma durumu deyilir
//    bunlari advice deyisenleri ile edirik
//
//    advice:  @Before("execution(* com.project.MyController.EmployeeController(..))")
//                 @After("execution(* com.project.MyController.EmployeeController(..))")
//
//    @Pointcut  ile teyin olunan method tekrar adress deyisenleri olan advice lere deyerini deyisen adi kimi verir  ve kod anlasiqligini artirir  mes:
//    Pointcut :  @Pointcut ("execution(* com.project.MyController.EmployeeController(..))")
//                 public void employeeControllerPointVariable(){
//                      }
//    istifadesi: @Before("employeeControllerPointVariable()")
//               @After("employeeControllerPointVariable()")
//
//    Advice ler:  @After, @Before, @AfterReturning, @Around (hem evvelde hem sonda), @AfterThrowing, @OzAdvicemiz
//------------------------------------------------------------------------------------------------------------
//    @Around(value= "employeeControllerPointVariable()")
//       public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//          System.out.println("Method baslamazdan evvel")
//               proceedingJoinPoint.proceed();
//          System.out.println("Method baslamazdan sonra")
//       }
//
//     @Pointcut ("execution(* com.project.MyController.EmployeeController(..))")
//               public void employeeControllerPointVariable(){
//                    }
//------------------------------------------------------------------------------------------------------------
//    @OzAdvicemiz de around un icine oz advicemizin path ini veririk
//
}
