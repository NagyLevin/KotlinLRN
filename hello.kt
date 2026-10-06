fun main() {
    println("Hello, Kotlin!")
    
    val one = 5
    var two = 3
    two = two + 1 //only var can be changed, val can't  be changed
    println(two)
    
    val customers = 10
    println("There are $customers customers")
    // after $ you can add variable name to print the value of the variable

    println("There are ${customers + 1} customers")
    // you can also add expressions to the ${variable + expression}
    
    val name = "John"
    println("Hello, $name!")
    // you can also add strings to the $name
    
    val year: Int = 2026
    // you can also add the type of the variable to the variable
    val isEnabled: Boolean = true
    
    
    // Variable declared without initialization
    //val d: Int

    // Triggers an error
    //println(d)
    // Variable 'd' must be initialized
    
    // Read only list
    val LISTreadOnlyShapes = listOf("triangle", "square", "circle")
    println(LISTreadOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
    val LISTshapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(LISTshapes)
    // [triangle, square, circle]
    
    println("The first item in the list is: ${LISTreadOnlyShapes.first()}")
    
    println("The last item in the list is: ${LISTreadOnlyShapes.last()}")
    
    println("This list has ${LISTreadOnlyShapes.count()} items")
    
    println("circle" in LISTreadOnlyShapes)
    // you can also check if a item is in the list
    
    
    // Add "pentagon" to the list
    LISTshapes.add("pentagon") 
    println(LISTshapes)  
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    LISTshapes.remove("pentagon") 
    println(LISTshapes)  
    // [triangle, square, circle]
    
    //Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
    
    val SETreadOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(SETreadOnlyFruit)
    
    // Mutable set with explicit type declaration
    val SETfruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(SETfruit)
    
    println("This set has ${SETreadOnlyFruit.count()} items")
    println("banana" in SETreadOnlyFruit)
    
    
    SETfruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(SETfruit)              // [apple, banana, cherry, dragonfruit]

    SETfruit.remove("dragonfruit") // Remove "dragonfruit" from the set
    println(SETfruit)              // [apple, banana, cherry
    
    //Maps store items as key-value pairs. 
    
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}
    
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    
    juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu)
    
    juiceMenu.remove("orange")    // Remove key "orange" from the map
    println(juiceMenu)
    
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    
    println(readOnlyJuiceMenu.keys)
    
    println(readOnlyJuiceMenu.values)
    
    println("orange" in readOnlyJuiceMenu.keys)
    // true

    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)
    // true

    println(200 in readOnlyJuiceMenu.values)
    // false
    
    
    
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d) // 1
    println(if (check) 1 else 2) // 1
    
    val obj = "Hello"
    
    
    
    // when is like switch in other languages
    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")     
    }
    
     val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    
    
     val trafficAction2 = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction2)  
    
    //LOOPS
    for (number in 1..5) { 
    // number is the iterator and 1..5 is the range
    print(number)
    } // 12345
    
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
        
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a torta ")
        cakesEaten++
    }
    
    
    var cakesBaked = 0
    
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    //hatultesztelős ciklus, azaz először lefut a ciklus, majd utána a feltétel
    
    println(add(1, 2))
    
    printMessageWithPrefix("Hello", "World")
    
    println("The bigger number is:" + bigger(1, 2))
    
    //you can make a function way easyer with lambda 
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
    
    passtootherfunction()
    
    tailinglambda()
    
}
//end of main

fun add(x: Int, y: Int): Int { // function with return value ezért kell return és ezt jelöli a : Int
    
    return x + y
}


fun printMessageWithPrefix(message: String, prefix: String) { // function without return value ezért nincs return és ezt jelöli a : Unit
    println("[$prefix] $message")
}


fun bigger(a: Int, b: Int): Int {
    if (a > b) {
        return a
        }
    else if (a < b) {
        return b
    }
    else {
        return 0
    }
    
    
    
}

fun passtootherfunction(){
    
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter ({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]

}

fun tailinglambda(){
    // The initial value is zero. 
    // The operation sums the initial value with every item in the list cumulatively.
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

    // Alternatively, in the form of a trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
}