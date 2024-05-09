public class log {

//    Log lama proyektimizin calisma zamaninda  analiz ede bilmek, xetalari gormek, performansi deyerlendirmek, ve lazim olan melumatlari bir file ve ya db ye yazmagi temin edir
//
//   Spring default olaraq logback framework u istifade edir mehsur log framework leri log4j log4j2 slf4j ve. s
//
//   log4j ucun pom.xml e lazimli log4j jar larini yazmaliyiq. ve ayrica log4j.xml de mutleq sekilde src/main/resources altinda acmaliyiq. cunki log4j jari bu pathi axtarir
//
//    log4j.xml in icinde butun ayarlar <Configuration></Configuration> teg in icinde edilir.
//    <Appenders></Appenders> bunun icinde outputun console ve ya file ve ya db oldugunu qeyd edirik ve birden cox <Console> ve <PatternLayout> yaza bilerik
//
//    <Configuration status="debug" name="baeldung" packages="">
//    <Appenders>
//        <Console name="stdout" target="SYSTEM_OUT">
//            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %p %m%n"/>
//        </Console>
//        <!-- Diğer appender'lar burada eklenebilir -->
//    </Appenders>
//    <Loggers>
//        <Root level="error">
//            <AppenderRef ref="STDOUT"/>
//        </Root>
//    </Loggers>
//  </Configuration>
//
//  <PatternLayout> outputun gorunus ve hansi hisselerin cixmasini istediyimiz tag dir
//    <Loggers></Loggers> bu tagin icinde istediyimiz <Logger></Logger> taglerini yazaraq log seviyelerine ve bolgelerine gore log yazmagimizi temin edir, loggers in icinde
//    bir de  <Root></Root> logger de olur bu default logger sayilir logger teyin etmesek avtomatik bu isleyir ve butun paketler ucun kecerli sayilir
//     <Root></Root> icindeki <AppenderRef> ile hansi <Console> dizayninin referansini teyin edeceyimizi gostere bilerik
//
//   log seviyeleri debug < info < warn < error < trace olaraq gedir mes eger warn teyin etsek warn ve ustu olan error ve trace isleyir daha zeif olan debug ve info islemir
//   <RollingFile> file larimiza mueyyen limit verib boyuk log size lari zamani ardicil yeni fayllar yaradir ve hemcinin fayllarin tarixe gore adlandirilmasi ile
//    axtarisi asanlasdiran bir Appender methodudur.
//

}
