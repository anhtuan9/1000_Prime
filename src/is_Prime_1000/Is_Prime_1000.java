package is_Prime_1000;

public class Is_Prime_1000 {
    public static boolean is_Prime(int n){
        boolean check = true;
        if (n < 2){
            check = false;
        }
        for (int i = 2; i < n;i++){
            if (n % i == 0){
                check = false;
            }
        }
        return  check;
    }
    public static void main(String[] args) {
        for (int i = 1 ; i <1000; i ++ ){
            if (is_Prime(i)){
                System.out.println(i);
            }
        }
    }
}
