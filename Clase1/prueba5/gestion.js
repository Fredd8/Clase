
let lista = [
    new Pais("praga", "europa", "25", "04/05/2024", "29/05/2024", "100"),
    new Pais("paris", "europa", "10", "04/05/2024", "14/05/2024", "300"),

    new Pais("aruba", "america", "30", "01/05/2024", "30/05/2024", "150"),
    new Pais("buenos aires", "america", "10", "04/05/2024", "14/05/2024", "200"),

    new Pais("china", "asia", "25", "04/05/2024", "29/05/2024", "365"),
    new Pais("korea", "asia", "20", "04/05/2024", "24/05/2024", "500"),
    new Pais("india", "asia", "20", "04/05/2024", "24/05/2024", "700"),
];

window.onload = function () {
    let select = document.querySelector("#seleccionaPais");

    select.addEventListener('change', (e) => {
        let listaFiltrada = lista.filter((item) => {
            return select.value == item.continente;
        });
        crearViaje(listaFiltrada);
    });
};

function crearViaje(listaFiltrada) {
    let contenido = document.querySelector("#contenidoPais");
    contenido.innerHTML = "";
    listaFiltrada.forEach((item) => {
        contenido.innerHTML += `
        <div class="col">
            <div class="card" style="width: 18rem">
            <div class="card-body">
                <h5 class="card-title">${item.nombre}</h5>
                <p class="card-text">Fecha Ida: ${item.fechaIda}</p>
                <p class="card-text">Fecha Vuelta: ${item.fechaVuelta}</p>
                <p class="card-text">Precio vuelo: ${item.precioBase}</p>
                <p class="card-text">Días: ${item.dias}</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
            </div>
        </div>
        `;
    });
}