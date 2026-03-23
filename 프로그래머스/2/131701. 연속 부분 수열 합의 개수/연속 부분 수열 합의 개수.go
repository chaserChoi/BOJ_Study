func solution(elements []int) int {
    n := len(elements)

	uniqueSums := make(map[int]struct{}) // Set

	for i := 0; i < n; i++ {
		sum := 0

		for j := 0; j < n; j++ {
			idx := (i + j) % n   // 모듈러 연산
			sum += elements[idx] // 이전 합에 현재 요소만 추가

			uniqueSums[sum] = struct{}{}
		}
	}

	return len(uniqueSums)
}