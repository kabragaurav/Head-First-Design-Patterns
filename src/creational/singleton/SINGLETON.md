Singleton Design Pattern
- Single instance exist
- E.g. DB connection

Problems
- Reflection can break it
- Implementation without enum in multithreading environment can lead to more
than one object being created. Solution is double check locking
- Another problem is while deserialization, fresh instances are created, breaking singleton property
, does not matter if constructor is private or not
- Enums are thread safe but any values in enum structure are lost in serialization