followme.fx
===========

A better name would be "cloneme.fx". Follow me is the simplest possible afterburner.fx
application demonstrating:

1. A MVP architecture with FXML and CSS
2. Integration with [http://afterburner.adam-bien.com](http://afterburner.adam-bien.com)
3. Dependency Injection of models / services
4. Conventional configuration with DI
5. Maven 3 Build

How to use

1. git clone https://github.com/AdamBien/followme.fx
2. cd followme.fx
3. mvn
4. [JAVA_8_HOME]/java -jar target/followme-app.jar

A followme.fx can be automatically created with: 

`mvn archetype:generate -Dfilter=com.airhacks:igniter`


See also: [http://afterburner.adam-bien.com](http://afterburner.adam-bien.com)
and [https://github.com/AdamBien/igniter.fx](https://github.com/AdamBien/igniter.fx)
