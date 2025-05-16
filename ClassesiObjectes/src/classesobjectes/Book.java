package classesobjectes;

/**
 * Representa un libro con un ISBN, título, autor y número de páginas.
 */
class Book {
    private String ISBN;
    private String title;
    private String author;
    private int pageCount;

    /**
     * Constructor de la clase Book.
     * 
     * @param ISBN Código ISBN del libro
     * @param title Título del libro
     * @param author Autor del libro
     * @param pageCount Número de páginas del libro
     */
    public Book(String ISBN, String title, String author, int pageCount) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    /**
     * Obtiene el ISBN del libro.
     * 
     * @return ISBN del libro
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return Título del libro
     */
    public String gettitle() {
        return title;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return Autor del libro
     */
    public String getauthor() {
        return author;
    }

    /**
     * Obtiene el número de páginas del libro.
     * 
     * @return Número de páginas del libro
     */
    public int getpageCount() {
        return pageCount;
    }

    /**
     * Establece el ISBN del libro.
     * 
     * @param isbn2 Nuevo ISBN del libro
     */
    public void setISBN(String isbn2) {
        this.ISBN = isbn2;
    }

    /**
     * Establece el título del libro.
     * 
     * @param title2 Nuevo título del libro
     */
    public void settitle(String title2) {
        this.title = title2;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param author2 Nuevo autor del libro
     */
    public void setauthor(String author2) {
        this.author = author2;
    }

    /**
     * Establece el número de páginas del libro.
     * 
     * @param pageCount2 Nuevo número de páginas del libro
     */
    public void setpageCount(int pageCount2) {
        this.pageCount = pageCount2;
    }

    /**
     * Devuelve una representación en cadena del libro.
     * 
     * @return Cadena de texto con la información del libro
     */
    public String toString() {
        return "El llibre " + title + " amb ISBN " + ISBN + " creat per l'autor " + author + " té " + pageCount + " pàgines.";
    }
}