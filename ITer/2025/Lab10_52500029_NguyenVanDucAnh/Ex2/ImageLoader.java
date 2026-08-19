public class ImageLoader {
    private static ImageLoader instance = null;

    private ImageLoader() {
    }

    public static ImageLoader getInstance() {
        if (instance == null) {
            instance = new ImageLoader();
        }
        return instance;
    }

    public String loadImage() {
        return "Loaded successfully.";
    }

    public static void main(String[] args) {
        ImageLoader il = ImageLoader.getInstance();
        System.out.println(il.loadImage());
    }
}
