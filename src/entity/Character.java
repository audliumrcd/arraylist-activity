package entity;

public class Character {

    private String name;
    private String gender;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return name;
    }
}
