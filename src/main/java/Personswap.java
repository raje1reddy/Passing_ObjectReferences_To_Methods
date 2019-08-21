public class Personswap {
    public  static void swap (Person p1, Person p2) {  //Method to swap two object references
        Person temp = p1;
        // System.out.println(temp);
        p1 = p2;
        p2 = temp;
        //System.out.println(p2);
    }

}
