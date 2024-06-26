package src.main;
import java.util.*;
public class coordinator {
    List<dataNode> nodes;
    PartitionManager partitionManager;
    public coordinator(List<dataNode> nodes,PartitionManager partitionManager){
        this.nodes=nodes;
        this.partitionManager=partitionManager;
    }
    @Override
    public String get(int key){
        int index=partitionManager.getPartition(key);
        return nodes.get(index).get(key);
    }
    @Override
    public void put(int key, String value){
        int index=partitionManager.getPartition(key);
        nodes.get(index).put(key,value);
    }
    public void delete(int key){
        int index=partitionManager.getPartition(key);
        nodes.get(index).delete(key);
    }
}
