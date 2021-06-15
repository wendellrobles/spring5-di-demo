package guru.springframework.services;

public class GreetingServiceFactory {

  private GreetingRepository greetingRepository;

  public GreetingServiceFactory(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService createGreetingSevice(String lang) {

    switch (lang) {
      case "de":
        return new PrimaryGermanGreetingService(greetingRepository);
      case "es":
        return new PrimarySpanishGreetingService(greetingRepository);
      case "en":
      default:
        return new PrimaryGreetingService(greetingRepository);
    }

  }
}
