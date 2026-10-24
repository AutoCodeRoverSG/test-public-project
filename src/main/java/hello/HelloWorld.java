package hello;

import java.util.logging.Logger;

public class HelloWorld {
  private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

  public static void main(String[] args) {
	Greeter greeter = new Greeter();
	@SuppressWarnings("java:S1481")
	var hello = "Hello";
	LOGGER.info(greeter.sayHello());
  }
}
