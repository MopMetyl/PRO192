import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) {
        Set<String> lecturersAndStudents = new HashSet<>();
        String filename = "lecturersandstudents.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!lecturersAndStudents.contains(line)) {
                    lecturersAndStudents.add(line);
                    System.out.println("Thêm thành công: " + line);
                } else {
                    System.out.println("Giảng viên/sinh viên đã tồn tại: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Danh sách giảng viên và sinh viên sau khi loại bỏ trùng:");
        for (String person : lecturersAndStudents) {
            System.out.println(person);
        }
    }
}
