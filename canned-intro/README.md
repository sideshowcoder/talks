# Server mocking with canned

https://github.com/sideshowcoder/canned

Philipp Fehre (http://sideshowcoder.com)
Software Engineer @ Yammer

# The idea behind canned

In Unix everything is a file, so lets use files to serve HTTP requests.

# So a static file server?

That is the idea! But to use this for a complete API some extensions are needed.

# `$ tree` represents the API

    $ tree ./example_1
    example_1
    └── index.get.json

# Let me show you

    $ canned ./example_1 &
    $ curl 127.0.0.1:3000

# Example 1

# There is more to an API, not everything is 200

    $ curl -v 127.0.0.1:3000
    ...
    < HTTP/1.1 200 OK
    ...

    :(

# Custom response codes

    $ canned ./example_2 &
    $ curl -v -XPOST 127.0.0.1:3000
    ...
    < HTTP/1.1 201 OK
    ...

    :)

# Example 2

# No talk is complete without cat pictures!
     /\___/\
    (  o o  )
    /   *   \
    \__\_/__/ meow!
     /   \
    / ___ \
    \/___\/

# Different responses based on request

    //! body: {...}

# Lets build something

    $ open example_3/sample.html
    $ tree example_3
    $ canned example_3

# Example 3

# Matching all the things!

- match headers
- match get params
- match body

# Sending all the things!

- Send custom headers
- CORS support
- Custom content types

# Here have another cat picture!
      /\__/\
     /`    '\
   === 0  0 ===
     \  --  /
    /        \
   /          \
  |            |
   \  ||  ||  /
    \_oo__oo_/#######o

# Why did I build this?

APIs being developed get input from the consumers to late

Developers can work on the API togehter!

# Decouple testing

comparing results against expected results is simple based on files

    $ diff curl http://mybackend/todo/1 ./todo-api/todo/_1.get.json

# Downloadable sandbox

Let everybody play with your API without much setup

    $ git clone MYAPIMOCK
    $ canned MYAPIMOCK

# Mock responses

Understandable format without knowledge of node / JavaScript / framework XYZ

Wiremock? racktest? anyone?

# Explorability

    $ tree MYAPIMOCK
    MYAPIMOCK
    └── index.get.json

# Get started

https://github.com/sideshowcoder/canned
Look at the README and the specs

# THANK YOU! Have another Cat!

     ____
    (.   \
      \  |
       \ |___(\--/)
     __/    (  . . )
    "'._.    '-.O.'
         '-.  \ "|\
            '.,,/'.,,mrf


