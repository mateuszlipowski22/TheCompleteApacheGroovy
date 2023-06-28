package section9

import groovy.transform.ToString

Expando e = new Expando();

e.first = "Mateusz";
e.last = "Michal";
e.email = "mateusz@wp.pl";

e.getFullName = {
    "$first $last";
}

println e.toString();
println e.getFullName();

@ToString
class Person {
    String first, last;
}

Person p = new Person(first:"Mateusaz", last: "kieliszek");
p.metaClass.email="cscsdcs";
println p;
println p.email;

