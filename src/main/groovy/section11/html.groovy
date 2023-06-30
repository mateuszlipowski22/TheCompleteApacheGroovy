package section11

import groovy.xml.MarkupBuilder

def books = [
        [isbn: "978-1935182443", title: "Groovy in Action 2nd Editio", author: "Dierk Koeningn", price: 50.58],
        [isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.58],
        [isbn: "978-1935182307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Vent Subramanian", price: 28.58]
]

FileWriter fileWriter = new FileWriter('html/books.html');
MarkupBuilder builder = new MarkupBuilder(fileWriter);

builder.html {
    head {
        title("My favorite books")
    }
    body {
        h1("My Favorite books")
        table{
            tr{
                th("ISBN")
                th("Title")
                th("Author")
                th("Price")
            }
            books.each({
                book -> {
                    tr{
                        td(book.isbn)
                        td(book.title)
                        td(book.author)
                        td(book.price)
                    }
                }
            })
        }
    }
}