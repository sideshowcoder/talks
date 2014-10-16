require "couchbase"

cb = Couchbase.connect

cb.set "my_key!", "a value" # => 10969713723938373632
cb.get "my_key!" # => "a value"
cb.replace "my_key!", "this will work because my_key! is already there!" # => 
