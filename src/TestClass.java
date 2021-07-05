/** Driver class for test
 * @version 1.0
 * @author  Xiaoming Su
 * @see ICollection,ClientService,ShoppingBag,DeansList,Student
 */

public class TestClass {
    /**
     * this is the main() method for the driver program.
     * @param args stores the incoming command line arguments for the program.
     */
    public static void main(String[] args) {

        ClientService cl1 = new ClientService(4);
        cl1.add("Tom");
        cl1.add("Jerry");
        cl1.add("Mary");
        System.out.println(cl1.add("Jane"));
        System.out.println("Next client is: " + cl1.getNext());
        System.out.println("=================================================");
        System.out.println();

        ShoppingBag sp1 = new ShoppingBag(5);
        sp1.add("iPhone");
        sp1.add("LED monitor");
        sp1.add("keyboard");
        sp1.add("mouse");
        System.out.println(sp1.add("iPad"));
        System.out.println(sp1.getNext());
        System.out.println("=================================================");
        System.out.println();

        DeansList dl1 = new DeansList();
        Student st1 = new Student("Tom",3.0);
        Student st2 = new Student("Jerry", 3.3);
        Student st3 = new Student("Mary", 4.0);
        Student st4 = new Student("Jane", 3.9);
        dl1.add(st1);
        dl1.add(st2);
        dl1.add(st3);
        dl1.add(st4);
        System.out.println(dl1.getNext());
        System.out.println(dl1.getNext());
        System.out.println(dl1.getNext());
        System.out.println(dl1.getNext());
        System.out.println("=================================================");
        System.out.println();
    }
}
