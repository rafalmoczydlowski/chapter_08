import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ex_08_02 {
    public static void longWordsWithStream(String pathname) throws IOException {
        var start = System.currentTimeMillis();
        String text = new String(Files.readAllBytes(Paths.get(pathname)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(text.split("\\PL+"));
        long longWordsCount = words.stream().filter(s -> s.length() > 12).count();
        var end = System.currentTimeMillis();
        var delay = end - start;
        System.out.println("Czas wykonania operacji z metodą stream() - " + delay);
    }

    public static void longWordsWithStreamParallel(String pathname) throws IOException {
        var start = System.currentTimeMillis();
        String text = new String(Files.readAllBytes(Paths.get(pathname)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(text.split("\\PL+"));
        long longWordsCount = words.parallelStream().filter(s -> s.length() > 12).count();
        var end = System.currentTimeMillis();
        var delay = end - start;
        System.out.println("Czas wykonania operacji z metodą parallelStream() - " + delay);
    }
}
