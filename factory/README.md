## Factory Pattern

To learn more about this design pattern, access the awesome [refactoring.guru.](https://refactoring.guru/design-patterns/factory-method)

Imagine that we are dealing with a application that has to deliver notifications to clients. In our scenario, we have multiple ways of delivering this notification, being:

- SMS
- Email
- Mail letter
- Push notification
- Carrier pigeon


In this case, the application has to accommodate all the different existing ways of delivering a message and any other new method of delivery that may arise.
We also don't care that much about the details of each delivery method, we only want the message delivered.

To solve this problem, we are going to use the factory method, which is a creational pattern.