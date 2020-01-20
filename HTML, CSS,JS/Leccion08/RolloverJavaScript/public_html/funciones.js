/**
 * @author MAuri
 */
window.onload = cargarImagenes;

/*
 * Funcion que carga todas las imagenes que funcionan
 * como un link, en particular las que estan envueltas 
 * con un tag " a"
 */
function  cargarImagenes() {
    for (var i = 0; i < document.images.length; i++) {
        if (document.images[i].parentNode.tagName == "A") {
            configuraRollover(document.images[i]);

        }

    }

}

/**
 * Esta funcion se ejecuta al iniciar la pagina, y se utiliza 
 * para asocialr las imagenes del rollover a los links
 * que funcionaran como tal 
 * @param {Object} imagen - La imagen que funciona como rollover
 */

function configuraRollover(imagen) {
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "boton_off.jpg";
    imagen.onmouseout = cambiaOff;

    imagen.imagenOn = new Image();
    imagen.imagenOn.src = "boton_on.jpg";
    imagen.onmouseover = cambiaOn;

}
/**
 * Estas funciones se ejecutan segun el evento que se dispare
 * pero no es al iniciar la pagina, sino depende del +boton que se presionen son conocidas
 * como handlers
 */
//SE asocia al evento onmouseout
function  cambiaOff() {
    this.src = this.imagenOff.src; // tomamos los valores ya asociados
}
//SE asocia el evento onmouseover
function cambiaOn() {
    this.src = this.imagenOn.src;

}
