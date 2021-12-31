fun main(){
    fun EvenOdd() {
        val scan = Scanner(System.`in`)
        print("Enter a value here : ")
        val value = scan.nextInt()
        if (value % 2 == 0) {
            println("Value is even")
        } else {
            println("Value is odd")
        }
    }
EvenOdd()
}