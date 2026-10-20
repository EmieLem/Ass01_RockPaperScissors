public class ForLoop{
    static void main(){
        for(int X = 0; X <= 10; X++){
            IO.println("X is " + X);
        }
        IO.println();
        for(int x = 10; x<=0; x--){
            IO.println("X is " + x);
        }
        for(int a = 0; a <= 100; a += 10){
            IO.println("a is " + a);
        }
        int x = 100;
        while(x > 5){
            IO.println(x);
        }
    }
}