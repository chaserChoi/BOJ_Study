func solution(a int, b int) string {
    // 각 월 일수 
    months := []int{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    
    // 요일 
    days := []string{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}
    
    totalDays := 0
    
    for i := 1; i < a; i++ {
        totalDays += months[i]
    }
    
    totalDays += (b - 1)
    
    return days[totalDays%7]
}