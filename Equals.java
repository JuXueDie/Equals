public class Equals {
    public static void main(String[] args) {
        String str1 = new String("str");
        String str2 = new String("str");
        System.out.println("==��� �G" + (str1 == str2));
        System.out.println("equal����G" + str1.equals(str2));
        String str3 = "str1";
        String str4 = "str1";
        System.out.println("==��� �G" + (str3 == str4));
        System.out.println("equal����G" + str3.equals(str4));
    }
}