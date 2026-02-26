func solution(a int, b int) int64 {
	// 대소 관계 맞추기 => swap
	if a > b {
		a, b = b, a
	}

	first := int64(a)
	last := int64(b)

	// 힝 개수(n)
	n := last - first + 1

	// 가우스 공식
	return n * (first + last) / 2
}