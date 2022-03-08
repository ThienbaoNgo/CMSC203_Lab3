import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest2 {
	
	GradeBook gradeBook1;
	GradeBook gradeBook2;
	
	

	@BeforeEach
	void setUp() throws Exception {
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(60);
		gradeBook1.addScore(70);
		gradeBook1.addScore(80);
		gradeBook1.addScore(90);
		gradeBook1.addScore(100);
		
		gradeBook2.addScore(60);
		gradeBook2.addScore(70);
		gradeBook2.addScore(80);
		gradeBook2.addScore(90);
		gradeBook2.addScore(100);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	
	@Test
	void testAddScore() {
		
		System.out.print(gradeBook1.toString());
		
		assertTrue((gradeBook1.toString().equals("60.0 70.0 80.0 90.0 100.0 ")));
		assertEquals(gradeBook2.getScoreSize(),5);
		
	}

	@Test
	void testSum() {
		assertEquals(gradeBook1.sum(),400);
	}

	@Test
	void testMinimum() {
		assertEquals(gradeBook1.minimum(),60);
	}

	@Test
	void testFinalScore() {
		assertEquals(gradeBook1.finalScore(),340);
	}

}
