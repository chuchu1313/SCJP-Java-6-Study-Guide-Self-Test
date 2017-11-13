package CH6;

import java.io.*;

class Vehicle{}
class Wheels{}
class Car extends Vehicle implements Serializable{} // can be serialized
class Ford extends Car{} // can be serialized, because Car already implements Serializable
class Dodge extends Car{
    Wheels w = new Wheels(); // Wheels cannot be serialized
}
