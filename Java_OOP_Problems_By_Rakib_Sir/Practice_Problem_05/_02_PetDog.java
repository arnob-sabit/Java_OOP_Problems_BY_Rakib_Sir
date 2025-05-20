public class _02_PetDog 
{
    String name, breed;
    _02_PetDog(String name){
        this(name, "UnIdentified");
    }
    _02_PetDog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Its Barking");
    }
    public void spin(){
        System.out.println("Its Spinning");
    }
    public static void main(String[] args) {
        _02_PetDog obj1 = new _02_PetDog("Tumu", "German Shepard");
        _02_PetDog obj2 = new _02_PetDog("Tommy");

        obj1.bark();
    }
}
