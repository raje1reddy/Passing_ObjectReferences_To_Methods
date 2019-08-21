import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    public  void swap (Person p1, Person p2) {  //Method to swap two object references
        Person temp = p1;
       // System.out.println(temp);
        p1 = p2;
        p2 = temp;
        //System.out.println(p2);
    }

    @Test
    public void test() {
        Person person1 = new Person("Padmaja"); // create object
        Person person2 = new Person("Reddy");
        System.out.println(person1.getName() + ":" + person2.getName()); //Prints Padmaja:Reddy before passing objects
        swap(person1 , person2); //Executes method swap
        System.out.println(person1.getName() + ":" + person2.getName()); //Prints Padmaja:Reddy after mwthod swap completes execution
    }


}