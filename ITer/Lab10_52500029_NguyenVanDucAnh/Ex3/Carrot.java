public class Carrot implements Vegetable {
    private String type;

    @Override
    public String getInfo() {
        return "Type=" + type;
    }
}
