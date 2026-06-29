package Pattern.Pattern;

//Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:
//        *
//        **
//        ***
//        ****
//        *****


public class pattern2 {
    static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
