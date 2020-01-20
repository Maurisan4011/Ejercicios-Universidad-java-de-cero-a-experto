/**
 * 
 * @returns {undefined}
 * @author mauri
 */
function sumar() {
    //envoyvelos todo el codigo en un bloque
    //try y catch para procesar la excepcion
    //en caso de que haya ocurrido alguna
    try {
        //Pedimos el valor del operando a 
        var a = prompt("Valor a: ", "");

        //validacion parametro a , !a revisa si la cadena esta vacia 
        if (!a || isNaN(a)) {
            throw new Error("Valor invalido de a : " + a);

        }
        //Pedimos el valor b
        var b = prompt("Valor b: ", "");
        //validacin parametro b, !b revisa si la cadena esta vacia o nula 
        if (!a || isNaN(b)) {
            throw new Error("Valor invalido de b :" + b);

        }

        /*
         * Si no hay problema , hacemos la suma 
         * necesitamos convertir los parametros 
         * parseInt convierte a entero, si no es entero
         * no va a realizar la suma sino concatena valores 
         * 
         */

        var c = parseInt(a) + parseInt(b);
        alert("la suma es : " + c);


    } catch (e) {
        alert("El error es: " + e.message);

    }
}

