package fundamentals

class Person(var name: String, var age: Int, var address: Address) {

    override fun toString(): String {
        return "my name is: ${this.name}. and i'm ${this.age} " +
                "years old. my age in moths is ${ageInMonths()}." +
                " my address is $address."
    }

    private fun ageInMonths(): Int{
        return this.age * 12
    }
}

class Address(val street: String, var number: Int){
    override fun toString(): String {
        return "Rua $street - NRº $number"
    }
}

fun main(){
    var a = Address("Um", 0)
    a.number = 344

    var p = Person("Gabriela", 25, a)
    println(p)

    var p2 = Person("Luana", 28, Address("Dois", 145))

    println(p2.address)
    println(p2.name)
}