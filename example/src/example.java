public class example {
    public static void main(String[] args){

        //SHORT CIRCUITING

        //since (false && something), it will always be -> false, so therefore it indicates false || true .... doesn't solve (10/0 > 5) since it is short circuting
        boolean output = (false && (10/0 > 5)) || true;

        //since (false || something), can be true OR false, it must solve within parantheses (10/0 > 5) but this doesn't make sense so it will give us error
        boolean output2 = true || (false || (10/0 > 5));
        System.out.println(output);
        System.out.println(output2);
    }
}
