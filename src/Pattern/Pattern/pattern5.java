package Pattern.Pattern;

public class pattern5 {
    static void main(String[] args) {
        int n =5;
        for (int i=n; i>0; i--){
            for (int j=i; j<0; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
