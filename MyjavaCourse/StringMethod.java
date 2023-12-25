public class StringMethod {
    public static void main(String[] args) {
        String str = new String("Anmol pradhan");
        System.out.println("character at 0 in str : "+str.charAt(0));
        System.out.println("String length : "+str.length());
        System.out.println("String Lowe case conversion : "+str.toLowerCase());
        System.out.println("String Upper case conversion : "+str.toUpperCase());
        System.out.println("String trim space : "+str.trim());
        System.out.println("String having start index & print til last : "+str.substring(3));
        System.out.println("String having start index & print til last : "+str.substring(3,5));
        System.out.println("String Replace character by a to d : "+str.replaceAll("a", "o"));
        System.out.println("Strings equals to functions ");
    }
}
