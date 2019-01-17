
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

public void ausgeben() {
	System.out.println(name +" / " + studiengang + gebJahr);
}

public static void main(String[]args) {
	
}

}
