public class CheckBinary {
    public static void main(String[] args) {
        String b = "";
        String str = String.valueOf(b);
        Boolean binaryCheck = str.matches("[01]*");
        System.out.println("User given number is binary : " + binaryCheck);
    }
}
