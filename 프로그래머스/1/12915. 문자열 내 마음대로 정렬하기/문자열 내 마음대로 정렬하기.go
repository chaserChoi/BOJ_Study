import (
	"sort"
)

func solution(strings []string, n int) []string {
	// 정렬
	sort.Slice(strings, func(i, j int) bool {
		// n번째 인덱스 문자가 같은 경우
		if strings[i][n] == strings[j][n] {
			return strings[i] < strings[j] // 문자열 전체 사전순으로 비교 -> 오름차순
		}

		// n번째 인덱스 문자가 다른 경우
		return strings[i][n] < strings[j][n] // n번째 문자 기준 -> 오름차순
	})

	return strings
}