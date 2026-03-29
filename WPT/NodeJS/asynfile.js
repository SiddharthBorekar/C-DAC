const fs = require('fs');

//read file asynchronously

fs.readFile("./writeOne.txt","utf-8",(error,data)=>{
    console.log(data);
    fs.writeFile("./writeThree.txt",data,(error,data)=>{
        fs.appendFile("./writeThree.txt"," In infoway CDAC",(error,data)=>{});
    });
});