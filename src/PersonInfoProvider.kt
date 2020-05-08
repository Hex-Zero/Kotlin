interface PersonInfoProvider {
    fun printInfo(person: Person)
}
class BasicProvider : PersonInfoProvider {
    override fun printInfo(person: Person) {
       println("Print info")
    }
}
fun main(){
    val provider = BasicProvider()

    provider.printInfo(Person())
}