package controller
import model.Persona

class PersonaController {

    var persona = Persona()


    fun calcularIMC(persona: Persona): Int {
        val resultado = persona.pPeso / (persona.pAltura * persona.pAltura)

        if(resultado<18.5){
            return -1

        }else if (resultado in 18.5..24.9){
            return 0

        }else{
            return 1

        }
    }

    fun esMayorDeEdad(persona: Persona): Boolean{

        if(persona.pEdad>17) {
            return true
        }
            return false
    }

    fun comprobarSexo(sexo:Char): Boolean{

        if(sexo=='H' || sexo=='F'){
            return true
        }
        return false
    }
    fun toString(persona: Persona): String{

        var datos = ""
        datos += "Nombre: " + persona.pNombre + "\n"
        datos += "Edad: " + persona.pEdad + "\n"
        datos += "Cedula: " + persona.pCedula + "\n"
        datos += "Sexo: " + persona.pSexo + "\n"
        datos += "Peso: " + persona.pPeso + "\n"
        datos += "Altura: " + persona.pAltura + "\n"
        return datos
    }

}