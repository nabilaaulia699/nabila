package `2`.Class

open class Employe (val name : String ){
    fun sayHelo(nama: String){
        println("hello $name myname is ${this.name}")
    }
}

class Manager (nama: String) : Employe("name")

class member (nama: String) : Employe("nabila")