fun main(args: Array<String>) {
    val elegirPiso = Pisos()
    println("El elevador se encuentra detenido en el lobby")

    //inicio del Juego
    println("Ingrese el piso al que desea ir:")
    val piso = readLine()!!.toInt()

            if (piso <= 12) {
                elegirPiso.estadoElevador(piso)
            } else {
                println("Este piso no existe")
            }



}