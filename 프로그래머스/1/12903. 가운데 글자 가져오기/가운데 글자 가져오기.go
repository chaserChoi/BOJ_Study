func solution(s string) string {
	// 안전한 문자 처리 => 룬(rune) 슬라이스
	chars := []rune(s)

	length := len(chars) // 총 길이
	mid := length / 2    // 가운데 index

	// 길이 = 짝수
	if length%2 == 0 {
		return string(chars[mid-1 : mid+1]) // 가운데 두 글자
	} else { // 길이 = 홀수
		return string(chars[mid : mid+1]) // 가운데 한 글자
	}
}