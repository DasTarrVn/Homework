public class Carrot implements Vegetable {
    private String type = "Carrot";

    @Override
    public String getInfo() {
        return "Type=" + type;
    }
}
