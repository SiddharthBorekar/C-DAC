const fs = require('fs');

//how to write file operation synchronousl

 let writedata = fs.writeFileSync("./writeOne.txt","Hello Everyone.","");
let readdata = fs.writeFileSync("./writeTwo.txt","utf-8")
console.log(readdata);
let appenddata = fs.appendFileSync("./writeOne.txt","\nWelcome you All");
