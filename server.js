/**
 *  Avery Robertson
 *  Email:avery.br125@gmail.com
 *  Github:Averrryyy
 * 
 *  this is the code for local testing of the website
 *  this simple server only sends the quiz to the localhost
 *  not to be used for actual deployment
 */

const express = require("express");
const cors = require("cors");
const path = require("path");

const app = express();
app.use(cors());

app.use(express.static(path.join(__dirname, "./")));


const PORT = 3000;

async function start() {
  try {
    app.listen(PORT,  () => {
      console.log(`Server running on port ${PORT}`);
    });
  } catch (err) {
    console.error("Startup error:", err);
    process.exit(1);
  }
}

start();