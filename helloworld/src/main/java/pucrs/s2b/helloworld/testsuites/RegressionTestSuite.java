package pucrs.s2b.helloworld.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pucrs.s2b.helloworld.testcases.LoginTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTestCase.class
})
public class RegressionTestSuite {
	@BeforeClass
	public static void init() {
		System.out.println("Iniciando execução.");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("finalizando.");
	}
}
