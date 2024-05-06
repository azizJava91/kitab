public class a_18_annotationlar {
    String ann = "" +
            "annotaion ilk java 5 ile gelmisdir" +
            "java coduna class method deyisken parametr ve paketlere on bilgi ve ya metadata elave etmek ucun istifade olunur" +
            "uc meqsedi var" +
            " 1: compayleri xeberdar etmek ucun, yeni compayler bunu gorub bezi xetalari ve xeberdarliqlari gormezden gelir" +
            " 2: kompayl zamani avtomatik kod ve xml fayli yaradilmasi ucun " +
            " 3: isleme zamani kodun annotationa gore islemesini temin etmek ucun" +
            "javaDoc a alternativ kimi  de istifade olunur" +
            "java.lang.annotation paketinden gelir" +
            "class method interface vs yerlerde istifade oluna biler" +
            "icinde tek uzv olan annotation single value, cox olan multi value, hec olmayan ise marker annotation adlanir" +
            "class method deyisen ve ya paketlerden yalnizca hansisa birileri ucun istifade etme controlu ucun target istifade olunur mes: @Target(ElementTYPE.METHOD) " +
            "Annotation un lifecycle yeni yasama muddeti ucun uc tip teyinat vardir" +
            " 1: SOURCE @RETENTION(RETENTIONPOLICY.Source) " +
            " 2: CLASS  @RETENTION(RETENTIONPOLICY.CLASS)" +
            " 3: RUNTIME @RETENTION(RETENTIONPOLICY.RUNTIME)" +
            "";


}
