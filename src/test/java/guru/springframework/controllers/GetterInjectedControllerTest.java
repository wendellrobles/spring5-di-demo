package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetterInjectedControllerTest {

  private SetterInjectedController getterInjectedController;

  @Before
  public void setUp() throws Exception {

    this.getterInjectedController = new SetterInjectedController();
    this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
  }
}
