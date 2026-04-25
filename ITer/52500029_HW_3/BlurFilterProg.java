import java.util.Random;

public class BlurFilterProg {

    public static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int i : row) {
                System.out.printf("%03d ", i);
            }
            System.out.println();
        }
    }

    public static int[][] applyBlur(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                int sum = 0;
                int count = 0;

                int startRow = Math.max(0, r - 1);
                int endRow = Math.min(rows - 1, r + 1);

                int startCol = Math.max(0, c - 1);
                int endCol = Math.min(cols - 1, c + 1);

                for (int i = startRow; i <= endRow; i++) {
                    for (int j = startCol; j <= endCol; j++) {
                        sum += image[i][j];
                        count++;
                    }
                }

                result[r][c] = sum / count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] image = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = rand.nextInt(256);
            }
        }

        System.out.println("--- The image before blurring ---");
        printImage(image);

        System.out.println("\n--- The blurred image ---");
        int[][] result = applyBlur(image);
        printImage(result);
    }
}