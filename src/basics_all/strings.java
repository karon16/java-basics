package basics_all;

public class strings {
    public static void main(String[] args){
        String s = " hello ";
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("ll"));
        System.out.println(s.endsWith(" "));
        System.out.println(s.concat("World ").trim());
        System.out.println(s.charAt(2));
        System.out.println(s.concat("world"));
    }
}