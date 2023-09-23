public class Main {
    public static void main(String[] args) {
        Complex a = Complex.getInstance(6, 6);
        Complex b = Complex.getInstance(7, -7);

        Complex sum = a.add(b);
        System.out.println(sum);
        Complex sub = a.subtract(b);
        System.out.println(sub);
        Complex milti = a.multiply(b);
        System.out.println(milti);
        Complex div = a.divide(b);
        System.out.println(div);
    }
}