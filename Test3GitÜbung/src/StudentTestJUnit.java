import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestJUnit {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAlter () {
		Student s1 = new Student("Günter", 2000, "IMA");
		assertEquals("", 19, s1.alterStudent());
		//Test Alter Korrekt
	}

}
