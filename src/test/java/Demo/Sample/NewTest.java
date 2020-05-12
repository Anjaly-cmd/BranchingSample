package Demo.Sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after");
  }

}
