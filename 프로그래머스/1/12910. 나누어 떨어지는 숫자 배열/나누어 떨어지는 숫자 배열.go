import "sort"

func solution(arr []int, divisor int) []int {
	// 나누어 떨어지는 숫자를 담을 슬라이스
	var answer []int

	// 배열 순회 -> divisor로 나누어 떨어지는지 검사
	for _, v := range arr {
		if v%divisor == 0 {
			answer = append(answer, v)
		}
	}

	// 나누어 떨어지는 수가 없는 경우
	if len(answer) == 0 {
		return []int{-1}
	}

	// 오름차순 정렬
	sort.Ints(answer)

	return answer
}