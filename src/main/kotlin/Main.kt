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
    val car1 = Car()
    car1.move()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("car is moving")
    }
    fun stop(){
        println("car is stopped")
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

