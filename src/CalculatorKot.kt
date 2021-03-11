// Funções matemáticas
fun soma(a:Float, b:Float) = a.plus(b)
fun subt(a:Float, b:Float) = a.minus(b)
fun mult(a:Float, b:Float) = a.times(b)
fun divi(a:Float, b:Float) = a.div(b)

fun main(){
    /* Menu */
    println("Selecione a operação que deseja realizar: ")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicão")
    println("4 - Divisão")
    println("5 - Sair.")
    println("Digite a operação escolhida: ")

    val operacao: Int = readLine()!!.toInt()
    println("Primeiro valor:  ")

    val a:Float = readLine()!!.toFloat()
    println("Segundo valor: ")

    val b:Float = readLine()!!.toFloat()
    println("A operação selecionada foi $operacao e os valores $a e $b")
    println("Digite 1 caso for verdadeiro")
    println("Digite 2 caso for falso")


    when (readLine()!!.toInt()) {
        1-> {
            //Condição para a operação desejada.
            when (operacao) {
                1-> {
                    println("O resultado da somatória é: " + soma(a, b))
                }
                2-> {
                    println("O resultado da subtração é: " + subt(a, b))
                }
                3-> {
                    println("O resultado da multiplicação é: " + mult(a, b))
                }
                4-> {
                    println("O resultado da divisão é: " + divi(a, b))
                }

                5-> {
                    println("Saindo...")
                }
            }
        }
        2-> {
            //Condição para a operação desejada.
            println("Tente novamente.")
        }
    }

}

