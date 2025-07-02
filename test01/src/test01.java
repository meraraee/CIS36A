class passByValueEx{

    public static void change(int x){
        x = 10;

        System.out.println("In method thats in public, pass by value: " + x);

    }


}

public class test01 {
    public static void main(String[] args){
        int num = 5;

        passByValueEx.change(num); //pass by value

        System.out.println("In main:" + num);
    }
}
