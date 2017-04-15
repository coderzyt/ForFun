'use strict';

//引入node模块
var greet = require('./node');

var s = 'zyt';

greet(s);

process.on('exit', function (code) {
    console.log('about to exit with code: ' + code);
});

var fs = require('fs');

fs.readFile('node.js', 'utf-8', function(err, data){
    if (err) {
        console.log(err);
    }
    else {
        console.log(data);
    }
});


fs.readFile('明明.jpg', function(err, data) {
    if (err) {
        console.log(err);
    }
    else {
        console.log(data);
        console.log(data.length + 'bytes');
    }

    // var text = data.toString('utf-8');

    // console.log(text);

    var buf = new Buffer(data, 'utf-8');

    console.log(buf);
});

// var data = 'hello, zyt!'
// fs.writeFile('output.txt', data, function(err) {
//     if (err) {
//         console.log(err);
//     }
//     else {
//         console.log('ok');
//     }
// });

// fs.writeFileSync('output1.txt', data);

// fs.stat('output.txt', function (err, stat) {
//     if (err) {
//         console.log(err);
//     }
//     else {
//         console.log('isFile: ' + stat.isFile());
//         console.log('isDirectory: ' + stat.isDirectory());
//         if (stat.isFile()) {
//             console.log('size: ' + stat.size);
//             console.log('birth time: ' + stat.birthtime);
//             console.log('modified time: ' + stat.mtime);
//         }
//     }
// });

// var rs = fs.createReadStream('output.txt', 'utf-8');

// rs.on('data', function (chunk) {
//     console.log('DATA: ')
//     console.log(chunk);
// });

// rs.on('end', function () {
//     console.log('END');
// })

// rs.on('error', function (err) {
//     console.log('ERROR: ' + err);
// })

// var ws1 = fs.createWriteStream('output1.txt', 'utf-8');
// ws1.write('使用Stream写入文本数据...\n');
// ws1.write('END.');
// ws1.end;

// var ws2 = fs.createWriteStream('output2.txt');
// ws2.write(new Buffer('使用Stream写入二进制数据...\n', 'utf-8'));
// ws2.write(new Buffer('END', 'utf-8'));
// ws2.end();

// var rs2 = fs.createReadStream('output.txt');
// var ws3 = fs.createWriteStream('output1.txt');

// rs2.pipe(ws3);

// readable.pipe(writable, { end: false});

var http = require('http');

// 创建http server，并传入回调函数:
var server = http.createServer(function (request, response) {
    // 回调函数接收request和response对象,
    // 获得HTTP请求的method和url:
    console.log(request.method + ': ' + request.url);
    // 将HTTP响应200写入response, 同时设置Content-Type: text/html:
    response.writeHead(200, {'Content-Type': 'text/html'});
    // 将HTTP响应的HTML内容写入response:
    response.end('<h1>Hello world!</h1>');
});

// 让服务器监听8080端口:
server.listen(8080);

console.log('Server is running at http://127.0.0.1:8080/');

var net = require('net');

var server1 = net.createServer(function (socket) {
    console.log('客户端与服务端连接已建立');
});
server1.listen(8431, 'localhost', function () {
    console.log('服务器开始监听')
});

var url = require('url');

console.log(url.parse('http://赵云桐:93tong@127.0.0.1:8080//path/to/file?query=string#hash'));

var path = require('path');

// var filepath = path.join(workDir, 'pub', 'index.html');

var root = path.resolve(process.argv[2] || '.');

console.log('Static root dir' + root);

var server2 = http.createServer(function (request,  response) {
    var pathname = url.parse(request.url).pathname;
    var filepath = path.join(root, pathname);

    fs.stat(filepath, function (err, stats) {
        if (!err && stats.isFile()) {
            console.log('200 ' + request.url);
            response.writeHead(200);
            fs.createReadStream(filepath).pipe(response);
        }
        else {
            console.log('404 ' + request.url);
            response.writeHead(404);
            fs.createReadStream('明明.jpg').pipe(response);
        }
    });
});
server2.listen(8888);
console.log('Server is running at http://127.0.0.1:8888/');

const crypto = require('crypto');

const hash = crypto.createHash('md5');