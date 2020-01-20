/*
 * Catálogo de Usuarios
 */

//Variables globales
var usuarios = new Array();
var contadorUsuarios = 0;

function agregarUsuario(entrada) {
    var usuario = entrada.value.trim();
    usuarios[contadorUsuarios++] = usuario;
    //Desplegamos el catálogo actual de usuarios
    mostrarUsuarios();
    //Limpiamos la caja de texto y la seleccionamos
    entrada.value = "";
    entrada.focus();
}

function mostrarUsuarios() {
    limpiar("listado");
    var usuario = null;
    for (i = 0; i < usuarios.length; i++) {
        usuario = usuarios[i];
        var resultado = i + " - " + usuario;
        imprimir(resultado, "listado");
    }
}

function buscarUsuario(entrada) {
    for (i = 0; i <= usuarios.length; i++) {
        if ((usuarios[i] == entrada.value)) {
            document.getElementById("busqueda").innerHTML = "El usuario tiene la posición:" + [i];
            break; //si encuentra el usuario indica la posicion, si no lo encuentra sigue buscando
        }
        else {
            document.getElementById("busqueda").innerHTML = "No se encontró ningún resultado.";
        }
    }
}

function imprimir(valor, campo) {
    var resultado = document.getElementById(campo);
    resultado.innerHTML += valor + " <br/>";
}

function limpiar(campo) {
    document.getElementById(campo).innerHTML = "";
}