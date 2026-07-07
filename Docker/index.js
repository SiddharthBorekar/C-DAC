const express = require("express");
const app = express();

let port = 9999;

app.get("/", (req, res) => {
  res.send("This is Nodejs server + Docker");
});
app.listen(port, () => {
  console.log(`Server get started on localhost : ${port}`);
});