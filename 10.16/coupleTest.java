public class coupleTest{
    public static void main(String[] args){
        Date husbandDate = new Date(1000,1,1);
        Date wifeDate = new Date(2000,1,1);

        Husband jack = new Husband(322,"jack",husbandDate);
        Wife merry = new Wife(321,"merry",wifeDate);

        jack.wife = merry;
        merry.husband = jack;

        System.out.println("jack's wife is " + jack.wife.name);
        System.out.println("merry's husband is " + merry.husband.name);

        System.out.println("jack's wife's birthday is " + jack.wife.date.year + jack.wife.date.month + jack.wife.date.day);

        jack.wife.date.year = 1000;

        System.out.println("jack's wife's birthday is " + jack.wife.date.year + jack.wife.date.month + jack.wife.date.day);

        jack.wife = null;
        System.out.println("jack's wife's birthday is " + jack.wife.date.year + jack.wife.date.month + jack.wife.date.day);



    }
}