fun main() {
    printName("Esther")
    println(modulus(35, 3))
    println(add(32, 45, 21,12))
    printName("Esther", "loves", "travelling")

}

fun printName(name: String){
    println("Hello " + name)

}
fun modulus(num1: Int, num2: Int): Int{
    return num1 % num2

}
fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    return num1+num2+num3+num4

}
fun printName(firstname: String, secondname: String, thirdname: String){
    println(firstname+ " "+ secondname+ " "+thirdname)

}


