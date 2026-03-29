import { log } from 'node:console';
import chalk from 'chalk';
import validator from 'validator';

let myName="fgh@gmail.com";


console.log(validator.isEmpty(myName));
// console.log(validator.isEmail(yourname));

console.log(chalk.bold("Sidd"));
console.log(chalk.bold.red("Sidd"));
console.log(chalk.bold.red.bgCyanBright("Sidd"));

let danger = chalk.bgRed.white;
let success = chalk.bgGreen.white.italic;


console.log(danger("Something went wrong"));
console.log(success("yo Done it..."));
