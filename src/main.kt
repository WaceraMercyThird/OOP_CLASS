// object have state/ properties and behavior
// object are created from templete/ plan / butprint called class

fun main(){
    var jeep = Car("A5", "jeep", "KCC 4647678",0)


//    println(jeep.model)
//    println(jeep.speed)
//    println(jeep.registration)
//    println(jeep.start())


    println(jeep.speed)
    jeep.start("grrrrrrrrrrrr")
    jeep.accelerate(50)
    println(jeep.speed)
    jeep.accelerate(80)
    println(jeep.speed)

//    print(jeep.model)
//    print(" ")
//    print(jeep.make)
//    print(" ")
//    print(jeep.registration)

    var benz = Car("Mecindez Benz", "G63", "KDG 642X",0)

    benz.start("frrrrrrrrrrr")
    benz.hoot()
    benz.accelerate(70)
    println(benz.speed)
    benz.decelerate(30)
    println(benz.speed)
    benz.stop(40)
    println(benz.speed)

    benz.stop(0)
    println(benz.speed)

var nancy = Students("Peter Mwangi", 22)
    println(nancy.name)
    println("${nancy.name} ${nancy.age}")



}
class Car(var model: String, var make:String, var registration:String, var speed: Int){
    public fun start(sound: String){
        println("vrooooom")
    }
    fun accelerate(accelaration: Int):Int{
        //speed = speed + accelaration//
        speed+=accelaration
        return speed
    }

    fun hoot(){
        println("piiiiiiiiiipiiiiiii")
    }

    fun decelerate(decelaration: Int):Int{
        speed-=decelaration
        return speed
    }

    fun stop(stop: Int):Int{
        speed-=stop
        return speed
    }


}
data class Students(var name: String, var age: Int)


//
