package ParalellExecution;

import org.testng.annotations.Test;

public class ParalellExecutionClass2 {
	
		@Test
		public void testMethod5() {
		System.out.println("ParalellExecution-testMethod5"+Thread.currentThread().getId());
		
		}
		@Test
		public void testMethod6() {
		System.out.println("ParalellExecution-testMethod6"+Thread.currentThread().getId());
	}
		@Test
		public void testMethod7() {
			System.out.println("ParalellExecution-testMethod7"+Thread.currentThread().getId());
		
	}	@Test
		public void testMethod8() {
			
			System.out.println("ParalellExecution-testMethod8"+Thread.currentThread().getId());
		
}
}