Observer Design Pattern
- Push based model
- Different from Pub-sub since in Observer 1:N mapping is there between publisher and subscriber,
whereas pub-sub is generalized form where N:N mapping is there
- E.g. Cred app allows Notify Me option for upcoming deals. It is pub-sub
- Another is YouTube channel subscription and notification button

Advantages
- Reduces unnecessary load on server and network by not adapting pull based mechanism
- O in SOLID pattern is achieved (loose coupling) since Publisher's code is unmodified even as scale of subscribers increases

![Observer Pattern](img/Observer%20Design%20Pattern.png "Observer Pattern")