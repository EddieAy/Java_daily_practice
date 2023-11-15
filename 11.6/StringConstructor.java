public class StringConstructor {
    public static void main(String[] args) {
//        byte a = 127;
////        byte c = (byte) 260;
////        System.out.println(c);


        int[] a = {1,6,96,274};
        String s3 = new String(a,1,3);
        System.out.println(s3);

        char[] c = {'a','q','h','k'};
        String s4 = new String(c,1,3);
        String s5 = new String(c);

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s5.charAt(1));

        System.out.println("-----------------------------------------------------");
        System.out.println("b".compareTo("d"));
        System.out.println("b".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("z".compareTo("a"));
        System.out.println("-----------------------------------------------------");


        System.out.println("asdadadadsadqewdfjdigdifuasfiuqpriuqrwfjdksfs".contains("asd"));


        System.out.println("-----------------------------------------------------");

        System.out.println("qwe.java".endsWith("java"));
        System.out.println("qwe.java".startsWith("qw"));

        System.out.println("-----------------------------------------------------");

        System.out.println("ABc".equalsIgnoreCase("abc"));

        System.out.println("a".compareTo("A"));
        System.out.println((char)(97-"a".compareTo("A")));

        System.out.println("-----------------------------------------------------");

        System.out.println("asdoajdasdjasodiuqoieqweoqewqoewqehdkjshkjhasfd".indexOf(
                "wq"
        ));

        System.out.println("-----------------------------------------------------");

        System.out.println("qwe".length());
        System.out.println("qwe".isBlank());

        String s1 = "javac++pythonjavac++python";
        System.out.println(s1.replace("c++"," go "));
        System.out.println("-----------------------------------------------------");

//        System.out.println("boo:and:foo".split(":"));

        s1 = "boo:and:foo";
        String[] s1_split = s1.split("o");
        for (int i = 0; i < s1_split.length; i++) {
            System.out.println(s1_split[i]);
        }
        System.out.println(s1_split.length);

        System.out.println("-----------------------------------------------------");
        s1 = "1++2+3+4+";
        s1_split = s1.split("\\+");
        for (String s:s1_split) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------");

        s1 = "abcdefg";
        System.out.println(s1.substring(0,2));
        System.out.println("-----------------------------------------------------");

        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        System.out.println("-----------------------------------------------------");
        Object obj = new Object();
        String objString = String.valueOf(obj);
        System.out.println(objString);
        char[] charArray = {'a', 'b', 'c'};
        String charArrayString = String.valueOf(charArray);
        System.out.println(charArrayString);

        boolean boolValue = true;
        String boolString = String.valueOf(boolValue);
        System.out.println(boolString);

        Customer c1= new Customer();
        System.out.println(String.valueOf(new Customer()));
        System.out.println(c1);
        System.out.println(100);


    }
}

class Customer{
    @Override
    public String toString() {
        return "I am what I am";
    }
}
