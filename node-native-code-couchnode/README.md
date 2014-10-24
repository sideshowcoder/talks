Native code in node.js: An introduction to Couchnode
====================================================

Duration: 30 min

### Presented

- LNUG - 27.8.2014
- MNUG - 24.9.2014
- Fullstack Conference - 23.10.2014

### Abstract

Over the last years node.js has evolved to be a great language to build web
applications. The reason for this is not only that it is based on JavaScript
which already is established around "the web" but also that it provides
excellent facilities for extensions, not only via JavaScript but also
integration of native C libraries.
Couchbase makes a lot of use of this fact making the Couchbase node.js SDK
[Couchnode](github.com/couchbase/couchnode) a wrapper around the C library
providing a node.js like API, but leveraging the power of a native C library
underneath.
So how is this done?  What does such a package look like, and how do you go
about writing one? This talk walks through creating C extensions for node by
example, with live coding goodness.


### Topics

- Couchnode basics
- node.js C external function calls
- Wrapping a C library in node.js

### Recordings

- [LNUG Recording](https://www.youtube.com/watch?v=-ISX_4peEKY&feature=youtu.be)
- [Fullstack Recording](https://skillsmatter.com/skillscasts/5770-native-code-in-node-js-by-example-of-couchnode)

