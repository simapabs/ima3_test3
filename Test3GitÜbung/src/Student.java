
public class Student {
	
private String name;
private Integer gebJahr;
private String studiengang;



/**
 * 
 * @param name
 * @param gebJahr
 * @param studiengang
 */

public Student(String name, Integer gebJahr, String studiengang) {
	super();
	this.name = name;
	this.gebJahr = gebJahr;
	this.studiengang = studiengang;
}

public int ausgeben() {
	return(2019-gebJahr);
}

public void alterStudent() {
	System.out.println("Der Student ist: " + gebJahr + "alt");
}
public static void main(String[]args) {
	
}

}
