import React, { useState } from "react";

function App() {
  const [data, setData] = useState([]);

  const generateTable = () => {
    setData([
      { id: 1, name: "Rohit", city: "Solapur" },
      { id: 2, name: "Pranav", city: "Pune" },
      { id: 3, name: "Saurav", city: "Mumbai" }
    ]);
  };

  return (
    <div>
      <button onClick={generateTable}>Generate</button>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
          </tr>
        </thead>

        <tbody>
          {data.map((d) => (
            <tr key={d.id}>
              <td>{d.id}</td>
              <td>{d.name}</td>
              <td>{d.city}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;