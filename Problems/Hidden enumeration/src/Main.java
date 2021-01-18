public class Main {

    public static void main(String[] args) {
        int i = 0;
        for (Secret s : Secret.values()) {
            if (s.toString().startsWith("STAR")) {
                ++i;
            }
        }
        System.out.println(i);
    }
}
//enum Secret {
//    STAR, CRASH, START, // ...
//}