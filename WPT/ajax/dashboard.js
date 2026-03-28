function getData() {
  let xmlhttp = new XMLHttpRequest();

  xmlhttp.onload = function () {
    let data = JSON.parse(this.responseText);

    let tbody = document.getElementById("tb");
    tbody.innerHTML = "";   // FIX: clear old data

    for (let i = 0; i < data.length; i++) {
      let row = document.createElement("tr");

      row.innerHTML =
        `<td>${data[i].id}</td>
         <td>${data[i].name}</td>
         <td>${data[i].role}</td>
         <td>${data[i].salary}</td>
         <td>${data[i].department}</td>`;

      tbody.appendChild(row);
    }
  };

  xmlhttp.open("GET", "http://localhost:8888/employees");
  xmlhttp.send();
}

// DELETE
function deleteRecord() {
  let id = document.getElementById("uid").value;   // FIX: define first

  if (window.confirm("Delete record with ID: " + id)) {
    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function () {
      alert("Deleted successfully");
      getData();
    };

    xmlhttp.open("DELETE", `http://localhost:8888/employees/${id}`);
    xmlhttp.send();
  }
}

// ADD (POST)
function addRecord() {
  let data = {
    Id: document.getElementById("Id").value,
    name: document.getElementById("name").value,
    role: document.getElementById("role").value,
    salary: document.getElementById("salary").value,
    department: document.getElementById("dept").value
  };

  let xmlhttp = new XMLHttpRequest();

  xmlhttp.onload = function () {
    alert("Record added");
    document.getElementById("name").value=""
    document.getElementById("role").value=""
    document.getElementById("salary").value=""
    document.getElementById("dept").value=""
    document.getElementById("Id").value=""
    getData();
  };

  xmlhttp.open("POST", "http://localhost:8888/employees");
  xmlhttp.setRequestHeader("Content-Type", "application/json");
  xmlhttp.send(JSON.stringify(data));
}

// UPDATE (PUT)
function updateRecord() {
  let id = document.getElementById("uid_update").value;

  let data = {
    id: Number(id),
    name: document.getElementById("name_update").value,
    role: document.getElementById("role_update").value,
    salary: document.getElementById("salary_update").value,
    department: document.getElementById("dept_update").value
  };

  let xmlhttp = new XMLHttpRequest();

  xmlhttp.onload = function () {
    alert("Record updated");
    getData();
  };

  xmlhttp.open("PUT", `http://localhost:8888/employees/${id}`);
  xmlhttp.setRequestHeader("Content-Type", "application/json");
  xmlhttp.send(JSON.stringify(data));
}