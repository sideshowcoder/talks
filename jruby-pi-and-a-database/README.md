JRuby, a Pi, and a Java Database
================================

Duration: 45 min

### Presented

- FrOSCon - 24.8.2014

### Abstract

JRuby is a great way to use native Java libraries and get around the project
overhead of Java, but how do you actually use Java from JRuby? This talk
explores building a JRuby application, backed by the portable Java version of
Couchbase Mobile.

While JRuby is build to interface with Java, when calling out to JVM land
there are all those little hurdles to overcome. Handling Strings correctly,
using native Collection types, and interfacing with libraries which expect those
native types instead of the ones provided by JRuby, and last but not least
Implementing native interfaces to pass around.

Oh and by the way all of this runs on a little Raspberry Pi!

### Topics

- Calling native Java from JRuby
- JRuby on the Raspberry Pi
- Concepts of Couchbase Lite


