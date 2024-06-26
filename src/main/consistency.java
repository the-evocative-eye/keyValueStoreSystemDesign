package src.main;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;
public class consistency {
    List<dataNode> nodes;
    public consistency(List<dataNode> nodes){
        this.nodes=nodes;
    }
    public boolean write(int key, String value){
        AtomicInteger cnt=new AtomicInteger(0);
        nodes.parallelStream().forEach(node -> {
            try{
node.put(key,value);
cnt.incrementAndGet();
            } catch(Exception e){

            }
        });
        return cnt.get() > (nodes.size())/2;
    }
    public String read(int key){
        for(dataNode node:nodes){
            String v=node.get(key);
            if(v != null){
                return v;
            }
        }
        return null;
    }
}
