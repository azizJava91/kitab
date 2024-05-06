import java.sql.JDBCType;

public class jdbs {
//   JDBC bir API (application programming interface) data base ye baglanmaq ucun bir interface kimi qebul ede bilerik, onun alt interfaceleri var:
//   Connection, Statement, ResultSet interfaceler.  Connection, Statement, PreparedStatement, CallableStatement, ResultSet kimi de class lari var
//
//   JDBC Template ise jdbc ile isleyen spring framework udur. spring de jdbc istifade ede bilmek ucun mysql ve ya oracle jari ve spring-jdbc jar ini elave etmeliyik
//
//    database de datalarin saxlanma formalari:
//    1: obyektyonumli model
//    2: network model
//    3: hiyerarxik model
//    4: elaqelendirilmis(relational) model
//    5: varliq-elaqe model (ENTITY-RELATIONSHIP)
//
//    data base idareetme sistemleri (data base management systems) database yaratmaq, hemin bazadaki datalari yazmaq,
//    axtarmaq, silmek, deyisiklik etmek ucun platformadir, bunu idare eden sexsler database managerdir(db idareci)
//    db lara numune olaraq oracle, mysql, microsoft sql server, postgresql, apache, access, sql lite, mongo db ve s
//
//    JDBC java database connectivity java uzerinden db lere baglanmaq ucun istifade olunan INTERFACE dir
//
//    JDBC iki hisseden ibaretdir 1: jdbc api 2: driver manager
//    jdbc api emrleri driver managere gonderir ve driver manager database ile elaqe qurub isleyir ve datalari jdbc api ye geri verir
//
//    java da jdbc nin uc elementi istifade olunur
//
//    1: Connection
//    session yaradir, sql sorgularini db ye gonderir ve geri donen datani resultsete veren korpudur
//    connection u iki class ile yaratmaq olur 1: DriverManager  2: DataSource
//    Connectionun 3 parametrini (baglanti path , username , password) girerek obyektini yaradiriq
//    connectionu close etmek lazimdir
//    data base e baglanmaq ucun lazimli url username ve password kimi bilgileri javada javax.sql paketindeki DataSource interface istifade ederek yaza bilirik
//    datasource drivermanager den daha performanslidir
//
//    2: Statement
//    Statement uc cur qurulur 1:PraperedStatement  2:Statement  3: CallableStatement
//    Statement her defe eyni sorgunu eyni performansda isleyir
//    PraperedStatement sql sorgu bir nece defe islenende daha cox performanslidir
//    Statement ile PraperedStatement ferqi PraperedStatement sql injection (?id=1 5>1) hucumuna imkan vermir ve value ?,?,?,? formada deyerleri performansli map ede bilir
//
//
//    3: Resultset
//    Resultset db den qayidan neticeleri ozunde tutan interface dir
//    while dongusu ile isleyir.
//    datalari colon indeksi ve colon adi ile almaq mumkundur, int id = resultSet.getInt("CUSTOMER_ID");   int id = resultSet.getInt(1);
//
//
//
//
//
//   JPA (java persistance api) kodlasdirma dili ile data base arasinda anlasmani temin eden bir razilasma noqtesi, spesifikasiyadir, JPA ferqli ORM texnologiyalarinin
//    eyni isi ferqli yontemlerle gormeyinin qarsisini almaq ucun java cemiyyeti terefinden standart kimi qebul olunub
//
//   Hibernate de JPA nin telebleri esasinda isleyen java ya mexsus ORM (object relational mapping) kitabxanasidir. java data tiplerini sql data tiplerine cevirir,
//   JPA ya destek olur, Hibernate JPA standart olmadan once de mehsur idi ve JPA nin temeli sayilir
//
//   JDBC yeni driver manager ile database e her sorgu bir connection obyekti istifade edir ve hem proyekti hem de db i yukleyir, amma jpa hibernate istifadesi zamani
//   Connection Pool da connection obyekti hovuzu arxada yaranir ve lazim olduqda sorgu ucun istifadeye verir ve isi bitdiyinde geri verir
//   Spring de connection pool yaratmaq  ucun el ile  Apache Commons,  C3P0, HikariCP ve s kimi jar lari proyekte daxil etmeliyik. avtomatik yaranmir
//
//   Spring boot ise db connection pool u ozu avtomatik yaradir, spring-boot-starter-data-jpa spring boot proyektlerimizde HikariCP ve ya Tomcat JDBC cp istifadeni teqdim
//   edir, default olaraq HikariCP istifade edir onu tapmasa Tomcat JDBC cp ve bu da tapilmasa Apache Commons DBCP2 istifade edir
//
//   yeni ki JDBC ile isleyen JPA dir ve jpanin altinda ona komek eden Hibernate dir
}
