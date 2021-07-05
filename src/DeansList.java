/**
 * Dean's list class
 * @author Xiaoming Su
 * @version 1.0
 */
import java.util.ArrayList;

public class DeansList implements ICollection {
    /**
     * this DeansList class can manage students on the dean's list.
     */

    private int maxNum;
    private Object[] arrayList;
    private int index = 0;
    private ArrayList<Student> deansList = new ArrayList<>();

    public DeansList() {

    }

    public ArrayList<Student> getDeansList() {
        return deansList;
    }

    public void setDeansList(ArrayList<Student> deansList) {
        this.deansList = deansList;
    }

    public DeansList(ArrayList<Student> allList){
        this.deansList = new ArrayList<Student>();
        for (int i = 0; i < allList.size(); i++) {
            if(allList.get(i).getGpa() >= 3.7)
                deansList.add(allList.get(i));
        }
    }

    @Override
    public boolean add(Object newItem) {
        if(((Student)newItem).getGpa() >= 3.7){
            this.deansList.add((Student) newItem);
            return true;
        }else
        return false;
    }

   @Override
    public Object getNext(){
        if(deansList.size() == 0){
            return false;
        }else {
            int index = 0;
            for (int i = 0; i < deansList.size(); i++) {
                if(deansList.get(i).getGpa() >= deansList.get(index).getGpa()) {
                    index = i;
                }
            }
            return deansList.remove(index);
        }
    }

}
