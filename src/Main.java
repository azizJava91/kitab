import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.util.*;
import java.util.concurrent.Semaphore;
public class Main {


    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        semaphore.acquireUninterruptibly();
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] yeniMassiv = new int[3][3];

        // Diagonal elemanları değiştir

        for (int i = 0; i < arr.length; i++) {
            int muveqqeti = arr[i][i];
            arr[i][i] = arr[i][arr.length - i - 1];
            arr[i][arr.length - i - 1] = muveqqeti;
        }

        // Değiştirilmiş matrisi yazdır
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                yeniMassiv[i][j] = arr[i][j];
            }
        }

        Arrays.stream(yeniMassiv).forEach(indexMassiv -> {
            Arrays.stream(indexMassiv).forEach(element -> System.out.print(element + " "));
            System.out.println();
        });

        Optional<Integer> optionalNumber = Optional.ofNullable(null);
        optionalNumber.ifPresent(number -> System.out.println("Sayı: " + number));
optionalNumber.orElseThrow(()->new NullPointerException("5t6y7hu"));
    }
}



