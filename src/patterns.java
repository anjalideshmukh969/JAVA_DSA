public class patterns {
    public static void main(String[] args) {

        patterns obj = new patterns();
        obj.printSolidRectangle(3, 4);

    }
    public void printSolidRectangle(int n, int  m){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
