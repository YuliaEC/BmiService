public class BmiService {

    public int calculate(int weight, double height) {

        int result = (int) (weight / (height * height));

        return (int)result;
    }

}
