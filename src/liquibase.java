public class liquibase {
//    liquibase database migration tool dur, benzer Flyway, bytebase, Evolve, DbPatch, yuniql kimi toolar da var
//    liquibase ile biz application qalxmazdan evvel DB mizi istediyimiz kimi configuration ede bilerik, mes: super admin yaratmaq
//    liquibase istifadesi ucun lazimli dependency leri endirmeliyik
//    liquibase proyektimizde resource altinda changelog.yaml file ni axtarib oxumaq isteyir
//    liquibase database de ki value ve column deyisikliklerini idare etmek changelog fayllarindan oxuyub db ye tetbiq etmek
//    ve db de yaranan changelog table ye etrafli qeyd etmek ucun istifade olunur
//    liquibase changelog lock table ise wait mentiqini ise sala bilir. deyek ki kubernetes de bir proyektimizin 3-4 copy si var
//    ve onlar eyni anda start olur bu zaman db ye ilk giren proyekt copyasi changelog lock table daki "locked" columunun deyerini
//    true edir ve bu db ye girmek isteyen diger copy proyektler gozleyir (10 sec)isini bitirib cixanda ise false edir ve digerleri gire bilir
//    bir nov liquibase start deyerlerini vermek ve bir daha yeniden islemeyinin qarsisini almaq ve copy proyektlerde novbeni qorumaq
//    prinsipini temin edir, rename zamani yeni column yaratmagin qarsisini alir, default deyerleri bir defe vermek, deyisiklikleri log kimi
//    tarixe ve diger parametrlere gore loglayib saxlamaq, db novu mes: mysql i oracle deyisen zaman yeni db ye gedib sintaksis ferqine
//    baxmayaraq hemin db nin sintaksisine uygun column, table lar create edir
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
