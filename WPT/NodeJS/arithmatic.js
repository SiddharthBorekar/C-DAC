const add = (num1,num2)=>{
    return `Addition of ${num1} + ${num2} = ${num1+num2}`
}
const sub = (num1,num2)=>{
    return `Subtraction of ${num1} - ${num2} = ${num1-num2}`
}
const mul = (num1,num2)=>{
    return `Multiplication of ${num1} * ${num2} = ${num1*num2}`
}

const div = (num1,num2)=>{
    return `Division of ${num1} / ${num2} = ${num1/num2}`
}

module.exports={add,sub,mul,div }