public class Demonstrator {
    public static void main(String[] args){

        //PhoneNumber instances
        PhoneNumber phone01 = new PhoneNumber("510","701","2772");
        PhoneNumber phone02 = new PhoneNumber("490","507","2771");

        //Person instances
        Person person01 = new Person("Mera", "Marquez", "06.27.2004", "700 harris rd", phone01, "mexican");
        Person person02 = new Person("Liam", "Chamalette", "03.23.2000", "Willow St.", phone02, "french");

        //2 instances of the Restaurant class
        Restaurant restaurant01 = new Restaurant("Aroma Cafe", "coffee & pastries", "123 Main St.", person01, phone01, 770000, 55432.44);
        Restaurant restaurant02 = new Restaurant("L'Oliveto", "Italian Food", "Viale Milano 8, 20100 Milano, Italia", person02, phone02, 780060, 554773.22);

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

        //outputting prettyPrint instance method
        System.out.println(person01.prettyPrint());
        System.out.println(person02.prettyPrint());
    }
}
