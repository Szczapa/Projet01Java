package contacts;

import java.util.ArrayList;
import java.util.List;

public class Directory{    
    private List<Person> persons = new ArrayList<>(); 

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {   
    return new ArrayList<>(); 
    }

    @Override
    public String toString() {
        StringBuilder allPersons = new StringBuilder();
        for (Person person : persons) {
            allPersons.append(person.toString()).append("\n");         
        }
        return allPersons.toString();
    }
}

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"