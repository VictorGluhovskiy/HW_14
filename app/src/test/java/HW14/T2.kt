package HW14

data class random(var num: Int, var num2: Int){
    fun rand(start: Int, end: Int): Int {
        require(start <= end)
        return (start..end).random()



    }
}