func solution(s string) bool {
    // 문자 길이가 4 or 6인지 검사
	if len(s) != 4 && len(s) != 6 {
		return false
	}

	// 문자열 구성하는 각 문자 순회 
	for _, char := range s {
		// 알파벳 등 숫자가 아니라면 
		if char < '0' || char > '9' {
			return false
		}
	}

	return true
}