package view

import controller.PersonaController
import model.Persona

class PersonaView {

    var personaController= PersonaController()

    fun Inicializar(){

        val dato1= Persona()

        print("Digite su nombre: ")
        val nombre = readLine()!!

        print("Digite su edad: ")
        val edad =  readLine()?.toInt()!!

        print("Digite su sexo: ")
        val sexo= readLine()!![0]

        print("Digite su peso: ")
        val peso = readLine()?.toFloat()!!

        print("Digite su altura: ")
        val altura = readLine()?.toFloat()!!

        dato1.pNombre="Yuta"
        dato1.pEdad=16
        dato1.pCedula= "100004"
        dato1.pSexo='H'
        dato1.pPeso=67.5F
        dato1.pAltura=1.67F

        val dato2= Persona(nombre,edad,sexo)
        val dato3= Persona(nombre,edad,"504321234",sexo,peso,altura)


        println("Persona 1 posee ")
        calcularPeso(dato1)

        println("Persona 3 posee ")
        calcularPeso(dato3)

        println("Persona 2 posee ")
        calcularPeso(dato2)

        println("---------------------------------------------")
        MayorDeEdad(dato1)
        MayorDeEdad(dato3)
        MayorDeEdad(dato2)

        println("---------------------------------------------")
        println(personaController.toString(dato1))
        println(personaController.toString(dato3))
        println(personaController.toString(dato2))

    }
    fun calcularPeso(dato1: Persona){

        val personaController = PersonaController()
        val resultado = personaController.calcularIMC(dato1)

        if(resultado==-1){
            println("Bajo Peso")

        }else if(resultado==0){
            println("Peso Normal")

        }else{
            println("Sobrepeso")
        }
    }
    fun MayorDeEdad(dato1: Persona){

        val personaController = PersonaController()
        val resultado = personaController.esMayorDeEdad(dato1)

        if(resultado==true){
            println("Es Mayor de Edad ")

        }else{
            println("Es menor de Edad ")

        }


    }


}