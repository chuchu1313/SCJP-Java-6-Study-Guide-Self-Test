package CH7;

interface Hungry<E>{void much (E x);}
interface Carnivore<E extends Animal> extends Hungry<E> {}
//interface Carnivore<E extends Plant> extends Hungry<E> {} // Sheep class is still wrong
interface Herbivore<E extends Plant> extends Hungry<E> { }
//interface Herbivore<E extends Animal> extends Hungry<E> {} // Correct!

abstract class Plant{}
class Grass extends Plant{}
abstract class Animal{}
/* Original code:
class Sheep extends Animal implements Herbivore<Sheep>{
    public void much(Sheep x){ }
}

class Wolf extends Animal implements Carnivore<Sheep>{
    public void much(Sheep x ){}
}*/
/*
class Sheep extends Animal implements Herbivore<Plant> {
    public void munch(Grass x) {} //<E> should be Plant!
}
class Sheep extends Plant implements Carnivore<Wolf> {  // Wolf class will get error: Carnivore<Sheep>
    public void munch(Wolf x) {}
}
class Wolf extends Animal implements Herbivore<Grass> { // Sheep class is still wrong
    public void munch(Grass x) {}
}
 */