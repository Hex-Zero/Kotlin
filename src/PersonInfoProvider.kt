interface PersonInfoProvider {
    val  providerInfo : String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}
interface SessionInfoProvider{
    fun getSessionId() : String
}
class BasicProvider(override val providerInfo: String = "BasicInfoProvider") : PersonInfoProvider , SessionInfoProvider{
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}
fun main(){
    val provider = BasicProvider()

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is a session info provider")
    }else{
        println("not a session info provider")
    }
}