class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        // 오늘 날짜 -> 총 일수
        val todayTotalDays = convertDateToDays(today)
        
        // 약관 정보 -> Map 저장
        val termMap = HashMap<String, Int>()
        for (term in terms) {
            val (type, period) = term.split(" ")
            termMap[type] = period.toInt()
        }
        
        val resultList = ArrayList<Int>()
        
        // 개인정보 확인
        for (i in privacies.indices) {
            val (dateStr, type) = privacies[i].split(" ")
            val collectedTotalDays = convertDateToDays(dateStr)
            val termMonths = termMap[type]!!
            
            // 파기 예정일 계산
            val expirationTotalDays = collectedTotalDays + (termMonths * 28)
            
            // 오늘 날짜 >= 파기 예정일 => 파기 대상
            if (todayTotalDays >= expirationTotalDays) {
                resultList.add(i + 1)
            }
        }
        
        return resultList.toIntArray()
    }
    
    // "YYYY.MM.DD" -> (정수) 총 일수
    private fun convertDateToDays(date: String): Int {
        val parts = date.split(".")
        val year = parts[0].toInt()
        val month = parts[1].toInt()
        val day = parts[2].toInt()
        
        // 1년 = 12달 * 28일, 1달 = 28일
        return (year * 12 * 28) + (month * 28) + day
    }
}