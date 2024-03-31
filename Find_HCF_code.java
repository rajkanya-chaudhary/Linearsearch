public class Find_HCF_code {
    public static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return hcf(b, a % b);
        }
    }

    public static void main(String[] args) {
        int first = 23;
        int second = 69;
        System.out.println("HCF of " + first + " and " + second + " is " + hcf(first, second));
    }
}
