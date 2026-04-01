import React, { useState } from "react";

const UseStateHookComp = () =>{
    const [count,setCount] = useState(0);
    const [MyName,setMyName] = useState("Sidd");
    const [items,setItems] = useState([
        {id:1,name:"Somosa"},
        {id:2,name:"Dosa"},
        {id:3,name:"Idli"},
        {id:4,name:"chatni"}
        ]);
    return (
        <div>
            <h2>UseStateHookComp</h2>
            <div>Count:{count}</div>
            <button type="button" onClick={()=>setCount(count+1)}>Count++</button>
            <button type="button" onClick={()=>setCount(count-1)}>Count--</button>
            <div>My name is {MyName}</div>
            <h2>Hover on me to update name </h2>
            <button type="button" onMouseOver={()=>setMyName(MyName)}>Siddhant</button>
            <ul>
                {
                    items.map((val,index)=>{
                        return <li key={index}>{val.id}-{val.name}</li>
                    })
                }
            </ul>
            <hr></hr>
        </div>
    )
}
export default UseStateHookComp;