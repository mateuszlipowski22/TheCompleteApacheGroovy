package section11

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder();

builder.books {
    book(isbn: "978-1935182443") {
        title("Groovy in Action 2nd Edition")
        author("Dierk Koening")
        price("50.58")
    }
    book(isbn: "978-1935182948") {
        title("Making Java Groovy")
        author("Ken Kousen")
        price("33.58")
    }
    book(isbn: "978-1935182307") {
        title("Programming Groovy 2: Dynamic Productivity for the Java Developer")
        author("Vent Subramanian")
        price("28.58")
    }
}

