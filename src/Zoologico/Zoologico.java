package Zoologico;

public class Zoologico {

    public String alimentar(Animal animal){
        return animal.alimentar();
    }

    public String alimentarAnimais(Animal animal1, Animal animal2){
        return animal1.alimentar() + " " + animal2.alimentar();
    }
}
