/** Driver class for test
 * version 1.0
 * by Xiaoming Su
 */

public class TestClass {
    public static void main(String[] args) {

        ClientService cl1 = new ClientService();
        ClientService cl2 = new ClientService(100);
        System.out.println(cl1.add(new Student("Tom", 4)));
        System.out.println("===========================================================");
        System.out.println();

        ShoppingBag sp1 = new ShoppingBag();
        ShoppingBag sp2 = new ShoppingBag(50);
        System.out.println(sp1.getNext());
        System.out.println(sp1.getNext());
        System.out.println("===========================================================");
        System.out.println();

        DeansList dl1 = new DeansList();
        DeansList dl2 = new DeansList(10);
        System.out.println(dl1.getNext());
        System.out.println("===========================================================");
        System.out.println();
    }
}
