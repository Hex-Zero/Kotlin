interface PersonInfoProvider {
    val  providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}
class BasicProvider(override val providerInfo: String = "BasicInfoProvider") : PersonInfoProvider {
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }
}
fun main(){
    val provider = BasicProvider()

    provider.printInfo(Person())
}