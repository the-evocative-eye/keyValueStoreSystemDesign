package src.main;
import java.util.*;
public class replicaManager {
    private List<dataNode> replicas;
    public replicaManager(List<dataNode> replicas){
        this.replicas=replicas;
    }
    public void putReplica(int key,String Value){
        for(dataNode replica:replicas){
            replica.put(key, Value);
        }
    }
    public void deleteReplica(int key){
        for(dataNode replica : replicas){
            replica.delete(key);
        }
    }
}
