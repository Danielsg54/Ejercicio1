package model

class Persona{
var pNombre : String = ""
var pEdad : Int = 0
var pCedula : String = ""
var pSexo : Char = 'H'
var pPeso : Float = 0.0f
var pAltura : Float = 0.0f

    constructor(){

    }


    constructor(pNombre : String, pEdad : Int, pSexo : Char){
        this.pNombre = pNombre
        this.pEdad = pEdad
        this.pSexo = pSexo
    }
    constructor(pNombre : String, pEdad : Int, pCedula : String, pSexo : Char, pPeso : Float, pAltura : Float){
        this.pNombre = pNombre
        this.pEdad = pEdad
        this.pCedula = pCedula
        this.pSexo = pSexo
        this.pPeso = pPeso
        this.pAltura = pAltura
    }

}