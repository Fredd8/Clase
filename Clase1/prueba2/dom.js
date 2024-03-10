window.onload = function () {
    init();


    let colores = {
        "red": 0,
        "orange": 0,
        "green": 0,
        "yellow": 0
    };

    for (let color in colores) {
        if (color == "orange") {
            colores[color]++;
        }

        console.log(color);
        console.log(colores[color]);
    }

    document.getElementById("red").textContent = colores["red"];
    document.getElementById("orange").textContent = colores["orange"];
    document.getElementById("green").textContent = colores["green"];
    document.getElementById("yellow").textContent = colores["yellow"];


}

function init() {
    let cajaPrincipal = document.querySelector("#cajaPrincipal");
    let ul = document.createElement("ul");

    let li = document.createElement("li");
    li.id = "red"
    li.textContent = "red";
    li.style.backgroundColor = "red";
    ul.append(li);

    li = document.createElement("li");
    li.id = "orange"
    li.textContent = "orange";
    li.style.backgroundColor = "orange";
    ul.append(li);

    li = document.createElement("li");
    li.id = "green"
    li.textContent = "green";
    li.style.backgroundColor = "green";
    ul.append(li);

    li = document.createElement("li");
    li.id = "yellow"
    li.textContent = "yellow";
    li.style.backgroundColor = "yellow";
    ul.append(li);





    cajaPrincipal.append(ul);
}


