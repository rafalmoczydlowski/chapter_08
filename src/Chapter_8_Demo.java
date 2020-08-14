import java.io.IOException;

public class Chapter_8_Demo {
    public static void main(String [] args) {
        try {
            Ex_08_02.longWordsWithStream("Test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Ex_08_02.longWordsWithStreamParallel("Test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
