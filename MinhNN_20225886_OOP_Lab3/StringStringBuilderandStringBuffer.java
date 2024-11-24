
package otherproject;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            r.nextInt(2);//NguyenNhatMinh20225886
        }
        System.out.println(System.currentTimeMillis() - start);
        
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) { 
            sb.append(r.nextInt(2));//NguyenNhatMinh20225886
        }
        sb.toString();//NguyenNhatMinh20225886
        System.out.println(System.currentTimeMillis() - start);
    }
}



package hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        System.out.println("Starting GarbageCreator...");
        try {
            // Tao rat nhieu chuoi de gay ra "rac"
            while (true) {
                String garbage = new String("This is garbage: " + Math.random());//NguyenNhatMinh20225886
            }//NguyenNhatMinh20225886
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: Too much garbage created!");//NguyenNhatMinh20225886
        }
        System.out.println("Garbage Creator finished.");
    }
}




package otherproject;
import java.util.Random;

public class GarbageCreator {
    public static void main(String[] args) {
        int size = 10000;
        byte[] inputBytes = new byte[size];
        Random random = new Random();
        random.nextBytes(inputBytes);//NguyenNhatMinh20225886
        long startTime = System.currentTimeMillis();//NguyenNhatMinh20225886
        StringBuilder outputString = new StringBuilder(size);
        for (byte b : inputBytes) {
            outputString.append((char) b);//NguyenNhatMinh20225886
        }
        long endTime = System.currentTimeMillis();//NguyenNhatMinh20225886
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}




package otherproject;
import java.util.Random;
public class NoGarbage {
    public static void main(String[] args) {
        int size = 10000;
        byte[] inputBytes = new byte[size];
        Random random = new Random();//NguyenNhatMinh20225886
        random.nextBytes(inputBytes);//NguyenNhatMinh20225886
        long startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder(size);
        for (byte b : inputBytes) {
            char printableChar = (char) ((b & 0xFF) % 95 + 32);//NguyenNhatMinh20225886
            outputStringBuilder.append(printableChar);//NguyenNhatMinh20225886
        }
        outputStringBuilder.toString();//NguyenNhatMinh20225886
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}
