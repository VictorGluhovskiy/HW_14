package HW14

open class Car(open val model: String, open val motor: Int){

    }

class Moto(override val model: String, override val motor: Int): Car(model, motor){

}



