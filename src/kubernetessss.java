public class kubernetessss {
//
//   kubernetes de en ust birim claster dir, clasterin icinde bizim qurdugumuz structurun bir nece namespace i ola biler meselen test ucun test namespace prod ucun prod
//   namespace, clasterin icinde node lar olur
//
//   kubernetes bizim docker container leri avtomatik idare etmeyimiz ucun bir konteyner orkestration dur CLI(comand line interface) dir API deyil yeni comand ile idare olunur
//   meselen deyek ki bizim 4 docker container de up olan proyektimiz var ve kubernetes bu proyektlerin up olub olmamasini eger down dursa clone bir copyasini up edilmesini
//   ve s bu kimi funksiyalari yerine yetirir. bunu biz bir API proyect yazib da ede bilerik amma kubernetes bunu asanlasdirmaq ucun yaradilib
//
//   kubernetes de bu isleri goren de NOD dur onun nezaret etdiyi  de NOD dur sadece idare eden nod MASTER NOD, idare olunanlar
//   WORKER NOD adlanir. eger master nod down olsa o zaman hansisa bir worker nod master nod funksiyasini alir ve idareciliyi ele kecirir
//   MASTER NOD un db si var ETCD adlanir key value strukturundadir
//
//   node un icinde POD olur ve  hemin pod un icinde adeten 1 container olur,  1 pod a 1 den artiq container de daxil etmek olar,  pod larin ancaq internal ip si olur
//
//   kubernetes kubectl commandi ile baslayan commandlarla isleyir
//
//   master nod worker node larla kublets service si vasitesile danisir meselen deyir ki get 2 image qaldir ve ya 3 image qaldir
//
//   master node un icinde scheduler i olur
//
//   her bir node un icinde kube proxy si ve internal ip external ip adresi var
//
//   master node da replication controller var ve deyek ki biz bir proyektden iki eded qaldirmisiq onun biri down olubsa gedib bir copy sini avtomatik yaradir
//
//   deployment in icinde podlar, replika sayi, yenileme strategiyalari olur, bir sozle deployment birden artiq podu yardib idare etmek ucun istifade olunur
//
//   deyek ki bir mysql in iki replikasini qaldirdiq ve hansisa biri down oldu, bu zaman kubernetes onun bir yeni kopyasini qaldiracaq ve onun internal ip si ferqli olacaq
//   ve yeni gelen requestleri ala bilmeyecek. bunun qarsisini almaq ucun SERVICE yaradiriq ve deyirik ki bu database e gelen requestler bu adli service terefinden accept
//   olunsun bu zaman master nod gedib yeni yaranan db nin ip sini oz db sine yazir ve service gelen requestleri bu yenilenmis ip ye yoneldir.
//
//   kubernetes de loadbalancer var ve cox sayda gelen requestleri pod lar arasinda beraber bolur bir poda cox digerine az request gelmeyinin qarsisini alir
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
