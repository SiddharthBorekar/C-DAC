✅Node,JS modules

it has 3 types of  modules
• Core Modules :module provided by nodejs to us.
• Local Modules :module created by devloper for their use in proj.
• Third party Module :module created and devloped by third party vendorm,to use it first we have to install it then we use it.

✅Core module
http: createHTTP server in node js
OS: Provide info about OS system
path:to handle the file path
url: parse the url string
fs: handle the file system in comp
querystring: handle url query string
util:access utility function

6Common module: file.js, module.export,required 

✅ES module(supports advanced structure): file.mjs(file extension),export(to export), import(to import)

•  __dirname : It gives current directory address path
• __filename : it gives current file path.


✅NODE.JS LOCAL MODULE
•Local modules are modules created locally in your Node.js applaction.
•You can also package it and distribute it via NPM,so that Node.js community can use it.

✅NPM - Node package manager
▫️it is a command line tool that installs,updates or unstalls Node.js packages in your applaction.

✅Third party modules
▫️To use 3rd party modules

✅ Blocking and Non-Blocking
▫️Blocking is when the execution of addition javascript in the Nodejs.process must wait until a non-javascript operation completeds.This happens beacuse the event loop is unable to continiue running javascript while a blocking operation is occurring.

✅Callback
▫️A callback is a function called at the completion of a given task; this prevent any blocking ,and allows other code to be run in the meantime.
there are 2 parameters(error,result);

✅ Events
▫️Event action on a computer is an event.like when a connection is madde or a file

✅ NPM i express
▫️how to create server using express



✅ Serve static resources using Express.js
▫️it is easy to srever static files using bult-in middleware in Express.js called express.static.
▫️The express static middleware is respnsable for serving the static assets of an express.js application.
▫️The express.static()method specifics the folder from which to serve all staic resource.
//app.use(express.static(__dirname + 'public'));

how to create webserver
s
1. cfreate directory for proj and enter into directory by writing command "cd directoryname"
2.  create package.json file 
    npm init or init -y
3. Install expressjs
    npm i express
4. install .env
    npm i .env
    ▫️node_module : all external dependency and libary will install here
    ▫️package.json : all external dependency or libaryentry will found here.
    ▫️packagelock.json: all dependency details avalible here.
5. create server by using expressjs with multiple roting path.