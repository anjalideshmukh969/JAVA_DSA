public class lc1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5, 6},
                {7, 3},
                {3, 5, 2, 9}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        //person= row, account = col
        for (int person = 0; person < accounts.length; person++) { //iterates through each person (each row).
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) { //iterates through each account (each column) belonging to the current person.
                sum = sum + accounts[person][account];
            }
//            max = Math.max(max, sum);
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
//Time Complexity: \(O(m \times n)\) — we visit every account.
//Auxiliary Space: \(O(1)\) — we use only sum and max, regardless of input size.
