import React, { Component } from "react"
class ConditionalRenCom extends Component{
    constructor(){
        super();                    //this is a constuctor
       this.state ={
           Count:0
        }
    }
increment(){
    this.setState({Count:this.state.Count+1});
}
decrement(){
this.setState((prevState) => ({Count: prevState.Count > 0 ? prevState.Count - 1 : 0}))}
reset(){
    this.setState({Count:this.state.Count=0});
}

render(){
        return (
            <div>
                MystateComp
                <p>Count:<strong>{this.state.Count}</strong></p>
                <button type='button' onClick={()=>this.increment()}>Add</button>
                <button type='button' onClick={()=>this.decrement()}>Sub</button>
                <button type='button' onClick={()=>this.reset()}>Reset</button>
                 <hr></hr>
                 {/* <button type='button' onClick={()=>this.hour()}>Hour</button> */}
            </div>
                )
    }
}

export default ConditionalRenCom;
