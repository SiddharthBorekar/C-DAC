/** @format */
import "./App.css";
import FuncComp from "./component/FuncComp";
import ClassComp from "./component/ClassComp";
import MystateComp from "./component/MystateComp";
import MyDetailsComp from "./component/MyDetailsComp";
import ConditionalRenCom from "./component/ConditionalRenCom";
import ParentComponent from "./component/ParentComponent";
import MyimagesCom from "./component/MyimagesCom";
import UseStateHookComp from "./Hoooks/UseStateHookComp";
import ToggleImage from "../src/Task/ToggleImage";
import ImageToggleComp from "./Task/ImageToggleComp";

function App() {
  return (
    <div>
      <h1>Hy.. I am Sidd</h1>
      <FuncComp myname="Sidd" post="SDE1"></FuncComp>
      <ClassComp myname="Siddhant" post="Student"></ClassComp>
      <MystateComp></MystateComp>
      <MyDetailsComp
        fname="Siddharth"
        lname="Borekar"
        gender="Male"
        city="Wardha"
        country="India"
      >
      </MyDetailsComp>
      <ConditionalRenCom></ConditionalRenCom>
      <ParentComponent></ParentComponent>
      <MyimagesCom></MyimagesCom>
      <UseStateHookComp></UseStateHookComp>
      <ToggleImage></ToggleImage>
      {/* <ImageToggleComp></ImageToggleComp> */}
    </div>
  );
}

export default App;
