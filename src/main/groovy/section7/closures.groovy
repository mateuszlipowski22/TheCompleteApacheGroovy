package section7

def myMethod(Closure c){
    c();
}

def foo = {
    println "foo....";
}

myMethod(foo);

List names = ["Mateusz", "Michał", "Zbyszek", "Marek"];

names.each { name -> println name};

Map teams = [basketball: "Cleavland Indians", baseball:"Cleavland Cavs", football:"Cleavland Browns"];
teams.each({k,v->
   println "$k = $v";
});

def greet = {
    String greeting, String name ->
        println "$greeting, $name";
}

def sayHello = greet.curry("Hello");

sayHello("Mateusz");