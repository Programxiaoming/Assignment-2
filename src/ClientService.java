// ClientService class


import java.util.LinkedList;
import java.util.Queue;

public class ClientService implements ICollection{

    private int maxNumber;
    private Queue clients;

    public ClientService(){

    }

    public ClientService(int maxNumber) throws StackOverflowError{
        if(maxNumber <= 0) {
            throw new StackOverflowError("maxNumber less or equal than zero");
        }
        this.maxNumber = maxNumber;
        clients = new LinkedList<String>();
    }

    @Override
    public boolean add(Object newItem){
        if(clients.size() < maxNumber){
            clients.add((String)newItem);
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