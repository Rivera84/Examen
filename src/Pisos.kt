class Pisos()  {


    fun estadoElevador(piso:Int){
        var pisoAcual = 1

        if(piso> pisoAcual && piso <=12) {

            var contador = 1
            while (contador <= piso) {
                val elevador= Elevador.ARRIBA.toString()
                println("  piso $contador")
                contador++

            }
            val elevador = Elevador.DETENIDO.toString()
            println("En el piso $piso")
            println("El elevador ha llegado al piso indicado")
        contador= pisoAcual


        }else{
            println("Este piso no existe")
        }
        }



}