import persons.Client;
import persons.Person;
import pets.Animal;
import pets.Dog;

public class Main {
    public static void main(String[] args) {
   starterLog();    
} 
public static void starterLog (){
    Animal kopek = new Dog("ace",true,"15.03.2021","pitbull");
    Animal kopek2 = new Dog("ace",false,"15.03.2021","pitbull"); 
    kopek2.showInformation();
Person musteri = new Client(135,"emre","istanbul") ;   
musteri.personInfo();



}


}