require('dotenv').config();
const express = require('express');
const app = express();
const path = require("path")
const hbs = require('hbs')

let host = process.env.HOST;
let port = process.env.PORT;
let staticfilepath = path.join(__dirname,"/Publc");

//for middleware;
app.use(express.static(staticfilepath));

//for hbs
app.set('view engine','hbs');

app.set("views",path.join(__dirname,"/tamplates/views/html"));
// hbs.registerPartials(path.join(__dirname,'/tamplates/partials'));

// app.get("/image/study.jpg",(req,res,next)=>{
//     res.send("get reques from home");
// });

// app.get("/about",(req,res,next)=>{
//     res.send("About page");
// });
// app.get("/service",(req,res,next)=>{
//     res.send("service page");
// });
// app.get("/contact",(req,res,next)=>{
//     res.send("contact page");
// });
// app.get("/*splat",(req,res,next)=>{
//     res.send("Page not Found");
// });


app.get("/index",(req,res,next)=>{
    res.render("Index",{title : "index page"})
});
app.get("/about",(req,res,next)=>{
    res.render("about",{title : "about page"})
});
app.get("/contact",(req,res,next)=>{
    res.render("contact",{title : "contact page"})
});
app.get("/service",(req,res,next)=>{
    res.render("service",{title : "service page"})
});
app.get("/404",(req,res,next)=>{
    res.render("404",{title : "404 page"})
});

app.listen(port,()=>{
    console.log(`My web server get started on ${host}:${port}`);
});