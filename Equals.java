public class Equals {
    public static void main(String[] args) {
        String str1 = new String("str");
        String str2 = new String("str");
        System.out.println("==比較 ：" + (str1 == str2));
        System.out.println("equal比較：" + str1.equals(str2));
        String str3 = "str1";
        String str4 = "str1";
        System.out.println("==比較 ：" + (str3 == str4));
        System.out.println("equal比較：" + str3.equals(str4));
    }
}