// Michelle Pohl
public class MagicSquare {
    private Integer[][] mSq;
    private int n;

    // 2
    public MagicSquare(String sq) {
        // WErte in array aufteilen und Anzahl bestimmen
        String[] values = sq.split(",");
        n = (int) Math.sqrt(values.length);

        mSq = new Integer[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mSq[i][j] = Integer.valueOf(values[index++]); // Verwende Integer.valueOf, um Autoboxing zu vermeiden
            }
        }
    }

    public static void main(String[] args) {
        String sq1 = "2,7,6,9,5,1,4,3,8";
        String sq2 = "15,10,3,6,4,5,16,9,14,11,2,7,1,8,13,12";
        String sq3 = "1,2,3,4";
        String sq4 = "1,1,1,1,1,1,1,1,1";

        for (String s : new String[]{sq1, sq2, sq3, sq4}) {
            System.out.println();
            MagicSquare mSq = new MagicSquare(s);
            mSq.printSquare();
            if (mSq.checkSquare() && mSq.checkSquare2()) {
                System.out.println("\n... is a magic square\n");
            } else {
                System.out.println("\n... is NO magic square\n");
            }
        }

    }

    // 1
    public void printSquare() {

        for (Integer[] row : mSq) {
            for (Integer value : row) {
                System.out.print(String.format("%3d", value));
            }
            System.out.println();
        }

    }

    // 1
    private int sumArr(Integer[] arr) {
        int sum = 0;
        for (Integer value : arr) {
            sum += value; // Verwendet intValue() für Summierung ohne Autounboxing
        }
        return sum;
    }

    // 3
    public boolean checkSquare() {

        int targetSum = sumArr(mSq[0]);

        for (int i = 1; i < n; i++) {
            if (sumArr(mSq[i]) != targetSum) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            Integer[] column = new Integer[n];
            for (int i = 0; i < n; i++) {
                column[i] = mSq[i][j];
            }
            if (sumArr(column) != targetSum) {
                return false;
            }
        }

        Integer[] diagonal1 = new Integer[n];
        Integer[] diagonal2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            diagonal1[i] = mSq[i][i];
            diagonal2[i] = mSq[i][n - i - 1];
        }
        return sumArr(diagonal1) == targetSum && sumArr(diagonal2) == targetSum;

//        Integer[] arr1 = new Integer[this.n];
//        Integer[] arr2 = new Integer[this.n];
//
//        return false; // Dummy Return
    }

    // 2
    public boolean checkSquare2() {

        // Zielwertebereich [1, n^2]
        int maxVal = n * n;

        // Prüfe für jede Zahl von 1 bis n^2, ob sie in mSq enthalten ist
        for (int i = 1; i <= maxVal; i++) {
            Integer target = i;
            boolean found = false;

            // Durchsuche mSq nach der Zahl target
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (mSq[row][col].equals(target)) {
                        found = true;
                        break; // Zahl gefunden, nächste Zahl prüfen
                    }
                }
                if (found) break; // Falls gefunden, verlasse die Zeile
            }

            // Wenn die Zahl nicht gefunden wurde, ist mSq kein magisches Quadrat
            if (!found) {
                return false;
            }
        }

        // Alle Zahlen von 1 bis n^2 wurden gefunden
        return true;

    }
}
