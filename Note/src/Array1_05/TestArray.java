package Array1_05;

public class TestArray {
    public static void main(String[] args) {

        // An object storing reference and primitive type
        // c is a reference to the very first item int the array
        char[] c;
        c = new char[4];
        c[0] = 'b';
        c[1] = 'l';
        c[2] = 'u';
        c[3] = 'e';
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        // 2D array is the array is reference to array
        // use loop can get one rectangular multi-dimensional array
        char[][] cIn2D;
        int n = 3;
        cIn2D = new char[n][n];
        for(int i = 0; i < n; i++){
            cIn2D[i] = new char[n];
            for(int j = 0; j < n; j++){
                cIn2D[i][j] = 'a';
                System.out.print(cIn2D[i][j]);
            }
            System.out.println("");
        }
    }
}
