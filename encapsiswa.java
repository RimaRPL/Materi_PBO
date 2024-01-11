package OOP;

public class encapsiswa {
    private String name ;
    private String address;
    private int age ;

    // Asesor

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    // Mutator
    public void setAge (int newAge){
        age=newAge;
    }
    public void setName (String newName){
        name=newName;
    }
    public void setAddress (String newAddress){
        address=newAddress;
    }


}
