package src.main;
// we have created a central node and a replica of it for storage, perform read-write operations, thathelp us in mainitaing consistency
public class dataNode implements keyValueStore {
    private storage store;
    private replicaManager replica;
    public dataNode( replicaManager replica){
        this.store=new storage();
        this.replica=replica;
    }
    @Override
    public String get(int key){
        return store.get(key);
    }
    @Override
    public  void put(int key,String value){
        store.put(key,value);
replica.putReplica(key,value);
    }
@Override
public  void delete(int key){
    store.delete(key);;
replica.deleteReplica(key);
}
}
