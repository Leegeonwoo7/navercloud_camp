package homework;

public class GuGuDan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i += 3) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 0; k < 3; k++) {
                    int left = i + k;
                    int right = left * j;

                    System.out.print(left + "*" + j + "=" + right + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
public class GuguDan {
    public static void main(String[] args) {
        // Start multiplication tables from 2 to 9
        for (int cnt = 2; cnt <= 9; cnt += 3) {
            for (int i = 1; i <= 9; i++) {
                for (int j = cnt; j <= cnt + 2; j++) {
                    if (j > 9) {
                        break;
                    }
                    System.out.printf("%d * %d = %2d\t", j, i, (j * i));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/
