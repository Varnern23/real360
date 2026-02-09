package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person R;
	Person J;
	Person M;
	Person Y;

	@BeforeEach
	void setUp() throws Exception {
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliet", "Cap", 13);
		M = new Person("Count", "Dukoo", 54);
		Y = new Person("Yo", "Da", 55);
	}

	@Test
	void testToString() {
		assertEquals("Person: Romeo Mon, 15", R.toString());
		//fail("Not yet implemented");
	}
	@Test
	void testPerson() {
		assertThrows(UnderAgeException.class, 
				()->{
					R.makePerson(J);
				});
		Person child;
		try {
			child = M.makePerson(J);
			assertEquals(R.getFname(), child.getFname());
			assertEquals(J.getLname(), child.getLname());
			assertEquals(0, child.getAge());
		} catch (UnderAgeException e) {
			e.printStackTrace();
			fail("threw Exception");
		}

		//fail("Not yet implemented");
	}

}
