public class ListDiffClass {
    public static int[] diff(int[]a, int[]b) {
        int[] c = new int[a.length];
        try {
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        catch (Exception e){
            System.out.println("Размер входных массивов не одинаковый!");
        }
        return c;
    }
}
