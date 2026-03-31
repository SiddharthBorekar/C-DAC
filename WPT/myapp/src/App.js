import logo from './logo.svg';
import './App.css';
import FuncComp from './component/FuncComp';
import ClassComp from './component/ClassComp';
import MystateComp from './component/MystateComp';
function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
    <h1>Hy.. I am Sidd</h1>
    <FuncComp myname="Sidd" post="SDE1"></FuncComp>
    <ClassComp myname="Siddhant" post="Student"></ClassComp>
    <MystateComp></MystateComp>
    </div>
  );
}

export default App;
