package src.main;

public interface keyValueStore {
     String get(int key);
     void put(int key, String value);
    void delete(int key);
}
// here static instantiation is avoided due to the abstract nature of the function
// generalize keyvalue store