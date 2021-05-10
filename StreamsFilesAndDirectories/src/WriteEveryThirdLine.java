import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        List<String> output = Files.readAllLines(Path.of("input.txt"));
        List<String> lines = new ArrayList<>();
        for (int i = 2; i < output.size(); i += 3) {
            lines.add(output.get(i));
        }
        Files.write(Path.of("output.txt"), lines, StandardCharsets.UTF_8);
    }
}