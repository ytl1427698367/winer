package tailong;

import java.io.*;
import java.nio.file.Paths;
import java.util.Random;

/**
 * Author：TaiLong
 * created:2018/12/9
 */
public class Point {

    public static void main(String[] args) {
        File studentDataFile = Paths.get("D:", "dianmingce", "exe").toFile();
        try (
                InputStream in = new FileInputStream(studentDataFile);
                Reader inputStreamReader = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(inputStreamReader))

        {
            String line = null;
            String[] student = new String[2];
            int index = -1;
            while ((line = reader.readLine()) != null) {
                index++;
                student[index] = line;
            }
            Random random = new Random();
            int sclectIndex = random.nextInt(student.length);
            System.out.println("选择的学生是" + student[sclectIndex]);
        } catch (
                IOException e)

        {
            System.out.println(e.getMessage());
        }

    }


}
