const os = require('os');

const path = require("path")
console.log(os.arch());
console.log(os.hostname());
console.log(os.homedir());
console.log(os.cpus()); //used while making networking system
console.log("Total memory: ",os.totalmem());
console.log("Free Memory: ",os.freemem());

//path module method

console.log(__dirname);
console.log(__filename);
console.log(path.extname(__filename));
console.log(path.isAbsolute(__filename));
console.log(path.basename(__dirname));
console.log(path.join(__dirname,"/myhome/assets"));

