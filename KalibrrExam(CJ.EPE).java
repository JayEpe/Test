import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        do{
            size = scan.nextInt();
            if( size > 0 ){
                int temp = 0;
                for( int a = 1; a <= size; a++, temp = 0){
                    for(int b = 1; b <= size - a; b++){
                        System.out.print("  ");
                    }
                    while(temp != 2* a-1){
                        System.out.print("o ");
                        temp++;
                    }
                    System.out.println(" ");
                }
                size = -1;
            }
            else{
                System.out.println("The value inputed is not a positive integer");
            }
        }
        while (size < 0);
    }
}
