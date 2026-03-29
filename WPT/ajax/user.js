
function getData() {
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function () {
        let data = JSON.parse(this.responseText);
        // console.log(data);
        let parentEl = document.getElementById("d1");
        for (let i = 0; i < data.length; i++) {

            let newTR = document.createElement("tr");
            newTR.innerHTML = `<td>${data[i].id}</td><td>${data[i].name}</td><td>${data[i].age}</td><td>${data[i].email}</td><td>${data[i].city}</td>`;

            parentEl.appendChild(newTR);
        }
    }
    xmlhttp.open("GET", "http://localhost:8888/users");
    xmlhttp.send();
}
// delete data function 
function deleteRecod() {
    let id = document.getElementById("uid").value;
    if (window.confirm(`are you sure to delete record with id:${id}`)) {
        let xmlhttp = new XMLHttpRequest();
        xmlhttp.onload = function () {
            window.alert('record deleted successfully');
        };
        xmlhttp.open("DELETE", `http://localhost:8888/users/${id}`);
        xmlhttp.send();
    }

}

// add data function 
function addData() {
    let userObj = {
        ename: document.getElementById("name").value,
        epost: document.getElementById("age").value,  
        salary: document.getElementById("email").value,
        salary: document.getElementById("city").value,
    }
   
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function (){
        window.alert("Record Added successfully");
         document.getElementById("name").value="";
         document.getElementById("age").value="";
        document.getElementById("email").value="";
        document.getElementById("city").value="";
    };
    xmlhttp.open("POST","http://localhost:8888/users");
    xmlhttp.send(JSON.stringify(userObj));
    
}
//  let id;
// // get request for single record 
// function getSingleId(){
//      id = document.getElementById("gid").value;
//     let xmlhttp = new XMLHttpRequest();
//     xmlhttp.onload = function(){
//         // console.log(this.responseText);
//         let data = JSON.parse(this.responseText);
//         document.getElementById("nname").value=data.ename;
//          document.getElementById("npost").value=data.epost;
//         document.getElementById("nsalary").value=data.salary;
//     }
//     xmlhttp.open("GET",`http://localhost:8888/employee/${id}`);
//     xmlhttp.send();
// }

// // put request method 
// function updateRecord(){
//     let empObj = {
//        ename:  document.getElementById("nname").value,
//        epost :  document.getElementById("npost").value,
//        salary: document.getElementById("nsalary").value,
//     }
//    let xmlhttp=new XMLHttpRequest();
//    xmlhttp.onload = function(){
//      window.alert("Record updated Successfully");
//    }
//    xmlhttp.open("PUT",`http://localhost:8888/employee/${id}`);
//    xmlhttp.send(JSON.stringify(empObj));
// }