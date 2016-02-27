var express = require('express'),
    app = express(),
    http = require('http').Server(app),
    io = require('socket.io')(http),
    port = 3000;

app.get('/', function (req, res) {
    res.sendFile(__dirname + '/index.html');
});

io.on('connection', function (socket) {
    // Message to new users
    io.emit('chat message', 'Welcome to the chat');
    // Logs to server that a new user has connected to the chat
    console.log('a user connected');
    // Logs when a user disconnects.
    socket.on('disconnect', function () {
        console.log('user disconnected');
    });
    socket.on('chat message', function (msg) {
        console.log('message: ' + msg);
        io.emit('chat message', msg);
    });
});
http.listen(port, function () {
    console.log('listening on *:' + port);
});