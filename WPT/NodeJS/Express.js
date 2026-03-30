const express = require("express");
const app = express();

app.get("/",(req,res,next)=>{
    res.send("This is  simple get request");
});

app.listen(8888,()=>{
    console.log("Server get started");
});