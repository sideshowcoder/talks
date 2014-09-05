java_import "MyClass"

my_class = MyClass.new

map = my_class.map

map.put("foo", "bar")
my_class.print_map

map.put(1, "bar")
my_class.print_map
