import person.Person;
import person.PersonNotFoundException;
import person.PersonRepository;

public class Application {
    public static void main(String[] args) {

        PersonRepository repo = new PersonRepository();
        try{
            repo.findById(42);
        }
        catch (PersonNotFoundException e){
            System.out.println("PersonNotFoundException");
        }
        catch (Exception e){
            System.out.println("Exception");
        }

         repo.addPerson(new Person());
    }
}
