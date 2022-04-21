package person;

public class PersonRepository {

    public Person findById(Integer id) throws PersonNotFoundException{
        throw new PersonNotFoundException("no Person found");
    }

    public void addPerson(Person p){
        throw new IllegalArgumentException();
    }

}
