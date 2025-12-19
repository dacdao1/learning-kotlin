fun main() {
//    println("hello")

    // variable,
    // var <variable-name>: <variable type> <- declare variable with type
    // val is declare like final
//    var userName: String = "dac dao"
//    userName = "new name"
//    println("hello $userName");

    // assign value within the if condition to a variable, must have if and else
//    val isActive = true;
//    var text = if(isActive){
//        "this is true"
//    } else {
//        "this is not true"
//    }
//    println(text)

    // kotlin ternary like operation
//    var isActive = true;
//    var text = if (isActive) 1 else 2
//    println(text)

    // only way to assign a null value to a variable
//    val text:String? = null;
    // <variable>? will let the variable to be null
//    println(text?.length);
    // <variable>!! will throw a null pointer exception
//    println(text!!.length);
    // assigning a value to variable if it is null
//    println(text ?:"This display if it is null");

    // using function
//    sayHello();
    // function with return value
//    println(getMax(10, 5));
    // function with optional paramenter
//    sendMessage("dac");
    // send to whatever parameter you wanted to targer, most likely the second param.
//    sendMessage(message = "yes");
    // spread parameter like for func
//    println(sum(1, 2, 3, 4))

    // for loop
    // below it will loop from 1 to 10, only go upward
//    for(i in 1..10){
//        println("i = $i")
//    }
    // remove the 1 and 10 for the list because of until keyword, only go upwward
//    for (i in 1 until 10){
//        print(i)
//    }
    // going downward
//    for (i in 10 downTo 1){
//        print(i)
//    }
//    var someArray = arrayOf(1,2,3,4);
//    for ( i in 0..< someArray.size) {
//    println(someArray[i])
//    }
//    // can use the following
//    for (element in someArray) {
//        println(element)
//    }

    // creating array
//    val numbers: Array<Int> = arrayOf(1,2,3,4,5);
//    var sum = 0;
//    for (element in numbers){
//        sum += element;
//    }
//    println(sum);

    // learning about class and oop
//    val car1 = Car()
//    car1.name = "Tesla"
//    car1.move()

//    val user = User("dac", "dao", 21)
//    val friend = User("Dac")
//    val friend1 = User("Dac", "Dao")
//    friend1.favoriteMovie = "hello"

    // using function without initiate the class first
//    User.sum(4,10)

    // creating private class
//    val instance = Database.getInstance()

    // singleton of the object
//    println(Database)

    // lazy initialization
//    val user by lazy {
//        NewUser("dac")
//    }
//    println(user)

    // enum, set constant and more powerful, have properties and function rather then val
//    println(Direction.NORTH.ordinal)
//    Direction.WEST.printData()

    // when condition is like switch for enum but you have to include all of the enum
//    val directionWhen = Direction.WEST
    //OR
//    val direction = Direction.valueOf("north".uppercase())
//    when(directionWhen) {
//        Direction.WEST -> print("direction is west")
//        Direction.EAST -> print("direction is east")
//        Direction.SOUTH -> print("direction is south")
//        Direction.NORTH -> print("direction is north")
//    }

    // inner classes
//    val listView = ListView(arrayOf("name 1", "name 2", "name 3"))
//    listView.ListViewItems().displayItem(1)

    // inherent
    val car = CarInhe("toyo", "red", 1, 3)
    car.move()

}

// inheretent
open class Vehicle(val name: String, val color: String){
    //override this function in the child class
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name has stopped")
    }
}

class CarInhe(name: String, color: String, val engines: Int, val doors: Int):Vehicle(name, color){
    override fun move() {
        driving()
        super.move()
    }
    fun driving(){
        println("Driving the $name car")
    }
}
class PlaneInhe(name: String, color: String, val engines: Int, val doors: Int):Vehicle(name, color)

class ListView(val items: Array<String>){
    inner class ListViewItems(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 11),
    SOUTH("south", 12),
    EAST("east", 13),
    WEST("west",14);

    fun printData() {
        println("Direction = $direction and $distance")
    }

}

// lazy init class
class NewUser(var firstName: String){
    init{
        println("User : $firstName was created")
    }
}

//class Database private constructor(){
//    companion object{
//        private var instance: Database? = null
//        fun getInstance(): Database?{
//            if(instance == null){
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

object Database {
    init {
        println("database created")
    }
}
// primary constructor
class User(var name: String, var lastName: String, var age:Int){

    // create secondary constructor
    constructor(name: String) : this(name, "LastName", 0)
    constructor(name:String, lastName: String):this(name, lastName, 1)
//    init{
//        if(name.lowercase().startsWith("a")){
//            this.name = name;
//        } else{
//            this.name = ""
//            println("The name $name doesn't start with the letter 'a' or 'A'")
//        }
//    }

    // having another variable within the class, late init. no primitive data types
    lateinit var favoriteMovie: String
    companion object {
        fun sum(a: Int, b: Int): Int{
            return a + b
        }

    }

}

fun sayHello(){
    println("hello");
}

// function with return type
fun getMax(a: Int, b: Int): Int{
    return if (a>b) a else b;
}

// short hand function call
fun getMax2(a: Int, b: Int): Int = if (a>b) a else b;

fun sendMessage(name: String = "User", message: String = "") {
    println("name = $name and message = $message")
}

fun sum( vararg numbers: Int) : Int {
    return numbers.sum()
}

