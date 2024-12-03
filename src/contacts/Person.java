package contacts;

public class Person{
    private String name;
    private String phone;

    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String  getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String newPhone){
        this.phone = newPhone;
    }

   @Override
   public String toString(){
    return "Nom :"+ name + ", numéro de téléphone:" + phone;
   }


}