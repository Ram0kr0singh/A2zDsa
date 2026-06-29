package Pattern.Pattern;

//Given an integer n. You need to recreate the pattern3
// given below for any value of N. Let's say for N = 5,
// the pattern3 should look like as below:
//        1
//        12
//        123
//        1234
//        12345


public class pattern3 {
    static void main(String[] args) {
        for(int i =1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
