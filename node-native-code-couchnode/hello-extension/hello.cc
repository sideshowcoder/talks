#include <node.h>
#include <v8.h>

using namespace v8;

Handle<Value> world(const Arguments& args) {
  HandleScope scope;

  return scope.Close(String::New("hello world"));
}

void init(Handle<Object> target) {
  NODE_SET_METHOD(target, "world", world);
}

NODE_MODULE(hello, init);
