require("dotenv").config()
const http=require('http')

let host=process.env.HOST;
let port=process.env.PORT;

let server=http.createServer((req,res)=>{
    if(req.url=="/"){
        res.write("This is home page");
        res.end();

    }if(req.url=="/about"){
        res.write("This is about page");
        res.end();
    }if(req.url=="/service"){
        res.write("This is service page");
        res.end();
    }
});
// server.listen(9999,()=>{
//     console.log("server started");
// })


server.listen(port,()=>{
    console.log(`server get started om ${host}:${port}`);
})