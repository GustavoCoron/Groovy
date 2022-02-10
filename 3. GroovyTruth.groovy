//Las groovys truth son expresiones qbooleanes que nos ayudan a decir si es verdadero o no

class Person {
    String name
    int age

    boolean asBoolean(){
        age>18
    }
    String toString(){
        name
    }
}

Person person = new Person(name:"Gustavo", age:22)

println person ?: "La persona no es valida"

assert person.age >18
assert person.name.contains('w')
