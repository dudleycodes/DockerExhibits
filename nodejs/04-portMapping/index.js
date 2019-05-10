"use strict";

const http = require('http')

const server = http.createServer(function (request, response) {
  var now = new Date();
  var time = now.getHours().toString().padStart(2, "0")
    + ":" + now.getMinutes().toString().padStart(2, "0")
    + ":" + now.getSeconds().toString().padStart(2, "0")
    + ":" + now.getMilliseconds().toString(10).padStart(3, "0");

  response.end('Hello from NodeJS http server! The current time is ' + time)
})

server.listen(3000, (err) => {
  if (err) {
    return console.log('server crashed', err)
  }

  console.log(`server is listening on 3000`)
})
