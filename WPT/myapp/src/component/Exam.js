import React from "react";

function App() {
  const generateTable = () => {
    const data = [
      { id: 1, name: "Rohit", city: "Solapur" },
      { id: 2, name: "Pranav", city: "Pune" },
      { id: 3, name: "Saurav", city: "Mumbai" }
    ];

    const table = document.getElementById("myTable");
    table.innerHTML = "<tr><th>ID</th><th>Name</th><th>City</th></tr>";

    data.forEach(d => {
      table.innerHTML += <tr><td>${d.id}</td><td>${d.name}</td><td>${d.city}</td></tr>;
    });
  };

  return (
    <div>
      <button onClick={generateTable}>Generate</button>
      <table id="myTable" border="1" cellPadding="8"></table>
    </div>
  );
}

export default App;