const fs = require('fs');


let readStream = fs.createReadStream(__dirname+"/writeThree.txt","utf-8");
let writeStream = fs.createWriteStream(__dirname+"newStream.js",(err,res)=>{

})
readStream.on("data",(chunk)=>{
    console.log(chunk);
    writeStream.write(chunk);
});