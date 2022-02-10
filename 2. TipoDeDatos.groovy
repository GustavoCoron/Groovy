def name = '"Developer"'
def map = [:]                                       //  java.util.LinkedHashMap

def elements = [
                1,                                  //  java.lang.Integer
                11111111111,                        //  jala.lang.Long
                11111111111111111111,               //  java.math.BigInteger
                0.1,                                //  java.math.BigDecimal
                0..5,                               //  groovy.lang.IntRange
                'a'..'z',                           //  groovy.lang.ObjectRange
                "Normal String",                    //  java.lang.String
                'Another normal String',            //  java.lang.String
                "GString with value $name",         //  groovy.lang.GString
                [],                                 // java.util.ArrayList
]

elements.each{ 
    println """$it
    - ${it.class.name}
    """
}

println map.getClass().name


//Declarando variables tipo dinamico
def something = 1

println something
println something.class.name

something = 1.0

println something
println something.class.name

something = "Esto es una cadena"

println something
println something.class.name


Closure write = { param ->
    println param
    println param.class.name
}
write(1)
write(1.0)
write("Esto es una cadena")
write('x'..'r')