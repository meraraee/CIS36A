

//#include <iostream>
//using namespace std;
//
//int main(){
//
//
//
//    return 0;
//}

public class Main {
    public static void main(String[] args) {

    //Exercise 1:

        System.out.println("EXAMPLE 1:");

        int i = 500;
        if (i < 50) {
            System.out.println("i is a tiny number.");
        } else if (i >= 200 && i <= 350) {
            System.out.println("i is just right.");
        } else
            System.out.println("i is " + i + ", that is too big!");


    //Exercise 2:

        System.out.println("EXAMPLE 2:");

        //1.

        int j = 0;
        while(j <= 10) {
            System.out.println(j);
            j = j + 2;
        }

        //2.

        int k = 31;
        while(k <= 40){
            System.out.println(k);
            k = k + 2;
        }

        //3.

        int lower = 10;
        int upper = 20;

        while(lower <= upper){
            System.out.println(lower);
            lower = lower + 1;

        }

    //Exercise 3:

        int countdown_stop = 0;

        System.out.println("Counting down: ");
        for(int countdown_start = 5; countdown_start >= countdown_stop; countdown_start--){
             System.out.println(countdown_start);
        }

        System.out.println("Blast Off!");
    }
}
