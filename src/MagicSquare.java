public class MagicSquare { 
    private Integer[][] mSq;
    private int n;

    // 2
    public MagicSquare(String sq){
        
    }


    // 1
    public void printSquare(){
        
    }

    // 1
    private int sumArr(Integer[] arr) {

        
        return 0;   // Dummy Return
    }

    // 3
    public boolean checkSquare(){
        Integer[] arr1 = new Integer[this.n];
        Integer[] arr2 = new Integer[this.n];


        return false; // Dummy Return
    }

    // 2
    public boolean checkSquare2() {
        
        return true; // Dummy Return
    }

    public static void main(String[] args) {
        String sq1 = "2,7,6,9,5,1,4,3,8";
        String sq2 = "15,10,3,6,4,5,16,9,14,11,2,7,1,8,13,12";
        String sq3 = "1,2,3,4";
        String sq4 = "1,1,1,1,1,1,1,1,1";
         
        for (String s : new String[] {sq1, sq2, sq3, sq4}) {
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
}
