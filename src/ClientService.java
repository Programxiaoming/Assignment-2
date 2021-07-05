/**
 * ClientService class
 * @author Xiaoming Su
 * @version 1.0
 */

import java.util.LinkedList;
import java.util.Queue;

public class ClientService implements ICollection{

    private int maxNum;
    private Queue clients;

    public ClientService(){

    }

    public ClientService(int max) throws StackOverflowError{
        if(max <= 0) {
            throw new StackOverflowError("maxNumber less or equal than zero");
        }
        this.maxNum = max;
        clients = new LinkedList<String>();
    }

    @Override
    public boolean add(Object newItem){
        if(clients.size() < maxNum){
            clients.add(newItem);
            return true;
        }
        return false;
    }

    @Override
    public Object getNext(){
        if(clients.size() > 0){
            return clients.poll();
        }
        return null;
    }
}