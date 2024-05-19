package ParalellExecution;

import org.testng.annotations.Test;

public class ParalellExecutionClass3 {
	
		@Test
		public void testMethod9() {
		System.out.println("ParalellExecution-testMethod9"+Thread.currentThread().getId());
		
		}
		@Test
		public void testMethod10() {
		System.out.println("ParalellExecution-testMethod10"+Thread.currentThread().getId());
	}
		@Test
		public void testMethod11() {
			System.out.println("ParalellExecution-testMethod11"+Thread.currentThread().getId());
		
	}	
		@Test
		public void testMethod12() {
			
			System.out.println("ParalellExecution-testMethod12"+Thread.currentThread().getId());
		
}
}