class FancyInfoProvider: BasicProvider(){
    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        println("Fancy Print Info")
    }
}
