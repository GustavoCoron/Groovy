//Metodo toString de la clase.
// @groovy.transform.ToString

//Usando el AST Canonical para añadir sobreescribir ToString, EqualsAndHasCode la genracion de constructores entre otros
@groovy.transform.Canonical

class Person {
    String name
    int age

    // Encapsulamiento de las propiedades
    // void setName(String _name){
    //     println "calling setName on Person" 
    //     this.name = _name
    // }
    // int getAge(){
    //     println "calling getAge on Person" 
    //     ge
    // }


}
// Person person = new Person()
// person.setName('Gustavo')
// person.setAge(22)

// Instanciar un objeto mandando un mapa con las propiedades en el constructor
// Person person = new Person([name:"Gustavo", age:22])

Person person = ["Gustavo", 22]

//Uso del closure with para asignar valores a las propiedades de un GroovyBean
// person.with{
//     name = "Gustavo"
//     age = 22
// }

//Interpolacion cuando llamamos a una propiedad de un objeto
// println "Name: ${person.getName()} Age: ${person.getAge()}"
println person