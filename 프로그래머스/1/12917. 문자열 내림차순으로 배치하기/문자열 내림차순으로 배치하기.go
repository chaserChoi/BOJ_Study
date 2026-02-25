import (
	"sort"
)

func solution(s string) string {
	chars := []rune(s) // 슬라이스로 변환

	// 내림차순 정렬
	sort.Slice(chars, func(i, j int) bool {
		return chars[i] > chars[j]
	})

	return string(chars) // 슬라이스 -> 문자열
}