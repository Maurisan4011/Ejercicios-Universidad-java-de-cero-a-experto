/* 
 * @author MAuri
 */
window.onload = iniciaDatos;

/**
 * Funcion  que manda a llamr 
 * al cargar la pagina HTML
 */

function iniciaDatos() {
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;

}

/**
 * Funcion que valida si el usuario quiere salir del sitio o no 
 */
function validaSalir() {
    if (confirm("Desea salir del sitio??")) {
        alert("Nos vamos de google ");
        return  true;//regresamos verdadero para salir 

    } else {
        alert("Nos quedamos en  el sitio");
        return false;//regresamos falso para quedarnos 
    }

}

/**
 * Funcion que pide  una cadena a buscar en google 
 */
function busqueda() {
    //con la funcion prompt capturamos informacion del usuario
    var respuesta = prompt("Escriba los que usted desea buscar ", "");
    //si hubo una respuesta concatenamos la cadena a buscar 
    // al link de google 
    if (respuesta) {
        alert("Turespuesta fue: " + respuesta);
        //el operados this nos sirve para referenciar 
        //al elemento que provoco el evento, en este caso 
        //el elemento con identificador "linkSearch"
        //y concatenamos la respuesta como un parametro 
        //de una peticion get 
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo link: " + nuevoLink);
        //Redireccionamos el Liunk
        window.location = nuevoLink;
        //regresamos false, sino nos lleva al link originalmente
        //registrado en el elemento "linkSearch"
        return false;

    } else {
        alert("No proporcionaste ninguna cadena a buscar ");
        return false;

    }

}

