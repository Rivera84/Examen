enum class Elevador{
    DETENIDO{

        override fun toString(): String {
           return  print("El elevador se encuentra DETENIDO ").toString()
        }
    },
    ARRIBA {
        override fun toString(): String {
            return print("Estado del elevador: ARRIBA").toString()
        }
    },
    ABAJO{
        override fun toString(): String {
            return  print("Estado del elevador: ABAJO").toString()
        }
    }
}