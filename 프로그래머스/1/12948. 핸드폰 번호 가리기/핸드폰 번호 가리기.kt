class Solution {
    fun solution(phone_number: String): String {
        return phone_number.takeLast(4).padStart(phone_number.length, '*')
    }
}