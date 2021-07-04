// Dean's list class

public class DeansList implements ICollection{

    private int maxNumber;
    private Object[] stack;
    private int index = 0;
    public DeansList(){

    }

    public DeansList(int maxNumber) throws ArithmeticException{
        if(maxNumber <= 0)
            throw new ArithmeticException("Max number can't be over 5 ");
        else System.out.println("The Dean's list max number is " + maxNumber);
        this.maxNumber = maxNumber;
        stack = new Object[maxNumber];
    }

    @Override
    public boolean add(Object newItem){
        if(index == maxNumber){
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
