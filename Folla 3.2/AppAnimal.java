public class AppAnimal {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(4,"Paco",false);
        Animal animal2 = new Animal(5,"Babo",false);
        Animal animal3 = new Animal(6,"Coco",false);
        Animal animal4 = new Animal(7,"Kike",false);

        animal1.getDatos();
        animal2.getDatos();
        animal3.getDatos();
        animal4.getDatos();

        Animal.nace(animal1);
        System.out.println(Animal.numeroAnimais);
        Animal.nace(animal2);
        System.out.println(Animal.numeroAnimais);
        Animal.nace(animal3);
        System.out.println(Animal.numeroAnimais);
        Animal.nace(animal4);
        System.out.println(Animal.numeroAnimais);

        Animal.morre(animal1);
        System.out.println(Animal.numeroAnimais);
        Animal.morre(animal2);
        System.out.println(Animal.numeroAnimais);
        Animal.morre(animal3);
        System.out.println(Animal.numeroAnimais);
        Animal.morre(animal4);
        System.out.println(Animal.numeroAnimais);
    }
}
