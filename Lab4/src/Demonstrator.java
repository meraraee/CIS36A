public class Demonstrator {
    public static void main(String[] args) {


        //2 instances of the Restaurant class
        Restaurant restaurant01 = new Restaurant("Aroma Cafe", "coffee & pastries", "123 Main St.", "Merary", 570765432, 770000, 55432.44);
        Restaurant restaurant02 = new Restaurant("L'Oliveto", "Italian Food", "Viale Milano 8, 20100 Milano, Italia", "Merary", 570077054, 780060, 554773.22);

        //calling 'invite' instance method
        String invite01 = restaurant01.invite();
        String invite02 = restaurant02.invite();

        //calling 'taxInfo' instance method
        String taxInfo01 = restaurant01.getTaxInfo();
        String taxInfo02 = restaurant02.getTaxInfo();

        System.out.println();

        //outputting invite & taxInfo
        System.out.println(invite01);
        System.out.println(invite02);

        System.out.println(taxInfo01);
        System.out.println(taxInfo02);

    }

}