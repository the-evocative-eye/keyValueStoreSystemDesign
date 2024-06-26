package src.main;
import java.util.concurrent.ConcurrentHashMap;
public class storage {
     ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
    public String get(int key){
        return map.get(key);
    }
    public void put(int key,String value){
        map.put(key,value);
    }
    public void delete(int key){
        if(map.get(key) != null){
map.remove(key);
        }
    }
}
// creating a general or POJO for storage
