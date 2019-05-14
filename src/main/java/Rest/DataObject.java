package Rest;

public class DataObject {
    private String id = "";
    private String name = "";

    public DataObject(String ID, String Name){
        this.id = ID;
        this.name = Name;
    }

    public String getId(){ //Getter and setters are required for spring boot to convert this object.
        return id;
    }
    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
