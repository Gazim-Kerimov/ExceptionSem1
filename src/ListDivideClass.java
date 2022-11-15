public class ListDivideClass {
    public static int[] divide(int[]a, int[]b) {
        int[] c;
        if (a.length != b.length) {
            System.out.println("Размер входных массивов не одинаковый!");
            throw new RuntimeException();
        } else {
            c = new int[a.length];
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i] / b[i];
            }
        }
        return c;
    }
}
