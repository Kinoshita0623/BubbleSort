import sort.BubbleSort

fun main(args: Array<String>){
    val list = arrayListOf(5,3,2,3,8,11,23,9,13)
    val sortedList = BubbleSort<Int>().sort(list)
    println(sortedList)
}