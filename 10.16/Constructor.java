public class Constructor{

    public static void main(String[] argh){
        student s1 = new student();
        student s2 = new student("zera","male");
        student s3 = new student("zera","male",322);



        System.out.println(s1.name+s1.gender);
        System.out.println(s2.name+s2.gender);
        System.out.println(s3.name+s3.gender);


    }
}