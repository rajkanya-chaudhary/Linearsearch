public class Removevawel {
    public static void main(String[] args) {
        String str = "dimpal";
        String s1 = "";
        s1 = str.replaceAll("[aeoui]", "");
        System.out.println("after remove vawel String = " +s1);
    }
}
