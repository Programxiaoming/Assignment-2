/**
 * Dean's list class
 * @author Xiaoming Su
 * @version 1.0
 */
import java.util.ArrayList;

public class DeansList implements ICollection{

    private int maxNum;
    private Object[] arrayList;
    private int index = 0;
    ArrayList deansList;

    public DeansList(){

    }

    public DeansList(int max) throws ArithmeticException{
        if(max <= 0)
            throw new ArithmeticException("the dean's list should be above 0 ");
        else System.out.println("The Dean's list max number is " + max);
        this.maxNum = max;
        arrayList = new Object[max];

    }

    @Override
    public boolean add(Object newItem){
        if(index == maxNum){
            return false;
        }
        else{
            arrayList[index] = newItem;
            index++;
            return true;
        }
    }

   @Override
    public Object getNext(){
        if(deansList.size() == 0){
            return false;
        }else {
            int index = 0;
            for (int i = 0; i < deansList.size(); i++) {
                if(deansList.get(i).getGpa() > deansList.get(index).getGpa()) {
                    index = i;
                }
            }
            return deansList.remove(index);
        }
    }

}
