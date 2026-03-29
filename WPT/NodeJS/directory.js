const fs = require("fs");

fs.mkdir("./newDir",(error,result)=>{
    fs.unlike("./dummy.txt",(error,result)=>{
        fs.mkdir("newDirTwo",(error,result)=>{
            fs.writeFile("newDirTwo/writeMe.txt","my name is sidd",(error,result)=>{
                console.log("new directory and new file created");
            })
        })
    })
})

// fs.rmdirSync("./newDir",(error,result)=>{
//     console.log()
// })