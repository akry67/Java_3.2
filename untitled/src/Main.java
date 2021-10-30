public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 150;
        int height = 220;
        double BodyMassIndex = service.calculate(weight,height);
        System.out.println(BodyMassIndex);
    }
}
