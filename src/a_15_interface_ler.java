public class a_15_interface_ler {
    String in = "" +
            "interface polymorphism in numayendesidir, abstract classdan ferqi subclass birden cox interface i impliments ede biler" +
            "abstract classlari extends eden classlar butun methodlari override etmek mecburiyetinde deyildi amma interfacede butun methodlar override edilmelidir" +
            "interfacelerde deyisenlerin access modifieri (public static final int SABIT_QIYMET = 450; ) olur ve sabit kimi qebul edilir, ilk setirde deyeri verilir, deyise bilmir" +
            "java 8 den evvel interfacelere ancaq govdesiz abstract metodlar yazila bilirdi" +
            "java 8 den sonra metodun basina default, static, private, ve ya private static keywordleri qoyub body ile (govde) yazmaq olur override konulludur" +
            "class iki interface impliment ederse ve her iki interface de eyni adda method olsa xete verir bunu aradan qaldirmaq ucun iki yontem var" +
            " 1: mutleq methodu override etmek, bu zaman kompayler hansi interfaceden override etdiyimize onem vermez " +
            " 2: diger yontem super keywordu ile override edib bildirmek  @override public void nefesAl()  {Insan.super.nefesAl();  }  " +
            "interface basqa interface i extend ede biler ve bu interface i impliments eden class her iki interface in methodlarini override etmelidir" +
            "interface icinde iki ve daha artiq eyni adda method ola biler amma mutleq parametr sayi, novu ve ya sirasi ferqli olmalidir, " +
            "donus tipi ferqli olsa da xeta verer bunun ehemiyeti yoxdu, bir nov overloading kimi de baxa bilerik" +
            "interface icinde interface teyin etmek olar bu zaman (class InterfaceTest impliments Interface1.Interface2) kimi olur" +
            "java da class larin bir birinden birbasa asililigi yeni tightly couplingin qarsisini alir loosely coupling e cevirir" +
            "deyek ki Mysqlconnection class var ve onun mysql baglanti confiqurasiyasi olan connect methodu var, bizim Service classimiz" +
            "db ye baglanmaq isteyir ve oz daxilinde Mysqlconnection mySql = new Mysqlconnection(); yaradib baglantini qurur, eger ne vaxtsa " +
            "mysql yox Oracle lazim olsa ve yeni Oracle classi yaradib onun connect methodunu istifade etmek istesek gedib mysql obyektini " +
            "silib Oracle oracle = new Oracle(); yazmali olacagiq. bunun qarsisini almaq ucun her iki db connect classini yeni bir Repository" +
            "interface den impliments edirik ve interfaceye connect abstract methodu yazib her iki class dan override edib doldururuq, " +
            "sonra Servicede lazim olsa Repository repository = new  Mysqlconnection(); ve ya Repository repository = new Oracle();yaza bilerik ";
}
