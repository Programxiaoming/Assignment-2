/**
 * ShoppingBag class
 * @author Xiaoming Su
 * @version 1.0
 */
public class ShoppingBag implements ICollection{
    /**
     * this ShoppingBag class can be added and removed items.
     */
    private int maxNum;
    private Object[] stack;
    private int index = 0;
    public ShoppingBag(){

    }

    public ShoppingBag(int max) throws ArithmeticException{
        if(max <= 0)
            throw new ArithmeticException("Maximum number can't less or equal 0.");
        else System.out.println("The max number of shopping bag is " + max);
        this.maxNum = max;
        stack = new Object[max];
    }

    @Override
    public boolean add(Object newItem){
        if(index == maxNum){
            return false;
        }
        else{
            stack[index] = newItem;
            index++;
            return true;
        }
    }

    @Override
    public Object getNext(){
        if(index == 0){
            return null;
        }else {
            return stack[--index];
        }
    }
}
