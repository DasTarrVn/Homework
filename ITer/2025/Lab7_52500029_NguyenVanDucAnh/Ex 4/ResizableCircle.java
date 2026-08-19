public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }

    public void resize(int percent) {
        setRadius(radius * ((double) percent / 100));
    }
}
