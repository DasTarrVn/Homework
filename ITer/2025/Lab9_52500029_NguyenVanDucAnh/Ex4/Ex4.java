import java.io.*;

public class Ex4 {
    public static boolean getFileByExtensions(String inputPath, String extension, String outputPath) {
        try (PrintWriter pw = new PrintWriter(new File(outputPath))) {
            File folder = new File(inputPath);
            String[] fileList = folder.list();
            for (String file : fileList) {
                if (file.endsWith(extension)) {
                    pw.println(file);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args) {
        getFileByExtensions("Folder", ".java", "Result.txt");
    }
}
