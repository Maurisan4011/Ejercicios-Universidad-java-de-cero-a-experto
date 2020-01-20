/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Declaramos las variables  no importa el tipo de entrada 
var nombre = prompt(" Por favor tu nombre  "," Aqui va el nombre  ");
var edad = prompt(" Por favor tu edad   "," Aqui va  du edad en numero  ");
var residencia = prompt(" Por favor tu domicilio   "," Aqui va  donde vivis  ");
var telefono = prompt(" Porfavor  tu numero telefonico  "," Aqui va el numero Ej  555-455 ");
window.alert("MUCHAS GRACIAS ");
//Agregamos un salto de linea 
var saltoLinea ="<br />";

//imprimimos los datos ingresadfos en la variables

document.write("Los datos ingresados son :" +saltoLinea);
document.write( "Nombre: " + nombre  + saltoLinea);
document.write("Edad : " + edad  + saltoLinea);
document.write("Domicilio: " + residencia  + saltoLinea);
document.write("Telefono " + telefono  + saltoLinea);

