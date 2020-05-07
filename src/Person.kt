class Person(val firstName: String = "Ilona",val lastName: String = "Aldrich") {
    var nickName: String = "Lalala"
    set(value){
        field = value
        println("the new nickname is $value")
    }
    get(){
        println("the return value is $field")
        return field
    }
}
