class Pais {
    nombre;
    continente;
    dias;
    fechaIda;
    fechaVuelta;
    precioBase;

    constructor(nombre, continente, dias, fechaIda, fechaVuelta, precioBase) {
        this.nombre = nombre;
        this.continente = continente;
        this.dias = dias;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.precioBase = precioBase;
    }

    get nombre() {
        return this.nombre;
    }
    set nombre(nombre) {
        this.nombre = nombre;
    }


}