package classesobjectes;

/**
 * Classe que representa un curs amb un nom i un professor.
 */
class Course {

    private String nameCourse;
    private String nameTeacher;
    
    /**
     * Constructor de la classe Course.
     * 
     * @param nameCourse Nom del curs
     * @param nameTeacher Nom del professor
     */
    public Course(String nameCourse, String nameTeacher) {
        this.nameCourse = nameCourse;
        this.nameTeacher = nameTeacher;
    }

    /**
     * Estableix el nom del curs.
     * 
     * @param nameCourse2 Nou nom del curs
     */
    public void setnameCourse(String nameCourse2) {
        this.nameCourse = nameCourse2;
    }

    /**
     * Estableix el nom del professor.
     * 
     * @param nameTeacher2 Nou nom del professor
     */
    public void setnameTeacher(String nameTeacher2) {
        this.nameTeacher = nameTeacher2;
    }

    /**
     * Obté el nom del curs.
     * 
     * @return Nom del curs
     */
    public String getnameCourse() {
        return nameCourse;
    }

    /**
     * Obté el nom del professor.
     * 
     * @return Nom del professor
     */
    public String getnameTeacher() {
        return nameTeacher;
    }

    /**
     * Retorna una cadena de text amb la informació del curs.
     * 
     * @return Cadena amb el nom del curs i el professor
     */
    public String formatCadena() {
        return nameCourse + " impartit per " + nameTeacher;
    }
}
