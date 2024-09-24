public class docker {
//
//   Containerization proyektin kodunu her hansisa emeliyyat sisteminde qaldirmaq ucun lazim olan butun fayl ve kitabxanalarla birlikde paketlemek demekdir
//
//   DOCKER HUB image lerin toplu saxlanildigi uzaq serverdir, burada oz profilimizi yaradib public ve ya private ede biler ve oz custom image lerimizi saxlaya bilerik
//
//   CONTAINER bizim applicationumuzu hansisa bir virtual masinda, ve hansisa operation system de up etmek ve idare etmek ucundur
//
//   Docker bir container dir, docker olmayanda bir proyekti qaldirmaq ucun virtual masin yaradilirdi onun icine operation system yazilirdi, networkler config olunurdu
//   menfi cehetleri configurasiya vaxt alir operation system cox yaddas hecmine malikdir, virtual masin cox cpu ram istifade edirdi,
//
//   docker de ise bos containerler var onlarin her birinin icinde db mizi, proyektimizi qaldira bilirik, deyek ki bize mysql lazimdi biz bunu docker olmadan endirsek
//   500 mb dan cox yaddas serf ederdik amma dockerhub da bunun hazir image leri var hecmi de texminen 80-100 mb ve hetta ustelik icinde de operation system de var ,
//   sadece o image i goturub her hansi bir docker containere install edib qaldira bilerik, bunun ucun dockerhubdan bu image pull komandi ile localimiza endiririk
//   
//   docker local computerimizin icinde bir komputerdir deye bilerik deye biz eger dockerimizde 3306 da mysql qaldirmisiqsa komputerimize 3306 ya gelen istekleri gormur
//   cunki komputerimizde hazirda 3306 bosdur, biz bunun ucun dockerin 3306 portunu komputerimizin hansisa bos portuna baglamaliyiq mes 4444:3306, solda komp sagda docker
//   eger her iki container bir networkle isleyirse o zaman localhostunu gore bilir
//
//   docker pull mmsql               # hubdan locala image endirmek ucun
//   docker image rm id-si           # image silir
//   docker images                   # imageleri gosterir
//   docker ps                       # containerleri gosterir
//   docker ps -a                    # sonulu ve islek olanlari birlikde gosterir
//   docker start id-si              # containeri qaldirir
//   docker stop  id-si              # containeri sondurur
//   docker rm id-si                 # containeri silir
//   docker network ls               # networklerin siyahisini gosterir
//
//   docker-compose.yaml property file di icinde db image adi, enviroment password, port lar, volume lar ve s olur, bir nece containerin bir biri ile elaqelerini configurasiya
//   etmek ucundur. yeni bir proyektimizin islemesi ucun bir nece container varsa bunlari service kimi ele alib aralarindaki elaqeleri configurasiya edirik
//
//   VOLUME db de ki datalari saxlamaq ucun istifade olunur. deyek ki db olan container silindi amma bu zaman icindeki datalar volume sayesinde silinmeyecek
//
//   NETWORK containerin icinde yaradilib bir nov basqa containerlerle ve kenar dunya ile elaqeni temin etmek ucun virtual adressdir
//
//   DOCKERFILE bizim proyekti dockere yuklemek ucun bir file dir. icinde operation system, jdk, "build ve run" commandlari olur
//
//   BUILD COMMANDLARI from(meselen jdk nin versiyasini isteye bilerik) ve copy(localdaki applicationumuzu jar a cevirib dockere tanidiriq). build yaratmaq ucundur
//
//   RUN COMMANDLARI  cmd(java -jar myapp.jar)   proyektimizin dockere tanitdigimiz jar ini run edib isletmesini isteyirik.                   run isletmek ucundur
//   image in icinde bir cmd command ola biler yoxsa bir cmd digerini override edir
//
//   ENTRYPOINT cmd nin hansi emri yerine yetireceyini teyin edir, deyek ki  cmd[java -jar myapp.jar] vermisik eger entrypoint[java] versek cmd[-jar myapp.jar] bu cur
//   olacaq icindeki java ni silirik, yeni entrypoint image isleyende default isleyecek esas commandi teyin edir, cmd de defaul isleyecek commandi teyin edir
//
//   MULTISTAGE DOCKERFILE bize deyek ki her hansi bir xarici kitabxananin verdiyi ozelliyi istifade etdiyimiz zaman bize sadece o lazim olan ozelliyi getirmesini yaninda
//   o kitabxananin bize lazim olmayan ozelliklerini getirmemesini temin edir.
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
