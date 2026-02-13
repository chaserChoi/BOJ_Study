class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command -> 
            val i = command[0]
            val j = command[1]
            val k = command[2]
            
            val slicedArray = array.sliceArray((i - 1) until j)
            
            slicedArray.sort()
            
            slicedArray[k - 1]
        }.toIntArray()
    }
}