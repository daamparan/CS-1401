
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestRover{

	@Test
	void testAccelForward(){
		Rover testR=new Rover();
		assertEquals(0,testR.accelerate_forward());
		assertEquals(1,testR.accelerate_forward());
		assertEquals(2,testR.accelerate_forward());
		assertEquals(3,testR.accelerate_forward());

	}
	
	@Test
	void testIdleState() {
		Rover testR=new Rover();
		assertEquals(0,testR.idle_state());
		assertEquals(1,testR.idle_state());
		assertEquals(2,testR.idle_state());

	}
	@Test
	void testAccelBack() {
		Rover testR=new Rover();
		assertEquals(0,testR.accelerate_backward());
		assertEquals(1,testR.accelerate_backward());
		assertEquals(2,testR.accelerate_backward());		
	}
	
	@Test
	void testDeccelBack() {
		Rover testR=new Rover();
		assertEquals(0,testR.deccelerate_backward());
		assertEquals(1,testR.deccelerate_backward());
		assertEquals(2,testR.deccelerate_backward());
	}
	
	@Test
	void testConstForw() {
		Rover testR=new Rover();
		assertEquals(0,testR.constant_forward());
		assertEquals(1,testR.constant_forward());
		assertEquals(2,testR.constant_forward());
		assertEquals(3,testR.constant_forward());
	}
}
