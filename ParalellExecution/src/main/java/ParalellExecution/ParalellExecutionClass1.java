package ParalellExecution;

import org.testng.annotations.Test;

public class ParalellExecutionClass1 {
	
		@Test
		public void testMethod1() {
		System.out.println("ParalellExecution-testMethod1- "+Thread.currentThread().getId());
		
		}
		@Test
		public void testMethod2() {
		System.out.println("ParalellExecution-testMethod2- "+Thread.currentThread().getId());
	}
		@Test
		public void testMethod3() {
			System.out.println("ParalellExecution-testMethod3- "+Thread.currentThread().getId());
		
	}	
		@Test
		public void testMethod4() {
			
			System.out.println("ParalellExecution-testMethod4- "+Thread.currentThread().getId());
		
}
}