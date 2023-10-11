public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.86;
        int weightKilo = 85;
        int index = service.calculate(heightMeter, weightKilo);
        System.out.println("Индекс массы тела: " + index + " кг/кв.м");
    }


}
