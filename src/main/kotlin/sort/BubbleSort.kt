package sort

class BubbleSort<E: Comparable<E>>{


    tailrec fun sort(list: ArrayList<E>, count: Int = list.size):ArrayList<E>{
        return if(count > 0){
            //sort(sortOneLoop(list),count = count - 1)
            var sortedCounter: Int = 0
            for(n in 0.until(list.size - 1)){

                if(list[n] > list[n + 1]){
                    sortedCounter++
                    val w = list[n]
                    list[n] = list[n + 1]
                    list[n + 1] = w
                }
            }

            if(sortedCounter > 0) sort(list ,count -1) else list

        }else{
            return list
        }


    }

}