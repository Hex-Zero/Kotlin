

var names = arrayOf("Ace","Ilona")
fun sayHello( name: String ) = print("Hello $name\n")
fun main() {
    names.forEach { it: String -> sayHello(it) }
}