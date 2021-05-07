public class Test7 {
    public static void main(String[] args) throws Exception {
        Float f = null;
        try {
            f = Float.valueOf("12.3");
            System.out.println(f); // 12.3

            String s = f.toString();
            System.out.println(s);

            float in = Float.parseFloat(s);
            System.out.println(in);
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("trouble: " +f);
        }
    }
}
