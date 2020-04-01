package Transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveData {

    public static void SaveToFile(String fileName, List<String> data) throws IOException {
        FileWriter writer = new FileWriter("src/main/java/Files/" + fileName + ".txt");
        for (String str : data) {
            System.out.println(str);
            writer.write(str + System.lineSeparator());
        }
        writer.close();

    }

}
