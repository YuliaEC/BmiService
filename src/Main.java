public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int myBmi = service.calculate(65, 1.63);

        System.out.println(myBmi);
    }
}