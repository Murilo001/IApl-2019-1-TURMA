/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package turmas;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppCliTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }
}
