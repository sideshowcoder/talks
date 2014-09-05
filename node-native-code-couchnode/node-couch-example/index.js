var couchbase = require("couchbase")
var cluster = new couchbase.Cluster()
var bucket = cluster.openBucket("default")

var doc = { store: "json we can", multiple: "values it can have" }

bucket.upsert("my-key", doc, function (err, res) {
  if (err) throw err
  bucket.get("my-key", function (err, res) {
    if (err) throw err
    console.log(res)
    bucket.disconnect()
  })
})


