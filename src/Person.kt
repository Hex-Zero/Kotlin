class Person(val firstName: String = "Ilona",var nickName: String? = null, val lastName: String = "Aldrich") {

    fun printInfo(){
        val nickNameToPrint = nickName ?: "---"
        println("$firstName ( $nickNameToPrint ) $lastName")
    }
}
