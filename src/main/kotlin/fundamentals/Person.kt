package fundamentals

class Person(var name: String, var age: Int) {

    override fun toString(): String {
        return "my name is: ${this.name}. and i'm ${this.age} " +
                "years old. my age in moths is ${ageInMonths()}."
    }

    private fun ageInMonths(): Int{
        return this.age * 12
    }
}

fun main(){
    var p = Person("Gabriela", 25)
    println(p)
}